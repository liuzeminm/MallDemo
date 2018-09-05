package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class PrerogativeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrerogativeExample() {
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

        public Criteria andPgidIsNull() {
            addCriterion("pgid is null");
            return (Criteria) this;
        }

        public Criteria andPgidIsNotNull() {
            addCriterion("pgid is not null");
            return (Criteria) this;
        }

        public Criteria andPgidEqualTo(Integer value) {
            addCriterion("pgid =", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotEqualTo(Integer value) {
            addCriterion("pgid <>", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidGreaterThan(Integer value) {
            addCriterion("pgid >", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pgid >=", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidLessThan(Integer value) {
            addCriterion("pgid <", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidLessThanOrEqualTo(Integer value) {
            addCriterion("pgid <=", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidIn(List<Integer> values) {
            addCriterion("pgid in", values, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotIn(List<Integer> values) {
            addCriterion("pgid not in", values, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidBetween(Integer value1, Integer value2) {
            addCriterion("pgid between", value1, value2, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotBetween(Integer value1, Integer value2) {
            addCriterion("pgid not between", value1, value2, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgtypeIsNull() {
            addCriterion("pgtype is null");
            return (Criteria) this;
        }

        public Criteria andPgtypeIsNotNull() {
            addCriterion("pgtype is not null");
            return (Criteria) this;
        }

        public Criteria andPgtypeEqualTo(String value) {
            addCriterion("pgtype =", value, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeNotEqualTo(String value) {
            addCriterion("pgtype <>", value, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeGreaterThan(String value) {
            addCriterion("pgtype >", value, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("pgtype >=", value, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeLessThan(String value) {
            addCriterion("pgtype <", value, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeLessThanOrEqualTo(String value) {
            addCriterion("pgtype <=", value, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeLike(String value) {
            addCriterion("pgtype like", value, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeNotLike(String value) {
            addCriterion("pgtype not like", value, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeIn(List<String> values) {
            addCriterion("pgtype in", values, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeNotIn(List<String> values) {
            addCriterion("pgtype not in", values, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeBetween(String value1, String value2) {
            addCriterion("pgtype between", value1, value2, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgtypeNotBetween(String value1, String value2) {
            addCriterion("pgtype not between", value1, value2, "pgtype");
            return (Criteria) this;
        }

        public Criteria andPgcontentIsNull() {
            addCriterion("pgcontent is null");
            return (Criteria) this;
        }

        public Criteria andPgcontentIsNotNull() {
            addCriterion("pgcontent is not null");
            return (Criteria) this;
        }

        public Criteria andPgcontentEqualTo(String value) {
            addCriterion("pgcontent =", value, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentNotEqualTo(String value) {
            addCriterion("pgcontent <>", value, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentGreaterThan(String value) {
            addCriterion("pgcontent >", value, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentGreaterThanOrEqualTo(String value) {
            addCriterion("pgcontent >=", value, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentLessThan(String value) {
            addCriterion("pgcontent <", value, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentLessThanOrEqualTo(String value) {
            addCriterion("pgcontent <=", value, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentLike(String value) {
            addCriterion("pgcontent like", value, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentNotLike(String value) {
            addCriterion("pgcontent not like", value, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentIn(List<String> values) {
            addCriterion("pgcontent in", values, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentNotIn(List<String> values) {
            addCriterion("pgcontent not in", values, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentBetween(String value1, String value2) {
            addCriterion("pgcontent between", value1, value2, "pgcontent");
            return (Criteria) this;
        }

        public Criteria andPgcontentNotBetween(String value1, String value2) {
            addCriterion("pgcontent not between", value1, value2, "pgcontent");
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