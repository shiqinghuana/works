package com.territory.client.entity;

import java.util.ArrayList;
import java.util.List;

public class WorksContractHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksContractHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Integer value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Integer value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Integer value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Integer value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Integer> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Integer> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("process_id like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("process_id not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNull() {
            addCriterion("contract_name is null");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNotNull() {
            addCriterion("contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andContractNameEqualTo(String value) {
            addCriterion("contract_name =", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotEqualTo(String value) {
            addCriterion("contract_name <>", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThan(String value) {
            addCriterion("contract_name >", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("contract_name >=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThan(String value) {
            addCriterion("contract_name <", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThanOrEqualTo(String value) {
            addCriterion("contract_name <=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLike(String value) {
            addCriterion("contract_name like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotLike(String value) {
            addCriterion("contract_name not like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameIn(List<String> values) {
            addCriterion("contract_name in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotIn(List<String> values) {
            addCriterion("contract_name not in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameBetween(String value1, String value2) {
            addCriterion("contract_name between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotBetween(String value1, String value2) {
            addCriterion("contract_name not between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNull() {
            addCriterion("contract_code is null");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNotNull() {
            addCriterion("contract_code is not null");
            return (Criteria) this;
        }

        public Criteria andContractCodeEqualTo(String value) {
            addCriterion("contract_code =", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotEqualTo(String value) {
            addCriterion("contract_code <>", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThan(String value) {
            addCriterion("contract_code >", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_code >=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThan(String value) {
            addCriterion("contract_code <", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThanOrEqualTo(String value) {
            addCriterion("contract_code <=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLike(String value) {
            addCriterion("contract_code like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotLike(String value) {
            addCriterion("contract_code not like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIn(List<String> values) {
            addCriterion("contract_code in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotIn(List<String> values) {
            addCriterion("contract_code not in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeBetween(String value1, String value2) {
            addCriterion("contract_code between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotBetween(String value1, String value2) {
            addCriterion("contract_code not between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyIsNull() {
            addCriterion("ourself_company is null");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyIsNotNull() {
            addCriterion("ourself_company is not null");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyEqualTo(Integer value) {
            addCriterion("ourself_company =", value, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyNotEqualTo(Integer value) {
            addCriterion("ourself_company <>", value, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyGreaterThan(Integer value) {
            addCriterion("ourself_company >", value, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ourself_company >=", value, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyLessThan(Integer value) {
            addCriterion("ourself_company <", value, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("ourself_company <=", value, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyIn(List<Integer> values) {
            addCriterion("ourself_company in", values, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyNotIn(List<Integer> values) {
            addCriterion("ourself_company not in", values, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyBetween(Integer value1, Integer value2) {
            addCriterion("ourself_company between", value1, value2, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOurselfCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("ourself_company not between", value1, value2, "ourselfCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyIsNull() {
            addCriterion("other_company is null");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyIsNotNull() {
            addCriterion("other_company is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyEqualTo(Integer value) {
            addCriterion("other_company =", value, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyNotEqualTo(Integer value) {
            addCriterion("other_company <>", value, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyGreaterThan(Integer value) {
            addCriterion("other_company >", value, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_company >=", value, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyLessThan(Integer value) {
            addCriterion("other_company <", value, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("other_company <=", value, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyIn(List<Integer> values) {
            addCriterion("other_company in", values, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyNotIn(List<Integer> values) {
            addCriterion("other_company not in", values, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyBetween(Integer value1, Integer value2) {
            addCriterion("other_company between", value1, value2, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andOtherCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("other_company not between", value1, value2, "otherCompany");
            return (Criteria) this;
        }

        public Criteria andContractMarkIsNull() {
            addCriterion("contract_mark is null");
            return (Criteria) this;
        }

        public Criteria andContractMarkIsNotNull() {
            addCriterion("contract_mark is not null");
            return (Criteria) this;
        }

        public Criteria andContractMarkEqualTo(String value) {
            addCriterion("contract_mark =", value, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkNotEqualTo(String value) {
            addCriterion("contract_mark <>", value, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkGreaterThan(String value) {
            addCriterion("contract_mark >", value, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkGreaterThanOrEqualTo(String value) {
            addCriterion("contract_mark >=", value, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkLessThan(String value) {
            addCriterion("contract_mark <", value, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkLessThanOrEqualTo(String value) {
            addCriterion("contract_mark <=", value, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkLike(String value) {
            addCriterion("contract_mark like", value, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkNotLike(String value) {
            addCriterion("contract_mark not like", value, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkIn(List<String> values) {
            addCriterion("contract_mark in", values, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkNotIn(List<String> values) {
            addCriterion("contract_mark not in", values, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkBetween(String value1, String value2) {
            addCriterion("contract_mark between", value1, value2, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractMarkNotBetween(String value1, String value2) {
            addCriterion("contract_mark not between", value1, value2, "contractMark");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentIsNull() {
            addCriterion("contract_attachment is null");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentIsNotNull() {
            addCriterion("contract_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentEqualTo(String value) {
            addCriterion("contract_attachment =", value, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentNotEqualTo(String value) {
            addCriterion("contract_attachment <>", value, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentGreaterThan(String value) {
            addCriterion("contract_attachment >", value, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("contract_attachment >=", value, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentLessThan(String value) {
            addCriterion("contract_attachment <", value, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentLessThanOrEqualTo(String value) {
            addCriterion("contract_attachment <=", value, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentLike(String value) {
            addCriterion("contract_attachment like", value, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentNotLike(String value) {
            addCriterion("contract_attachment not like", value, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentIn(List<String> values) {
            addCriterion("contract_attachment in", values, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentNotIn(List<String> values) {
            addCriterion("contract_attachment not in", values, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentBetween(String value1, String value2) {
            addCriterion("contract_attachment between", value1, value2, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentNotBetween(String value1, String value2) {
            addCriterion("contract_attachment not between", value1, value2, "contractAttachment");
            return (Criteria) this;
        }

        public Criteria andSigningDataIsNull() {
            addCriterion("signing_data is null");
            return (Criteria) this;
        }

        public Criteria andSigningDataIsNotNull() {
            addCriterion("signing_data is not null");
            return (Criteria) this;
        }

        public Criteria andSigningDataEqualTo(String value) {
            addCriterion("signing_data =", value, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataNotEqualTo(String value) {
            addCriterion("signing_data <>", value, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataGreaterThan(String value) {
            addCriterion("signing_data >", value, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataGreaterThanOrEqualTo(String value) {
            addCriterion("signing_data >=", value, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataLessThan(String value) {
            addCriterion("signing_data <", value, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataLessThanOrEqualTo(String value) {
            addCriterion("signing_data <=", value, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataLike(String value) {
            addCriterion("signing_data like", value, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataNotLike(String value) {
            addCriterion("signing_data not like", value, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataIn(List<String> values) {
            addCriterion("signing_data in", values, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataNotIn(List<String> values) {
            addCriterion("signing_data not in", values, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataBetween(String value1, String value2) {
            addCriterion("signing_data between", value1, value2, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningDataNotBetween(String value1, String value2) {
            addCriterion("signing_data not between", value1, value2, "signingData");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyIsNull() {
            addCriterion("signing_money is null");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyIsNotNull() {
            addCriterion("signing_money is not null");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyEqualTo(Long value) {
            addCriterion("signing_money =", value, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyNotEqualTo(Long value) {
            addCriterion("signing_money <>", value, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyGreaterThan(Long value) {
            addCriterion("signing_money >", value, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("signing_money >=", value, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyLessThan(Long value) {
            addCriterion("signing_money <", value, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyLessThanOrEqualTo(Long value) {
            addCriterion("signing_money <=", value, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyIn(List<Long> values) {
            addCriterion("signing_money in", values, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyNotIn(List<Long> values) {
            addCriterion("signing_money not in", values, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyBetween(Long value1, Long value2) {
            addCriterion("signing_money between", value1, value2, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andSigningMoneyNotBetween(Long value1, Long value2) {
            addCriterion("signing_money not between", value1, value2, "signingMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Boolean value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Boolean value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Boolean value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Boolean value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Boolean> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Boolean> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentIsNull() {
            addCriterion("cost_department is null");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentIsNotNull() {
            addCriterion("cost_department is not null");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentEqualTo(String value) {
            addCriterion("cost_department =", value, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentNotEqualTo(String value) {
            addCriterion("cost_department <>", value, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentGreaterThan(String value) {
            addCriterion("cost_department >", value, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("cost_department >=", value, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentLessThan(String value) {
            addCriterion("cost_department <", value, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentLessThanOrEqualTo(String value) {
            addCriterion("cost_department <=", value, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentLike(String value) {
            addCriterion("cost_department like", value, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentNotLike(String value) {
            addCriterion("cost_department not like", value, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentIn(List<String> values) {
            addCriterion("cost_department in", values, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentNotIn(List<String> values) {
            addCriterion("cost_department not in", values, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentBetween(String value1, String value2) {
            addCriterion("cost_department between", value1, value2, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andCostDepartmentNotBetween(String value1, String value2) {
            addCriterion("cost_department not between", value1, value2, "costDepartment");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIsNull() {
            addCriterion("updata_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIsNotNull() {
            addCriterion("updata_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeEqualTo(String value) {
            addCriterion("updata_time =", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotEqualTo(String value) {
            addCriterion("updata_time <>", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeGreaterThan(String value) {
            addCriterion("updata_time >", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeGreaterThanOrEqualTo(String value) {
            addCriterion("updata_time >=", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLessThan(String value) {
            addCriterion("updata_time <", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLessThanOrEqualTo(String value) {
            addCriterion("updata_time <=", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLike(String value) {
            addCriterion("updata_time like", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotLike(String value) {
            addCriterion("updata_time not like", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIn(List<String> values) {
            addCriterion("updata_time in", values, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotIn(List<String> values) {
            addCriterion("updata_time not in", values, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeBetween(String value1, String value2) {
            addCriterion("updata_time between", value1, value2, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotBetween(String value1, String value2) {
            addCriterion("updata_time not between", value1, value2, "updataTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(String value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(String value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(String value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(String value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(String value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(String value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLike(String value) {
            addCriterion("insert_time like", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotLike(String value) {
            addCriterion("insert_time not like", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<String> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<String> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(String value1, String value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(String value1, String value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("`delete` is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("`delete` is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Integer value) {
            addCriterion("`delete` =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Integer value) {
            addCriterion("`delete` <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Integer value) {
            addCriterion("`delete` >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("`delete` >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Integer value) {
            addCriterion("`delete` <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("`delete` <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Integer> values) {
            addCriterion("`delete` in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Integer> values) {
            addCriterion("`delete` not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Integer value1, Integer value2) {
            addCriterion("`delete` between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("`delete` not between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andColumn12IsNull() {
            addCriterion("column_12 is null");
            return (Criteria) this;
        }

        public Criteria andColumn12IsNotNull() {
            addCriterion("column_12 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn12EqualTo(Integer value) {
            addCriterion("column_12 =", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12NotEqualTo(Integer value) {
            addCriterion("column_12 <>", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12GreaterThan(Integer value) {
            addCriterion("column_12 >", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12GreaterThanOrEqualTo(Integer value) {
            addCriterion("column_12 >=", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12LessThan(Integer value) {
            addCriterion("column_12 <", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12LessThanOrEqualTo(Integer value) {
            addCriterion("column_12 <=", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12In(List<Integer> values) {
            addCriterion("column_12 in", values, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12NotIn(List<Integer> values) {
            addCriterion("column_12 not in", values, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12Between(Integer value1, Integer value2) {
            addCriterion("column_12 between", value1, value2, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12NotBetween(Integer value1, Integer value2) {
            addCriterion("column_12 not between", value1, value2, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn11IsNull() {
            addCriterion("column_11 is null");
            return (Criteria) this;
        }

        public Criteria andColumn11IsNotNull() {
            addCriterion("column_11 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn11EqualTo(Integer value) {
            addCriterion("column_11 =", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotEqualTo(Integer value) {
            addCriterion("column_11 <>", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11GreaterThan(Integer value) {
            addCriterion("column_11 >", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11GreaterThanOrEqualTo(Integer value) {
            addCriterion("column_11 >=", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11LessThan(Integer value) {
            addCriterion("column_11 <", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11LessThanOrEqualTo(Integer value) {
            addCriterion("column_11 <=", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11In(List<Integer> values) {
            addCriterion("column_11 in", values, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotIn(List<Integer> values) {
            addCriterion("column_11 not in", values, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11Between(Integer value1, Integer value2) {
            addCriterion("column_11 between", value1, value2, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotBetween(Integer value1, Integer value2) {
            addCriterion("column_11 not between", value1, value2, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNull() {
            addCriterion("column_10 is null");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNotNull() {
            addCriterion("column_10 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn10EqualTo(Integer value) {
            addCriterion("column_10 =", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotEqualTo(Integer value) {
            addCriterion("column_10 <>", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThan(Integer value) {
            addCriterion("column_10 >", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThanOrEqualTo(Integer value) {
            addCriterion("column_10 >=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThan(Integer value) {
            addCriterion("column_10 <", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThanOrEqualTo(Integer value) {
            addCriterion("column_10 <=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10In(List<Integer> values) {
            addCriterion("column_10 in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotIn(List<Integer> values) {
            addCriterion("column_10 not in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Between(Integer value1, Integer value2) {
            addCriterion("column_10 between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotBetween(Integer value1, Integer value2) {
            addCriterion("column_10 not between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn9IsNull() {
            addCriterion("column_9 is null");
            return (Criteria) this;
        }

        public Criteria andColumn9IsNotNull() {
            addCriterion("column_9 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn9EqualTo(Integer value) {
            addCriterion("column_9 =", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotEqualTo(Integer value) {
            addCriterion("column_9 <>", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9GreaterThan(Integer value) {
            addCriterion("column_9 >", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9GreaterThanOrEqualTo(Integer value) {
            addCriterion("column_9 >=", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9LessThan(Integer value) {
            addCriterion("column_9 <", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9LessThanOrEqualTo(Integer value) {
            addCriterion("column_9 <=", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9In(List<Integer> values) {
            addCriterion("column_9 in", values, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotIn(List<Integer> values) {
            addCriterion("column_9 not in", values, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9Between(Integer value1, Integer value2) {
            addCriterion("column_9 between", value1, value2, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotBetween(Integer value1, Integer value2) {
            addCriterion("column_9 not between", value1, value2, "column9");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}