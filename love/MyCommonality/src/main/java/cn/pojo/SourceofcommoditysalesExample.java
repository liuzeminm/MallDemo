package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class SourceofcommoditysalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourceofcommoditysalesExample() {
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

        public Criteria andSocsidIsNull() {
            addCriterion("socsid is null");
            return (Criteria) this;
        }

        public Criteria andSocsidIsNotNull() {
            addCriterion("socsid is not null");
            return (Criteria) this;
        }

        public Criteria andSocsidEqualTo(Integer value) {
            addCriterion("socsid =", value, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidNotEqualTo(Integer value) {
            addCriterion("socsid <>", value, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidGreaterThan(Integer value) {
            addCriterion("socsid >", value, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("socsid >=", value, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidLessThan(Integer value) {
            addCriterion("socsid <", value, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidLessThanOrEqualTo(Integer value) {
            addCriterion("socsid <=", value, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidIn(List<Integer> values) {
            addCriterion("socsid in", values, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidNotIn(List<Integer> values) {
            addCriterion("socsid not in", values, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidBetween(Integer value1, Integer value2) {
            addCriterion("socsid between", value1, value2, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsidNotBetween(Integer value1, Integer value2) {
            addCriterion("socsid not between", value1, value2, "socsid");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingIsNull() {
            addCriterion("socsscalping is null");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingIsNotNull() {
            addCriterion("socsscalping is not null");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingEqualTo(String value) {
            addCriterion("socsscalping =", value, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingNotEqualTo(String value) {
            addCriterion("socsscalping <>", value, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingGreaterThan(String value) {
            addCriterion("socsscalping >", value, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingGreaterThanOrEqualTo(String value) {
            addCriterion("socsscalping >=", value, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingLessThan(String value) {
            addCriterion("socsscalping <", value, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingLessThanOrEqualTo(String value) {
            addCriterion("socsscalping <=", value, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingLike(String value) {
            addCriterion("socsscalping like", value, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingNotLike(String value) {
            addCriterion("socsscalping not like", value, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingIn(List<String> values) {
            addCriterion("socsscalping in", values, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingNotIn(List<String> values) {
            addCriterion("socsscalping not in", values, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingBetween(String value1, String value2) {
            addCriterion("socsscalping between", value1, value2, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsscalpingNotBetween(String value1, String value2) {
            addCriterion("socsscalping not between", value1, value2, "socsscalping");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopIsNull() {
            addCriterion("socsbrandshop is null");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopIsNotNull() {
            addCriterion("socsbrandshop is not null");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopEqualTo(String value) {
            addCriterion("socsbrandshop =", value, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopNotEqualTo(String value) {
            addCriterion("socsbrandshop <>", value, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopGreaterThan(String value) {
            addCriterion("socsbrandshop >", value, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopGreaterThanOrEqualTo(String value) {
            addCriterion("socsbrandshop >=", value, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopLessThan(String value) {
            addCriterion("socsbrandshop <", value, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopLessThanOrEqualTo(String value) {
            addCriterion("socsbrandshop <=", value, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopLike(String value) {
            addCriterion("socsbrandshop like", value, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopNotLike(String value) {
            addCriterion("socsbrandshop not like", value, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopIn(List<String> values) {
            addCriterion("socsbrandshop in", values, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopNotIn(List<String> values) {
            addCriterion("socsbrandshop not in", values, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopBetween(String value1, String value2) {
            addCriterion("socsbrandshop between", value1, value2, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsbrandshopNotBetween(String value1, String value2) {
            addCriterion("socsbrandshop not between", value1, value2, "socsbrandshop");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantIsNull() {
            addCriterion("socsmerchant is null");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantIsNotNull() {
            addCriterion("socsmerchant is not null");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantEqualTo(Integer value) {
            addCriterion("socsmerchant =", value, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantNotEqualTo(Integer value) {
            addCriterion("socsmerchant <>", value, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantGreaterThan(Integer value) {
            addCriterion("socsmerchant >", value, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantGreaterThanOrEqualTo(Integer value) {
            addCriterion("socsmerchant >=", value, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantLessThan(Integer value) {
            addCriterion("socsmerchant <", value, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantLessThanOrEqualTo(Integer value) {
            addCriterion("socsmerchant <=", value, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantIn(List<Integer> values) {
            addCriterion("socsmerchant in", values, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantNotIn(List<Integer> values) {
            addCriterion("socsmerchant not in", values, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantBetween(Integer value1, Integer value2) {
            addCriterion("socsmerchant between", value1, value2, "socsmerchant");
            return (Criteria) this;
        }

        public Criteria andSocsmerchantNotBetween(Integer value1, Integer value2) {
            addCriterion("socsmerchant not between", value1, value2, "socsmerchant");
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