package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class LikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikeExample() {
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

        public Criteria andLikeidIsNull() {
            addCriterion("likeid is null");
            return (Criteria) this;
        }

        public Criteria andLikeidIsNotNull() {
            addCriterion("likeid is not null");
            return (Criteria) this;
        }

        public Criteria andLikeidEqualTo(Integer value) {
            addCriterion("likeid =", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotEqualTo(Integer value) {
            addCriterion("likeid <>", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidGreaterThan(Integer value) {
            addCriterion("likeid >", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeid >=", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidLessThan(Integer value) {
            addCriterion("likeid <", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidLessThanOrEqualTo(Integer value) {
            addCriterion("likeid <=", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidIn(List<Integer> values) {
            addCriterion("likeid in", values, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotIn(List<Integer> values) {
            addCriterion("likeid not in", values, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidBetween(Integer value1, Integer value2) {
            addCriterion("likeid between", value1, value2, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotBetween(Integer value1, Integer value2) {
            addCriterion("likeid not between", value1, value2, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikedidIsNull() {
            addCriterion("likedid is null");
            return (Criteria) this;
        }

        public Criteria andLikedidIsNotNull() {
            addCriterion("likedid is not null");
            return (Criteria) this;
        }

        public Criteria andLikedidEqualTo(Integer value) {
            addCriterion("likedid =", value, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidNotEqualTo(Integer value) {
            addCriterion("likedid <>", value, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidGreaterThan(Integer value) {
            addCriterion("likedid >", value, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("likedid >=", value, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidLessThan(Integer value) {
            addCriterion("likedid <", value, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidLessThanOrEqualTo(Integer value) {
            addCriterion("likedid <=", value, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidIn(List<Integer> values) {
            addCriterion("likedid in", values, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidNotIn(List<Integer> values) {
            addCriterion("likedid not in", values, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidBetween(Integer value1, Integer value2) {
            addCriterion("likedid between", value1, value2, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikedidNotBetween(Integer value1, Integer value2) {
            addCriterion("likedid not between", value1, value2, "likedid");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaIsNull() {
            addCriterion("likepraisea is null");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaIsNotNull() {
            addCriterion("likepraisea is not null");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaEqualTo(Integer value) {
            addCriterion("likepraisea =", value, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaNotEqualTo(Integer value) {
            addCriterion("likepraisea <>", value, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaGreaterThan(Integer value) {
            addCriterion("likepraisea >", value, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaGreaterThanOrEqualTo(Integer value) {
            addCriterion("likepraisea >=", value, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaLessThan(Integer value) {
            addCriterion("likepraisea <", value, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaLessThanOrEqualTo(Integer value) {
            addCriterion("likepraisea <=", value, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaIn(List<Integer> values) {
            addCriterion("likepraisea in", values, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaNotIn(List<Integer> values) {
            addCriterion("likepraisea not in", values, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaBetween(Integer value1, Integer value2) {
            addCriterion("likepraisea between", value1, value2, "likepraisea");
            return (Criteria) this;
        }

        public Criteria andLikepraiseaNotBetween(Integer value1, Integer value2) {
            addCriterion("likepraisea not between", value1, value2, "likepraisea");
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