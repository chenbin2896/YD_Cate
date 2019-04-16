package top.axbt.to.domain;

import java.math.BigDecimal;

public class TbSellproduct {
    private Long id;

    private Long sellId;

    private String proName;

    private Long proCategoryId;

    private String proPhoto;

    private BigDecimal proPrice;

    private Integer proLevle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSellId() {
        return sellId;
    }

    public void setSellId(Long sellId) {
        this.sellId = sellId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Long getProCategoryId() {
        return proCategoryId;
    }

    public void setProCategoryId(Long proCategoryId) {
        this.proCategoryId = proCategoryId;
    }

    public String getProPhoto() {
        return proPhoto;
    }

    public void setProPhoto(String proPhoto) {
        this.proPhoto = proPhoto == null ? null : proPhoto.trim();
    }

    public BigDecimal getProPrice() {
        return proPrice;
    }

    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    public Integer getProLevle() {
        return proLevle;
    }

    public void setProLevle(Integer proLevle) {
        this.proLevle = proLevle;
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
        TbSellproduct other = (TbSellproduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSellId() == null ? other.getSellId() == null : this.getSellId().equals(other.getSellId()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProCategoryId() == null ? other.getProCategoryId() == null : this.getProCategoryId().equals(other.getProCategoryId()))
            && (this.getProPhoto() == null ? other.getProPhoto() == null : this.getProPhoto().equals(other.getProPhoto()))
            && (this.getProPrice() == null ? other.getProPrice() == null : this.getProPrice().equals(other.getProPrice()))
            && (this.getProLevle() == null ? other.getProLevle() == null : this.getProLevle().equals(other.getProLevle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSellId() == null) ? 0 : getSellId().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProCategoryId() == null) ? 0 : getProCategoryId().hashCode());
        result = prime * result + ((getProPhoto() == null) ? 0 : getProPhoto().hashCode());
        result = prime * result + ((getProPrice() == null) ? 0 : getProPrice().hashCode());
        result = prime * result + ((getProLevle() == null) ? 0 : getProLevle().hashCode());
        return result;
    }
}