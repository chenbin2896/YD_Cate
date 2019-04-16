package top.axbt.to.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCusevalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCusevalExample() {
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

        public Criteria andCusIdIsNull() {
            addCriterion("cus_id is null");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNotNull() {
            addCriterion("cus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdEqualTo(Long value) {
            addCriterion("cus_id =", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotEqualTo(Long value) {
            addCriterion("cus_id <>", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThan(Long value) {
            addCriterion("cus_id >", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cus_id >=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThan(Long value) {
            addCriterion("cus_id <", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThanOrEqualTo(Long value) {
            addCriterion("cus_id <=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdIn(List<Long> values) {
            addCriterion("cus_id in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotIn(List<Long> values) {
            addCriterion("cus_id not in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdBetween(Long value1, Long value2) {
            addCriterion("cus_id between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotBetween(Long value1, Long value2) {
            addCriterion("cus_id not between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdIsNull() {
            addCriterion("sell_product_id is null");
            return (Criteria) this;
        }

        public Criteria andSellProductIdIsNotNull() {
            addCriterion("sell_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellProductIdEqualTo(Long value) {
            addCriterion("sell_product_id =", value, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdNotEqualTo(Long value) {
            addCriterion("sell_product_id <>", value, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdGreaterThan(Long value) {
            addCriterion("sell_product_id >", value, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sell_product_id >=", value, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdLessThan(Long value) {
            addCriterion("sell_product_id <", value, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdLessThanOrEqualTo(Long value) {
            addCriterion("sell_product_id <=", value, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdIn(List<Long> values) {
            addCriterion("sell_product_id in", values, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdNotIn(List<Long> values) {
            addCriterion("sell_product_id not in", values, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdBetween(Long value1, Long value2) {
            addCriterion("sell_product_id between", value1, value2, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andSellProductIdNotBetween(Long value1, Long value2) {
            addCriterion("sell_product_id not between", value1, value2, "sellProductId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andCourierLevelIsNull() {
            addCriterion("courier_level is null");
            return (Criteria) this;
        }

        public Criteria andCourierLevelIsNotNull() {
            addCriterion("courier_level is not null");
            return (Criteria) this;
        }

        public Criteria andCourierLevelEqualTo(Integer value) {
            addCriterion("courier_level =", value, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelNotEqualTo(Integer value) {
            addCriterion("courier_level <>", value, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelGreaterThan(Integer value) {
            addCriterion("courier_level >", value, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("courier_level >=", value, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelLessThan(Integer value) {
            addCriterion("courier_level <", value, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelLessThanOrEqualTo(Integer value) {
            addCriterion("courier_level <=", value, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelIn(List<Integer> values) {
            addCriterion("courier_level in", values, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelNotIn(List<Integer> values) {
            addCriterion("courier_level not in", values, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelBetween(Integer value1, Integer value2) {
            addCriterion("courier_level between", value1, value2, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andCourierLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("courier_level not between", value1, value2, "courierLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelIsNull() {
            addCriterion("product_level is null");
            return (Criteria) this;
        }

        public Criteria andProductLevelIsNotNull() {
            addCriterion("product_level is not null");
            return (Criteria) this;
        }

        public Criteria andProductLevelEqualTo(Integer value) {
            addCriterion("product_level =", value, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelNotEqualTo(Integer value) {
            addCriterion("product_level <>", value, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelGreaterThan(Integer value) {
            addCriterion("product_level >", value, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_level >=", value, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelLessThan(Integer value) {
            addCriterion("product_level <", value, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelLessThanOrEqualTo(Integer value) {
            addCriterion("product_level <=", value, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelIn(List<Integer> values) {
            addCriterion("product_level in", values, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelNotIn(List<Integer> values) {
            addCriterion("product_level not in", values, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelBetween(Integer value1, Integer value2) {
            addCriterion("product_level between", value1, value2, "productLevel");
            return (Criteria) this;
        }

        public Criteria andProductLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("product_level not between", value1, value2, "productLevel");
            return (Criteria) this;
        }

        public Criteria andEvalCommentIsNull() {
            addCriterion("eval_comment is null");
            return (Criteria) this;
        }

        public Criteria andEvalCommentIsNotNull() {
            addCriterion("eval_comment is not null");
            return (Criteria) this;
        }

        public Criteria andEvalCommentEqualTo(String value) {
            addCriterion("eval_comment =", value, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentNotEqualTo(String value) {
            addCriterion("eval_comment <>", value, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentGreaterThan(String value) {
            addCriterion("eval_comment >", value, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentGreaterThanOrEqualTo(String value) {
            addCriterion("eval_comment >=", value, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentLessThan(String value) {
            addCriterion("eval_comment <", value, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentLessThanOrEqualTo(String value) {
            addCriterion("eval_comment <=", value, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentLike(String value) {
            addCriterion("eval_comment like", value, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentNotLike(String value) {
            addCriterion("eval_comment not like", value, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentIn(List<String> values) {
            addCriterion("eval_comment in", values, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentNotIn(List<String> values) {
            addCriterion("eval_comment not in", values, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentBetween(String value1, String value2) {
            addCriterion("eval_comment between", value1, value2, "evalComment");
            return (Criteria) this;
        }

        public Criteria andEvalCommentNotBetween(String value1, String value2) {
            addCriterion("eval_comment not between", value1, value2, "evalComment");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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