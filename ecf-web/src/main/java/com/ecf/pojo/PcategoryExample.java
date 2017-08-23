package com.ecf.pojo;

import java.util.ArrayList;
import java.util.List;

public class PcategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcategoryExample() {
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

        public Criteria andPcategoryidIsNull() {
            addCriterion("pcategoryid is null");
            return (Criteria) this;
        }

        public Criteria andPcategoryidIsNotNull() {
            addCriterion("pcategoryid is not null");
            return (Criteria) this;
        }

        public Criteria andPcategoryidEqualTo(Integer value) {
            addCriterion("pcategoryid =", value, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidNotEqualTo(Integer value) {
            addCriterion("pcategoryid <>", value, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidGreaterThan(Integer value) {
            addCriterion("pcategoryid >", value, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcategoryid >=", value, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidLessThan(Integer value) {
            addCriterion("pcategoryid <", value, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("pcategoryid <=", value, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidIn(List<Integer> values) {
            addCriterion("pcategoryid in", values, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidNotIn(List<Integer> values) {
            addCriterion("pcategoryid not in", values, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidBetween(Integer value1, Integer value2) {
            addCriterion("pcategoryid between", value1, value2, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("pcategoryid not between", value1, value2, "pcategoryid");
            return (Criteria) this;
        }

        public Criteria andPcategoryIsNull() {
            addCriterion("pcategory is null");
            return (Criteria) this;
        }

        public Criteria andPcategoryIsNotNull() {
            addCriterion("pcategory is not null");
            return (Criteria) this;
        }

        public Criteria andPcategoryEqualTo(String value) {
            addCriterion("pcategory =", value, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryNotEqualTo(String value) {
            addCriterion("pcategory <>", value, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryGreaterThan(String value) {
            addCriterion("pcategory >", value, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("pcategory >=", value, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryLessThan(String value) {
            addCriterion("pcategory <", value, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryLessThanOrEqualTo(String value) {
            addCriterion("pcategory <=", value, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryLike(String value) {
            addCriterion("pcategory like", value, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryNotLike(String value) {
            addCriterion("pcategory not like", value, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryIn(List<String> values) {
            addCriterion("pcategory in", values, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryNotIn(List<String> values) {
            addCriterion("pcategory not in", values, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryBetween(String value1, String value2) {
            addCriterion("pcategory between", value1, value2, "pcategory");
            return (Criteria) this;
        }

        public Criteria andPcategoryNotBetween(String value1, String value2) {
            addCriterion("pcategory not between", value1, value2, "pcategory");
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