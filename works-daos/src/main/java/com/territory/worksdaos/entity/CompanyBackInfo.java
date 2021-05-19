package com.territory.worksdaos.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;



@ApiModel(value = "银行卡相关信息")
public class CompanyBackInfo implements Serializable {

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "公司id")
    //@NotBlank(message = "公司id不能为空")
    private String companyId;

    @ApiModelProperty(value = "银行名称")
    //@NotBlank(message = "银行名称不能为空")
    private String backName;

    @ApiModelProperty(value = "支行名称，可以为空")
    private String branchBackName;

    @ApiModelProperty(value = "收款户名")
    //@NotBlank(message = "收款户名不能为空")
    private String cardName;

    @ApiModelProperty(value = "卡号")
    //@NotBlank(message = "卡号不能为空")
    private String cardId;
    @ApiModelProperty(value = "备注信息")
    private String mark;
    @ApiModelProperty(value = "是否删除，默认0 正常")
    private Integer delete;
    @ApiModelProperty(value = "更新时间，")
    //@NotBlank(message = "更新时间不能为空")
    private long updataTime;
    @ApiModelProperty(value = "插入时间")
    //@NotBlank(message = "插入时间不能为空")
    private long insertTime;

    private Integer column12;

    private Integer column11;

    private Integer column10;

    private Integer column9;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getBackName() {
        return backName;
    }

    public void setBackName(String backName) {
        this.backName = backName == null ? null : backName.trim();
    }

    public String getBranchBackName() {
        return branchBackName;
    }

    public void setBranchBackName(String branchBackName) {
        this.branchBackName = branchBackName == null ? null : branchBackName.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public long getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(long updataTime) {
        this.updataTime = updataTime;
    }

    public long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(long insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getColumn12() {
        return column12;
    }

    public void setColumn12(Integer column12) {
        this.column12 = column12;
    }

    public Integer getColumn11() {
        return column11;
    }

    public void setColumn11(Integer column11) {
        this.column11 = column11;
    }

    public Integer getColumn10() {
        return column10;
    }

    public void setColumn10(Integer column10) {
        this.column10 = column10;
    }

    public Integer getColumn9() {
        return column9;
    }

    public void setColumn9(Integer column9) {
        this.column9 = column9;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", backName=").append(backName);
        sb.append(", branchBackName=").append(branchBackName);
        sb.append(", cardName=").append(cardName);
        sb.append(", cardId=").append(cardId);
        sb.append(", mark=").append(mark);
        sb.append(", delete=").append(delete);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", column12=").append(column12);
        sb.append(", column11=").append(column11);
        sb.append(", column10=").append(column10);
        sb.append(", column9=").append(column9);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}