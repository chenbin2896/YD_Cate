package top.axbt.to.domain;

import java.util.Date;

public class TbCuseval {
    private Long id;

    private Long cusId;

    private Long sellProductId;

    private Long shopId;

    private Integer courierLevel;

    private Integer productLevel;

    private String evalComment;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public Long getSellProductId() {
        return sellProductId;
    }

    public void setSellProductId(Long sellProductId) {
        this.sellProductId = sellProductId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Integer getCourierLevel() {
        return courierLevel;
    }

    public void setCourierLevel(Integer courierLevel) {
        this.courierLevel = courierLevel;
    }

    public Integer getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(Integer productLevel) {
        this.productLevel = productLevel;
    }

    public String getEvalComment() {
        return evalComment;
    }

    public void setEvalComment(String evalComment) {
        this.evalComment = evalComment == null ? null : evalComment.trim();
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
        TbCuseval other = (TbCuseval) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCusId() == null ? other.getCusId() == null : this.getCusId().equals(other.getCusId()))
            && (this.getSellProductId() == null ? other.getSellProductId() == null : this.getSellProductId().equals(other.getSellProductId()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getCourierLevel() == null ? other.getCourierLevel() == null : this.getCourierLevel().equals(other.getCourierLevel()))
            && (this.getProductLevel() == null ? other.getProductLevel() == null : this.getProductLevel().equals(other.getProductLevel()))
            && (this.getEvalComment() == null ? other.getEvalComment() == null : this.getEvalComment().equals(other.getEvalComment()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCusId() == null) ? 0 : getCusId().hashCode());
        result = prime * result + ((getSellProductId() == null) ? 0 : getSellProductId().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getCourierLevel() == null) ? 0 : getCourierLevel().hashCode());
        result = prime * result + ((getProductLevel() == null) ? 0 : getProductLevel().hashCode());
        result = prime * result + ((getEvalComment() == null) ? 0 : getEvalComment().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}