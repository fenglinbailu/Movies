package com.neu.po;

public class Avgranklist {
    private Double avg;

    private String m_id;

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public String getmId() {
        return m_id;
    }

    public void setmId(String mId) {
        this.m_id = mId == null ? null : mId.trim();
    }
}