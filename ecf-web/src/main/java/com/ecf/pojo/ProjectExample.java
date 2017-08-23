package com.ecf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
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

        public Criteria andPstatusIsNull() {
            addCriterion("pstatus is null");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNotNull() {
            addCriterion("pstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPstatusEqualTo(Boolean value) {
            addCriterion("pstatus =", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotEqualTo(Boolean value) {
            addCriterion("pstatus <>", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThan(Boolean value) {
            addCriterion("pstatus >", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pstatus >=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThan(Boolean value) {
            addCriterion("pstatus <", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThanOrEqualTo(Boolean value) {
            addCriterion("pstatus <=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusIn(List<Boolean> values) {
            addCriterion("pstatus in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotIn(List<Boolean> values) {
            addCriterion("pstatus not in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusBetween(Boolean value1, Boolean value2) {
            addCriterion("pstatus between", value1, value2, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pstatus not between", value1, value2, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPgoalIsNull() {
            addCriterion("pgoal is null");
            return (Criteria) this;
        }

        public Criteria andPgoalIsNotNull() {
            addCriterion("pgoal is not null");
            return (Criteria) this;
        }

        public Criteria andPgoalEqualTo(Integer value) {
            addCriterion("pgoal =", value, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalNotEqualTo(Integer value) {
            addCriterion("pgoal <>", value, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalGreaterThan(Integer value) {
            addCriterion("pgoal >", value, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalGreaterThanOrEqualTo(Integer value) {
            addCriterion("pgoal >=", value, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalLessThan(Integer value) {
            addCriterion("pgoal <", value, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalLessThanOrEqualTo(Integer value) {
            addCriterion("pgoal <=", value, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalIn(List<Integer> values) {
            addCriterion("pgoal in", values, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalNotIn(List<Integer> values) {
            addCriterion("pgoal not in", values, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalBetween(Integer value1, Integer value2) {
            addCriterion("pgoal between", value1, value2, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPgoalNotBetween(Integer value1, Integer value2) {
            addCriterion("pgoal not between", value1, value2, "pgoal");
            return (Criteria) this;
        }

        public Criteria andPpledgedIsNull() {
            addCriterion("ppledged is null");
            return (Criteria) this;
        }

        public Criteria andPpledgedIsNotNull() {
            addCriterion("ppledged is not null");
            return (Criteria) this;
        }

        public Criteria andPpledgedEqualTo(Integer value) {
            addCriterion("ppledged =", value, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedNotEqualTo(Integer value) {
            addCriterion("ppledged <>", value, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedGreaterThan(Integer value) {
            addCriterion("ppledged >", value, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppledged >=", value, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedLessThan(Integer value) {
            addCriterion("ppledged <", value, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedLessThanOrEqualTo(Integer value) {
            addCriterion("ppledged <=", value, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedIn(List<Integer> values) {
            addCriterion("ppledged in", values, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedNotIn(List<Integer> values) {
            addCriterion("ppledged not in", values, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedBetween(Integer value1, Integer value2) {
            addCriterion("ppledged between", value1, value2, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPpledgedNotBetween(Integer value1, Integer value2) {
            addCriterion("ppledged not between", value1, value2, "ppledged");
            return (Criteria) this;
        }

        public Criteria andPstartdateIsNull() {
            addCriterion("pstartdate is null");
            return (Criteria) this;
        }

        public Criteria andPstartdateIsNotNull() {
            addCriterion("pstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andPstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("pstartdate =", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pstartdate <>", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("pstartdate >", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pstartdate >=", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateLessThan(Date value) {
            addCriterionForJDBCDate("pstartdate <", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pstartdate <=", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("pstartdate in", values, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pstartdate not in", values, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pstartdate between", value1, value2, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pstartdate not between", value1, value2, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPenddateIsNull() {
            addCriterion("penddate is null");
            return (Criteria) this;
        }

        public Criteria andPenddateIsNotNull() {
            addCriterion("penddate is not null");
            return (Criteria) this;
        }

        public Criteria andPenddateEqualTo(Integer value) {
            addCriterion("penddate =", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateNotEqualTo(Integer value) {
            addCriterion("penddate <>", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateGreaterThan(Integer value) {
            addCriterion("penddate >", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateGreaterThanOrEqualTo(Integer value) {
            addCriterion("penddate >=", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateLessThan(Integer value) {
            addCriterion("penddate <", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateLessThanOrEqualTo(Integer value) {
            addCriterion("penddate <=", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateIn(List<Integer> values) {
            addCriterion("penddate in", values, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateNotIn(List<Integer> values) {
            addCriterion("penddate not in", values, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateBetween(Integer value1, Integer value2) {
            addCriterion("penddate between", value1, value2, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateNotBetween(Integer value1, Integer value2) {
            addCriterion("penddate not between", value1, value2, "penddate");
            return (Criteria) this;
        }

        public Criteria andPblurbIsNull() {
            addCriterion("pblurb is null");
            return (Criteria) this;
        }

        public Criteria andPblurbIsNotNull() {
            addCriterion("pblurb is not null");
            return (Criteria) this;
        }

        public Criteria andPblurbEqualTo(Integer value) {
            addCriterion("pblurb =", value, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbNotEqualTo(Integer value) {
            addCriterion("pblurb <>", value, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbGreaterThan(Integer value) {
            addCriterion("pblurb >", value, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbGreaterThanOrEqualTo(Integer value) {
            addCriterion("pblurb >=", value, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbLessThan(Integer value) {
            addCriterion("pblurb <", value, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbLessThanOrEqualTo(Integer value) {
            addCriterion("pblurb <=", value, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbIn(List<Integer> values) {
            addCriterion("pblurb in", values, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbNotIn(List<Integer> values) {
            addCriterion("pblurb not in", values, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbBetween(Integer value1, Integer value2) {
            addCriterion("pblurb between", value1, value2, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPblurbNotBetween(Integer value1, Integer value2) {
            addCriterion("pblurb not between", value1, value2, "pblurb");
            return (Criteria) this;
        }

        public Criteria andPcontentIsNull() {
            addCriterion("pcontent is null");
            return (Criteria) this;
        }

        public Criteria andPcontentIsNotNull() {
            addCriterion("pcontent is not null");
            return (Criteria) this;
        }

        public Criteria andPcontentEqualTo(String value) {
            addCriterion("pcontent =", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotEqualTo(String value) {
            addCriterion("pcontent <>", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentGreaterThan(String value) {
            addCriterion("pcontent >", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentGreaterThanOrEqualTo(String value) {
            addCriterion("pcontent >=", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLessThan(String value) {
            addCriterion("pcontent <", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLessThanOrEqualTo(String value) {
            addCriterion("pcontent <=", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLike(String value) {
            addCriterion("pcontent like", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotLike(String value) {
            addCriterion("pcontent not like", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentIn(List<String> values) {
            addCriterion("pcontent in", values, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotIn(List<String> values) {
            addCriterion("pcontent not in", values, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentBetween(String value1, String value2) {
            addCriterion("pcontent between", value1, value2, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotBetween(String value1, String value2) {
            addCriterion("pcontent not between", value1, value2, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPimageIsNull() {
            addCriterion("pimage is null");
            return (Criteria) this;
        }

        public Criteria andPimageIsNotNull() {
            addCriterion("pimage is not null");
            return (Criteria) this;
        }

        public Criteria andPimageEqualTo(String value) {
            addCriterion("pimage =", value, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageNotEqualTo(String value) {
            addCriterion("pimage <>", value, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageGreaterThan(String value) {
            addCriterion("pimage >", value, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageGreaterThanOrEqualTo(String value) {
            addCriterion("pimage >=", value, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageLessThan(String value) {
            addCriterion("pimage <", value, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageLessThanOrEqualTo(String value) {
            addCriterion("pimage <=", value, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageLike(String value) {
            addCriterion("pimage like", value, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageNotLike(String value) {
            addCriterion("pimage not like", value, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageIn(List<String> values) {
            addCriterion("pimage in", values, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageNotIn(List<String> values) {
            addCriterion("pimage not in", values, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageBetween(String value1, String value2) {
            addCriterion("pimage between", value1, value2, "pimage");
            return (Criteria) this;
        }

        public Criteria andPimageNotBetween(String value1, String value2) {
            addCriterion("pimage not between", value1, value2, "pimage");
            return (Criteria) this;
        }

        public Criteria andPrecommendIsNull() {
            addCriterion("precommend is null");
            return (Criteria) this;
        }

        public Criteria andPrecommendIsNotNull() {
            addCriterion("precommend is not null");
            return (Criteria) this;
        }

        public Criteria andPrecommendEqualTo(Integer value) {
            addCriterion("precommend =", value, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendNotEqualTo(Integer value) {
            addCriterion("precommend <>", value, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendGreaterThan(Integer value) {
            addCriterion("precommend >", value, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("precommend >=", value, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendLessThan(Integer value) {
            addCriterion("precommend <", value, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendLessThanOrEqualTo(Integer value) {
            addCriterion("precommend <=", value, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendIn(List<Integer> values) {
            addCriterion("precommend in", values, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendNotIn(List<Integer> values) {
            addCriterion("precommend not in", values, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendBetween(Integer value1, Integer value2) {
            addCriterion("precommend between", value1, value2, "precommend");
            return (Criteria) this;
        }

        public Criteria andPrecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("precommend not between", value1, value2, "precommend");
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