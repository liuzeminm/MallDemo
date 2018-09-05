package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class SearchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SearchExample() {
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

        public Criteria andShidIsNull() {
            addCriterion("shid is null");
            return (Criteria) this;
        }

        public Criteria andShidIsNotNull() {
            addCriterion("shid is not null");
            return (Criteria) this;
        }

        public Criteria andShidEqualTo(Integer value) {
            addCriterion("shid =", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidNotEqualTo(Integer value) {
            addCriterion("shid <>", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidGreaterThan(Integer value) {
            addCriterion("shid >", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shid >=", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidLessThan(Integer value) {
            addCriterion("shid <", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidLessThanOrEqualTo(Integer value) {
            addCriterion("shid <=", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidIn(List<Integer> values) {
            addCriterion("shid in", values, "shid");
            return (Criteria) this;
        }

        public Criteria andShidNotIn(List<Integer> values) {
            addCriterion("shid not in", values, "shid");
            return (Criteria) this;
        }

        public Criteria andShidBetween(Integer value1, Integer value2) {
            addCriterion("shid between", value1, value2, "shid");
            return (Criteria) this;
        }

        public Criteria andShidNotBetween(Integer value1, Integer value2) {
            addCriterion("shid not between", value1, value2, "shid");
            return (Criteria) this;
        }

        public Criteria andShtypeIsNull() {
            addCriterion("shtype is null");
            return (Criteria) this;
        }

        public Criteria andShtypeIsNotNull() {
            addCriterion("shtype is not null");
            return (Criteria) this;
        }

        public Criteria andShtypeEqualTo(String value) {
            addCriterion("shtype =", value, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeNotEqualTo(String value) {
            addCriterion("shtype <>", value, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeGreaterThan(String value) {
            addCriterion("shtype >", value, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeGreaterThanOrEqualTo(String value) {
            addCriterion("shtype >=", value, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeLessThan(String value) {
            addCriterion("shtype <", value, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeLessThanOrEqualTo(String value) {
            addCriterion("shtype <=", value, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeLike(String value) {
            addCriterion("shtype like", value, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeNotLike(String value) {
            addCriterion("shtype not like", value, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeIn(List<String> values) {
            addCriterion("shtype in", values, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeNotIn(List<String> values) {
            addCriterion("shtype not in", values, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeBetween(String value1, String value2) {
            addCriterion("shtype between", value1, value2, "shtype");
            return (Criteria) this;
        }

        public Criteria andShtypeNotBetween(String value1, String value2) {
            addCriterion("shtype not between", value1, value2, "shtype");
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