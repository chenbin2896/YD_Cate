package top.axbt.to.entity;

import top.axbt.to.domain.TbSellinfo;
import top.axbt.to.domain.TbSellproduct;

/**
 * Create by 张晨彬
 * 2018/12/2/002 20:42
 */


public class ProductAndSell {

    private TbSellproduct tbSellproduct;

    private TbSellinfo tbSellinfo;

    public ProductAndSell() {
    }

    public ProductAndSell(TbSellproduct tbSellproduct, TbSellinfo tbSellinfo) {
        this.tbSellproduct = tbSellproduct;
        this.tbSellinfo = tbSellinfo;
    }

    public TbSellproduct getTbSellproduct() {
        return tbSellproduct;
    }

    public void setTbSellproduct(TbSellproduct tbSellproduct) {
        this.tbSellproduct = tbSellproduct;
    }

    public TbSellinfo getTbSellinfo() {
        return tbSellinfo;
    }

    public void setTbSellinfo(TbSellinfo tbSellinfo) {
        this.tbSellinfo = tbSellinfo;
    }
}
