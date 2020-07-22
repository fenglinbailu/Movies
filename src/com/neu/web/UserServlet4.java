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
@WebServlet("/revises")
public class UserServlet4 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String u_name=request.getParameter("u_name");
	  String p_number=request.getParameter("p_number");
	  String p_d =request.getParameter("p_d");
	  String u_sex =request.getParameter("u_sex");
	  String m_type =request.getParameter("m_type");
	  System.out.println("11111111"+m_type);
	  String userId=((User)request.getSession().getAttribute("user")).getuId()+"";
	  //String userId = "999999999";
	  User_info userinfo = new User_info(userId,u_name,p_number,p_d,u_sex,m_type);
	   // user_info_mybatis user_info_mybatis1 = new user_info_mybatis();
	   int b = user_info_mybatis.updateUserinfo(userinfo);
	    System.out.println("request parameter= "+userinfo+":"+u_name+p_number+p_d);
	    PrintWriter out=response.getWriter(); 
	    StringBuilder jsonString=new StringBuilder(b); //GSON fastjson====list object array ---to---json
	 	jsonString.append(b+"+"+userId); 
	 	//jsonString.append("}"); 
	  jsonString=new StringBuilder(jsonString.substring(0, jsonString.length()));
	  //{data:[{id:1,name:"ÄÚ¿Æ"},{}]} jsonString.append("]}");
	  System.out.println(jsonString);
	  out.print(jsonString); 
	  System.out.println(jsonString);
	  out.close();
	  
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stu
    doGet(request, response);
  }

}