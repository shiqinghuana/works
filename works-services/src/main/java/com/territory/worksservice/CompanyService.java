package com.territory.worksservice;

import com.alibaba.fastjson.JSONObject;
import com.territory.workscommon.vo.company.CompanyQueryRes;
import com.territory.worksdaos.entity.Company;
import com.territory.worksdaos.entity.CompanyBackInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



// 公司管理相关服务

public interface CompanyService {

    int CompanyInsert(Company company, CompanyBackInfo[] companyBackInfos);

    int CompanyUpdate(Company company, CompanyBackInfo[] companyBackInfos);
    CompanyQueryRes CompanyQueryById(Integer companyId);
    List<Company> CompanyQueryAll(JSONObject Type);
}
