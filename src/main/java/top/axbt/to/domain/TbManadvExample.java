package top.axbt.to.domain;

import java.util.ArrayList;
import java.util.List;

public class TbManadvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbManadvExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoIsNull() {
            addCriterion("adv_photo is null");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoIsNotNull() {
            addCriterion("adv_photo is not null");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoEqualTo(String value) {
            addCriterion("adv_photo =", value, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoNotEqualTo(String value) {
            addCriterion("adv_photo <>", value, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoGreaterThan(String value) {
            addCriterion("adv_photo >", value, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("adv_photo >=", value, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoLessThan(String value) {
            addCriterion("adv_photo <", value, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoLessThanOrEqualTo(String value) {
            addCriterion("adv_photo <=", value, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoLike(String value) {
            addCriterion("adv_photo like", value, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoNotLike(String value) {
            addCriterion("adv_photo not like", value, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoIn(List<String> values) {
            addCriterion("adv_photo in", values, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoNotIn(List<String> values) {
            addCriterion("adv_photo not in", values, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoBetween(String value1, String value2) {
            addCriterion("adv_photo between", value1, value2, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvPhotoNotBetween(String value1, String value2) {
            addCriterion("adv_photo not between", value1, value2, "advPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvStateIsNull() {
            addCriterion("adv_state is null");
            return (Criteria) this;
        }

        public Criteria andAdvStateIsNotNull() {
            addCriterion("adv_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdvStateEqualTo(Integer value) {
            addCriterion("adv_state =", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateNotEqualTo(Integer value) {
            addCriterion("adv_state <>", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateGreaterThan(Integer value) {
            addCriterion("adv_state >", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_state >=", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateLessThan(Integer value) {
            addCriterion("adv_state <", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateLessThanOrEqualTo(Integer value) {
            addCriterion("adv_state <=", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateIn(List<Integer> values) {
            addCriterion("adv_state in", values, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateNotIn(List<Integer> values) {
            addCriterion("adv_state not in", values, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateBetween(Integer value1, Integer value2) {
            addCriterion("adv_state between", value1, value2, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_state not between", value1, value2, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryIsNull() {
            addCriterion("adv_category is null");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryIsNotNull() {
            addCriterion("adv_category is not null");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryEqualTo(String value) {
            addCriterion("adv_category =", value, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryNotEqualTo(String value) {
            addCriterion("adv_category <>", value, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryGreaterThan(String value) {
            addCriterion("adv_category >", value, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("adv_category >=", value, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryLessThan(String value) {
            addCriterion("adv_category <", value, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryLessThanOrEqualTo(String value) {
            addCriterion("adv_category <=", value, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryLike(String value) {
            addCriterion("adv_category like", value, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryNotLike(String value) {
            addCriterion("adv_category not like", value, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryIn(List<String> values) {
            addCriterion("adv_category in", values, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryNotIn(List<String> values) {
            addCriterion("adv_category not in", values, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryBetween(String value1, String value2) {
            addCriterion("adv_category between", value1, value2, "advCategory");
            return (Criteria) this;
        }

        public Criteria andAdvCategoryNotBetween(String value1, String value2) {
            addCriterion("adv_category not between", value1, value2, "advCategory");
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