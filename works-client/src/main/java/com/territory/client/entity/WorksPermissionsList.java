package com.territory.client.entity;

import java.io.Serializable;
import java.util.Date;

public class WorksPermissionsList implements Serializable {
    private Integer id;

    private Integer permissionsCode;

    private Integer permissionsName;

    private String mark;

    private Integer delete;

    private Date updataTime;

    private Date insertTime;

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

    public Integer getPermissionsCode() {
        return permissionsCode;
    }

    public void setPermissionsCode(Integer permissionsCode) {
        this.permissionsCode = permissionsCode;
    }

    public Integer getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(Integer permissionsName) {
        this.permissionsName = permissionsName;
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

    public Date getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Date updataTime) {
        this.updataTime = updataTime;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
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
        sb.append(", permissionsCode=").append(permissionsCode);
        sb.append(", permissionsName=").append(permissionsName);
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