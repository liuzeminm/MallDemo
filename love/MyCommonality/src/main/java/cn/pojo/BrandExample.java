package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andBdidIsNull() {
            addCriterion("bdid is null");
            return (Criteria) this;
        }

        public Criteria andBdidIsNotNull() {
            addCriterion("bdid is not null");
            return (Criteria) this;
        }

        public Criteria andBdidEqualTo(Integer value) {
            addCriterion("bdid =", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotEqualTo(Integer value) {
            addCriterion("bdid <>", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThan(Integer value) {
            addCriterion("bdid >", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdid >=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThan(Integer value) {
            addCriterion("bdid <", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThanOrEqualTo(Integer value) {
            addCriterion("bdid <=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidIn(List<Integer> values) {
            addCriterion("bdid in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotIn(List<Integer> values) {
            addCriterion("bdid not in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidBetween(Integer value1, Integer value2) {
            addCriterion("bdid between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotBetween(Integer value1, Integer value2) {
            addCriterion("bdid not between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelIsNull() {
            addCriterion("bdbrandlabel is null");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelIsNotNull() {
            addCriterion("bdbrandlabel is not null");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelEqualTo(String value) {
            addCriterion("bdbrandlabel =", value, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelNotEqualTo(String value) {
            addCriterion("bdbrandlabel <>", value, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelGreaterThan(String value) {
            addCriterion("bdbrandlabel >", value, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelGreaterThanOrEqualTo(String value) {
            addCriterion("bdbrandlabel >=", value, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelLessThan(String value) {
            addCriterion("bdbrandlabel <", value, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelLessThanOrEqualTo(String value) {
            addCriterion("bdbrandlabel <=", value, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelLike(String value) {
            addCriterion("bdbrandlabel like", value, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelNotLike(String value) {
            addCriterion("bdbrandlabel not like", value, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelIn(List<String> values) {
            addCriterion("bdbrandlabel in", values, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelNotIn(List<String> values) {
            addCriterion("bdbrandlabel not in", values, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelBetween(String value1, String value2) {
            addCriterion("bdbrandlabel between", value1, value2, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdbrandlabelNotBetween(String value1, String value2) {
            addCriterion("bdbrandlabel not between", value1, value2, "bdbrandlabel");
            return (Criteria) this;
        }

        public Criteria andBdintroductionIsNull() {
            addCriterion("bdIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andBdintroductionIsNotNull() {
            addCriterion("bdIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andBdintroductionEqualTo(String value) {
            addCriterion("bdIntroduction =", value, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionNotEqualTo(String value) {
            addCriterion("bdIntroduction <>", value, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionGreaterThan(String value) {
            addCriterion("bdIntroduction >", value, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("bdIntroduction >=", value, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionLessThan(String value) {
            addCriterion("bdIntroduction <", value, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionLessThanOrEqualTo(String value) {
            addCriterion("bdIntroduction <=", value, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionLike(String value) {
            addCriterion("bdIntroduction like", value, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionNotLike(String value) {
            addCriterion("bdIntroduction not like", value, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionIn(List<String> values) {
            addCriterion("bdIntroduction in", values, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionNotIn(List<String> values) {
            addCriterion("bdIntroduction not in", values, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionBetween(String value1, String value2) {
            addCriterion("bdIntroduction between", value1, value2, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdintroductionNotBetween(String value1, String value2) {
            addCriterion("bdIntroduction not between", value1, value2, "bdintroduction");
            return (Criteria) this;
        }

        public Criteria andBdfansofIsNull() {
            addCriterion("bdfansof is null");
            return (Criteria) this;
        }

        public Criteria andBdfansofIsNotNull() {
            addCriterion("bdfansof is not null");
            return (Criteria) this;
        }

        public Criteria andBdfansofEqualTo(String value) {
            addCriterion("bdfansof =", value, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofNotEqualTo(String value) {
            addCriterion("bdfansof <>", value, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofGreaterThan(String value) {
            addCriterion("bdfansof >", value, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofGreaterThanOrEqualTo(String value) {
            addCriterion("bdfansof >=", value, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofLessThan(String value) {
            addCriterion("bdfansof <", value, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofLessThanOrEqualTo(String value) {
            addCriterion("bdfansof <=", value, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofLike(String value) {
            addCriterion("bdfansof like", value, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofNotLike(String value) {
            addCriterion("bdfansof not like", value, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofIn(List<String> values) {
            addCriterion("bdfansof in", values, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofNotIn(List<String> values) {
            addCriterion("bdfansof not in", values, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofBetween(String value1, String value2) {
            addCriterion("bdfansof between", value1, value2, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdfansofNotBetween(String value1, String value2) {
            addCriterion("bdfansof not between", value1, value2, "bdfansof");
            return (Criteria) this;
        }

        public Criteria andBdnameIsNull() {
            addCriterion("bdname is null");
            return (Criteria) this;
        }

        public Criteria andBdnameIsNotNull() {
            addCriterion("bdname is not null");
            return (Criteria) this;
        }

        public Criteria andBdnameEqualTo(String value) {
            addCriterion("bdname =", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotEqualTo(String value) {
            addCriterion("bdname <>", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameGreaterThan(String value) {
            addCriterion("bdname >", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameGreaterThanOrEqualTo(String value) {
            addCriterion("bdname >=", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLessThan(String value) {
            addCriterion("bdname <", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLessThanOrEqualTo(String value) {
            addCriterion("bdname <=", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLike(String value) {
            addCriterion("bdname like", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotLike(String value) {
            addCriterion("bdname not like", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameIn(List<String> values) {
            addCriterion("bdname in", values, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotIn(List<String> values) {
            addCriterion("bdname not in", values, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameBetween(String value1, String value2) {
            addCriterion("bdname between", value1, value2, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotBetween(String value1, String value2) {
            addCriterion("bdname not between", value1, value2, "bdname");
            return (Criteria) this;
        }

        public Criteria andBddiscountIsNull() {
            addCriterion("bddiscount is null");
            return (Criteria) this;
        }

        public Criteria andBddiscountIsNotNull() {
            addCriterion("bddiscount is not null");
            return (Criteria) this;
        }

        public Criteria andBddiscountEqualTo(String value) {
            addCriterion("bddiscount =", value, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountNotEqualTo(String value) {
            addCriterion("bddiscount <>", value, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountGreaterThan(String value) {
            addCriterion("bddiscount >", value, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountGreaterThanOrEqualTo(String value) {
            addCriterion("bddiscount >=", value, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountLessThan(String value) {
            addCriterion("bddiscount <", value, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountLessThanOrEqualTo(String value) {
            addCriterion("bddiscount <=", value, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountLike(String value) {
            addCriterion("bddiscount like", value, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountNotLike(String value) {
            addCriterion("bddiscount not like", value, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountIn(List<String> values) {
            addCriterion("bddiscount in", values, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountNotIn(List<String> values) {
            addCriterion("bddiscount not in", values, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountBetween(String value1, String value2) {
            addCriterion("bddiscount between", value1, value2, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBddiscountNotBetween(String value1, String value2) {
            addCriterion("bddiscount not between", value1, value2, "bddiscount");
            return (Criteria) this;
        }

        public Criteria andBdgoodsIsNull() {
            addCriterion("bdgoods is null");
            return (Criteria) this;
        }

        public Criteria andBdgoodsIsNotNull() {
            addCriterion("bdgoods is not null");
            return (Criteria) this;
        }

        public Criteria andBdgoodsEqualTo(Integer value) {
            addCriterion("bdgoods =", value, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsNotEqualTo(Integer value) {
            addCriterion("bdgoods <>", value, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsGreaterThan(Integer value) {
            addCriterion("bdgoods >", value, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdgoods >=", value, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsLessThan(Integer value) {
            addCriterion("bdgoods <", value, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsLessThanOrEqualTo(Integer value) {
            addCriterion("bdgoods <=", value, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsIn(List<Integer> values) {
            addCriterion("bdgoods in", values, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsNotIn(List<Integer> values) {
            addCriterion("bdgoods not in", values, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsBetween(Integer value1, Integer value2) {
            addCriterion("bdgoods between", value1, value2, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdgoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("bdgoods not between", value1, value2, "bdgoods");
            return (Criteria) this;
        }

        public Criteria andBdnotesIsNull() {
            addCriterion("bdnotes is null");
            return (Criteria) this;
        }

        public Criteria andBdnotesIsNotNull() {
            addCriterion("bdnotes is not null");
            return (Criteria) this;
        }

        public Criteria andBdnotesEqualTo(Integer value) {
            addCriterion("bdnotes =", value, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesNotEqualTo(Integer value) {
            addCriterion("bdnotes <>", value, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesGreaterThan(Integer value) {
            addCriterion("bdnotes >", value, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdnotes >=", value, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesLessThan(Integer value) {
            addCriterion("bdnotes <", value, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesLessThanOrEqualTo(Integer value) {
            addCriterion("bdnotes <=", value, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesIn(List<Integer> values) {
            addCriterion("bdnotes in", values, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesNotIn(List<Integer> values) {
            addCriterion("bdnotes not in", values, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesBetween(Integer value1, Integer value2) {
            addCriterion("bdnotes between", value1, value2, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdnotesNotBetween(Integer value1, Integer value2) {
            addCriterion("bdnotes not between", value1, value2, "bdnotes");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsIsNull() {
            addCriterion("bdclassificationgoods is null");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsIsNotNull() {
            addCriterion("bdclassificationgoods is not null");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsEqualTo(Integer value) {
            addCriterion("bdclassificationgoods =", value, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsNotEqualTo(Integer value) {
            addCriterion("bdclassificationgoods <>", value, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsGreaterThan(Integer value) {
            addCriterion("bdclassificationgoods >", value, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdclassificationgoods >=", value, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsLessThan(Integer value) {
            addCriterion("bdclassificationgoods <", value, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsLessThanOrEqualTo(Integer value) {
            addCriterion("bdclassificationgoods <=", value, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsIn(List<Integer> values) {
            addCriterion("bdclassificationgoods in", values, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsNotIn(List<Integer> values) {
            addCriterion("bdclassificationgoods not in", values, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsBetween(Integer value1, Integer value2) {
            addCriterion("bdclassificationgoods between", value1, value2, "bdclassificationgoods");
            return (Criteria) this;
        }

        public Criteria andBdclassificationgoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("bdclassificationgoods not between", value1, value2, "bdclassificationgoods");
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