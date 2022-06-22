package com.cho.entity;

import java.io.Serializable;

/**
 * @Author: Cho
 * @Date: 2022/04/23/15:32
 * @Description: Class table of the corresponding database
 */
public class Class implements Serializable {
    private static final long serialVersionUID = 1L;
    private int cid;
    private String cName; // name of class
    private String cInfo; // information of class

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcInfo() {
        return cInfo;
    }

    public void setcInfo(String cInfo) {
        this.cInfo = cInfo;
    }

    @Override
    public String toString() {
        return "Class{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", cInfo='" + cInfo + '\'' +
                '}';
    }
}
