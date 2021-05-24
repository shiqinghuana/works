package com.territory.worksdaos.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;



@Data
@ApiModel(value = "公司相关信息")
public class Company implements Serializable {

    public String ids;
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "公司名称")
    //@NotBlank(message = "公司名称不能为空")
    private String companyName;

    @ApiModelProperty(value = "公司地址，可以为空")
    private String companyAddr;
    @ApiModelProperty(value = "公司电话，可以为空")
    private String companyPhone;
    @ApiModelProperty(value = "备注吧")
    private String mark;
    @ApiModelProperty(value = "公司类型")
   // @NotBlank(message = "公司类型不能为空 0:内部 1:外部")
    private String type;
    @ApiModelProperty(value = "跟新时间")
    private Long updataTime;
    @ApiModelProperty(value = "插入时间")
    private Long insertTime;
    @ApiModelProperty(value = "是否删除 0 否 1是")
    private Integer delete;
    @ApiModelProperty(value = "文件列表")
    private String fileList;


    private Integer column12;

    private Integer column11;

    private Integer column10;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Long updataTime) {
        this.updataTime = updataTime;
    }

    public Long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Long insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public String getFileList() {
        return fileList;
    }

    public void setFileList(String fileList) {
        this.fileList = fileList;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyAddr=").append(companyAddr);
        sb.append(", companyPhone=").append(companyPhone);
        sb.append(", mark=").append(mark);
        sb.append(", type=").append(type);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", delete=").append(delete);
        sb.append(", column12=").append(column12);
        sb.append(", column11=").append(column11);
        sb.append(", column10=").append(column10);
        sb.append(", fileList=").append(fileList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}