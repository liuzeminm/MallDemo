package cn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotesortingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotesortingExample() {
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

        public Criteria andNsidIsNull() {
            addCriterion("nsid is null");
            return (Criteria) this;
        }

        public Criteria andNsidIsNotNull() {
            addCriterion("nsid is not null");
            return (Criteria) this;
        }

        public Criteria andNsidEqualTo(Integer value) {
            addCriterion("nsid =", value, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidNotEqualTo(Integer value) {
            addCriterion("nsid <>", value, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidGreaterThan(Integer value) {
            addCriterion("nsid >", value, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nsid >=", value, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidLessThan(Integer value) {
            addCriterion("nsid <", value, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidLessThanOrEqualTo(Integer value) {
            addCriterion("nsid <=", value, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidIn(List<Integer> values) {
            addCriterion("nsid in", values, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidNotIn(List<Integer> values) {
            addCriterion("nsid not in", values, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidBetween(Integer value1, Integer value2) {
            addCriterion("nsid between", value1, value2, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsidNotBetween(Integer value1, Integer value2) {
            addCriterion("nsid not between", value1, value2, "nsid");
            return (Criteria) this;
        }

        public Criteria andNsheatIsNull() {
            addCriterion("nsheat is null");
            return (Criteria) this;
        }

        public Criteria andNsheatIsNotNull() {
            addCriterion("nsheat is not null");
            return (Criteria) this;
        }

        public Criteria andNsheatEqualTo(String value) {
            addCriterion("nsheat =", value, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatNotEqualTo(String value) {
            addCriterion("nsheat <>", value, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatGreaterThan(String value) {
            addCriterion("nsheat >", value, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatGreaterThanOrEqualTo(String value) {
            addCriterion("nsheat >=", value, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatLessThan(String value) {
            addCriterion("nsheat <", value, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatLessThanOrEqualTo(String value) {
            addCriterion("nsheat <=", value, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatLike(String value) {
            addCriterion("nsheat like", value, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatNotLike(String value) {
            addCriterion("nsheat not like", value, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatIn(List<String> values) {
            addCriterion("nsheat in", values, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatNotIn(List<String> values) {
            addCriterion("nsheat not in", values, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatBetween(String value1, String value2) {
            addCriterion("nsheat between", value1, value2, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNsheatNotBetween(String value1, String value2) {
            addCriterion("nsheat not between", value1, value2, "nsheat");
            return (Criteria) this;
        }

        public Criteria andNstimeIsNull() {
            addCriterion("nstime is null");
            return (Criteria) this;
        }

        public Criteria andNstimeIsNotNull() {
            addCriterion("nstime is not null");
            return (Criteria) this;
        }

        public Criteria andNstimeEqualTo(Date value) {
            addCriterion("nstime =", value, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeNotEqualTo(Date value) {
            addCriterion("nstime <>", value, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeGreaterThan(Date value) {
            addCriterion("nstime >", value, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nstime >=", value, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeLessThan(Date value) {
            addCriterion("nstime <", value, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeLessThanOrEqualTo(Date value) {
            addCriterion("nstime <=", value, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeIn(List<Date> values) {
            addCriterion("nstime in", values, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeNotIn(List<Date> values) {
            addCriterion("nstime not in", values, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeBetween(Date value1, Date value2) {
            addCriterion("nstime between", value1, value2, "nstime");
            return (Criteria) this;
        }

        public Criteria andNstimeNotBetween(Date value1, Date value2) {
            addCriterion("nstime not between", value1, value2, "nstime");
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