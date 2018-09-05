package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andCollectidIsNull() {
            addCriterion("collectid is null");
            return (Criteria) this;
        }

        public Criteria andCollectidIsNotNull() {
            addCriterion("collectid is not null");
            return (Criteria) this;
        }

        public Criteria andCollectidEqualTo(Integer value) {
            addCriterion("collectid =", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotEqualTo(Integer value) {
            addCriterion("collectid <>", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidGreaterThan(Integer value) {
            addCriterion("collectid >", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectid >=", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidLessThan(Integer value) {
            addCriterion("collectid <", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidLessThanOrEqualTo(Integer value) {
            addCriterion("collectid <=", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidIn(List<Integer> values) {
            addCriterion("collectid in", values, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotIn(List<Integer> values) {
            addCriterion("collectid not in", values, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidBetween(Integer value1, Integer value2) {
            addCriterion("collectid between", value1, value2, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotBetween(Integer value1, Integer value2) {
            addCriterion("collectid not between", value1, value2, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumIsNull() {
            addCriterion("collectmyalbum is null");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumIsNotNull() {
            addCriterion("collectmyalbum is not null");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumEqualTo(String value) {
            addCriterion("collectmyalbum =", value, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumNotEqualTo(String value) {
            addCriterion("collectmyalbum <>", value, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumGreaterThan(String value) {
            addCriterion("collectmyalbum >", value, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumGreaterThanOrEqualTo(String value) {
            addCriterion("collectmyalbum >=", value, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumLessThan(String value) {
            addCriterion("collectmyalbum <", value, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumLessThanOrEqualTo(String value) {
            addCriterion("collectmyalbum <=", value, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumLike(String value) {
            addCriterion("collectmyalbum like", value, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumNotLike(String value) {
            addCriterion("collectmyalbum not like", value, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumIn(List<String> values) {
            addCriterion("collectmyalbum in", values, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumNotIn(List<String> values) {
            addCriterion("collectmyalbum not in", values, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumBetween(String value1, String value2) {
            addCriterion("collectmyalbum between", value1, value2, "collectmyalbum");
            return (Criteria) this;
        }

        public Criteria andCollectmyalbumNotBetween(String value1, String value2) {
            addCriterion("collectmyalbum not between", value1, value2, "collectmyalbum");
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