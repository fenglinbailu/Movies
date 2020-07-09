package com.neu.po;

public class Rating {
    private Integer id;

    private String u_id;

    private String m_id;

    private String type;

    private Integer rate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuId() {
        return u_id;
    }

    public void setuId(String uId) {
        this.u_id = uId == null ? null : uId.trim();
    }

    public String getmId() {
        return m_id;
    }

    public void setmId(String mId) {
        this.m_id = mId == null ? null : mId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}