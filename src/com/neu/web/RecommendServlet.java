package com.neu.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.po.Movie;
import com.neu.po.User;
import com.neu.util.Recommendbyuserimpl;


/**
 * Servlet implementation class RecommendServlet
 */
@WebServlet("/RecommendServlet")
public class RecommendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecommendServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId=((User)request.getSession().getAttribute("user")).getuId()+"";
		System.out.println("sesson= "+userId);
		
		
		if (userId!="") {
		Recommendbyuserimpl rec = new Recommendbyuserimpl();
		List <Movie> mov=rec.Recommendbyuser(userId);
		if(mov!=null) {
		response.setCharacterEncoding("UTF-8");  // 加上此处可解决页面js显示乱码问题           
		PrintWriter out=response.getWriter();
		StringBuilder jsonString=new StringBuilder("{\"uid\":\""+userId+"\",\"data\":");
		jsonString.append("[");
		for(Movie d:mov) {
			jsonString.append("{\"mname\":\""+d.getmName()+"\",\"img\":\""+d.getImgurl()+"\",\"mid\":\""+d.getmId()+"\"},");

		}
		jsonString=new StringBuilder(jsonString.substring(0, jsonString.length()-1));
		jsonString.append("]}");
		System.out.println(jsonString);

		out.print(jsonString.toString());
		out.close();
		}
		else
		{
			response.setCharacterEncoding("UTF-8");  // 加上此处可解决页面js显示乱码问题           
			PrintWriter out=response.getWriter();
			StringBuilder jsonString=new StringBuilder("{\"uid\":\""+userId+"\",\"data\":");
			jsonString.append("[");
			jsonString.append("{\"mname\":\" \",\"img\":\" \",\"mid\":\" \"},");
			System.out.println(jsonString);
			jsonString=new StringBuilder(jsonString.substring(0, jsonString.length()-1));
			jsonString.append("]}");

			out.print(jsonString.toString());
			out.close();
		}
		

		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}



