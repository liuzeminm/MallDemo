package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class MerchantsfansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantsfansExample() {
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

        public Criteria andMfidIsNull() {
            addCriterion("mfid is null");
            return (Criteria) this;
        }

        public Criteria andMfidIsNotNull() {
            addCriterion("mfid is not null");
            return (Criteria) this;
        }

        public Criteria andMfidEqualTo(Integer value) {
            addCriterion("mfid =", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotEqualTo(Integer value) {
            addCriterion("mfid <>", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidGreaterThan(Integer value) {
            addCriterion("mfid >", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mfid >=", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidLessThan(Integer value) {
            addCriterion("mfid <", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidLessThanOrEqualTo(Integer value) {
            addCriterion("mfid <=", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidIn(List<Integer> values) {
            addCriterion("mfid in", values, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotIn(List<Integer> values) {
            addCriterion("mfid not in", values, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidBetween(Integer value1, Integer value2) {
            addCriterion("mfid between", value1, value2, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotBetween(Integer value1, Integer value2) {
            addCriterion("mfid not between", value1, value2, "mfid");
            return (Criteria) this;
        }

        public Criteria andMflikeIsNull() {
            addCriterion("mflike is null");
            return (Criteria) this;
        }

        public Criteria andMflikeIsNotNull() {
            addCriterion("mflike is not null");
            return (Criteria) this;
        }

        public Criteria andMflikeEqualTo(Integer value) {
            addCriterion("mflike =", value, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeNotEqualTo(Integer value) {
            addCriterion("mflike <>", value, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeGreaterThan(Integer value) {
            addCriterion("mflike >", value, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mflike >=", value, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeLessThan(Integer value) {
            addCriterion("mflike <", value, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeLessThanOrEqualTo(Integer value) {
            addCriterion("mflike <=", value, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeIn(List<Integer> values) {
            addCriterion("mflike in", values, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeNotIn(List<Integer> values) {
            addCriterion("mflike not in", values, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeBetween(Integer value1, Integer value2) {
            addCriterion("mflike between", value1, value2, "mflike");
            return (Criteria) this;
        }

        public Criteria andMflikeNotBetween(Integer value1, Integer value2) {
            addCriterion("mflike not between", value1, value2, "mflike");
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