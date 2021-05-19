package com.territory.worksservice.impl;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.territory.workscommon.vo.company.CompanyQueryRes;
import com.territory.worksdaos.entity.Company;
import com.territory.worksdaos.entity.CompanyBackInfo;
import com.territory.worksdaos.entity.CompanyBackInfoExample;
import com.territory.worksdaos.entity.CompanyExample;
import com.territory.worksdaos.mapper.CompanyBackInfoMapper;
import com.territory.worksdaos.mapper.CompanyMapper;
import com.territory.worksservice.CompanyService;
import com.territory.worksservice.exception.BusinessException;
import com.territory.worksservice.exception.code.BaseResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Transactional
@Service

public class CompanyServiceImpl extends BaseService implements CompanyService  {


    final CompanyMapper companyMapper;


    final CompanyBackInfoMapper companyBackInfo;

    final static String className = "CompanyServiceService";

    @Autowired
    public CompanyServiceImpl(CompanyMapper companyMapper, CompanyBackInfoMapper companyBackInfo){
        this.companyMapper = companyMapper;
        this.companyBackInfo = companyBackInfo;
    }


    @Override
    public int CompanyInsert(Company company, CompanyBackInfo[] companyBackInfos) {
        try {
            company.setInsertTime(System.currentTimeMillis());
            company.setUpdataTime(System.currentTimeMillis());
            company.setDelete(0);
            int insert = companyMapper.insert(company);
            if (insert<1){throw new Exception("companyMapper 插入数据失败");}
            for (CompanyBackInfo e: companyBackInfos){
                e.setDelete(0);
                e.setInsertTime(System.currentTimeMillis());
                e.setUpdataTime(System.currentTimeMillis());
                e.setCompanyId(String.valueOf(company.getId()));
            }
            int i = companyBackInfo.bulkInsert(companyBackInfos);
            if (i<1){throw new Exception("companyBackInfo插入数据失败");}
            return company.getId();
        } catch (Exception e) {
            throw  new BusinessException(99,handleErrMessage(className,
                    "CompanyInsert",
                    e.getMessage(),
                    company.toString(),
                    Arrays.toString(companyBackInfos),
                    Arrays.toString(e.getStackTrace())));
        }
    }

    @Override
    public int CompanyUpdate(Company company, CompanyBackInfo[] companyBackInfos)  {
        try {
           // companyMapper.updateByPrimaryKey(company);
            company.setUpdataTime(System.currentTimeMillis());
            int i =companyMapper.updateByPrimaryKeySelective(company);

            if (i<1){throw new Exception("更新数据失败");}

            for (CompanyBackInfo c:
                    companyBackInfos) {
                int i1;
                if (c.getId()==null){
                    // 这里新增一条银行记录
                    c.setDelete(0);
                    c.setUpdataTime(System.currentTimeMillis());
                    c.setInsertTime(System.currentTimeMillis());
                    c.setCompanyId(String.valueOf(company.getId()));
                    i1 = companyBackInfo.insert(c);
                }
                else {
                    i1 = companyBackInfo.updateByPrimaryKeySelective(c);

                }
                if (i1<1){throw new Exception("更新数据失败");}
            }
            return company.getId();
        } catch (Exception e) {
            throw  new BusinessException(99,handleErrMessage(className,
                    "CompanyUpdate",
                    e.getMessage(),
                    company.toString(),
                    Arrays.toString(companyBackInfos),
                    Arrays.toString(e.getStackTrace())));
        }
    }


    /**
     * 基础查询，直接使用自带的example 查询，不写sql
     * @param companyId
     * @return
     */
    @Override
    public CompanyQueryRes CompanyQueryById(Integer companyId) {
        try {
            HashMap<Company, List<CompanyBackInfo>> companyHashMap = new HashMap<>();
            CompanyExample companyExample = new CompanyExample();
            CompanyExample.Criteria or = companyExample.or();
            or.andIdEqualTo(companyId);
            or.andDeleteEqualTo(0);

            List<Company> companies = companyMapper.selectByExample(companyExample);
            if (companies.isEmpty()){
                throw new BusinessException(BaseResponseCode.DATA_ERROR.getCode(),"不存在id为"+companyId+"的数据");
            }

            CompanyBackInfoExample companyExample1 = new CompanyBackInfoExample();
            CompanyBackInfoExample.Criteria or1 = companyExample1.or();
            or1.andCompanyIdEqualTo(String.valueOf(companyId));
            List<CompanyBackInfo> companyBackInfos1 = companyBackInfo.selectByExample(companyExample1);
            CompanyQueryRes companyQueryRes = new CompanyQueryRes();
            companyQueryRes.company = companies.get(0);
            companyQueryRes.companyBackInfos = companyBackInfos1;
            return companyQueryRes;

        } catch (Exception e) {
            throw  new BusinessException(99,handleErrMessage(className,
                    "CompanyUpdate",
                    e.getMessage(),
                    String.valueOf(companyId),
                    Arrays.toString(e.getStackTrace())));
        }
    }

    @Override
    public List<Company> CompanyQueryAll(JSONObject type) {
        // 此处查询所有公司信息

        CompanyExample companyExample = new CompanyExample();
        Integer current = type.getInteger("current");
        Integer pageSize = type.getInteger("pageSize");
        Integer start = (current-1)*pageSize;

        companyExample.setLimit(String.valueOf(start),String.valueOf(pageSize));

        CompanyExample.Criteria or = companyExample.or();
        or.andDeleteEqualTo(0);
        String type1 = type.getString("type");
        String company = (String)type.getOrDefault("companyName", "");
        // 0 1   有效type，其他的查全部
        if (type1.equals("1") || type1.equals("0")){
            or.andTypeEqualTo(type1);
        }
        if (!StringUtils.isEmpty(company)){
            or.andCompanyNameLike(company);
        }

        List<Company> companies = companyMapper.selectByExample(companyExample);
        return companies;

    }

}
