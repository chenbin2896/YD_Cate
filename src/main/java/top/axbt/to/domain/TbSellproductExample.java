package top.axbt.to.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbSellproductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSellproductExample() {
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

        public Criteria andSellIdIsNull() {
            addCriterion("sell_id is null");
            return (Criteria) this;
        }

        public Criteria andSellIdIsNotNull() {
            addCriterion("sell_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellIdEqualTo(Long value) {
            addCriterion("sell_id =", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotEqualTo(Long value) {
            addCriterion("sell_id <>", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdGreaterThan(Long value) {
            addCriterion("sell_id >", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sell_id >=", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdLessThan(Long value) {
            addCriterion("sell_id <", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdLessThanOrEqualTo(Long value) {
            addCriterion("sell_id <=", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdIn(List<Long> values) {
            addCriterion("sell_id in", values, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotIn(List<Long> values) {
            addCriterion("sell_id not in", values, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdBetween(Long value1, Long value2) {
            addCriterion("sell_id between", value1, value2, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotBetween(Long value1, Long value2) {
            addCriterion("sell_id not between", value1, value2, "sellId");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdIsNull() {
            addCriterion("pro_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdIsNotNull() {
            addCriterion("pro_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdEqualTo(Long value) {
            addCriterion("pro_category_id =", value, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdNotEqualTo(Long value) {
            addCriterion("pro_category_id <>", value, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdGreaterThan(Long value) {
            addCriterion("pro_category_id >", value, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_category_id >=", value, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdLessThan(Long value) {
            addCriterion("pro_category_id <", value, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("pro_category_id <=", value, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdIn(List<Long> values) {
            addCriterion("pro_category_id in", values, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdNotIn(List<Long> values) {
            addCriterion("pro_category_id not in", values, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdBetween(Long value1, Long value2) {
            addCriterion("pro_category_id between", value1, value2, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("pro_category_id not between", value1, value2, "proCategoryId");
            return (Criteria) this;
        }

        public Criteria andProPhotoIsNull() {
            addCriterion("pro_photo is null");
            return (Criteria) this;
        }

        public Criteria andProPhotoIsNotNull() {
            addCriterion("pro_photo is not null");
            return (Criteria) this;
        }

        public Criteria andProPhotoEqualTo(String value) {
            addCriterion("pro_photo =", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoNotEqualTo(String value) {
            addCriterion("pro_photo <>", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoGreaterThan(String value) {
            addCriterion("pro_photo >", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_photo >=", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoLessThan(String value) {
            addCriterion("pro_photo <", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoLessThanOrEqualTo(String value) {
            addCriterion("pro_photo <=", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoLike(String value) {
            addCriterion("pro_photo like", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoNotLike(String value) {
            addCriterion("pro_photo not like", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoIn(List<String> values) {
            addCriterion("pro_photo in", values, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoNotIn(List<String> values) {
            addCriterion("pro_photo not in", values, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoBetween(String value1, String value2) {
            addCriterion("pro_photo between", value1, value2, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoNotBetween(String value1, String value2) {
            addCriterion("pro_photo not between", value1, value2, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNull() {
            addCriterion("pro_price is null");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNotNull() {
            addCriterion("pro_price is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceEqualTo(BigDecimal value) {
            addCriterion("pro_price =", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotEqualTo(BigDecimal value) {
            addCriterion("pro_price <>", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThan(BigDecimal value) {
            addCriterion("pro_price >", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pro_price >=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThan(BigDecimal value) {
            addCriterion("pro_price <", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pro_price <=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIn(List<BigDecimal> values) {
            addCriterion("pro_price in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotIn(List<BigDecimal> values) {
            addCriterion("pro_price not in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pro_price between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pro_price not between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProLevleIsNull() {
            addCriterion("pro_levle is null");
            return (Criteria) this;
        }

        public Criteria andProLevleIsNotNull() {
            addCriterion("pro_levle is not null");
            return (Criteria) this;
        }

        public Criteria andProLevleEqualTo(Integer value) {
            addCriterion("pro_levle =", value, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleNotEqualTo(Integer value) {
            addCriterion("pro_levle <>", value, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleGreaterThan(Integer value) {
            addCriterion("pro_levle >", value, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_levle >=", value, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleLessThan(Integer value) {
            addCriterion("pro_levle <", value, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleLessThanOrEqualTo(Integer value) {
            addCriterion("pro_levle <=", value, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleIn(List<Integer> values) {
            addCriterion("pro_levle in", values, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleNotIn(List<Integer> values) {
            addCriterion("pro_levle not in", values, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleBetween(Integer value1, Integer value2) {
            addCriterion("pro_levle between", value1, value2, "proLevle");
            return (Criteria) this;
        }

        public Criteria andProLevleNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_levle not between", value1, value2, "proLevle");
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