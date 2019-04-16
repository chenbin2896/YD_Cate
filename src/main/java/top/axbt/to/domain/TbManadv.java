package top.axbt.to.domain;

public class TbManadv {
    private Long id;

    private String advPhoto;

    private Integer advState;

    private String advCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdvPhoto() {
        return advPhoto;
    }

    public void setAdvPhoto(String advPhoto) {
        this.advPhoto = advPhoto == null ? null : advPhoto.trim();
    }

    public Integer getAdvState() {
        return advState;
    }

    public void setAdvState(Integer advState) {
        this.advState = advState;
    }

    public String getAdvCategory() {
        return advCategory;
    }

    public void setAdvCategory(String advCategory) {
        this.advCategory = advCategory == null ? null : advCategory.trim();
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
        TbManadv other = (TbManadv) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdvPhoto() == null ? other.getAdvPhoto() == null : this.getAdvPhoto().equals(other.getAdvPhoto()))
            && (this.getAdvState() == null ? other.getAdvState() == null : this.getAdvState().equals(other.getAdvState()))
            && (this.getAdvCategory() == null ? other.getAdvCategory() == null : this.getAdvCategory().equals(other.getAdvCategory()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdvPhoto() == null) ? 0 : getAdvPhoto().hashCode());
        result = prime * result + ((getAdvState() == null) ? 0 : getAdvState().hashCode());
        result = prime * result + ((getAdvCategory() == null) ? 0 : getAdvCategory().hashCode());
        return result;
    }
}