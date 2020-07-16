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

public class MovieServiceImpl implements MovieService{
	private MovieMapper cdao;
	private SqlSession  ss;
	public  MovieServiceImpl() throws IOException {
	//Reader inputStream = Resources.getResourceAsReader("SqlMapConfig.xml");
	FileInputStream inputStream = new FileInputStream("Eclipesworkplace\\\\moviesRecommendSystem\\\\resources/SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	
	MovieMapper cdao=ss.getMapper(MovieMapper.class);
	//Recommend_movie recmov =cc.selectByPrimaryKey(userId);
	this.ss=ss;
	this.cdao=cdao;
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
		
		List<Movie> list=cdao.findAll();
		List<Movie> llist = list.stream().filter(s->s.getmName().equals(mname)).collect(Collectors.toList());
		return llist;	
		}
	@Override
	public List<Movie> getMovieListByType(String type){
		
		List<Movie> list=cdao.findAll();
		List<Movie> llist = list.stream().filter(s->s.getType().equals(type)).collect(Collectors.toList());
		return llist;	
		}
	@Override
	public List<Movie> getRankedMovieListByScore(int num){
		
		List<Movie> list=cdao.findAll();
		//List<Movie> llist = Collections.sort(list , (Movie b1, Movie b2) -> b2.compareTo(b31.getXxx()));
		Collections.sort(list, new Comparator<Movie>(){
            public int compare(Movie o1, Movie o2) {
                return o1.getRate()-o2.getRate();
            }});
		Collections.reverse(list);
		return list.subList(0, num);	
		}
	@Override
	public List<Movie> getRankedMovieListByPopularity(int num){
		
		List<Movie> list=cdao.findAll();
		//List<Movie> llist = Collections.sort(list , (Movie b1, Movie b2) -> b2.compareTo(b31.getXxx()));
		list.sort((x, y) -> Long.compare(Long.parseLong(x.getStar().replace(",", "")), Long.parseLong(y.getStar().replace(",", ""))));
		Collections.reverse(list);
		return list.subList(0, num);	
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
