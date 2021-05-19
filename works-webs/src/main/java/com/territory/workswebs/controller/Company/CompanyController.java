package com.territory.workswebs.controller.Company;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.territory.workscommon.vo.company.CompanyQueryRes;
import com.territory.workscommon.vo.company.CompanyVo;
import com.territory.worksdaos.entity.Company;
import com.territory.worksservice.CompanyService;
import com.territory.workswebs.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/works/company")
@Api(tags = "公司管理",description = "部门管理相关接口")
public class CompanyController {

    final CompanyService companyService;
    public CompanyController(CompanyService companyService){
        this.companyService = companyService;

    }

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
