package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.po.HomeContent;

import com.neu.po.Movie;
import com.neu.po.MovieType;

public interface MovieService {
	Movie getMovieName(String movieName);
	Movie getMovieId(String movieId);
	List<Movie> getMovieListByName(String movieName);
	List<Movie> getMovieListByType(String type);
	List<Movie> getRankedMovieListByScore(int num);
	List<Movie> getRankedMovieListByPopularity(int num);
	HomeContent getHome(int num,int userId);
	List<MovieType> getMovieTypeInfo();
	List<Movie> getRankedMovieListByCoin(int num);
	List<Movie> getRankedMovieListByNew(int num);
	List<Movie> getSimilarMovie(String movieId);
	List<Map> addMovieName(String movieId);
	List<Movie> mapChangeToMovie(List<Map> list);
	List<Movie> searchmovie(String movieName);
	
}
