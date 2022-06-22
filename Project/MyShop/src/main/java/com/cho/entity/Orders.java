package com.cho.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Cho
 * @Date: 2022/04/23/15:41
 * @Description:
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    private String oNum; // package code of orders
    private int aid;
    private int uid;
    private BigDecimal oCount; // count of orders
    private Date oDate; // date of orders
    private int oStatus;

    public String getoNum() {
        return oNum;
    }

    public void setoNum(String oNum) {
        this.oNum = oNum;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public BigDecimal getoCount() {
        return oCount;
    }

    public void setoCount(BigDecimal oCount) {
        this.oCount = oCount;
    }

    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Date oDate) {
        this.oDate = oDate;
    }

    public int getoStatus() {
        return oStatus;
    }

    public void setoStatus(int oStatus) {
        this.oStatus = oStatus;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oNum='" + oNum + '\'' +
                ", aid=" + aid +
                ", uid=" + uid +
                ", oCount=" + oCount +
                ", oDate=" + oDate +
                ", oStatus=" + oStatus +
                '}';
    }
}
