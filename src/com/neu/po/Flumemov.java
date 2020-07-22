package com.neu.po;

public class Flumemov {
	   private String m_id;

	    private String m_name;
	    
	 //   public User() {}
	    

	    
	    public Flumemov(String u_id,String u_Passwd) {
	    	this.m_id=u_id;

	    	this.m_name=u_Passwd;
	    	
	    }

	    public String getId() {
	        return m_id;
	    }

	    public void setId(String u_id) {
	        this.m_id = u_id == null ? null : u_id.trim();
	    }

	    public String getname() {
	        return m_name;
	    }

	    public void setname(String uPasswd) {
	        this.m_name = m_name == null ? null : m_name.trim();
	    }
}
