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
import com.neu.service.UserRepository;
import com.neu.util.UserRepositoryimpl;


/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/logins")
public class UserServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.request.getParameter()  user password
    //2.service->dao-->user<--select * from userinfo where uname=? and upassword=?
      //3.user==null?return login.html:doctor.html
    String user=request.getParameter("u_id");
    String pwd=request.getParameter("p_id");
    System.out.println("request parameter= "+user+":"+pwd);
   UserRepositoryimpl  userRepository=new UserRepositoryimpl();
    int a=userRepository.loginIn(user,pwd);
    if(a==1)
    {
    	User u1  =new User(user,pwd);
		HttpSession session=request.getSession();
		session.setAttribute("user", u1);
		
		//Object a21=session.getAttribute("uesr");
    }
    
    
    PrintWriter out=response.getWriter(); 
	 StringBuilder jsonString=new StringBuilder("data:"); //GSON fastjson====list object array ---to---json
	 	jsonString.append(a); 
	 	jsonString.append("}"); 
	  jsonString=new StringBuilder(jsonString.substring(0, jsonString.length()-1));
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
    // TODO Auto-generated method stub
    doGet(request, response);
  }

}