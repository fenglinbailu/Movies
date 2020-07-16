package com.neu.web;



import java.io.IOException;
import java.util.List;

import com.neu.po.Movie;
import com.neu.service.MovieService;
import com.neu.util.MovieServiceImpl;


public class MovieServlet{
	public Movie getMovie(String movieid) throws IOException{
		MovieService movieservice=new MovieServiceImpl();
		Movie record=movieservice.getMovieId(movieid);
		//System.out.println(record);
		return record;
		
	}
	public Movie getMovieByName(String movieName) throws IOException{
		MovieService movieservice=new MovieServiceImpl();
		Movie record=movieservice.getMovieName(movieName);
		//System.out.println(record);
		return record;
		
	}
	public List<Movie> getMovieListByName(String movieName) throws IOException{
		MovieService movieservice=new MovieServiceImpl();
		List<Movie> list=movieservice.getMovieListByName(movieName);
		return list;
		
	}
	public List<Movie> getMovieListByScore(int num) throws IOException{
		MovieService movieservice=new MovieServiceImpl();
		List<Movie> list=movieservice.getRankedMovieListByScore(num);
		return list;
	}
	public List<Movie> getMovieListByPopularity(int num) throws IOException{
		MovieService movieservice=new MovieServiceImpl();
		List<Movie> list=movieservice.getRankedMovieListByPopularity(num);
		return list;
	}

	
	
	


}
