package top.axbt.to.domain;

import java.util.Date;

public class TbSellinfo {
    private Long id;

    private String name;

    private String shopPhoto;

    private Integer businessState;

    private String businessLicense;

    private String idcardPhoto;

    private Long shopPhone;

    private Date businessStart;

    private Date businesEnd;

    private Integer auditState;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShopPhoto() {
        return shopPhoto;
    }

    public void setShopPhoto(String shopPhoto) {
        this.shopPhoto = shopPhoto == null ? null : shopPhoto.trim();
    }

    public Integer getBusinessState() {
        return businessState;
    }

    public void setBusinessState(Integer businessState) {
        this.businessState = businessState;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getIdcardPhoto() {
        return idcardPhoto;
    }

    public void setIdcardPhoto(String idcardPhoto) {
        this.idcardPhoto = idcardPhoto == null ? null : idcardPhoto.trim();
    }

    public Long getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(Long shopPhone) {
        this.shopPhone = shopPhone;
    }

    public Date getBusinessStart() {
        return businessStart;
    }

    public void setBusinessStart(Date businessStart) {
        this.businessStart = businessStart;
    }

    public Date getBusinesEnd() {
        return businesEnd;
    }

    public void setBusinesEnd(Date businesEnd) {
        this.businesEnd = businesEnd;
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
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
        TbSellinfo other = (TbSellinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getShopPhoto() == null ? other.getShopPhoto() == null : this.getShopPhoto().equals(other.getShopPhoto()))
            && (this.getBusinessState() == null ? other.getBusinessState() == null : this.getBusinessState().equals(other.getBusinessState()))
            && (this.getBusinessLicense() == null ? other.getBusinessLicense() == null : this.getBusinessLicense().equals(other.getBusinessLicense()))
            && (this.getIdcardPhoto() == null ? other.getIdcardPhoto() == null : this.getIdcardPhoto().equals(other.getIdcardPhoto()))
            && (this.getShopPhone() == null ? other.getShopPhone() == null : this.getShopPhone().equals(other.getShopPhone()))
            && (this.getBusinessStart() == null ? other.getBusinessStart() == null : this.getBusinessStart().equals(other.getBusinessStart()))
            && (this.getBusinesEnd() == null ? other.getBusinesEnd() == null : this.getBusinesEnd().equals(other.getBusinesEnd()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getShopPhoto() == null) ? 0 : getShopPhoto().hashCode());
        result = prime * result + ((getBusinessState() == null) ? 0 : getBusinessState().hashCode());
        result = prime * result + ((getBusinessLicense() == null) ? 0 : getBusinessLicense().hashCode());
        result = prime * result + ((getIdcardPhoto() == null) ? 0 : getIdcardPhoto().hashCode());
        result = prime * result + ((getShopPhone() == null) ? 0 : getShopPhone().hashCode());
        result = prime * result + ((getBusinessStart() == null) ? 0 : getBusinessStart().hashCode());
        result = prime * result + ((getBusinesEnd() == null) ? 0 : getBusinesEnd().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}