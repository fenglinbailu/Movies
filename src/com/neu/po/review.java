package com.neu.po;

public class review {
	private String m_id;
    private String u_id;
    private String content;
    private String rate;
    public review(String m_id,String u_id,String content,String rate) {
    	this.m_id=m_id;
    	this.u_id=u_id;
    	this.rate= rate;
    	this.content=content;
    	
    }

    public String getmId() {
        return m_id;
    }
    public String getuId() {
        return u_id;
    }
    public String getcontent() {
        return content;
    }
    public String getrate() {
        return rate;
    }
 

}
