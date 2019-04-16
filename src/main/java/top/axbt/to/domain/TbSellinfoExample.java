package top.axbt.to.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSellinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSellinfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andShopPhotoIsNull() {
            addCriterion("shop_photo is null");
            return (Criteria) this;
        }

        public Criteria andShopPhotoIsNotNull() {
            addCriterion("shop_photo is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhotoEqualTo(String value) {
            addCriterion("shop_photo =", value, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoNotEqualTo(String value) {
            addCriterion("shop_photo <>", value, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoGreaterThan(String value) {
            addCriterion("shop_photo >", value, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_photo >=", value, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoLessThan(String value) {
            addCriterion("shop_photo <", value, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoLessThanOrEqualTo(String value) {
            addCriterion("shop_photo <=", value, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoLike(String value) {
            addCriterion("shop_photo like", value, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoNotLike(String value) {
            addCriterion("shop_photo not like", value, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoIn(List<String> values) {
            addCriterion("shop_photo in", values, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoNotIn(List<String> values) {
            addCriterion("shop_photo not in", values, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoBetween(String value1, String value2) {
            addCriterion("shop_photo between", value1, value2, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhotoNotBetween(String value1, String value2) {
            addCriterion("shop_photo not between", value1, value2, "shopPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessStateIsNull() {
            addCriterion("business_state is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStateIsNotNull() {
            addCriterion("business_state is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStateEqualTo(Integer value) {
            addCriterion("business_state =", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateNotEqualTo(Integer value) {
            addCriterion("business_state <>", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateGreaterThan(Integer value) {
            addCriterion("business_state >", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_state >=", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateLessThan(Integer value) {
            addCriterion("business_state <", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateLessThanOrEqualTo(Integer value) {
            addCriterion("business_state <=", value, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateIn(List<Integer> values) {
            addCriterion("business_state in", values, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateNotIn(List<Integer> values) {
            addCriterion("business_state not in", values, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateBetween(Integer value1, Integer value2) {
            addCriterion("business_state between", value1, value2, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessStateNotBetween(Integer value1, Integer value2) {
            addCriterion("business_state not between", value1, value2, "businessState");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_license =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_license >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_license <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_license like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_license not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_license in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoIsNull() {
            addCriterion("idcard_photo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoIsNotNull() {
            addCriterion("idcard_photo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoEqualTo(String value) {
            addCriterion("idcard_photo =", value, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoNotEqualTo(String value) {
            addCriterion("idcard_photo <>", value, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoGreaterThan(String value) {
            addCriterion("idcard_photo >", value, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_photo >=", value, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoLessThan(String value) {
            addCriterion("idcard_photo <", value, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoLessThanOrEqualTo(String value) {
            addCriterion("idcard_photo <=", value, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoLike(String value) {
            addCriterion("idcard_photo like", value, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoNotLike(String value) {
            addCriterion("idcard_photo not like", value, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoIn(List<String> values) {
            addCriterion("idcard_photo in", values, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoNotIn(List<String> values) {
            addCriterion("idcard_photo not in", values, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoBetween(String value1, String value2) {
            addCriterion("idcard_photo between", value1, value2, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIdcardPhotoNotBetween(String value1, String value2) {
            addCriterion("idcard_photo not between", value1, value2, "idcardPhoto");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNull() {
            addCriterion("shop_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNotNull() {
            addCriterion("shop_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneEqualTo(Long value) {
            addCriterion("shop_phone =", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotEqualTo(Long value) {
            addCriterion("shop_phone <>", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThan(Long value) {
            addCriterion("shop_phone >", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_phone >=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThan(Long value) {
            addCriterion("shop_phone <", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThanOrEqualTo(Long value) {
            addCriterion("shop_phone <=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIn(List<Long> values) {
            addCriterion("shop_phone in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotIn(List<Long> values) {
            addCriterion("shop_phone not in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneBetween(Long value1, Long value2) {
            addCriterion("shop_phone between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotBetween(Long value1, Long value2) {
            addCriterion("shop_phone not between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIsNull() {
            addCriterion("business_start is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIsNotNull() {
            addCriterion("business_start is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartEqualTo(Date value) {
            addCriterion("business_start =", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotEqualTo(Date value) {
            addCriterion("business_start <>", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartGreaterThan(Date value) {
            addCriterion("business_start >", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartGreaterThanOrEqualTo(Date value) {
            addCriterion("business_start >=", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartLessThan(Date value) {
            addCriterion("business_start <", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartLessThanOrEqualTo(Date value) {
            addCriterion("business_start <=", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIn(List<Date> values) {
            addCriterion("business_start in", values, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotIn(List<Date> values) {
            addCriterion("business_start not in", values, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartBetween(Date value1, Date value2) {
            addCriterion("business_start between", value1, value2, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotBetween(Date value1, Date value2) {
            addCriterion("business_start not between", value1, value2, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinesEndIsNull() {
            addCriterion("busines_end is null");
            return (Criteria) this;
        }

        public Criteria andBusinesEndIsNotNull() {
            addCriterion("busines_end is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesEndEqualTo(Date value) {
            addCriterion("busines_end =", value, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndNotEqualTo(Date value) {
            addCriterion("busines_end <>", value, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndGreaterThan(Date value) {
            addCriterion("busines_end >", value, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndGreaterThanOrEqualTo(Date value) {
            addCriterion("busines_end >=", value, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndLessThan(Date value) {
            addCriterion("busines_end <", value, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndLessThanOrEqualTo(Date value) {
            addCriterion("busines_end <=", value, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndIn(List<Date> values) {
            addCriterion("busines_end in", values, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndNotIn(List<Date> values) {
            addCriterion("busines_end not in", values, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndBetween(Date value1, Date value2) {
            addCriterion("busines_end between", value1, value2, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesEndNotBetween(Date value1, Date value2) {
            addCriterion("busines_end not between", value1, value2, "businesEnd");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(Integer value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(Integer value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(Integer value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(Integer value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(Integer value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<Integer> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<Integer> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(Integer value1, Integer value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
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