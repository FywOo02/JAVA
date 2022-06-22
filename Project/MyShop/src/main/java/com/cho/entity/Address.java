package com.cho.entity;

import java.io.Serializable;

/**
 * @Author: Cho
 * @Date: 2022/04/23/15:07
 * @Description: Address table of the corresponding database
 */
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    private int aid;
    private int uid;
    private String aReceiverName; //Receiver name
    private String aPhone; //Receiver phone number
    private String aDetail; //Receiver detailed address
    private int aState; //Receiver address status 0 default 1 non-default

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

    public String getaReceiverName() {
        return aReceiverName;
    }

    public void setaReceiverName(String aReceiverName) {
        this.aReceiverName = aReceiverName;
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone;
    }

    public String getaDetail() {
        return aDetail;
    }

    public void setaDetail(String aDetail) {
        this.aDetail = aDetail;
    }

    public int getaState() {
        return aState;
    }

    public void setaState(int aState) {
        this.aState = aState;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", aReceiverName='" + aReceiverName + '\'' +
                ", aPhone='" + aPhone + '\'' +
                ", aDetail='" + aDetail + '\'' +
                ", aState=" + aState +
                '}';
    }
}
