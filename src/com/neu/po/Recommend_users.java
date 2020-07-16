package com.neu.po;

public class Recommend_users {
    private Integer id;

    private String u_id;

    private String result;

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}