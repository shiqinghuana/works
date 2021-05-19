package com.territory.worksdaos.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InvoiceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("contract_id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("contract_id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNull() {
            addCriterion("invoice_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("invoice_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(String value) {
            addCriterion("invoice_id =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(String value) {
            addCriterion("invoice_id <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(String value) {
            addCriterion("invoice_id >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_id >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(String value) {
            addCriterion("invoice_id <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(String value) {
            addCriterion("invoice_id <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLike(String value) {
            addCriterion("invoice_id like", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotLike(String value) {
            addCriterion("invoice_id not like", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<String> values) {
            addCriterion("invoice_id in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<String> values) {
            addCriterion("invoice_id not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(String value1, String value2) {
            addCriterion("invoice_id between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(String value1, String value2) {
            addCriterion("invoice_id not between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataIsNull() {
            addCriterion("invoice_data is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataIsNotNull() {
            addCriterion("invoice_data is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataEqualTo(Date value) {
            addCriterionForJDBCDate("invoice_data =", value, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("invoice_data <>", value, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataGreaterThan(Date value) {
            addCriterionForJDBCDate("invoice_data >", value, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("invoice_data >=", value, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataLessThan(Date value) {
            addCriterionForJDBCDate("invoice_data <", value, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("invoice_data <=", value, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataIn(List<Date> values) {
            addCriterionForJDBCDate("invoice_data in", values, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("invoice_data not in", values, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("invoice_data between", value1, value2, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("invoice_data not between", value1, value2, "invoiceData");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyIsNull() {
            addCriterion("invoice_money is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyIsNotNull() {
            addCriterion("invoice_money is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyEqualTo(Long value) {
            addCriterion("invoice_money =", value, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyNotEqualTo(Long value) {
            addCriterion("invoice_money <>", value, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyGreaterThan(Long value) {
            addCriterion("invoice_money >", value, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("invoice_money >=", value, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyLessThan(Long value) {
            addCriterion("invoice_money <", value, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyLessThanOrEqualTo(Long value) {
            addCriterion("invoice_money <=", value, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyIn(List<Long> values) {
            addCriterion("invoice_money in", values, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyNotIn(List<Long> values) {
            addCriterion("invoice_money not in", values, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyBetween(Long value1, Long value2) {
            addCriterion("invoice_money between", value1, value2, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceMoneyNotBetween(Long value1, Long value2) {
            addCriterion("invoice_money not between", value1, value2, "invoiceMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxIsNull() {
            addCriterion("invoice_tax is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxIsNotNull() {
            addCriterion("invoice_tax is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxEqualTo(Float value) {
            addCriterion("invoice_tax =", value, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNotEqualTo(Float value) {
            addCriterion("invoice_tax <>", value, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxGreaterThan(Float value) {
            addCriterion("invoice_tax >", value, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("invoice_tax >=", value, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxLessThan(Float value) {
            addCriterion("invoice_tax <", value, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxLessThanOrEqualTo(Float value) {
            addCriterion("invoice_tax <=", value, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxIn(List<Float> values) {
            addCriterion("invoice_tax in", values, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNotIn(List<Float> values) {
            addCriterion("invoice_tax not in", values, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBetween(Float value1, Float value2) {
            addCriterion("invoice_tax between", value1, value2, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNotBetween(Float value1, Float value2) {
            addCriterion("invoice_tax not between", value1, value2, "invoiceTax");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
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

        public Criteria andUpdataTimeIsNull() {
            addCriterion("updata_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIsNotNull() {
            addCriterion("updata_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeEqualTo(Date value) {
            addCriterion("updata_time =", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotEqualTo(Date value) {
            addCriterion("updata_time <>", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeGreaterThan(Date value) {
            addCriterion("updata_time >", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updata_time >=", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLessThan(Date value) {
            addCriterion("updata_time <", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLessThanOrEqualTo(Date value) {
            addCriterion("updata_time <=", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIn(List<Date> values) {
            addCriterion("updata_time in", values, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotIn(List<Date> values) {
            addCriterion("updata_time not in", values, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeBetween(Date value1, Date value2) {
            addCriterion("updata_time between", value1, value2, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
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