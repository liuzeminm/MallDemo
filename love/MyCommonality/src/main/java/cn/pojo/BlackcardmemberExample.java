package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class BlackcardmemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlackcardmemberExample() {
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

        public Criteria andBcmidIsNull() {
            addCriterion("bcmid is null");
            return (Criteria) this;
        }

        public Criteria andBcmidIsNotNull() {
            addCriterion("bcmid is not null");
            return (Criteria) this;
        }

        public Criteria andBcmidEqualTo(Integer value) {
            addCriterion("bcmid =", value, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidNotEqualTo(Integer value) {
            addCriterion("bcmid <>", value, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidGreaterThan(Integer value) {
            addCriterion("bcmid >", value, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bcmid >=", value, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidLessThan(Integer value) {
            addCriterion("bcmid <", value, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidLessThanOrEqualTo(Integer value) {
            addCriterion("bcmid <=", value, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidIn(List<Integer> values) {
            addCriterion("bcmid in", values, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidNotIn(List<Integer> values) {
            addCriterion("bcmid not in", values, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidBetween(Integer value1, Integer value2) {
            addCriterion("bcmid between", value1, value2, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmidNotBetween(Integer value1, Integer value2) {
            addCriterion("bcmid not between", value1, value2, "bcmid");
            return (Criteria) this;
        }

        public Criteria andBcmusernameIsNull() {
            addCriterion("bcmusername is null");
            return (Criteria) this;
        }

        public Criteria andBcmusernameIsNotNull() {
            addCriterion("bcmusername is not null");
            return (Criteria) this;
        }

        public Criteria andBcmusernameEqualTo(String value) {
            addCriterion("bcmusername =", value, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameNotEqualTo(String value) {
            addCriterion("bcmusername <>", value, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameGreaterThan(String value) {
            addCriterion("bcmusername >", value, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameGreaterThanOrEqualTo(String value) {
            addCriterion("bcmusername >=", value, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameLessThan(String value) {
            addCriterion("bcmusername <", value, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameLessThanOrEqualTo(String value) {
            addCriterion("bcmusername <=", value, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameLike(String value) {
            addCriterion("bcmusername like", value, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameNotLike(String value) {
            addCriterion("bcmusername not like", value, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameIn(List<String> values) {
            addCriterion("bcmusername in", values, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameNotIn(List<String> values) {
            addCriterion("bcmusername not in", values, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameBetween(String value1, String value2) {
            addCriterion("bcmusername between", value1, value2, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmusernameNotBetween(String value1, String value2) {
            addCriterion("bcmusername not between", value1, value2, "bcmusername");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsIsNull() {
            addCriterion("bcmmembercomments is null");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsIsNotNull() {
            addCriterion("bcmmembercomments is not null");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsEqualTo(String value) {
            addCriterion("bcmmembercomments =", value, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsNotEqualTo(String value) {
            addCriterion("bcmmembercomments <>", value, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsGreaterThan(String value) {
            addCriterion("bcmmembercomments >", value, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsGreaterThanOrEqualTo(String value) {
            addCriterion("bcmmembercomments >=", value, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsLessThan(String value) {
            addCriterion("bcmmembercomments <", value, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsLessThanOrEqualTo(String value) {
            addCriterion("bcmmembercomments <=", value, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsLike(String value) {
            addCriterion("bcmmembercomments like", value, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsNotLike(String value) {
            addCriterion("bcmmembercomments not like", value, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsIn(List<String> values) {
            addCriterion("bcmmembercomments in", values, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsNotIn(List<String> values) {
            addCriterion("bcmmembercomments not in", values, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsBetween(String value1, String value2) {
            addCriterion("bcmmembercomments between", value1, value2, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmmembercommentsNotBetween(String value1, String value2) {
            addCriterion("bcmmembercomments not between", value1, value2, "bcmmembercomments");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsIsNull() {
            addCriterion("bcmHonourenjoygoods is null");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsIsNotNull() {
            addCriterion("bcmHonourenjoygoods is not null");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsEqualTo(Integer value) {
            addCriterion("bcmHonourenjoygoods =", value, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsNotEqualTo(Integer value) {
            addCriterion("bcmHonourenjoygoods <>", value, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsGreaterThan(Integer value) {
            addCriterion("bcmHonourenjoygoods >", value, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bcmHonourenjoygoods >=", value, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsLessThan(Integer value) {
            addCriterion("bcmHonourenjoygoods <", value, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsLessThanOrEqualTo(Integer value) {
            addCriterion("bcmHonourenjoygoods <=", value, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsIn(List<Integer> values) {
            addCriterion("bcmHonourenjoygoods in", values, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsNotIn(List<Integer> values) {
            addCriterion("bcmHonourenjoygoods not in", values, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsBetween(Integer value1, Integer value2) {
            addCriterion("bcmHonourenjoygoods between", value1, value2, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmhonourenjoygoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("bcmHonourenjoygoods not between", value1, value2, "bcmhonourenjoygoods");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatIsNull() {
            addCriterion("bcmsavethat is null");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatIsNotNull() {
            addCriterion("bcmsavethat is not null");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatEqualTo(Integer value) {
            addCriterion("bcmsavethat =", value, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatNotEqualTo(Integer value) {
            addCriterion("bcmsavethat <>", value, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatGreaterThan(Integer value) {
            addCriterion("bcmsavethat >", value, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatGreaterThanOrEqualTo(Integer value) {
            addCriterion("bcmsavethat >=", value, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatLessThan(Integer value) {
            addCriterion("bcmsavethat <", value, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatLessThanOrEqualTo(Integer value) {
            addCriterion("bcmsavethat <=", value, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatIn(List<Integer> values) {
            addCriterion("bcmsavethat in", values, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatNotIn(List<Integer> values) {
            addCriterion("bcmsavethat not in", values, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatBetween(Integer value1, Integer value2) {
            addCriterion("bcmsavethat between", value1, value2, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsavethatNotBetween(Integer value1, Integer value2) {
            addCriterion("bcmsavethat not between", value1, value2, "bcmsavethat");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeIsNull() {
            addCriterion("bcmsixbigprivilege is null");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeIsNotNull() {
            addCriterion("bcmsixbigprivilege is not null");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeEqualTo(Integer value) {
            addCriterion("bcmsixbigprivilege =", value, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeNotEqualTo(Integer value) {
            addCriterion("bcmsixbigprivilege <>", value, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeGreaterThan(Integer value) {
            addCriterion("bcmsixbigprivilege >", value, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bcmsixbigprivilege >=", value, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeLessThan(Integer value) {
            addCriterion("bcmsixbigprivilege <", value, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeLessThanOrEqualTo(Integer value) {
            addCriterion("bcmsixbigprivilege <=", value, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeIn(List<Integer> values) {
            addCriterion("bcmsixbigprivilege in", values, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeNotIn(List<Integer> values) {
            addCriterion("bcmsixbigprivilege not in", values, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeBetween(Integer value1, Integer value2) {
            addCriterion("bcmsixbigprivilege between", value1, value2, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmsixbigprivilegeNotBetween(Integer value1, Integer value2) {
            addCriterion("bcmsixbigprivilege not between", value1, value2, "bcmsixbigprivilege");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeIsNull() {
            addCriterion("bcmblackcardtype is null");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeIsNotNull() {
            addCriterion("bcmblackcardtype is not null");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeEqualTo(Integer value) {
            addCriterion("bcmblackcardtype =", value, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeNotEqualTo(Integer value) {
            addCriterion("bcmblackcardtype <>", value, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeGreaterThan(Integer value) {
            addCriterion("bcmblackcardtype >", value, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bcmblackcardtype >=", value, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeLessThan(Integer value) {
            addCriterion("bcmblackcardtype <", value, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeLessThanOrEqualTo(Integer value) {
            addCriterion("bcmblackcardtype <=", value, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeIn(List<Integer> values) {
            addCriterion("bcmblackcardtype in", values, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeNotIn(List<Integer> values) {
            addCriterion("bcmblackcardtype not in", values, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeBetween(Integer value1, Integer value2) {
            addCriterion("bcmblackcardtype between", value1, value2, "bcmblackcardtype");
            return (Criteria) this;
        }

        public Criteria andBcmblackcardtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bcmblackcardtype not between", value1, value2, "bcmblackcardtype");
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