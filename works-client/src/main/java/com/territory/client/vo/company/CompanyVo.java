package com.territory.client.vo.company;

import com.territory.client.entity.Company;
import com.territory.client.entity.CompanyBackInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class CompanyVo {

    @ApiModelProperty("业务类型，0:新增，1：跟新")
    //@NotNull(message = "业务类型不能为空")
    public Integer type;


    @ApiModelProperty("公司id,更新是不能为空")
    public Integer companyid;


    @ApiModelProperty("请求公司数据数据")
    //@NotNull(message = "请求公司数据不能为空")
    public Company company;

    @ApiModelProperty("请求公司银行卡数据数据")
    //@NotEmpty(message = "请求银行卡数据不能为空")
    public  CompanyBackInfo[] companyBackInfos ;

}
