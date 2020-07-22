package com.neu.po;

public class User_info {
    private String m_id;
    private String u_name;
    private String p_number;
    private String p_d;
    private String u_sex;
    private String m_type;

    public User_info(String m_id,String u_name,String p_number,String p_d,
    		String u_sex,String	m_type) {
    	this.m_id=m_id;
    	this.u_name=u_name;
    	this.p_number=p_number;
    	this.p_d=p_d;
    	this.u_sex=u_sex;
    	this.m_type=m_type;
    	
    }

    public String getmId() {
        return m_id;
    }
    public String getuname() {
        return u_name;
    }
    public String getpnumber() {
        return p_number;
    }
    public String pd() {
        return p_d;
    }
    public String getusex() {
        return u_sex;
    }
    public String getmtype() {
        return m_type;
    }

   /* public void setuId(String u_id) {
        this.u_id = u_id  == null ? null : u_id.trim();;
        		
    }

    public String getuPasswd() {
        return u_Passwd;
    }

    public void setuPasswd(String uPasswd) {
        this.u_Passwd =uPasswd;
    }*/
}