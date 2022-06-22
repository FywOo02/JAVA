package com.cho.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: Cho
 * @Date: 2022/04/23/15:46
 * @Description:
 */
public class OrdersItems implements Serializable {
    private static final long serialVersionUID = 1L;
    private  int oiid;
    private  String oNum;
    private  int gid;
    private  BigDecimal oiCount;
    private  int oiNum;

    public int getOiid() {
        return oiid;
    }

    public void setOiid(int oiid) {
        this.oiid = oiid;
    }

    public String getoNum() {
        return oNum;
    }

    public void setoNum(String oNum) {
        this.oNum = oNum;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public BigDecimal getOiCount() {
        return oiCount;
    }

    public void setOiCount(BigDecimal oiCount) {
        this.oiCount = oiCount;
    }

    public int getOiNum() {
        return oiNum;
    }

    public void setOiNum(int oiNum) {
        this.oiNum = oiNum;
    }

    @Override
    public String toString() {
        return "OrdersItems{" +
                "oiid=" + oiid +
                ", oNum='" + oNum + '\'' +
                ", gid=" + gid +
                ", oiCount=" + oiCount +
                ", oiNum=" + oiNum +
                '}';
    }
}
