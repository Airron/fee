package com.ecf.pojo;

import java.util.ArrayList;
import java.util.List;

public class PorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PorderExample() {
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

        public Criteria andOorderidIsNull() {
            addCriterion("oorderid is null");
            return (Criteria) this;
        }

        public Criteria andOorderidIsNotNull() {
            addCriterion("oorderid is not null");
            return (Criteria) this;
        }

        public Criteria andOorderidEqualTo(Integer value) {
            addCriterion("oorderid =", value, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidNotEqualTo(Integer value) {
            addCriterion("oorderid <>", value, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidGreaterThan(Integer value) {
            addCriterion("oorderid >", value, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oorderid >=", value, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidLessThan(Integer value) {
            addCriterion("oorderid <", value, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidLessThanOrEqualTo(Integer value) {
            addCriterion("oorderid <=", value, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidIn(List<Integer> values) {
            addCriterion("oorderid in", values, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidNotIn(List<Integer> values) {
            addCriterion("oorderid not in", values, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidBetween(Integer value1, Integer value2) {
            addCriterion("oorderid between", value1, value2, "oorderid");
            return (Criteria) this;
        }

        public Criteria andOorderidNotBetween(Integer value1, Integer value2) {
            addCriterion("oorderid not between", value1, value2, "oorderid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidIsNull() {
            addCriterion("pcftypeid is null");
            return (Criteria) this;
        }

        public Criteria andPcftypeidIsNotNull() {
            addCriterion("pcftypeid is not null");
            return (Criteria) this;
        }

        public Criteria andPcftypeidEqualTo(Integer value) {
            addCriterion("pcftypeid =", value, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidNotEqualTo(Integer value) {
            addCriterion("pcftypeid <>", value, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidGreaterThan(Integer value) {
            addCriterion("pcftypeid >", value, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcftypeid >=", value, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidLessThan(Integer value) {
            addCriterion("pcftypeid <", value, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidLessThanOrEqualTo(Integer value) {
            addCriterion("pcftypeid <=", value, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidIn(List<Integer> values) {
            addCriterion("pcftypeid in", values, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidNotIn(List<Integer> values) {
            addCriterion("pcftypeid not in", values, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidBetween(Integer value1, Integer value2) {
            addCriterion("pcftypeid between", value1, value2, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andPcftypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("pcftypeid not between", value1, value2, "pcftypeid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNull() {
            addCriterion("ostatus is null");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNotNull() {
            addCriterion("ostatus is not null");
            return (Criteria) this;
        }

        public Criteria andOstatusEqualTo(String value) {
            addCriterion("ostatus =", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotEqualTo(String value) {
            addCriterion("ostatus <>", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThan(String value) {
            addCriterion("ostatus >", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ostatus >=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThan(String value) {
            addCriterion("ostatus <", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThanOrEqualTo(String value) {
            addCriterion("ostatus <=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLike(String value) {
            addCriterion("ostatus like", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotLike(String value) {
            addCriterion("ostatus not like", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusIn(List<String> values) {
            addCriterion("ostatus in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotIn(List<String> values) {
            addCriterion("ostatus not in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusBetween(String value1, String value2) {
            addCriterion("ostatus between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotBetween(String value1, String value2) {
            addCriterion("ostatus not between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOcountIsNull() {
            addCriterion("ocount is null");
            return (Criteria) this;
        }

        public Criteria andOcountIsNotNull() {
            addCriterion("ocount is not null");
            return (Criteria) this;
        }

        public Criteria andOcountEqualTo(Integer value) {
            addCriterion("ocount =", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotEqualTo(Integer value) {
            addCriterion("ocount <>", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountGreaterThan(Integer value) {
            addCriterion("ocount >", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ocount >=", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountLessThan(Integer value) {
            addCriterion("ocount <", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountLessThanOrEqualTo(Integer value) {
            addCriterion("ocount <=", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountIn(List<Integer> values) {
            addCriterion("ocount in", values, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotIn(List<Integer> values) {
            addCriterion("ocount not in", values, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountBetween(Integer value1, Integer value2) {
            addCriterion("ocount between", value1, value2, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ocount not between", value1, value2, "ocount");
            return (Criteria) this;
        }

        public Criteria andOpriceIsNull() {
            addCriterion("oprice is null");
            return (Criteria) this;
        }

        public Criteria andOpriceIsNotNull() {
            addCriterion("oprice is not null");
            return (Criteria) this;
        }

        public Criteria andOpriceEqualTo(Integer value) {
            addCriterion("oprice =", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotEqualTo(Integer value) {
            addCriterion("oprice <>", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceGreaterThan(Integer value) {
            addCriterion("oprice >", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("oprice >=", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceLessThan(Integer value) {
            addCriterion("oprice <", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceLessThanOrEqualTo(Integer value) {
            addCriterion("oprice <=", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceIn(List<Integer> values) {
            addCriterion("oprice in", values, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotIn(List<Integer> values) {
            addCriterion("oprice not in", values, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceBetween(Integer value1, Integer value2) {
            addCriterion("oprice between", value1, value2, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("oprice not between", value1, value2, "oprice");
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