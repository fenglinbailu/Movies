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
import com.neu.service.MovieService;
import com.neu.util.MovieServiceImpl;
import com.neu.util.UserRepositoryimpl;
import com.neuedu.dao.MovieMapper;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		String input=request.getParameter("input");
	    MovieServiceImpl cc = new MovieServiceImpl();
		List<Movie> llist=cc.searchmovie(input);
		response.setCharacterEncoding("UTF-8");  // 加上此处可解决页面js显示乱码问题           
		PrintWriter out=response.getWriter();
		StringBuilder jsonString=new StringBuilder("{\"data\":");
		jsonString.append("[");
		for(Movie d:llist) {
			jsonString.append("{\"mname\":\""+d.getmName()+"\",\"img\":\""+d.getImgurl()+"\",\"mid\":\""+d.getmId()+"\"},");

		}
		jsonString=new StringBuilder(jsonString.substring(0, jsonString.length()-1));
		jsonString.append("]}");
		System.out.println(jsonString);

		out.print(jsonString.toString());
		out.close();
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
