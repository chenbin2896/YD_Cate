package top.axbt.to.entity;

import top.axbt.to.domain.TbCourierinfo;
import top.axbt.to.domain.TbCusinfo;
import top.axbt.to.domain.TbCusorder;

/**
 * Create by 张晨彬
 * 2018/12/3/003 10:58
 */


public class OrderCusInfoCourierInfo {

    private TbCusorder tbCusorder;
    private TbCusinfo tbCusinfo;
    private TbCourierinfo tbCourierinfo;

    public OrderCusInfoCourierInfo() {
    }

    public OrderCusInfoCourierInfo(TbCusorder tbCusorder, TbCusinfo tbCusinfo, TbCourierinfo tbCourierinfo) {
        this.tbCusorder = tbCusorder;
        this.tbCusinfo = tbCusinfo;
        this.tbCourierinfo = tbCourierinfo;
    }

    public TbCusorder getTbCusorder() {

        return tbCusorder;
    }

    public void setTbCusorder(TbCusorder tbCusorder) {
        this.tbCusorder = tbCusorder;
    }

    public TbCusinfo getTbCusinfo() {
        return tbCusinfo;
    }

    public void setTbCusinfo(TbCusinfo tbCusinfo) {
        this.tbCusinfo = tbCusinfo;
    }

    public TbCourierinfo getTbCourierinfo() {
        return tbCourierinfo;
    }

    public void setTbCourierinfo(TbCourierinfo tbCourierinfo) {
        this.tbCourierinfo = tbCourierinfo;
    }
}
