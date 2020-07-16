package com.neu.util;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.HomeContent;
import com.neu.po.Movie;
import com.neu.po.MovieType;
import com.neu.po.Recommend_movie;
import com.neu.service.MovieController;
import com.neuedu.dao.MovieMapper;
import com.neuedu.dao.Recommend_movieMapper;

public class MovieControllerimpl implements MovieController {
	
	private MovieMapper cdao;
	
	public  MovieControllerimpl() throws IOException {
	Reader inputStream = Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	MovieMapper cdao=ss.getMapper(MovieMapper.class);
	//Recommend_movie recmov =cc.selectByPrimaryKey(userId);
	this.cdao=cdao;
	}

	@Override
	public Movie getMovieByName(String movieName) {
		// TODO Auto-generated method stub
		Movie m =cdao.selectByPrimaryKey(movieName);
		return m;
	}

	@Override
	public Movie getMovieById(String movieId) {
		// TODO Auto-generated method stub
		Movie m =cdao.selectByPrimaryKey(movieId);
		return m;
	}

	@Override
	public Map getMovieListByActor(String actor, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getMovieListByName(String movieName, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getRankedMovieListByScore(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getRankedMovieListByPopularity(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getMoviesByType(String type, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HomeContent getHome(int UserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getContextByInput(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getALSMovieList(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovieType> getMoviesTypeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> getMovieClick() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getSimilarMovie(String movieId, int page) {
		// TODO Auto-generated method stub
		return null;
	}

}
