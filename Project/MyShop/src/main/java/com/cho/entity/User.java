package com.cho.entity;

import java.io.Serializable;

/**
 * @Author: Cho
 * @Date: 2022/04/23/14:45
 * @Description: The user table corresponding to the database
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int uid;
    private String username; // correspond to uname in database
    private String uPassword; // password
    private String uSex; //sex
    private String uStatus; // User Activation Status 0 non-activated 1 activated

    private String key;
    private String email; // correspond to uemail in database
    private int uRole; // 0 user 1 admin


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuStatus() {
        return uStatus;
    }

    public void setuStatus(String uStatus) {
        this.uStatus = uStatus;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getuRole() {
        return uRole;
    }

    public void setuRole(int uRole) {
        this.uRole = uRole;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uSex='" + uSex + '\'' +
                ", uStatus='" + uStatus + '\'' +
                ", key='" + key + '\'' +
                ", email='" + email + '\'' +
                ", uRole=" + uRole +
                '}';
    }
}
