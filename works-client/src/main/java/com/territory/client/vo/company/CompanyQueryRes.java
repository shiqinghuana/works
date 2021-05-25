package com.territory.client.vo.company;

import com.territory.client.entity.Company;
import com.territory.client.entity.CompanyBackInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "公司信息查询返回体")
public class CompanyQueryRes {

    @ApiModelProperty(value = "公司信息")
    public Company company;
    @ApiModelProperty(value = "公司银行卡信息")
    public List<CompanyBackInfo> companyBackInfos;

}
