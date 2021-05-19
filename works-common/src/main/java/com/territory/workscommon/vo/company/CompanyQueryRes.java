package com.territory.workscommon.vo.company;

import com.territory.worksdaos.entity.Company;
import com.territory.worksdaos.entity.CompanyBackInfo;
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
