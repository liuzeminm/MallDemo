package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class HonourenjoygoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HonourenjoygoodsExample() {
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

        public Criteria andHegidIsNull() {
            addCriterion("hegid is null");
            return (Criteria) this;
        }

        public Criteria andHegidIsNotNull() {
            addCriterion("hegid is not null");
            return (Criteria) this;
        }

        public Criteria andHegidEqualTo(Integer value) {
            addCriterion("hegid =", value, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidNotEqualTo(Integer value) {
            addCriterion("hegid <>", value, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidGreaterThan(Integer value) {
            addCriterion("hegid >", value, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hegid >=", value, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidLessThan(Integer value) {
            addCriterion("hegid <", value, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidLessThanOrEqualTo(Integer value) {
            addCriterion("hegid <=", value, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidIn(List<Integer> values) {
            addCriterion("hegid in", values, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidNotIn(List<Integer> values) {
            addCriterion("hegid not in", values, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidBetween(Integer value1, Integer value2) {
            addCriterion("hegid between", value1, value2, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegidNotBetween(Integer value1, Integer value2) {
            addCriterion("hegid not between", value1, value2, "hegid");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferIsNull() {
            addCriterion("hegspecialoffer is null");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferIsNotNull() {
            addCriterion("hegspecialoffer is not null");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferEqualTo(Double value) {
            addCriterion("hegspecialoffer =", value, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferNotEqualTo(Double value) {
            addCriterion("hegspecialoffer <>", value, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferGreaterThan(Double value) {
            addCriterion("hegspecialoffer >", value, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferGreaterThanOrEqualTo(Double value) {
            addCriterion("hegspecialoffer >=", value, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferLessThan(Double value) {
            addCriterion("hegspecialoffer <", value, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferLessThanOrEqualTo(Double value) {
            addCriterion("hegspecialoffer <=", value, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferIn(List<Double> values) {
            addCriterion("hegspecialoffer in", values, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferNotIn(List<Double> values) {
            addCriterion("hegspecialoffer not in", values, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferBetween(Double value1, Double value2) {
            addCriterion("hegspecialoffer between", value1, value2, "hegspecialoffer");
            return (Criteria) this;
        }

        public Criteria andHegspecialofferNotBetween(Double value1, Double value2) {
            addCriterion("hegspecialoffer not between", value1, value2, "hegspecialoffer");
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