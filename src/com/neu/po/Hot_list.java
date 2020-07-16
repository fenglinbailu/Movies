package com.neu.po;

public class Hot_list {
    private Long count;

    private String m_id;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getmId() {
        return m_id;
    }

    public void setmId(String mId) {
        this.m_id = mId == null ? null : mId.trim();
    }
}