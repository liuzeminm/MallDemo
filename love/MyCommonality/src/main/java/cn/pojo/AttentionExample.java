package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class AttentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttentionExample() {
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

        public Criteria andAttentionidIsNull() {
            addCriterion("attentionid is null");
            return (Criteria) this;
        }

        public Criteria andAttentionidIsNotNull() {
            addCriterion("attentionid is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionidEqualTo(Integer value) {
            addCriterion("attentionid =", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidNotEqualTo(Integer value) {
            addCriterion("attentionid <>", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidGreaterThan(Integer value) {
            addCriterion("attentionid >", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("attentionid >=", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidLessThan(Integer value) {
            addCriterion("attentionid <", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidLessThanOrEqualTo(Integer value) {
            addCriterion("attentionid <=", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidIn(List<Integer> values) {
            addCriterion("attentionid in", values, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidNotIn(List<Integer> values) {
            addCriterion("attentionid not in", values, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidBetween(Integer value1, Integer value2) {
            addCriterion("attentionid between", value1, value2, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidNotBetween(Integer value1, Integer value2) {
            addCriterion("attentionid not between", value1, value2, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedIsNull() {
            addCriterion("attentionbefocused is null");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedIsNotNull() {
            addCriterion("attentionbefocused is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedEqualTo(Integer value) {
            addCriterion("attentionbefocused =", value, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedNotEqualTo(Integer value) {
            addCriterion("attentionbefocused <>", value, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedGreaterThan(Integer value) {
            addCriterion("attentionbefocused >", value, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedGreaterThanOrEqualTo(Integer value) {
            addCriterion("attentionbefocused >=", value, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedLessThan(Integer value) {
            addCriterion("attentionbefocused <", value, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedLessThanOrEqualTo(Integer value) {
            addCriterion("attentionbefocused <=", value, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedIn(List<Integer> values) {
            addCriterion("attentionbefocused in", values, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedNotIn(List<Integer> values) {
            addCriterion("attentionbefocused not in", values, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedBetween(Integer value1, Integer value2) {
            addCriterion("attentionbefocused between", value1, value2, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionbefocusedNotBetween(Integer value1, Integer value2) {
            addCriterion("attentionbefocused not between", value1, value2, "attentionbefocused");
            return (Criteria) this;
        }

        public Criteria andAttentionuserIsNull() {
            addCriterion("attentionuser is null");
            return (Criteria) this;
        }

        public Criteria andAttentionuserIsNotNull() {
            addCriterion("attentionuser is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionuserEqualTo(Integer value) {
            addCriterion("attentionuser =", value, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserNotEqualTo(Integer value) {
            addCriterion("attentionuser <>", value, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserGreaterThan(Integer value) {
            addCriterion("attentionuser >", value, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("attentionuser >=", value, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserLessThan(Integer value) {
            addCriterion("attentionuser <", value, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserLessThanOrEqualTo(Integer value) {
            addCriterion("attentionuser <=", value, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserIn(List<Integer> values) {
            addCriterion("attentionuser in", values, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserNotIn(List<Integer> values) {
            addCriterion("attentionuser not in", values, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserBetween(Integer value1, Integer value2) {
            addCriterion("attentionuser between", value1, value2, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentionuserNotBetween(Integer value1, Integer value2) {
            addCriterion("attentionuser not between", value1, value2, "attentionuser");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeIsNull() {
            addCriterion("attentiontype is null");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeIsNotNull() {
            addCriterion("attentiontype is not null");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeEqualTo(Integer value) {
            addCriterion("attentiontype =", value, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeNotEqualTo(Integer value) {
            addCriterion("attentiontype <>", value, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeGreaterThan(Integer value) {
            addCriterion("attentiontype >", value, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("attentiontype >=", value, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeLessThan(Integer value) {
            addCriterion("attentiontype <", value, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("attentiontype <=", value, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeIn(List<Integer> values) {
            addCriterion("attentiontype in", values, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeNotIn(List<Integer> values) {
            addCriterion("attentiontype not in", values, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeBetween(Integer value1, Integer value2) {
            addCriterion("attentiontype between", value1, value2, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("attentiontype not between", value1, value2, "attentiontype");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelIsNull() {
            addCriterion("attentionlabel is null");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelIsNotNull() {
            addCriterion("attentionlabel is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelEqualTo(String value) {
            addCriterion("attentionlabel =", value, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelNotEqualTo(String value) {
            addCriterion("attentionlabel <>", value, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelGreaterThan(String value) {
            addCriterion("attentionlabel >", value, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelGreaterThanOrEqualTo(String value) {
            addCriterion("attentionlabel >=", value, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelLessThan(String value) {
            addCriterion("attentionlabel <", value, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelLessThanOrEqualTo(String value) {
            addCriterion("attentionlabel <=", value, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelLike(String value) {
            addCriterion("attentionlabel like", value, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelNotLike(String value) {
            addCriterion("attentionlabel not like", value, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelIn(List<String> values) {
            addCriterion("attentionlabel in", values, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelNotIn(List<String> values) {
            addCriterion("attentionlabel not in", values, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelBetween(String value1, String value2) {
            addCriterion("attentionlabel between", value1, value2, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionlabelNotBetween(String value1, String value2) {
            addCriterion("attentionlabel not between", value1, value2, "attentionlabel");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumIsNull() {
            addCriterion("attentionalbum is null");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumIsNotNull() {
            addCriterion("attentionalbum is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumEqualTo(String value) {
            addCriterion("attentionalbum =", value, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumNotEqualTo(String value) {
            addCriterion("attentionalbum <>", value, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumGreaterThan(String value) {
            addCriterion("attentionalbum >", value, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumGreaterThanOrEqualTo(String value) {
            addCriterion("attentionalbum >=", value, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumLessThan(String value) {
            addCriterion("attentionalbum <", value, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumLessThanOrEqualTo(String value) {
            addCriterion("attentionalbum <=", value, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumLike(String value) {
            addCriterion("attentionalbum like", value, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumNotLike(String value) {
            addCriterion("attentionalbum not like", value, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumIn(List<String> values) {
            addCriterion("attentionalbum in", values, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumNotIn(List<String> values) {
            addCriterion("attentionalbum not in", values, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumBetween(String value1, String value2) {
            addCriterion("attentionalbum between", value1, value2, "attentionalbum");
            return (Criteria) this;
        }

        public Criteria andAttentionalbumNotBetween(String value1, String value2) {
            addCriterion("attentionalbum not between", value1, value2, "attentionalbum");
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