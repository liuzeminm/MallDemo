package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class NotesdraftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotesdraftExample() {
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

        public Criteria andNdidIsNull() {
            addCriterion("ndid is null");
            return (Criteria) this;
        }

        public Criteria andNdidIsNotNull() {
            addCriterion("ndid is not null");
            return (Criteria) this;
        }

        public Criteria andNdidEqualTo(Integer value) {
            addCriterion("ndid =", value, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidNotEqualTo(Integer value) {
            addCriterion("ndid <>", value, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidGreaterThan(Integer value) {
            addCriterion("ndid >", value, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ndid >=", value, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidLessThan(Integer value) {
            addCriterion("ndid <", value, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidLessThanOrEqualTo(Integer value) {
            addCriterion("ndid <=", value, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidIn(List<Integer> values) {
            addCriterion("ndid in", values, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidNotIn(List<Integer> values) {
            addCriterion("ndid not in", values, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidBetween(Integer value1, Integer value2) {
            addCriterion("ndid between", value1, value2, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdidNotBetween(Integer value1, Integer value2) {
            addCriterion("ndid not between", value1, value2, "ndid");
            return (Criteria) this;
        }

        public Criteria andNdnoteIsNull() {
            addCriterion("ndnote is null");
            return (Criteria) this;
        }

        public Criteria andNdnoteIsNotNull() {
            addCriterion("ndnote is not null");
            return (Criteria) this;
        }

        public Criteria andNdnoteEqualTo(String value) {
            addCriterion("ndnote =", value, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteNotEqualTo(String value) {
            addCriterion("ndnote <>", value, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteGreaterThan(String value) {
            addCriterion("ndnote >", value, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteGreaterThanOrEqualTo(String value) {
            addCriterion("ndnote >=", value, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteLessThan(String value) {
            addCriterion("ndnote <", value, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteLessThanOrEqualTo(String value) {
            addCriterion("ndnote <=", value, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteLike(String value) {
            addCriterion("ndnote like", value, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteNotLike(String value) {
            addCriterion("ndnote not like", value, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteIn(List<String> values) {
            addCriterion("ndnote in", values, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteNotIn(List<String> values) {
            addCriterion("ndnote not in", values, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteBetween(String value1, String value2) {
            addCriterion("ndnote between", value1, value2, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdnoteNotBetween(String value1, String value2) {
            addCriterion("ndnote not between", value1, value2, "ndnote");
            return (Criteria) this;
        }

        public Criteria andNdtypeIsNull() {
            addCriterion("ndtype is null");
            return (Criteria) this;
        }

        public Criteria andNdtypeIsNotNull() {
            addCriterion("ndtype is not null");
            return (Criteria) this;
        }

        public Criteria andNdtypeEqualTo(String value) {
            addCriterion("ndtype =", value, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeNotEqualTo(String value) {
            addCriterion("ndtype <>", value, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeGreaterThan(String value) {
            addCriterion("ndtype >", value, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ndtype >=", value, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeLessThan(String value) {
            addCriterion("ndtype <", value, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeLessThanOrEqualTo(String value) {
            addCriterion("ndtype <=", value, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeLike(String value) {
            addCriterion("ndtype like", value, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeNotLike(String value) {
            addCriterion("ndtype not like", value, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeIn(List<String> values) {
            addCriterion("ndtype in", values, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeNotIn(List<String> values) {
            addCriterion("ndtype not in", values, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeBetween(String value1, String value2) {
            addCriterion("ndtype between", value1, value2, "ndtype");
            return (Criteria) this;
        }

        public Criteria andNdtypeNotBetween(String value1, String value2) {
            addCriterion("ndtype not between", value1, value2, "ndtype");
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