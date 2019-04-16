package top.axbt.to.entity;

import top.axbt.to.domain.TbCuseval;
import top.axbt.to.domain.TbSellinfo;
import top.axbt.to.domain.TbSellproduct;

/**
 * Create by 张晨彬
 * 2018/12/2/002 20:43
 */


public class EvalAndProductAndSell {

    private TbCuseval tbCuseval;
    private TbSellinfo tbSellinfo;
    private TbSellproduct tbSellproduct;

    public EvalAndProductAndSell() {
    }

    public EvalAndProductAndSell(TbCuseval tbCuseval, TbSellinfo tbSellinfo, TbSellproduct tbSellproduct) {
        this.tbCuseval = tbCuseval;
        this.tbSellinfo = tbSellinfo;
        this.tbSellproduct = tbSellproduct;
    }

    public TbCuseval getTbCuseval() {
        return tbCuseval;
    }

    public void setTbCuseval(TbCuseval tbCuseval) {
        this.tbCuseval = tbCuseval;
    }

    public TbSellinfo getTbSellinfo() {
        return tbSellinfo;
    }

    public void setTbSellinfo(TbSellinfo tbSellinfo) {
        this.tbSellinfo = tbSellinfo;
    }

    public TbSellproduct getTbSellproduct() {
        return tbSellproduct;
    }

    public void setTbSellproduct(TbSellproduct tbSellproduct) {
        this.tbSellproduct = tbSellproduct;
    }
}
