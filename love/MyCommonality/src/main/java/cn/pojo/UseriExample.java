package cn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UseriExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UseriExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUseravatarIsNull() {
            addCriterion("useravatar is null");
            return (Criteria) this;
        }

        public Criteria andUseravatarIsNotNull() {
            addCriterion("useravatar is not null");
            return (Criteria) this;
        }

        public Criteria andUseravatarEqualTo(String value) {
            addCriterion("useravatar =", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotEqualTo(String value) {
            addCriterion("useravatar <>", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarGreaterThan(String value) {
            addCriterion("useravatar >", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarGreaterThanOrEqualTo(String value) {
            addCriterion("useravatar >=", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLessThan(String value) {
            addCriterion("useravatar <", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLessThanOrEqualTo(String value) {
            addCriterion("useravatar <=", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLike(String value) {
            addCriterion("useravatar like", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotLike(String value) {
            addCriterion("useravatar not like", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarIn(List<String> values) {
            addCriterion("useravatar in", values, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotIn(List<String> values) {
            addCriterion("useravatar not in", values, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarBetween(String value1, String value2) {
            addCriterion("useravatar between", value1, value2, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotBetween(String value1, String value2) {
            addCriterion("useravatar not between", value1, value2, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordIsNull() {
            addCriterion("userloginpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordIsNotNull() {
            addCriterion("userloginpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordEqualTo(String value) {
            addCriterion("userloginpassword =", value, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordNotEqualTo(String value) {
            addCriterion("userloginpassword <>", value, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordGreaterThan(String value) {
            addCriterion("userloginpassword >", value, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userloginpassword >=", value, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordLessThan(String value) {
            addCriterion("userloginpassword <", value, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordLessThanOrEqualTo(String value) {
            addCriterion("userloginpassword <=", value, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordLike(String value) {
            addCriterion("userloginpassword like", value, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordNotLike(String value) {
            addCriterion("userloginpassword not like", value, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordIn(List<String> values) {
            addCriterion("userloginpassword in", values, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordNotIn(List<String> values) {
            addCriterion("userloginpassword not in", values, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordBetween(String value1, String value2) {
            addCriterion("userloginpassword between", value1, value2, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserloginpasswordNotBetween(String value1, String value2) {
            addCriterion("userloginpassword not between", value1, value2, "userloginpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordIsNull() {
            addCriterion("userpaymentpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordIsNotNull() {
            addCriterion("userpaymentpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordEqualTo(String value) {
            addCriterion("userpaymentpassword =", value, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordNotEqualTo(String value) {
            addCriterion("userpaymentpassword <>", value, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordGreaterThan(String value) {
            addCriterion("userpaymentpassword >", value, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userpaymentpassword >=", value, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordLessThan(String value) {
            addCriterion("userpaymentpassword <", value, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordLessThanOrEqualTo(String value) {
            addCriterion("userpaymentpassword <=", value, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordLike(String value) {
            addCriterion("userpaymentpassword like", value, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordNotLike(String value) {
            addCriterion("userpaymentpassword not like", value, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordIn(List<String> values) {
            addCriterion("userpaymentpassword in", values, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordNotIn(List<String> values) {
            addCriterion("userpaymentpassword not in", values, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordBetween(String value1, String value2) {
            addCriterion("userpaymentpassword between", value1, value2, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUserpaymentpasswordNotBetween(String value1, String value2) {
            addCriterion("userpaymentpassword not between", value1, value2, "userpaymentpassword");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationIsNull() {
            addCriterion("usergoodsreceivinginformation is null");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationIsNotNull() {
            addCriterion("usergoodsreceivinginformation is not null");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationEqualTo(String value) {
            addCriterion("usergoodsreceivinginformation =", value, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationNotEqualTo(String value) {
            addCriterion("usergoodsreceivinginformation <>", value, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationGreaterThan(String value) {
            addCriterion("usergoodsreceivinginformation >", value, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationGreaterThanOrEqualTo(String value) {
            addCriterion("usergoodsreceivinginformation >=", value, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationLessThan(String value) {
            addCriterion("usergoodsreceivinginformation <", value, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationLessThanOrEqualTo(String value) {
            addCriterion("usergoodsreceivinginformation <=", value, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationLike(String value) {
            addCriterion("usergoodsreceivinginformation like", value, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationNotLike(String value) {
            addCriterion("usergoodsreceivinginformation not like", value, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationIn(List<String> values) {
            addCriterion("usergoodsreceivinginformation in", values, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationNotIn(List<String> values) {
            addCriterion("usergoodsreceivinginformation not in", values, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationBetween(String value1, String value2) {
            addCriterion("usergoodsreceivinginformation between", value1, value2, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUsergoodsreceivinginformationNotBetween(String value1, String value2) {
            addCriterion("usergoodsreceivinginformation not between", value1, value2, "usergoodsreceivinginformation");
            return (Criteria) this;
        }

        public Criteria andUserlikeIsNull() {
            addCriterion("userlike is null");
            return (Criteria) this;
        }

        public Criteria andUserlikeIsNotNull() {
            addCriterion("userlike is not null");
            return (Criteria) this;
        }

        public Criteria andUserlikeEqualTo(Integer value) {
            addCriterion("userlike =", value, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeNotEqualTo(Integer value) {
            addCriterion("userlike <>", value, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeGreaterThan(Integer value) {
            addCriterion("userlike >", value, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("userlike >=", value, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeLessThan(Integer value) {
            addCriterion("userlike <", value, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeLessThanOrEqualTo(Integer value) {
            addCriterion("userlike <=", value, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeIn(List<Integer> values) {
            addCriterion("userlike in", values, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeNotIn(List<Integer> values) {
            addCriterion("userlike not in", values, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeBetween(Integer value1, Integer value2) {
            addCriterion("userlike between", value1, value2, "userlike");
            return (Criteria) this;
        }

        public Criteria andUserlikeNotBetween(Integer value1, Integer value2) {
            addCriterion("userlike not between", value1, value2, "userlike");
            return (Criteria) this;
        }

        public Criteria andUsercommentIsNull() {
            addCriterion("usercomment is null");
            return (Criteria) this;
        }

        public Criteria andUsercommentIsNotNull() {
            addCriterion("usercomment is not null");
            return (Criteria) this;
        }

        public Criteria andUsercommentEqualTo(String value) {
            addCriterion("usercomment =", value, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentNotEqualTo(String value) {
            addCriterion("usercomment <>", value, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentGreaterThan(String value) {
            addCriterion("usercomment >", value, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentGreaterThanOrEqualTo(String value) {
            addCriterion("usercomment >=", value, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentLessThan(String value) {
            addCriterion("usercomment <", value, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentLessThanOrEqualTo(String value) {
            addCriterion("usercomment <=", value, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentLike(String value) {
            addCriterion("usercomment like", value, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentNotLike(String value) {
            addCriterion("usercomment not like", value, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentIn(List<String> values) {
            addCriterion("usercomment in", values, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentNotIn(List<String> values) {
            addCriterion("usercomment not in", values, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentBetween(String value1, String value2) {
            addCriterion("usercomment between", value1, value2, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUsercommentNotBetween(String value1, String value2) {
            addCriterion("usercomment not between", value1, value2, "usercomment");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsIsNull() {
            addCriterion("userpotatostamps is null");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsIsNotNull() {
            addCriterion("userpotatostamps is not null");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsEqualTo(String value) {
            addCriterion("userpotatostamps =", value, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsNotEqualTo(String value) {
            addCriterion("userpotatostamps <>", value, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsGreaterThan(String value) {
            addCriterion("userpotatostamps >", value, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsGreaterThanOrEqualTo(String value) {
            addCriterion("userpotatostamps >=", value, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsLessThan(String value) {
            addCriterion("userpotatostamps <", value, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsLessThanOrEqualTo(String value) {
            addCriterion("userpotatostamps <=", value, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsLike(String value) {
            addCriterion("userpotatostamps like", value, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsNotLike(String value) {
            addCriterion("userpotatostamps not like", value, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsIn(List<String> values) {
            addCriterion("userpotatostamps in", values, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsNotIn(List<String> values) {
            addCriterion("userpotatostamps not in", values, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsBetween(String value1, String value2) {
            addCriterion("userpotatostamps between", value1, value2, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUserpotatostampsNotBetween(String value1, String value2) {
            addCriterion("userpotatostamps not between", value1, value2, "userpotatostamps");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartIsNull() {
            addCriterion("usershoppingcart is null");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartIsNotNull() {
            addCriterion("usershoppingcart is not null");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartEqualTo(Integer value) {
            addCriterion("usershoppingcart =", value, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartNotEqualTo(Integer value) {
            addCriterion("usershoppingcart <>", value, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartGreaterThan(Integer value) {
            addCriterion("usershoppingcart >", value, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartGreaterThanOrEqualTo(Integer value) {
            addCriterion("usershoppingcart >=", value, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartLessThan(Integer value) {
            addCriterion("usershoppingcart <", value, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartLessThanOrEqualTo(Integer value) {
            addCriterion("usershoppingcart <=", value, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartIn(List<Integer> values) {
            addCriterion("usershoppingcart in", values, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartNotIn(List<Integer> values) {
            addCriterion("usershoppingcart not in", values, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartBetween(Integer value1, Integer value2) {
            addCriterion("usershoppingcart between", value1, value2, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUsershoppingcartNotBetween(Integer value1, Integer value2) {
            addCriterion("usershoppingcart not between", value1, value2, "usershoppingcart");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressIsNull() {
            addCriterion("userreceivingaddress is null");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressIsNotNull() {
            addCriterion("userreceivingaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressEqualTo(String value) {
            addCriterion("userreceivingaddress =", value, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressNotEqualTo(String value) {
            addCriterion("userreceivingaddress <>", value, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressGreaterThan(String value) {
            addCriterion("userreceivingaddress >", value, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressGreaterThanOrEqualTo(String value) {
            addCriterion("userreceivingaddress >=", value, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressLessThan(String value) {
            addCriterion("userreceivingaddress <", value, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressLessThanOrEqualTo(String value) {
            addCriterion("userreceivingaddress <=", value, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressLike(String value) {
            addCriterion("userreceivingaddress like", value, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressNotLike(String value) {
            addCriterion("userreceivingaddress not like", value, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressIn(List<String> values) {
            addCriterion("userreceivingaddress in", values, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressNotIn(List<String> values) {
            addCriterion("userreceivingaddress not in", values, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressBetween(String value1, String value2) {
            addCriterion("userreceivingaddress between", value1, value2, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUserreceivingaddressNotBetween(String value1, String value2) {
            addCriterion("userreceivingaddress not between", value1, value2, "userreceivingaddress");
            return (Criteria) this;
        }

        public Criteria andUseridnumberIsNull() {
            addCriterion("useridnumber is null");
            return (Criteria) this;
        }

        public Criteria andUseridnumberIsNotNull() {
            addCriterion("useridnumber is not null");
            return (Criteria) this;
        }

        public Criteria andUseridnumberEqualTo(Integer value) {
            addCriterion("useridnumber =", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberNotEqualTo(Integer value) {
            addCriterion("useridnumber <>", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberGreaterThan(Integer value) {
            addCriterion("useridnumber >", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("useridnumber >=", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberLessThan(Integer value) {
            addCriterion("useridnumber <", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberLessThanOrEqualTo(Integer value) {
            addCriterion("useridnumber <=", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberIn(List<Integer> values) {
            addCriterion("useridnumber in", values, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberNotIn(List<Integer> values) {
            addCriterion("useridnumber not in", values, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberBetween(Integer value1, Integer value2) {
            addCriterion("useridnumber between", value1, value2, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("useridnumber not between", value1, value2, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUsercollectIsNull() {
            addCriterion("usercollect is null");
            return (Criteria) this;
        }

        public Criteria andUsercollectIsNotNull() {
            addCriterion("usercollect is not null");
            return (Criteria) this;
        }

        public Criteria andUsercollectEqualTo(Integer value) {
            addCriterion("usercollect =", value, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectNotEqualTo(Integer value) {
            addCriterion("usercollect <>", value, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectGreaterThan(Integer value) {
            addCriterion("usercollect >", value, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercollect >=", value, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectLessThan(Integer value) {
            addCriterion("usercollect <", value, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectLessThanOrEqualTo(Integer value) {
            addCriterion("usercollect <=", value, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectIn(List<Integer> values) {
            addCriterion("usercollect in", values, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectNotIn(List<Integer> values) {
            addCriterion("usercollect not in", values, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectBetween(Integer value1, Integer value2) {
            addCriterion("usercollect between", value1, value2, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUsercollectNotBetween(Integer value1, Integer value2) {
            addCriterion("usercollect not between", value1, value2, "usercollect");
            return (Criteria) this;
        }

        public Criteria andUseridentificationIsNull() {
            addCriterion("useridentification is null");
            return (Criteria) this;
        }

        public Criteria andUseridentificationIsNotNull() {
            addCriterion("useridentification is not null");
            return (Criteria) this;
        }

        public Criteria andUseridentificationEqualTo(Integer value) {
            addCriterion("useridentification =", value, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationNotEqualTo(Integer value) {
            addCriterion("useridentification <>", value, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationGreaterThan(Integer value) {
            addCriterion("useridentification >", value, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("useridentification >=", value, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationLessThan(Integer value) {
            addCriterion("useridentification <", value, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationLessThanOrEqualTo(Integer value) {
            addCriterion("useridentification <=", value, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationIn(List<Integer> values) {
            addCriterion("useridentification in", values, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationNotIn(List<Integer> values) {
            addCriterion("useridentification not in", values, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationBetween(Integer value1, Integer value2) {
            addCriterion("useridentification between", value1, value2, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUseridentificationNotBetween(Integer value1, Integer value2) {
            addCriterion("useridentification not between", value1, value2, "useridentification");
            return (Criteria) this;
        }

        public Criteria andUsermessageIsNull() {
            addCriterion("usermessage is null");
            return (Criteria) this;
        }

        public Criteria andUsermessageIsNotNull() {
            addCriterion("usermessage is not null");
            return (Criteria) this;
        }

        public Criteria andUsermessageEqualTo(Integer value) {
            addCriterion("usermessage =", value, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageNotEqualTo(Integer value) {
            addCriterion("usermessage <>", value, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageGreaterThan(Integer value) {
            addCriterion("usermessage >", value, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageGreaterThanOrEqualTo(Integer value) {
            addCriterion("usermessage >=", value, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageLessThan(Integer value) {
            addCriterion("usermessage <", value, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageLessThanOrEqualTo(Integer value) {
            addCriterion("usermessage <=", value, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageIn(List<Integer> values) {
            addCriterion("usermessage in", values, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageNotIn(List<Integer> values) {
            addCriterion("usermessage not in", values, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageBetween(Integer value1, Integer value2) {
            addCriterion("usermessage between", value1, value2, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermessageNotBetween(Integer value1, Integer value2) {
            addCriterion("usermessage not between", value1, value2, "usermessage");
            return (Criteria) this;
        }

        public Criteria andUsermemberIsNull() {
            addCriterion("usermember is null");
            return (Criteria) this;
        }

        public Criteria andUsermemberIsNotNull() {
            addCriterion("usermember is not null");
            return (Criteria) this;
        }

        public Criteria andUsermemberEqualTo(Integer value) {
            addCriterion("usermember =", value, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberNotEqualTo(Integer value) {
            addCriterion("usermember <>", value, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberGreaterThan(Integer value) {
            addCriterion("usermember >", value, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("usermember >=", value, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberLessThan(Integer value) {
            addCriterion("usermember <", value, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberLessThanOrEqualTo(Integer value) {
            addCriterion("usermember <=", value, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberIn(List<Integer> values) {
            addCriterion("usermember in", values, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberNotIn(List<Integer> values) {
            addCriterion("usermember not in", values, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberBetween(Integer value1, Integer value2) {
            addCriterion("usermember between", value1, value2, "usermember");
            return (Criteria) this;
        }

        public Criteria andUsermemberNotBetween(Integer value1, Integer value2) {
            addCriterion("usermember not between", value1, value2, "usermember");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userphone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userphone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userphone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userphone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userphone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userphone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userphone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userphone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userphone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userphone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userphone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userphone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userphone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userphone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthIsNull() {
            addCriterion("userdatebirth is null");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthIsNotNull() {
            addCriterion("userdatebirth is not null");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthEqualTo(Date value) {
            addCriterionForJDBCDate("userdatebirth =", value, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("userdatebirth <>", value, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthGreaterThan(Date value) {
            addCriterionForJDBCDate("userdatebirth >", value, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userdatebirth >=", value, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthLessThan(Date value) {
            addCriterionForJDBCDate("userdatebirth <", value, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userdatebirth <=", value, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthIn(List<Date> values) {
            addCriterionForJDBCDate("userdatebirth in", values, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("userdatebirth not in", values, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userdatebirth between", value1, value2, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andUserdatebirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userdatebirth not between", value1, value2, "userdatebirth");
            return (Criteria) this;
        }

        public Criteria andTentative1IsNull() {
            addCriterion("tentative1 is null");
            return (Criteria) this;
        }

        public Criteria andTentative1IsNotNull() {
            addCriterion("tentative1 is not null");
            return (Criteria) this;
        }

        public Criteria andTentative1EqualTo(String value) {
            addCriterion("tentative1 =", value, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1NotEqualTo(String value) {
            addCriterion("tentative1 <>", value, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1GreaterThan(String value) {
            addCriterion("tentative1 >", value, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1GreaterThanOrEqualTo(String value) {
            addCriterion("tentative1 >=", value, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1LessThan(String value) {
            addCriterion("tentative1 <", value, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1LessThanOrEqualTo(String value) {
            addCriterion("tentative1 <=", value, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1Like(String value) {
            addCriterion("tentative1 like", value, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1NotLike(String value) {
            addCriterion("tentative1 not like", value, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1In(List<String> values) {
            addCriterion("tentative1 in", values, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1NotIn(List<String> values) {
            addCriterion("tentative1 not in", values, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1Between(String value1, String value2) {
            addCriterion("tentative1 between", value1, value2, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative1NotBetween(String value1, String value2) {
            addCriterion("tentative1 not between", value1, value2, "tentative1");
            return (Criteria) this;
        }

        public Criteria andTentative2IsNull() {
            addCriterion("tentative2 is null");
            return (Criteria) this;
        }

        public Criteria andTentative2IsNotNull() {
            addCriterion("tentative2 is not null");
            return (Criteria) this;
        }

        public Criteria andTentative2EqualTo(String value) {
            addCriterion("tentative2 =", value, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2NotEqualTo(String value) {
            addCriterion("tentative2 <>", value, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2GreaterThan(String value) {
            addCriterion("tentative2 >", value, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2GreaterThanOrEqualTo(String value) {
            addCriterion("tentative2 >=", value, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2LessThan(String value) {
            addCriterion("tentative2 <", value, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2LessThanOrEqualTo(String value) {
            addCriterion("tentative2 <=", value, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2Like(String value) {
            addCriterion("tentative2 like", value, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2NotLike(String value) {
            addCriterion("tentative2 not like", value, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2In(List<String> values) {
            addCriterion("tentative2 in", values, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2NotIn(List<String> values) {
            addCriterion("tentative2 not in", values, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2Between(String value1, String value2) {
            addCriterion("tentative2 between", value1, value2, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative2NotBetween(String value1, String value2) {
            addCriterion("tentative2 not between", value1, value2, "tentative2");
            return (Criteria) this;
        }

        public Criteria andTentative3IsNull() {
            addCriterion("tentative3 is null");
            return (Criteria) this;
        }

        public Criteria andTentative3IsNotNull() {
            addCriterion("tentative3 is not null");
            return (Criteria) this;
        }

        public Criteria andTentative3EqualTo(String value) {
            addCriterion("tentative3 =", value, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3NotEqualTo(String value) {
            addCriterion("tentative3 <>", value, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3GreaterThan(String value) {
            addCriterion("tentative3 >", value, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3GreaterThanOrEqualTo(String value) {
            addCriterion("tentative3 >=", value, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3LessThan(String value) {
            addCriterion("tentative3 <", value, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3LessThanOrEqualTo(String value) {
            addCriterion("tentative3 <=", value, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3Like(String value) {
            addCriterion("tentative3 like", value, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3NotLike(String value) {
            addCriterion("tentative3 not like", value, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3In(List<String> values) {
            addCriterion("tentative3 in", values, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3NotIn(List<String> values) {
            addCriterion("tentative3 not in", values, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3Between(String value1, String value2) {
            addCriterion("tentative3 between", value1, value2, "tentative3");
            return (Criteria) this;
        }

        public Criteria andTentative3NotBetween(String value1, String value2) {
            addCriterion("tentative3 not between", value1, value2, "tentative3");
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