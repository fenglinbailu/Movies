package com.neu.po;

public class User {
    private String u_id;

    private String u_Passwd;

    public String getuId() {
        return u_id;
    }

    public void setuId(String u_id) {
        this.u_Passwd = u_id == null ? null : u_id.trim();
    }

    public String getuPasswd() {
        return u_Passwd;
    }

    public void setuPasswd(String uPasswd) {
        this.u_Passwd = u_Passwd == null ? null : u_Passwd.trim();
    }
}