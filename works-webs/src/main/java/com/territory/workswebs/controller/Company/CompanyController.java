package com.territory.workswebs.controller.Company;



import com.alibaba.dubbo.config.annotation.Reference;


import com.alibaba.fastjson.JSONObject;
import com.territory.client.entity.Company;
import com.territory.client.impl.CompanyService;
import com.territory.client.vo.company.CompanyQueryRes;
import com.territory.client.vo.company.CompanyVo;
import com.territory.workswebs.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/works/company")
@Api(tags = "公司管理",description = "部门管理相关接口")
public class CompanyController {

    @Reference
    private CompanyService companyService;



    @PostMapping("/change")
    @ApiOperation(value = "新增/修改公司相关信息")
    public BaseResponse change(@RequestBody CompanyVo vo){
        int i = vo.type == 0 ? companyService.CompanyInsert(vo.company, vo.companyBackInfos) : companyService.CompanyUpdate(vo.company, vo.companyBackInfos);
        System.out.println("操作成功");
        return BaseResponse.success(i);
    }


    @PostMapping("/queryAll")
    @ApiOperation(value = "新增/修改公司相关信息")
    public BaseResponse queryAll(@RequestBody JSONObject type){
        System.out.println(type);
        List<Company> companies = companyService.CompanyQueryAll(type);
        return BaseResponse.success(companies);
    }

    @PostMapping("/query")
    @ApiOperation(value = "新增/修改公司相关信息")
    public BaseResponse query(@RequestBody JSONObject type){
        CompanyQueryRes id = companyService.CompanyQueryById(type.getInteger("id"));
        return BaseResponse.success(id);
    }

}
