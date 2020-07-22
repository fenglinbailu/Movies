package com.neu.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.HomeContent;
import com.neu.po.Movie;
import com.neu.po.MovieType;
import com.neu.service.MovieService;
import com.neuedu.dao.MovieMapper;
import com.neuedu.dao.AvgranklistMapper;
import com.neuedu.dao.Hot_listMapper;

public class MovieServiceImpl implements MovieService{
	private MovieMapper cdao;
	private AvgranklistMapper adao;
	private Hot_listMapper bdao;
	private SqlSession  ss;
	public  MovieServiceImpl() throws IOException {
	Reader inputStream = Resources.getResourceAsReader("SqlMapConfig.xml");
	//FileInputStream inputStream = new FileInputStream("Eclipesworkplace\\\\moviesRecommendSystem\\\\resources/SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	
	MovieMapper cdao=ss.getMapper(MovieMapper.class);
	AvgranklistMapper adao=ss.getMapper(AvgranklistMapper.class);
	Hot_listMapper bdao=ss.getMapper(Hot_listMapper.class);
	//Recommend_movie recmov =cc.selectByPrimaryKey(userId);
	this.ss=ss;
	this.cdao=cdao;
	this.adao=adao;
	this.bdao=bdao;
	}
	
	@Override
	public Movie getMovieName(String movieName){
		
		//Movie record=movieservice.getMovieId("10047547");
		Movie record=cdao.selectByMovieName(movieName);
		//Movie record=movieservice.getMovieByPrimaryKey(movieId);
		//System.out.println(record.getActor());
		return record;
			
		}
	@Override
	public List<Movie> searchmovie(String movieName){
		
		//Movie record=movieservice.getMovieId("10047547");
		 List<Movie> record=cdao.search(movieName);
		//Movie record=cdao.selectByMovieName(movieName);
		//Movie record=movieservice.getMovieByPrimaryKey(movieId);
		//System.out.println(record.getActor());
		return record;
			
		}
	@Override
	public Movie getMovieId(String movieId) {
		
		Movie record=cdao.selectByPrimaryKey(movieId);
		return record;
			
		}
	@Override
	public List<Movie> getMovieListByName(String mname){
		List<Movie> list=cdao.getMovieListByName(mname);
		//List<Movie> list=cdao.findAll();
		//List<Movie> llist = list.stream().filter(s->s.getmName().equals(mname)).collect(Collectors.toList());
		return list;	
		}
	@Override
	public List<Movie> getMovieListByType(String type){
		List<Movie> list=cdao.getMovieListByType(type);
		//List<Movie> list=cdao.findAll();
		//List<Movie> llist = list.stream().filter(s->s.getType().equals(type)).collect(Collectors.toList());
		return list;	
		}
	@Override
	public List<Movie> getRankedMovieListByScore(int num){
		List<String> mids=adao.getMovieListByRate(num);
		List<Movie> list=new ArrayList<Movie>();
		for(int i=0;i<mids.size();i++) {
			Movie movie=cdao.selectByPrimaryKey(mids.get(i));
			list.add(movie);
		}
		return list;	
		}
	@Override
	public List<Movie> getRankedMovieListByPopularity(int num){
		List<String> mids=bdao.getMovieListByHot(num);
		List<Movie> list=new ArrayList<Movie>();
		for(int i=0;i<mids.size();i++) {
			Movie movie=cdao.selectByPrimaryKey(mids.get(i));
			list.add(movie);
		}
		return list;	
		}
	@Override
	public HomeContent getHome(int num,int userId){

		return null;	
		}
	@Override
	public List<MovieType> getMovieTypeInfo(){

		return null;	
		}
	@Override
	public List<Movie> getRankedMovieListByCoin(int num){

		return null;	
		}
	@Override
	public List<Movie> getRankedMovieListByNew(int num){

		return null;	
		}
	@Override
	public List<Movie> getSimilarMovie(String movieId){

		return null;	
		}
	@Override
	public List<Map> addMovieName(String movieId){

		return null;	
		}
	@Override
	public List<Movie> mapChangeToMovie(List<Map> list){

		return null;	
		}
	
	
	

	
	

}
