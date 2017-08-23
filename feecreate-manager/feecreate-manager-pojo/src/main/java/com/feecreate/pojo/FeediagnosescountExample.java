package com.feecreate.pojo;

import java.util.ArrayList;
import java.util.List;

public class FeediagnosescountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeediagnosescountExample() {
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

        public Criteria andDiagnosesidIsNull() {
            addCriterion("diagnosesId is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidIsNotNull() {
            addCriterion("diagnosesId is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidEqualTo(Integer value) {
            addCriterion("diagnosesId =", value, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidNotEqualTo(Integer value) {
            addCriterion("diagnosesId <>", value, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidGreaterThan(Integer value) {
            addCriterion("diagnosesId >", value, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("diagnosesId >=", value, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidLessThan(Integer value) {
            addCriterion("diagnosesId <", value, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidLessThanOrEqualTo(Integer value) {
            addCriterion("diagnosesId <=", value, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidIn(List<Integer> values) {
            addCriterion("diagnosesId in", values, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidNotIn(List<Integer> values) {
            addCriterion("diagnosesId not in", values, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidBetween(Integer value1, Integer value2) {
            addCriterion("diagnosesId between", value1, value2, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesidNotBetween(Integer value1, Integer value2) {
            addCriterion("diagnosesId not between", value1, value2, "diagnosesid");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateIsNull() {
            addCriterion("diagnosesDate is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateIsNotNull() {
            addCriterion("diagnosesDate is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateEqualTo(String value) {
            addCriterion("diagnosesDate =", value, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateNotEqualTo(String value) {
            addCriterion("diagnosesDate <>", value, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateGreaterThan(String value) {
            addCriterion("diagnosesDate >", value, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosesDate >=", value, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateLessThan(String value) {
            addCriterion("diagnosesDate <", value, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateLessThanOrEqualTo(String value) {
            addCriterion("diagnosesDate <=", value, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateLike(String value) {
            addCriterion("diagnosesDate like", value, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateNotLike(String value) {
            addCriterion("diagnosesDate not like", value, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateIn(List<String> values) {
            addCriterion("diagnosesDate in", values, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateNotIn(List<String> values) {
            addCriterion("diagnosesDate not in", values, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateBetween(String value1, String value2) {
            addCriterion("diagnosesDate between", value1, value2, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosesdateNotBetween(String value1, String value2) {
            addCriterion("diagnosesDate not between", value1, value2, "diagnosesdate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidIsNull() {
            addCriterion("diagnosesHospitalId is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidIsNotNull() {
            addCriterion("diagnosesHospitalId is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidEqualTo(Integer value) {
            addCriterion("diagnosesHospitalId =", value, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidNotEqualTo(Integer value) {
            addCriterion("diagnosesHospitalId <>", value, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidGreaterThan(Integer value) {
            addCriterion("diagnosesHospitalId >", value, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("diagnosesHospitalId >=", value, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidLessThan(Integer value) {
            addCriterion("diagnosesHospitalId <", value, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidLessThanOrEqualTo(Integer value) {
            addCriterion("diagnosesHospitalId <=", value, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidIn(List<Integer> values) {
            addCriterion("diagnosesHospitalId in", values, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidNotIn(List<Integer> values) {
            addCriterion("diagnosesHospitalId not in", values, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidBetween(Integer value1, Integer value2) {
            addCriterion("diagnosesHospitalId between", value1, value2, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnoseshospitalidNotBetween(Integer value1, Integer value2) {
            addCriterion("diagnosesHospitalId not between", value1, value2, "diagnoseshospitalid");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountIsNull() {
            addCriterion("diagnosesCount is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountIsNotNull() {
            addCriterion("diagnosesCount is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountEqualTo(Integer value) {
            addCriterion("diagnosesCount =", value, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountNotEqualTo(Integer value) {
            addCriterion("diagnosesCount <>", value, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountGreaterThan(Integer value) {
            addCriterion("diagnosesCount >", value, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountGreaterThanOrEqualTo(Integer value) {
            addCriterion("diagnosesCount >=", value, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountLessThan(Integer value) {
            addCriterion("diagnosesCount <", value, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountLessThanOrEqualTo(Integer value) {
            addCriterion("diagnosesCount <=", value, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountIn(List<Integer> values) {
            addCriterion("diagnosesCount in", values, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountNotIn(List<Integer> values) {
            addCriterion("diagnosesCount not in", values, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountBetween(Integer value1, Integer value2) {
            addCriterion("diagnosesCount between", value1, value2, "diagnosescount");
            return (Criteria) this;
        }

        public Criteria andDiagnosescountNotBetween(Integer value1, Integer value2) {
            addCriterion("diagnosesCount not between", value1, value2, "diagnosescount");
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