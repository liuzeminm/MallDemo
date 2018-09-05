package cn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShippinginformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippinginformationExample() {
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

        public Criteria andSiidIsNull() {
            addCriterion("siid is null");
            return (Criteria) this;
        }

        public Criteria andSiidIsNotNull() {
            addCriterion("siid is not null");
            return (Criteria) this;
        }

        public Criteria andSiidEqualTo(Integer value) {
            addCriterion("siid =", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidNotEqualTo(Integer value) {
            addCriterion("siid <>", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidGreaterThan(Integer value) {
            addCriterion("siid >", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("siid >=", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidLessThan(Integer value) {
            addCriterion("siid <", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidLessThanOrEqualTo(Integer value) {
            addCriterion("siid <=", value, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidIn(List<Integer> values) {
            addCriterion("siid in", values, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidNotIn(List<Integer> values) {
            addCriterion("siid not in", values, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidBetween(Integer value1, Integer value2) {
            addCriterion("siid between", value1, value2, "siid");
            return (Criteria) this;
        }

        public Criteria andSiidNotBetween(Integer value1, Integer value2) {
            addCriterion("siid not between", value1, value2, "siid");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeIsNull() {
            addCriterion("sideliverytime is null");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeIsNotNull() {
            addCriterion("sideliverytime is not null");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeEqualTo(Date value) {
            addCriterion("sideliverytime =", value, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeNotEqualTo(Date value) {
            addCriterion("sideliverytime <>", value, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeGreaterThan(Date value) {
            addCriterion("sideliverytime >", value, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sideliverytime >=", value, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeLessThan(Date value) {
            addCriterion("sideliverytime <", value, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeLessThanOrEqualTo(Date value) {
            addCriterion("sideliverytime <=", value, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeIn(List<Date> values) {
            addCriterion("sideliverytime in", values, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeNotIn(List<Date> values) {
            addCriterion("sideliverytime not in", values, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeBetween(Date value1, Date value2) {
            addCriterion("sideliverytime between", value1, value2, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSideliverytimeNotBetween(Date value1, Date value2) {
            addCriterion("sideliverytime not between", value1, value2, "sideliverytime");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressIsNull() {
            addCriterion("sishippingaddress is null");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressIsNotNull() {
            addCriterion("sishippingaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressEqualTo(String value) {
            addCriterion("sishippingaddress =", value, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressNotEqualTo(String value) {
            addCriterion("sishippingaddress <>", value, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressGreaterThan(String value) {
            addCriterion("sishippingaddress >", value, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sishippingaddress >=", value, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressLessThan(String value) {
            addCriterion("sishippingaddress <", value, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressLessThanOrEqualTo(String value) {
            addCriterion("sishippingaddress <=", value, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressLike(String value) {
            addCriterion("sishippingaddress like", value, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressNotLike(String value) {
            addCriterion("sishippingaddress not like", value, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressIn(List<String> values) {
            addCriterion("sishippingaddress in", values, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressNotIn(List<String> values) {
            addCriterion("sishippingaddress not in", values, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressBetween(String value1, String value2) {
            addCriterion("sishippingaddress between", value1, value2, "sishippingaddress");
            return (Criteria) this;
        }

        public Criteria andSishippingaddressNotBetween(String value1, String value2) {
            addCriterion("sishippingaddress not between", value1, value2, "sishippingaddress");
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