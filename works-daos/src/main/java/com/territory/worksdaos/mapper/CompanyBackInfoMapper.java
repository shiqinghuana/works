package com.territory.worksdaos.mapper;

import com.territory.client.entity.CompanyBackInfo;
import com.territory.client.entity.CompanyBackInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyBackInfoMapper {
    long countByExample(CompanyBackInfoExample example);

    int deleteByExample(CompanyBackInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyBackInfo record);

    int insertSelective(CompanyBackInfo record);

    List<CompanyBackInfo> selectByExample(CompanyBackInfoExample example);

    CompanyBackInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyBackInfo record, @Param("example") CompanyBackInfoExample example);

    int updateByExample(@Param("record") CompanyBackInfo record, @Param("example") CompanyBackInfoExample example);

    int updateByPrimaryKeySelective(CompanyBackInfo record);

    int updateByPrimaryKey(CompanyBackInfo record);

    CompanyBackInfo[] selectByCompanyId(Integer companyId);
    int bulkInsert(CompanyBackInfo[] companyBackInfos);
}