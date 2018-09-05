package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class SortordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SortordExample() {
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

        public Criteria andSdidIsNull() {
            addCriterion("sdid is null");
            return (Criteria) this;
        }

        public Criteria andSdidIsNotNull() {
            addCriterion("sdid is not null");
            return (Criteria) this;
        }

        public Criteria andSdidEqualTo(Integer value) {
            addCriterion("sdid =", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotEqualTo(Integer value) {
            addCriterion("sdid <>", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThan(Integer value) {
            addCriterion("sdid >", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdid >=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThan(Integer value) {
            addCriterion("sdid <", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThanOrEqualTo(Integer value) {
            addCriterion("sdid <=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidIn(List<Integer> values) {
            addCriterion("sdid in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotIn(List<Integer> values) {
            addCriterion("sdid not in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidBetween(Integer value1, Integer value2) {
            addCriterion("sdid between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotBetween(Integer value1, Integer value2) {
            addCriterion("sdid not between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdtimeIsNull() {
            addCriterion("sdtime is null");
            return (Criteria) this;
        }

        public Criteria andSdtimeIsNotNull() {
            addCriterion("sdtime is not null");
            return (Criteria) this;
        }

        public Criteria andSdtimeEqualTo(String value) {
            addCriterion("sdtime =", value, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeNotEqualTo(String value) {
            addCriterion("sdtime <>", value, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeGreaterThan(String value) {
            addCriterion("sdtime >", value, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sdtime >=", value, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeLessThan(String value) {
            addCriterion("sdtime <", value, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeLessThanOrEqualTo(String value) {
            addCriterion("sdtime <=", value, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeLike(String value) {
            addCriterion("sdtime like", value, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeNotLike(String value) {
            addCriterion("sdtime not like", value, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeIn(List<String> values) {
            addCriterion("sdtime in", values, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeNotIn(List<String> values) {
            addCriterion("sdtime not in", values, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeBetween(String value1, String value2) {
            addCriterion("sdtime between", value1, value2, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdtimeNotBetween(String value1, String value2) {
            addCriterion("sdtime not between", value1, value2, "sdtime");
            return (Criteria) this;
        }

        public Criteria andSdheatIsNull() {
            addCriterion("sdheat is null");
            return (Criteria) this;
        }

        public Criteria andSdheatIsNotNull() {
            addCriterion("sdheat is not null");
            return (Criteria) this;
        }

        public Criteria andSdheatEqualTo(String value) {
            addCriterion("sdheat =", value, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatNotEqualTo(String value) {
            addCriterion("sdheat <>", value, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatGreaterThan(String value) {
            addCriterion("sdheat >", value, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatGreaterThanOrEqualTo(String value) {
            addCriterion("sdheat >=", value, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatLessThan(String value) {
            addCriterion("sdheat <", value, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatLessThanOrEqualTo(String value) {
            addCriterion("sdheat <=", value, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatLike(String value) {
            addCriterion("sdheat like", value, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatNotLike(String value) {
            addCriterion("sdheat not like", value, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatIn(List<String> values) {
            addCriterion("sdheat in", values, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatNotIn(List<String> values) {
            addCriterion("sdheat not in", values, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatBetween(String value1, String value2) {
            addCriterion("sdheat between", value1, value2, "sdheat");
            return (Criteria) this;
        }

        public Criteria andSdheatNotBetween(String value1, String value2) {
            addCriterion("sdheat not between", value1, value2, "sdheat");
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