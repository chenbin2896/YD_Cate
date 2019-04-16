package top.axbt.to.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCusorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCusorderExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdIsNull() {
            addCriterion("order_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdIsNotNull() {
            addCriterion("order_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdEqualTo(Long value) {
            addCriterion("order_shop_id =", value, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdNotEqualTo(Long value) {
            addCriterion("order_shop_id <>", value, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdGreaterThan(Long value) {
            addCriterion("order_shop_id >", value, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_shop_id >=", value, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdLessThan(Long value) {
            addCriterion("order_shop_id <", value, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdLessThanOrEqualTo(Long value) {
            addCriterion("order_shop_id <=", value, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdIn(List<Long> values) {
            addCriterion("order_shop_id in", values, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdNotIn(List<Long> values) {
            addCriterion("order_shop_id not in", values, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdBetween(Long value1, Long value2) {
            addCriterion("order_shop_id between", value1, value2, "orderShopId");
            return (Criteria) this;
        }

        public Criteria andOrderShopIdNotBetween(Long value1, Long value2) {
            addCriterion("order_shop_id not between", value1, value2, "orderShopId");
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

        public Criteria andCusInfoIdIsNull() {
            addCriterion("cus_info_id is null");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdIsNotNull() {
            addCriterion("cus_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdEqualTo(Long value) {
            addCriterion("cus_info_id =", value, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdNotEqualTo(Long value) {
            addCriterion("cus_info_id <>", value, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdGreaterThan(Long value) {
            addCriterion("cus_info_id >", value, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cus_info_id >=", value, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdLessThan(Long value) {
            addCriterion("cus_info_id <", value, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("cus_info_id <=", value, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdIn(List<Long> values) {
            addCriterion("cus_info_id in", values, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdNotIn(List<Long> values) {
            addCriterion("cus_info_id not in", values, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdBetween(Long value1, Long value2) {
            addCriterion("cus_info_id between", value1, value2, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCusInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("cus_info_id not between", value1, value2, "cusInfoId");
            return (Criteria) this;
        }

        public Criteria andCourierIdIsNull() {
            addCriterion("courier_id is null");
            return (Criteria) this;
        }

        public Criteria andCourierIdIsNotNull() {
            addCriterion("courier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourierIdEqualTo(Long value) {
            addCriterion("courier_id =", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdNotEqualTo(Long value) {
            addCriterion("courier_id <>", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdGreaterThan(Long value) {
            addCriterion("courier_id >", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("courier_id >=", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdLessThan(Long value) {
            addCriterion("courier_id <", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdLessThanOrEqualTo(Long value) {
            addCriterion("courier_id <=", value, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdIn(List<Long> values) {
            addCriterion("courier_id in", values, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdNotIn(List<Long> values) {
            addCriterion("courier_id not in", values, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdBetween(Long value1, Long value2) {
            addCriterion("courier_id between", value1, value2, "courierId");
            return (Criteria) this;
        }

        public Criteria andCourierIdNotBetween(Long value1, Long value2) {
            addCriterion("courier_id not between", value1, value2, "courierId");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(Integer value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(Integer value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(Integer value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(Integer value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(Integer value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<Integer> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<Integer> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(Integer value1, Integer value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
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