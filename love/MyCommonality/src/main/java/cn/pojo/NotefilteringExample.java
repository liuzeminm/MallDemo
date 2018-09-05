package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class NotefilteringExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotefilteringExample() {
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

        public Criteria andNfidIsNull() {
            addCriterion("nfid is null");
            return (Criteria) this;
        }

        public Criteria andNfidIsNotNull() {
            addCriterion("nfid is not null");
            return (Criteria) this;
        }

        public Criteria andNfidEqualTo(Integer value) {
            addCriterion("nfid =", value, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidNotEqualTo(Integer value) {
            addCriterion("nfid <>", value, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidGreaterThan(Integer value) {
            addCriterion("nfid >", value, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nfid >=", value, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidLessThan(Integer value) {
            addCriterion("nfid <", value, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidLessThanOrEqualTo(Integer value) {
            addCriterion("nfid <=", value, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidIn(List<Integer> values) {
            addCriterion("nfid in", values, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidNotIn(List<Integer> values) {
            addCriterion("nfid not in", values, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidBetween(Integer value1, Integer value2) {
            addCriterion("nfid between", value1, value2, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfidNotBetween(Integer value1, Integer value2) {
            addCriterion("nfid not between", value1, value2, "nfid");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesIsNull() {
            addCriterion("nfgeneralnotes is null");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesIsNotNull() {
            addCriterion("nfgeneralnotes is not null");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesEqualTo(String value) {
            addCriterion("nfgeneralnotes =", value, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesNotEqualTo(String value) {
            addCriterion("nfgeneralnotes <>", value, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesGreaterThan(String value) {
            addCriterion("nfgeneralnotes >", value, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesGreaterThanOrEqualTo(String value) {
            addCriterion("nfgeneralnotes >=", value, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesLessThan(String value) {
            addCriterion("nfgeneralnotes <", value, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesLessThanOrEqualTo(String value) {
            addCriterion("nfgeneralnotes <=", value, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesLike(String value) {
            addCriterion("nfgeneralnotes like", value, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesNotLike(String value) {
            addCriterion("nfgeneralnotes not like", value, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesIn(List<String> values) {
            addCriterion("nfgeneralnotes in", values, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesNotIn(List<String> values) {
            addCriterion("nfgeneralnotes not in", values, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesBetween(String value1, String value2) {
            addCriterion("nfgeneralnotes between", value1, value2, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfgeneralnotesNotBetween(String value1, String value2) {
            addCriterion("nfgeneralnotes not between", value1, value2, "nfgeneralnotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesIsNull() {
            addCriterion("nfvideonotes is null");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesIsNotNull() {
            addCriterion("nfvideonotes is not null");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesEqualTo(String value) {
            addCriterion("nfvideonotes =", value, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesNotEqualTo(String value) {
            addCriterion("nfvideonotes <>", value, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesGreaterThan(String value) {
            addCriterion("nfvideonotes >", value, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesGreaterThanOrEqualTo(String value) {
            addCriterion("nfvideonotes >=", value, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesLessThan(String value) {
            addCriterion("nfvideonotes <", value, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesLessThanOrEqualTo(String value) {
            addCriterion("nfvideonotes <=", value, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesLike(String value) {
            addCriterion("nfvideonotes like", value, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesNotLike(String value) {
            addCriterion("nfvideonotes not like", value, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesIn(List<String> values) {
            addCriterion("nfvideonotes in", values, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesNotIn(List<String> values) {
            addCriterion("nfvideonotes not in", values, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesBetween(String value1, String value2) {
            addCriterion("nfvideonotes between", value1, value2, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNfvideonotesNotBetween(String value1, String value2) {
            addCriterion("nfvideonotes not between", value1, value2, "nfvideonotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesIsNull() {
            addCriterion("nflongnotes is null");
            return (Criteria) this;
        }

        public Criteria andNflongnotesIsNotNull() {
            addCriterion("nflongnotes is not null");
            return (Criteria) this;
        }

        public Criteria andNflongnotesEqualTo(String value) {
            addCriterion("nflongnotes =", value, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesNotEqualTo(String value) {
            addCriterion("nflongnotes <>", value, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesGreaterThan(String value) {
            addCriterion("nflongnotes >", value, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesGreaterThanOrEqualTo(String value) {
            addCriterion("nflongnotes >=", value, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesLessThan(String value) {
            addCriterion("nflongnotes <", value, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesLessThanOrEqualTo(String value) {
            addCriterion("nflongnotes <=", value, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesLike(String value) {
            addCriterion("nflongnotes like", value, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesNotLike(String value) {
            addCriterion("nflongnotes not like", value, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesIn(List<String> values) {
            addCriterion("nflongnotes in", values, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesNotIn(List<String> values) {
            addCriterion("nflongnotes not in", values, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesBetween(String value1, String value2) {
            addCriterion("nflongnotes between", value1, value2, "nflongnotes");
            return (Criteria) this;
        }

        public Criteria andNflongnotesNotBetween(String value1, String value2) {
            addCriterion("nflongnotes not between", value1, value2, "nflongnotes");
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