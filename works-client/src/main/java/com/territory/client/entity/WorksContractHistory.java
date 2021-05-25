package com.territory.client.entity;

import java.io.Serializable;

public class WorksContractHistory implements Serializable {
    private Integer id;

    private Integer contractId;

    private String processId;

    private String contractName;

    private String contractCode;

    private Integer ourselfCompany;

    private Integer otherCompany;

    private String contractMark;

    private String contractAttachment;

    private String signingData;

    private Long signingMoney;

    private Boolean invoice;

    private String costDepartment;

    private String updataTime;

    private String insertTime;

    private Integer delete;

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

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode == null ? null : contractCode.trim();
    }

    public Integer getOurselfCompany() {
        return ourselfCompany;
    }

    public void setOurselfCompany(Integer ourselfCompany) {
        this.ourselfCompany = ourselfCompany;
    }

    public Integer getOtherCompany() {
        return otherCompany;
    }

    public void setOtherCompany(Integer otherCompany) {
        this.otherCompany = otherCompany;
    }

    public String getContractMark() {
        return contractMark;
    }

    public void setContractMark(String contractMark) {
        this.contractMark = contractMark == null ? null : contractMark.trim();
    }

    public String getContractAttachment() {
        return contractAttachment;
    }

    public void setContractAttachment(String contractAttachment) {
        this.contractAttachment = contractAttachment == null ? null : contractAttachment.trim();
    }

    public String getSigningData() {
        return signingData;
    }

    public void setSigningData(String signingData) {
        this.signingData = signingData == null ? null : signingData.trim();
    }

    public Long getSigningMoney() {
        return signingMoney;
    }

    public void setSigningMoney(Long signingMoney) {
        this.signingMoney = signingMoney;
    }

    public Boolean getInvoice() {
        return invoice;
    }

    public void setInvoice(Boolean invoice) {
        this.invoice = invoice;
    }

    public String getCostDepartment() {
        return costDepartment;
    }

    public void setCostDepartment(String costDepartment) {
        this.costDepartment = costDepartment == null ? null : costDepartment.trim();
    }

    public String getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(String updataTime) {
        this.updataTime = updataTime == null ? null : updataTime.trim();
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime == null ? null : insertTime.trim();
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
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
        sb.append(", contractId=").append(contractId);
        sb.append(", processId=").append(processId);
        sb.append(", contractName=").append(contractName);
        sb.append(", contractCode=").append(contractCode);
        sb.append(", ourselfCompany=").append(ourselfCompany);
        sb.append(", otherCompany=").append(otherCompany);
        sb.append(", contractMark=").append(contractMark);
        sb.append(", contractAttachment=").append(contractAttachment);
        sb.append(", signingData=").append(signingData);
        sb.append(", signingMoney=").append(signingMoney);
        sb.append(", invoice=").append(invoice);
        sb.append(", costDepartment=").append(costDepartment);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", delete=").append(delete);
        sb.append(", column12=").append(column12);
        sb.append(", column11=").append(column11);
        sb.append(", column10=").append(column10);
        sb.append(", column9=").append(column9);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}