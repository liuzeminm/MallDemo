package cn.pojo;

import java.util.ArrayList;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andNoteidIsNull() {
            addCriterion("noteid is null");
            return (Criteria) this;
        }

        public Criteria andNoteidIsNotNull() {
            addCriterion("noteid is not null");
            return (Criteria) this;
        }

        public Criteria andNoteidEqualTo(Integer value) {
            addCriterion("noteid =", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotEqualTo(Integer value) {
            addCriterion("noteid <>", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThan(Integer value) {
            addCriterion("noteid >", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("noteid >=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThan(Integer value) {
            addCriterion("noteid <", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThanOrEqualTo(Integer value) {
            addCriterion("noteid <=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidIn(List<Integer> values) {
            addCriterion("noteid in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotIn(List<Integer> values) {
            addCriterion("noteid not in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidBetween(Integer value1, Integer value2) {
            addCriterion("noteid between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotBetween(Integer value1, Integer value2) {
            addCriterion("noteid not between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelIsNull() {
            addCriterion("notenotethelabel is null");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelIsNotNull() {
            addCriterion("notenotethelabel is not null");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelEqualTo(String value) {
            addCriterion("notenotethelabel =", value, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelNotEqualTo(String value) {
            addCriterion("notenotethelabel <>", value, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelGreaterThan(String value) {
            addCriterion("notenotethelabel >", value, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelGreaterThanOrEqualTo(String value) {
            addCriterion("notenotethelabel >=", value, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelLessThan(String value) {
            addCriterion("notenotethelabel <", value, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelLessThanOrEqualTo(String value) {
            addCriterion("notenotethelabel <=", value, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelLike(String value) {
            addCriterion("notenotethelabel like", value, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelNotLike(String value) {
            addCriterion("notenotethelabel not like", value, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelIn(List<String> values) {
            addCriterion("notenotethelabel in", values, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelNotIn(List<String> values) {
            addCriterion("notenotethelabel not in", values, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelBetween(String value1, String value2) {
            addCriterion("notenotethelabel between", value1, value2, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNotenotethelabelNotBetween(String value1, String value2) {
            addCriterion("notenotethelabel not between", value1, value2, "notenotethelabel");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineIsNull() {
            addCriterion("noteheadline is null");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineIsNotNull() {
            addCriterion("noteheadline is not null");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineEqualTo(String value) {
            addCriterion("noteheadline =", value, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineNotEqualTo(String value) {
            addCriterion("noteheadline <>", value, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineGreaterThan(String value) {
            addCriterion("noteheadline >", value, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineGreaterThanOrEqualTo(String value) {
            addCriterion("noteheadline >=", value, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineLessThan(String value) {
            addCriterion("noteheadline <", value, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineLessThanOrEqualTo(String value) {
            addCriterion("noteheadline <=", value, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineLike(String value) {
            addCriterion("noteheadline like", value, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineNotLike(String value) {
            addCriterion("noteheadline not like", value, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineIn(List<String> values) {
            addCriterion("noteheadline in", values, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineNotIn(List<String> values) {
            addCriterion("noteheadline not in", values, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineBetween(String value1, String value2) {
            addCriterion("noteheadline between", value1, value2, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteheadlineNotBetween(String value1, String value2) {
            addCriterion("noteheadline not between", value1, value2, "noteheadline");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceIsNull() {
            addCriterion("noteuserexperience is null");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceIsNotNull() {
            addCriterion("noteuserexperience is not null");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceEqualTo(String value) {
            addCriterion("noteuserexperience =", value, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceNotEqualTo(String value) {
            addCriterion("noteuserexperience <>", value, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceGreaterThan(String value) {
            addCriterion("noteuserexperience >", value, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("noteuserexperience >=", value, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceLessThan(String value) {
            addCriterion("noteuserexperience <", value, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceLessThanOrEqualTo(String value) {
            addCriterion("noteuserexperience <=", value, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceLike(String value) {
            addCriterion("noteuserexperience like", value, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceNotLike(String value) {
            addCriterion("noteuserexperience not like", value, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceIn(List<String> values) {
            addCriterion("noteuserexperience in", values, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceNotIn(List<String> values) {
            addCriterion("noteuserexperience not in", values, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceBetween(String value1, String value2) {
            addCriterion("noteuserexperience between", value1, value2, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNoteuserexperienceNotBetween(String value1, String value2) {
            addCriterion("noteuserexperience not between", value1, value2, "noteuserexperience");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingIsNull() {
            addCriterion("notenotesharing is null");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingIsNotNull() {
            addCriterion("notenotesharing is not null");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingEqualTo(String value) {
            addCriterion("notenotesharing =", value, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingNotEqualTo(String value) {
            addCriterion("notenotesharing <>", value, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingGreaterThan(String value) {
            addCriterion("notenotesharing >", value, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingGreaterThanOrEqualTo(String value) {
            addCriterion("notenotesharing >=", value, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingLessThan(String value) {
            addCriterion("notenotesharing <", value, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingLessThanOrEqualTo(String value) {
            addCriterion("notenotesharing <=", value, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingLike(String value) {
            addCriterion("notenotesharing like", value, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingNotLike(String value) {
            addCriterion("notenotesharing not like", value, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingIn(List<String> values) {
            addCriterion("notenotesharing in", values, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingNotIn(List<String> values) {
            addCriterion("notenotesharing not in", values, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingBetween(String value1, String value2) {
            addCriterion("notenotesharing between", value1, value2, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotenotesharingNotBetween(String value1, String value2) {
            addCriterion("notenotesharing not between", value1, value2, "notenotesharing");
            return (Criteria) this;
        }

        public Criteria andNotelikeIsNull() {
            addCriterion("notelike is null");
            return (Criteria) this;
        }

        public Criteria andNotelikeIsNotNull() {
            addCriterion("notelike is not null");
            return (Criteria) this;
        }

        public Criteria andNotelikeEqualTo(Integer value) {
            addCriterion("notelike =", value, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeNotEqualTo(Integer value) {
            addCriterion("notelike <>", value, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeGreaterThan(Integer value) {
            addCriterion("notelike >", value, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notelike >=", value, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeLessThan(Integer value) {
            addCriterion("notelike <", value, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeLessThanOrEqualTo(Integer value) {
            addCriterion("notelike <=", value, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeIn(List<Integer> values) {
            addCriterion("notelike in", values, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeNotIn(List<Integer> values) {
            addCriterion("notelike not in", values, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeBetween(Integer value1, Integer value2) {
            addCriterion("notelike between", value1, value2, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotelikeNotBetween(Integer value1, Integer value2) {
            addCriterion("notelike not between", value1, value2, "notelike");
            return (Criteria) this;
        }

        public Criteria andNotereplyIsNull() {
            addCriterion("notereply is null");
            return (Criteria) this;
        }

        public Criteria andNotereplyIsNotNull() {
            addCriterion("notereply is not null");
            return (Criteria) this;
        }

        public Criteria andNotereplyEqualTo(String value) {
            addCriterion("notereply =", value, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyNotEqualTo(String value) {
            addCriterion("notereply <>", value, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyGreaterThan(String value) {
            addCriterion("notereply >", value, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyGreaterThanOrEqualTo(String value) {
            addCriterion("notereply >=", value, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyLessThan(String value) {
            addCriterion("notereply <", value, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyLessThanOrEqualTo(String value) {
            addCriterion("notereply <=", value, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyLike(String value) {
            addCriterion("notereply like", value, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyNotLike(String value) {
            addCriterion("notereply not like", value, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyIn(List<String> values) {
            addCriterion("notereply in", values, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyNotIn(List<String> values) {
            addCriterion("notereply not in", values, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyBetween(String value1, String value2) {
            addCriterion("notereply between", value1, value2, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotereplyNotBetween(String value1, String value2) {
            addCriterion("notereply not between", value1, value2, "notereply");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserIsNull() {
            addCriterion("notenotepostinguser is null");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserIsNotNull() {
            addCriterion("notenotepostinguser is not null");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserEqualTo(String value) {
            addCriterion("notenotepostinguser =", value, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserNotEqualTo(String value) {
            addCriterion("notenotepostinguser <>", value, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserGreaterThan(String value) {
            addCriterion("notenotepostinguser >", value, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserGreaterThanOrEqualTo(String value) {
            addCriterion("notenotepostinguser >=", value, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserLessThan(String value) {
            addCriterion("notenotepostinguser <", value, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserLessThanOrEqualTo(String value) {
            addCriterion("notenotepostinguser <=", value, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserLike(String value) {
            addCriterion("notenotepostinguser like", value, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserNotLike(String value) {
            addCriterion("notenotepostinguser not like", value, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserIn(List<String> values) {
            addCriterion("notenotepostinguser in", values, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserNotIn(List<String> values) {
            addCriterion("notenotepostinguser not in", values, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserBetween(String value1, String value2) {
            addCriterion("notenotepostinguser between", value1, value2, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotenotepostinguserNotBetween(String value1, String value2) {
            addCriterion("notenotepostinguser not between", value1, value2, "notenotepostinguser");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberIsNull() {
            addCriterion("notepraisenumber is null");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberIsNotNull() {
            addCriterion("notepraisenumber is not null");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberEqualTo(Integer value) {
            addCriterion("notepraisenumber =", value, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberNotEqualTo(Integer value) {
            addCriterion("notepraisenumber <>", value, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberGreaterThan(Integer value) {
            addCriterion("notepraisenumber >", value, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("notepraisenumber >=", value, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberLessThan(Integer value) {
            addCriterion("notepraisenumber <", value, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberLessThanOrEqualTo(Integer value) {
            addCriterion("notepraisenumber <=", value, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberIn(List<Integer> values) {
            addCriterion("notepraisenumber in", values, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberNotIn(List<Integer> values) {
            addCriterion("notepraisenumber not in", values, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberBetween(Integer value1, Integer value2) {
            addCriterion("notepraisenumber between", value1, value2, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotepraisenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("notepraisenumber not between", value1, value2, "notepraisenumber");
            return (Criteria) this;
        }

        public Criteria andNotecommentsIsNull() {
            addCriterion("notecomments is null");
            return (Criteria) this;
        }

        public Criteria andNotecommentsIsNotNull() {
            addCriterion("notecomments is not null");
            return (Criteria) this;
        }

        public Criteria andNotecommentsEqualTo(Integer value) {
            addCriterion("notecomments =", value, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsNotEqualTo(Integer value) {
            addCriterion("notecomments <>", value, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsGreaterThan(Integer value) {
            addCriterion("notecomments >", value, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("notecomments >=", value, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsLessThan(Integer value) {
            addCriterion("notecomments <", value, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsLessThanOrEqualTo(Integer value) {
            addCriterion("notecomments <=", value, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsIn(List<Integer> values) {
            addCriterion("notecomments in", values, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsNotIn(List<Integer> values) {
            addCriterion("notecomments not in", values, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsBetween(Integer value1, Integer value2) {
            addCriterion("notecomments between", value1, value2, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotecommentsNotBetween(Integer value1, Integer value2) {
            addCriterion("notecomments not between", value1, value2, "notecomments");
            return (Criteria) this;
        }

        public Criteria andNotesortingIsNull() {
            addCriterion("notesorting is null");
            return (Criteria) this;
        }

        public Criteria andNotesortingIsNotNull() {
            addCriterion("notesorting is not null");
            return (Criteria) this;
        }

        public Criteria andNotesortingEqualTo(Integer value) {
            addCriterion("notesorting =", value, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingNotEqualTo(Integer value) {
            addCriterion("notesorting <>", value, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingGreaterThan(Integer value) {
            addCriterion("notesorting >", value, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingGreaterThanOrEqualTo(Integer value) {
            addCriterion("notesorting >=", value, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingLessThan(Integer value) {
            addCriterion("notesorting <", value, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingLessThanOrEqualTo(Integer value) {
            addCriterion("notesorting <=", value, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingIn(List<Integer> values) {
            addCriterion("notesorting in", values, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingNotIn(List<Integer> values) {
            addCriterion("notesorting not in", values, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingBetween(Integer value1, Integer value2) {
            addCriterion("notesorting between", value1, value2, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotesortingNotBetween(Integer value1, Integer value2) {
            addCriterion("notesorting not between", value1, value2, "notesorting");
            return (Criteria) this;
        }

        public Criteria andNotefilteringIsNull() {
            addCriterion("notefiltering is null");
            return (Criteria) this;
        }

        public Criteria andNotefilteringIsNotNull() {
            addCriterion("notefiltering is not null");
            return (Criteria) this;
        }

        public Criteria andNotefilteringEqualTo(Integer value) {
            addCriterion("notefiltering =", value, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringNotEqualTo(Integer value) {
            addCriterion("notefiltering <>", value, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringGreaterThan(Integer value) {
            addCriterion("notefiltering >", value, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringGreaterThanOrEqualTo(Integer value) {
            addCriterion("notefiltering >=", value, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringLessThan(Integer value) {
            addCriterion("notefiltering <", value, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringLessThanOrEqualTo(Integer value) {
            addCriterion("notefiltering <=", value, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringIn(List<Integer> values) {
            addCriterion("notefiltering in", values, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringNotIn(List<Integer> values) {
            addCriterion("notefiltering not in", values, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringBetween(Integer value1, Integer value2) {
            addCriterion("notefiltering between", value1, value2, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotefilteringNotBetween(Integer value1, Integer value2) {
            addCriterion("notefiltering not between", value1, value2, "notefiltering");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationIsNull() {
            addCriterion("notepostinglocation is null");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationIsNotNull() {
            addCriterion("notepostinglocation is not null");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationEqualTo(String value) {
            addCriterion("notepostinglocation =", value, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationNotEqualTo(String value) {
            addCriterion("notepostinglocation <>", value, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationGreaterThan(String value) {
            addCriterion("notepostinglocation >", value, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationGreaterThanOrEqualTo(String value) {
            addCriterion("notepostinglocation >=", value, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationLessThan(String value) {
            addCriterion("notepostinglocation <", value, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationLessThanOrEqualTo(String value) {
            addCriterion("notepostinglocation <=", value, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationLike(String value) {
            addCriterion("notepostinglocation like", value, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationNotLike(String value) {
            addCriterion("notepostinglocation not like", value, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationIn(List<String> values) {
            addCriterion("notepostinglocation in", values, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationNotIn(List<String> values) {
            addCriterion("notepostinglocation not in", values, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationBetween(String value1, String value2) {
            addCriterion("notepostinglocation between", value1, value2, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNotepostinglocationNotBetween(String value1, String value2) {
            addCriterion("notepostinglocation not between", value1, value2, "notepostinglocation");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftIsNull() {
            addCriterion("noteonthedraft is null");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftIsNotNull() {
            addCriterion("noteonthedraft is not null");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftEqualTo(Integer value) {
            addCriterion("noteonthedraft =", value, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftNotEqualTo(Integer value) {
            addCriterion("noteonthedraft <>", value, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftGreaterThan(Integer value) {
            addCriterion("noteonthedraft >", value, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftGreaterThanOrEqualTo(Integer value) {
            addCriterion("noteonthedraft >=", value, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftLessThan(Integer value) {
            addCriterion("noteonthedraft <", value, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftLessThanOrEqualTo(Integer value) {
            addCriterion("noteonthedraft <=", value, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftIn(List<Integer> values) {
            addCriterion("noteonthedraft in", values, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftNotIn(List<Integer> values) {
            addCriterion("noteonthedraft not in", values, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftBetween(Integer value1, Integer value2) {
            addCriterion("noteonthedraft between", value1, value2, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNoteonthedraftNotBetween(Integer value1, Integer value2) {
            addCriterion("noteonthedraft not between", value1, value2, "noteonthedraft");
            return (Criteria) this;
        }

        public Criteria andNotecollectionIsNull() {
            addCriterion("notecollection is null");
            return (Criteria) this;
        }

        public Criteria andNotecollectionIsNotNull() {
            addCriterion("notecollection is not null");
            return (Criteria) this;
        }

        public Criteria andNotecollectionEqualTo(Integer value) {
            addCriterion("notecollection =", value, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionNotEqualTo(Integer value) {
            addCriterion("notecollection <>", value, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionGreaterThan(Integer value) {
            addCriterion("notecollection >", value, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("notecollection >=", value, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionLessThan(Integer value) {
            addCriterion("notecollection <", value, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionLessThanOrEqualTo(Integer value) {
            addCriterion("notecollection <=", value, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionIn(List<Integer> values) {
            addCriterion("notecollection in", values, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionNotIn(List<Integer> values) {
            addCriterion("notecollection not in", values, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionBetween(Integer value1, Integer value2) {
            addCriterion("notecollection between", value1, value2, "notecollection");
            return (Criteria) this;
        }

        public Criteria andNotecollectionNotBetween(Integer value1, Integer value2) {
            addCriterion("notecollection not between", value1, value2, "notecollection");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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