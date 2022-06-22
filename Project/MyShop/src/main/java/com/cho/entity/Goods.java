package com.cho.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Cho
 * @Date: 2022/04/23/15:35
 * @Description:
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;
    private int gid;
    private int cid;
    private String gName; // name of goods
    private Date gLaunchTime; // launch time of goods
    private String gImage; // images of goods
    private BigDecimal gPrice; // the price of goods
    private int gState; // Hot index of commodities
    private String gInfo; // information of goods

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public Date getgLaunchTime() {
        return gLaunchTime;
    }

    public void setgLaunchTime(Date gLaunchTime) {
        this.gLaunchTime = gLaunchTime;
    }

    public String getgImage() {
        return gImage;
    }

    public void setgImage(String gImage) {
        this.gImage = gImage;
    }

    public BigDecimal getgPrice() {
        return gPrice;
    }

    public void setgPrice(BigDecimal gPrice) {
        this.gPrice = gPrice;
    }

    public int getgState() {
        return gState;
    }

    public void setgState(int gState) {
        this.gState = gState;
    }

    public String getgInfo() {
        return gInfo;
    }

    public void setgInfo(String gInfo) {
        this.gInfo = gInfo;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", cid=" + cid +
                ", gName='" + gName + '\'' +
                ", gLaunchTime=" + gLaunchTime +
                ", gImage='" + gImage + '\'' +
                ", gPrice=" + gPrice +
                ", gState=" + gState +
                ", gInfo='" + gInfo + '\'' +
                '}';
    }
}
