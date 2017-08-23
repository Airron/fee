package com.feecreate.pojo;

import java.util.ArrayList;
import java.util.List;

public class FeehospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeehospitalExample() {
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

        public Criteria andHospitalidIsNull() {
            addCriterion("hospitalId is null");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNotNull() {
            addCriterion("hospitalId is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalidEqualTo(Integer value) {
            addCriterion("hospitalId =", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotEqualTo(Integer value) {
            addCriterion("hospitalId <>", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThan(Integer value) {
            addCriterion("hospitalId >", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalId >=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThan(Integer value) {
            addCriterion("hospitalId <", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalId <=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidIn(List<Integer> values) {
            addCriterion("hospitalId in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotIn(List<Integer> values) {
            addCriterion("hospitalId not in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidBetween(Integer value1, Integer value2) {
            addCriterion("hospitalId between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalId not between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidIsNull() {
            addCriterion("hospitalAreaId is null");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidIsNotNull() {
            addCriterion("hospitalAreaId is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidEqualTo(Integer value) {
            addCriterion("hospitalAreaId =", value, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidNotEqualTo(Integer value) {
            addCriterion("hospitalAreaId <>", value, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidGreaterThan(Integer value) {
            addCriterion("hospitalAreaId >", value, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalAreaId >=", value, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidLessThan(Integer value) {
            addCriterion("hospitalAreaId <", value, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalAreaId <=", value, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidIn(List<Integer> values) {
            addCriterion("hospitalAreaId in", values, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidNotIn(List<Integer> values) {
            addCriterion("hospitalAreaId not in", values, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidBetween(Integer value1, Integer value2) {
            addCriterion("hospitalAreaId between", value1, value2, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalareaidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalAreaId not between", value1, value2, "hospitalareaid");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNull() {
            addCriterion("hospitalName is null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNotNull() {
            addCriterion("hospitalName is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameEqualTo(String value) {
            addCriterion("hospitalName =", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotEqualTo(String value) {
            addCriterion("hospitalName <>", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThan(String value) {
            addCriterion("hospitalName >", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThanOrEqualTo(String value) {
            addCriterion("hospitalName >=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThan(String value) {
            addCriterion("hospitalName <", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThanOrEqualTo(String value) {
            addCriterion("hospitalName <=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLike(String value) {
            addCriterion("hospitalName like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotLike(String value) {
            addCriterion("hospitalName not like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIn(List<String> values) {
            addCriterion("hospitalName in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotIn(List<String> values) {
            addCriterion("hospitalName not in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameBetween(String value1, String value2) {
            addCriterion("hospitalName between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotBetween(String value1, String value2) {
            addCriterion("hospitalName not between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameIsNull() {
            addCriterion("hospitalShortname is null");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameIsNotNull() {
            addCriterion("hospitalShortname is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameEqualTo(String value) {
            addCriterion("hospitalShortname =", value, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameNotEqualTo(String value) {
            addCriterion("hospitalShortname <>", value, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameGreaterThan(String value) {
            addCriterion("hospitalShortname >", value, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("hospitalShortname >=", value, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameLessThan(String value) {
            addCriterion("hospitalShortname <", value, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameLessThanOrEqualTo(String value) {
            addCriterion("hospitalShortname <=", value, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameLike(String value) {
            addCriterion("hospitalShortname like", value, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameNotLike(String value) {
            addCriterion("hospitalShortname not like", value, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameIn(List<String> values) {
            addCriterion("hospitalShortname in", values, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameNotIn(List<String> values) {
            addCriterion("hospitalShortname not in", values, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameBetween(String value1, String value2) {
            addCriterion("hospitalShortname between", value1, value2, "hospitalshortname");
            return (Criteria) this;
        }

        public Criteria andHospitalshortnameNotBetween(String value1, String value2) {
            addCriterion("hospitalShortname not between", value1, value2, "hospitalshortname");
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