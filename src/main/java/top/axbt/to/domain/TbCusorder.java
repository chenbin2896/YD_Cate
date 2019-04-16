package top.axbt.to.domain;

import java.math.BigDecimal;
import java.util.Date;

public class TbCusorder {
    private String id;

    private Long orderShopId;

    private Long sellProductId;

    private Long cusInfoId;

    private Long courierId;

    private String orderName;

    private BigDecimal orderAmount;

    private Integer payState;

    private Integer orderState;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getOrderShopId() {
        return orderShopId;
    }

    public void setOrderShopId(Long orderShopId) {
        this.orderShopId = orderShopId;
    }

    public Long getSellProductId() {
        return sellProductId;
    }

    public void setSellProductId(Long sellProductId) {
        this.sellProductId = sellProductId;
    }

    public Long getCusInfoId() {
        return cusInfoId;
    }

    public void setCusInfoId(Long cusInfoId) {
        this.cusInfoId = cusInfoId;
    }

    public Long getCourierId() {
        return courierId;
    }

    public void setCourierId(Long courierId) {
        this.courierId = courierId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbCusorder other = (TbCusorder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderShopId() == null ? other.getOrderShopId() == null : this.getOrderShopId().equals(other.getOrderShopId()))
            && (this.getSellProductId() == null ? other.getSellProductId() == null : this.getSellProductId().equals(other.getSellProductId()))
            && (this.getCusInfoId() == null ? other.getCusInfoId() == null : this.getCusInfoId().equals(other.getCusInfoId()))
            && (this.getCourierId() == null ? other.getCourierId() == null : this.getCourierId().equals(other.getCourierId()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getOrderAmount() == null ? other.getOrderAmount() == null : this.getOrderAmount().equals(other.getOrderAmount()))
            && (this.getPayState() == null ? other.getPayState() == null : this.getPayState().equals(other.getPayState()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderShopId() == null) ? 0 : getOrderShopId().hashCode());
        result = prime * result + ((getSellProductId() == null) ? 0 : getSellProductId().hashCode());
        result = prime * result + ((getCusInfoId() == null) ? 0 : getCusInfoId().hashCode());
        result = prime * result + ((getCourierId() == null) ? 0 : getCourierId().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getOrderAmount() == null) ? 0 : getOrderAmount().hashCode());
        result = prime * result + ((getPayState() == null) ? 0 : getPayState().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}