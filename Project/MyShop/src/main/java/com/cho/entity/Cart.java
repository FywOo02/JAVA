package com.cho.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: Cho
 * @Date: 2022/04/23/15:15
 * @Description: The shopping cart table corresponding to the database
 */
public class Cart implements Serializable {
    private static final long serialVersionUID = 1L;
    private int sid;
    private int uid;
    private int gid;
    private BigDecimal sCount; // the count of goods in cart
    private int sNum; // the number of goods in cart

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public BigDecimal getsCount() {
        return sCount;
    }

    public void setsCount(BigDecimal sCount) {
        this.sCount = sCount;
    }

    public int getsNum() {
        return sNum;
    }

    public void setsNum(int sNum) {
        this.sNum = sNum;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "sid=" + sid +
                ", uid=" + uid +
                ", gid=" + gid +
                ", sCount=" + sCount +
                ", sNum=" + sNum +
                '}';
    }
}
