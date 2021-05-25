package com.territory.client.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyBackInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyBackInfoExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andBackNameIsNull() {
            addCriterion("back_name is null");
            return (Criteria) this;
        }

        public Criteria andBackNameIsNotNull() {
            addCriterion("back_name is not null");
            return (Criteria) this;
        }

        public Criteria andBackNameEqualTo(String value) {
            addCriterion("back_name =", value, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameNotEqualTo(String value) {
            addCriterion("back_name <>", value, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameGreaterThan(String value) {
            addCriterion("back_name >", value, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameGreaterThanOrEqualTo(String value) {
            addCriterion("back_name >=", value, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameLessThan(String value) {
            addCriterion("back_name <", value, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameLessThanOrEqualTo(String value) {
            addCriterion("back_name <=", value, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameLike(String value) {
            addCriterion("back_name like", value, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameNotLike(String value) {
            addCriterion("back_name not like", value, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameIn(List<String> values) {
            addCriterion("back_name in", values, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameNotIn(List<String> values) {
            addCriterion("back_name not in", values, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameBetween(String value1, String value2) {
            addCriterion("back_name between", value1, value2, "backName");
            return (Criteria) this;
        }

        public Criteria andBackNameNotBetween(String value1, String value2) {
            addCriterion("back_name not between", value1, value2, "backName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameIsNull() {
            addCriterion("branch_back_name is null");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameIsNotNull() {
            addCriterion("branch_back_name is not null");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameEqualTo(String value) {
            addCriterion("branch_back_name =", value, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameNotEqualTo(String value) {
            addCriterion("branch_back_name <>", value, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameGreaterThan(String value) {
            addCriterion("branch_back_name >", value, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameGreaterThanOrEqualTo(String value) {
            addCriterion("branch_back_name >=", value, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameLessThan(String value) {
            addCriterion("branch_back_name <", value, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameLessThanOrEqualTo(String value) {
            addCriterion("branch_back_name <=", value, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameLike(String value) {
            addCriterion("branch_back_name like", value, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameNotLike(String value) {
            addCriterion("branch_back_name not like", value, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameIn(List<String> values) {
            addCriterion("branch_back_name in", values, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameNotIn(List<String> values) {
            addCriterion("branch_back_name not in", values, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameBetween(String value1, String value2) {
            addCriterion("branch_back_name between", value1, value2, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andBranchBackNameNotBetween(String value1, String value2) {
            addCriterion("branch_back_name not between", value1, value2, "branchBackName");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
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