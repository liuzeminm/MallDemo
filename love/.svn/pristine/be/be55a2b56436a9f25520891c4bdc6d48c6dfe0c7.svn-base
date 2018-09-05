package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andReportidIsNull() {
            addCriterion("reportid is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("reportid is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(Integer value) {
            addCriterion("reportid =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(Integer value) {
            addCriterion("reportid <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(Integer value) {
            addCriterion("reportid >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportid >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(Integer value) {
            addCriterion("reportid <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(Integer value) {
            addCriterion("reportid <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<Integer> values) {
            addCriterion("reportid in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<Integer> values) {
            addCriterion("reportid not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(Integer value1, Integer value2) {
            addCriterion("reportid between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(Integer value1, Integer value2) {
            addCriterion("reportid not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportmessageIsNull() {
            addCriterion("reportmessage is null");
            return (Criteria) this;
        }

        public Criteria andReportmessageIsNotNull() {
            addCriterion("reportmessage is not null");
            return (Criteria) this;
        }

        public Criteria andReportmessageEqualTo(String value) {
            addCriterion("reportmessage =", value, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageNotEqualTo(String value) {
            addCriterion("reportmessage <>", value, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageGreaterThan(String value) {
            addCriterion("reportmessage >", value, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageGreaterThanOrEqualTo(String value) {
            addCriterion("reportmessage >=", value, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageLessThan(String value) {
            addCriterion("reportmessage <", value, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageLessThanOrEqualTo(String value) {
            addCriterion("reportmessage <=", value, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageLike(String value) {
            addCriterion("reportmessage like", value, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageNotLike(String value) {
            addCriterion("reportmessage not like", value, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageIn(List<String> values) {
            addCriterion("reportmessage in", values, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageNotIn(List<String> values) {
            addCriterion("reportmessage not in", values, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageBetween(String value1, String value2) {
            addCriterion("reportmessage between", value1, value2, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportmessageNotBetween(String value1, String value2) {
            addCriterion("reportmessage not between", value1, value2, "reportmessage");
            return (Criteria) this;
        }

        public Criteria andReportpictureIsNull() {
            addCriterion("reportpicture is null");
            return (Criteria) this;
        }

        public Criteria andReportpictureIsNotNull() {
            addCriterion("reportpicture is not null");
            return (Criteria) this;
        }

        public Criteria andReportpictureEqualTo(String value) {
            addCriterion("reportpicture =", value, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureNotEqualTo(String value) {
            addCriterion("reportpicture <>", value, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureGreaterThan(String value) {
            addCriterion("reportpicture >", value, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureGreaterThanOrEqualTo(String value) {
            addCriterion("reportpicture >=", value, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureLessThan(String value) {
            addCriterion("reportpicture <", value, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureLessThanOrEqualTo(String value) {
            addCriterion("reportpicture <=", value, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureLike(String value) {
            addCriterion("reportpicture like", value, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureNotLike(String value) {
            addCriterion("reportpicture not like", value, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureIn(List<String> values) {
            addCriterion("reportpicture in", values, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureNotIn(List<String> values) {
            addCriterion("reportpicture not in", values, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureBetween(String value1, String value2) {
            addCriterion("reportpicture between", value1, value2, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReportpictureNotBetween(String value1, String value2) {
            addCriterion("reportpicture not between", value1, value2, "reportpicture");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNull() {
            addCriterion("reporttype is null");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNotNull() {
            addCriterion("reporttype is not null");
            return (Criteria) this;
        }

        public Criteria andReporttypeEqualTo(Integer value) {
            addCriterion("reporttype =", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotEqualTo(Integer value) {
            addCriterion("reporttype <>", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThan(Integer value) {
            addCriterion("reporttype >", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reporttype >=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThan(Integer value) {
            addCriterion("reporttype <", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThanOrEqualTo(Integer value) {
            addCriterion("reporttype <=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeIn(List<Integer> values) {
            addCriterion("reporttype in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotIn(List<Integer> values) {
            addCriterion("reporttype not in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeBetween(Integer value1, Integer value2) {
            addCriterion("reporttype between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("reporttype not between", value1, value2, "reporttype");
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