package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class NotecommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotecommentsExample() {
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

        public Criteria andNcidIsNull() {
            addCriterion("ncid is null");
            return (Criteria) this;
        }

        public Criteria andNcidIsNotNull() {
            addCriterion("ncid is not null");
            return (Criteria) this;
        }

        public Criteria andNcidEqualTo(Integer value) {
            addCriterion("ncid =", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotEqualTo(Integer value) {
            addCriterion("ncid <>", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidGreaterThan(Integer value) {
            addCriterion("ncid >", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ncid >=", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidLessThan(Integer value) {
            addCriterion("ncid <", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidLessThanOrEqualTo(Integer value) {
            addCriterion("ncid <=", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidIn(List<Integer> values) {
            addCriterion("ncid in", values, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotIn(List<Integer> values) {
            addCriterion("ncid not in", values, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidBetween(Integer value1, Integer value2) {
            addCriterion("ncid between", value1, value2, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ncid not between", value1, value2, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcreplyIsNull() {
            addCriterion("ncreply is null");
            return (Criteria) this;
        }

        public Criteria andNcreplyIsNotNull() {
            addCriterion("ncreply is not null");
            return (Criteria) this;
        }

        public Criteria andNcreplyEqualTo(String value) {
            addCriterion("ncreply =", value, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyNotEqualTo(String value) {
            addCriterion("ncreply <>", value, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyGreaterThan(String value) {
            addCriterion("ncreply >", value, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyGreaterThanOrEqualTo(String value) {
            addCriterion("ncreply >=", value, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyLessThan(String value) {
            addCriterion("ncreply <", value, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyLessThanOrEqualTo(String value) {
            addCriterion("ncreply <=", value, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyLike(String value) {
            addCriterion("ncreply like", value, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyNotLike(String value) {
            addCriterion("ncreply not like", value, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyIn(List<String> values) {
            addCriterion("ncreply in", values, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyNotIn(List<String> values) {
            addCriterion("ncreply not in", values, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyBetween(String value1, String value2) {
            addCriterion("ncreply between", value1, value2, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNcreplyNotBetween(String value1, String value2) {
            addCriterion("ncreply not between", value1, value2, "ncreply");
            return (Criteria) this;
        }

        public Criteria andNclikeIsNull() {
            addCriterion("nclike is null");
            return (Criteria) this;
        }

        public Criteria andNclikeIsNotNull() {
            addCriterion("nclike is not null");
            return (Criteria) this;
        }

        public Criteria andNclikeEqualTo(Integer value) {
            addCriterion("nclike =", value, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeNotEqualTo(Integer value) {
            addCriterion("nclike <>", value, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeGreaterThan(Integer value) {
            addCriterion("nclike >", value, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nclike >=", value, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeLessThan(Integer value) {
            addCriterion("nclike <", value, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeLessThanOrEqualTo(Integer value) {
            addCriterion("nclike <=", value, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeIn(List<Integer> values) {
            addCriterion("nclike in", values, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeNotIn(List<Integer> values) {
            addCriterion("nclike not in", values, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeBetween(Integer value1, Integer value2) {
            addCriterion("nclike between", value1, value2, "nclike");
            return (Criteria) this;
        }

        public Criteria andNclikeNotBetween(Integer value1, Integer value2) {
            addCriterion("nclike not between", value1, value2, "nclike");
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