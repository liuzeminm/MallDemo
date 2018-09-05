package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class NotenoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotenoteExample() {
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

        public Criteria andNcusernameidIsNull() {
            addCriterion("ncusernameid is null");
            return (Criteria) this;
        }

        public Criteria andNcusernameidIsNotNull() {
            addCriterion("ncusernameid is not null");
            return (Criteria) this;
        }

        public Criteria andNcusernameidEqualTo(Integer value) {
            addCriterion("ncusernameid =", value, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidNotEqualTo(Integer value) {
            addCriterion("ncusernameid <>", value, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidGreaterThan(Integer value) {
            addCriterion("ncusernameid >", value, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ncusernameid >=", value, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidLessThan(Integer value) {
            addCriterion("ncusernameid <", value, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidLessThanOrEqualTo(Integer value) {
            addCriterion("ncusernameid <=", value, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidIn(List<Integer> values) {
            addCriterion("ncusernameid in", values, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidNotIn(List<Integer> values) {
            addCriterion("ncusernameid not in", values, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidBetween(Integer value1, Integer value2) {
            addCriterion("ncusernameid between", value1, value2, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcusernameidNotBetween(Integer value1, Integer value2) {
            addCriterion("ncusernameid not between", value1, value2, "ncusernameid");
            return (Criteria) this;
        }

        public Criteria andNcstateIsNull() {
            addCriterion("ncstate is null");
            return (Criteria) this;
        }

        public Criteria andNcstateIsNotNull() {
            addCriterion("ncstate is not null");
            return (Criteria) this;
        }

        public Criteria andNcstateEqualTo(Integer value) {
            addCriterion("ncstate =", value, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateNotEqualTo(Integer value) {
            addCriterion("ncstate <>", value, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateGreaterThan(Integer value) {
            addCriterion("ncstate >", value, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ncstate >=", value, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateLessThan(Integer value) {
            addCriterion("ncstate <", value, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateLessThanOrEqualTo(Integer value) {
            addCriterion("ncstate <=", value, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateIn(List<Integer> values) {
            addCriterion("ncstate in", values, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateNotIn(List<Integer> values) {
            addCriterion("ncstate not in", values, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateBetween(Integer value1, Integer value2) {
            addCriterion("ncstate between", value1, value2, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNcstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ncstate not between", value1, value2, "ncstate");
            return (Criteria) this;
        }

        public Criteria andNccollectionidIsNull() {
            addCriterion("nccollectionid is null");
            return (Criteria) this;
        }

        public Criteria andNccollectionidIsNotNull() {
            addCriterion("nccollectionid is not null");
            return (Criteria) this;
        }

        public Criteria andNccollectionidEqualTo(Integer value) {
            addCriterion("nccollectionid =", value, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidNotEqualTo(Integer value) {
            addCriterion("nccollectionid <>", value, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidGreaterThan(Integer value) {
            addCriterion("nccollectionid >", value, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nccollectionid >=", value, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidLessThan(Integer value) {
            addCriterion("nccollectionid <", value, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidLessThanOrEqualTo(Integer value) {
            addCriterion("nccollectionid <=", value, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidIn(List<Integer> values) {
            addCriterion("nccollectionid in", values, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidNotIn(List<Integer> values) {
            addCriterion("nccollectionid not in", values, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidBetween(Integer value1, Integer value2) {
            addCriterion("nccollectionid between", value1, value2, "nccollectionid");
            return (Criteria) this;
        }

        public Criteria andNccollectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("nccollectionid not between", value1, value2, "nccollectionid");
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