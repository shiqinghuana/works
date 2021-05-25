package com.territory.client.impl;


import com.alibaba.fastjson.JSONObject;
import com.territory.client.vo.company.CompanyQueryRes;
import com.territory.client.entity.Company;
import com.territory.client.entity.CompanyBackInfo;


import java.util.List;


// 公司管理相关服务

public interface CompanyService {

    int CompanyInsert(Company company, CompanyBackInfo[] companyBackInfos);

    int CompanyUpdate(Company company, CompanyBackInfo[] companyBackInfos);
    CompanyQueryRes CompanyQueryById(Integer companyId);
    List<Company> CompanyQueryAll(JSONObject Type);
}
