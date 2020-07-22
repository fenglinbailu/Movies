package com.neu.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

import com.neu.po.User;
import com.neu.po.User_info;
import com.neu.service.UserRepository;
import com.neu.util.UserRepositoryimpl;
import com.neu.util.user_mybatis;
import com.neu.util.user_info_mybatis;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/persons")
public class UserServlet3 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
	  String userId=((User)request.getSession().getAttribute("user")).getuId()+"";
	  //String userId = "999999999";
	  User_info a=user_info_mybatis.findUserinfo(userId);
	    if(a==null) {
	    	a = new User_info(userId,"*","*","*","*","*");
	    	user_info_mybatis.insertUserinfo(a);
	    }
    System.out.println(userId);
    if(a!=null) {
    PrintWriter out=response.getWriter(); 
	 StringBuilder jsonString=new StringBuilder("data:"); //GSON fastjson====list object array ---to---json
	 	jsonString.append(a.getmId()+"+"+a.getuname()+"+"+a.getusex()+"+"+a.getpnumber()+"+"+a.getmtype()+"+"+a.pd()); 
	 	//jsonString.append("}"); 
	  jsonString=new StringBuilder(jsonString.substring(0, jsonString.length()));
	  //{data:[{id:1,name:"ÄÚ¿Æ"},{}]} jsonString.append("]}");
	  System.out.println(jsonString);
	  out.print(jsonString); 
	  System.out.println(jsonString);
	  out.close();
    }
	  
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stu
    doGet(request, response);
  }

}