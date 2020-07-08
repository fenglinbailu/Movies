package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.po.HomeContent;
import com.neu.po.Movie;
import com.neu.po.MovieType;

public interface MovieController {
	//url：/getMovieByName
	//传入参数：movieName:String
	//返回结果：Movie，以JSON格式
	//描述：精确搜索指定电影名，将Movie对象以JSON格式返回
	Movie getMovieByName(String movieName);
	//url：/getMovieById
	//传入参数:movieId:String
	//返回结果：Movie，以JSON格式
	//描述：搜索指定movieId，将Movie对象以JSON格式返回
	Movie getMovieById(String  movieId);
	//url：/getMovieListByAuthor
	//传入参数：author:String，page:int
	//返回结果：Map，以JSON格式
	//描述：获取指定演员的相关作品，将Movie对象放入List再经过Map包装以JSON格式返回
	Map getMovieListByActor(String actor,int page);
	//url：/getMovieListByName
	//传入参数:movieName:String，page:int
	//返回结果：Map，以JSON格式
	//描述：精确搜索指定电影名，获取相关作品，将Movie对象放入List再经过Map包装以JSON格式返回
	Map getMovieListByName(String movieName,int page);
	//url：/getRankedMovieListByScore
	//传入参数：num:int
	//返回结果：List<Movie>，以JSON格式
	//描述：搜索指定个数为num的按评分排序的Movie，放入列表以JSON格式返回
	List<Movie>getRankedMovieListByScore(int num);
	/*
	 	url：/getRankedMovieListByPopularity
		传入参数：num:int
		返回结果：List<Movie>，以JSON格式
		描述：搜索指定个数为num的按热度排序的Movie，放入列表以JSON格式返回
	 */
	List<Movie>getRankedMovieListByPopularity(int num);
	/*
	 * url：/getMoviesByType
		传入参数：type:String，page:int
		返回结果：Map，以JSON格式
		描述：获取指定类型的Movie，放入Map以JSON格式返回
	*/
	Map getMoviesByType(String type,int page);
	/*url：/getHome
	传入参数：userID：int
	返回结果：HomeContent，以JSON格式
	描述：返回home界面所有从后端获取的数据，包括热门、好评、推荐、新电影等
	*/
	HomeContent getHome(int UserId);
	/*url：/getContextByInput
	传入参数：input:String
	返回结果：List<Movie>，以JSON格式
	描述：根据用户搜索内容返回6个电影
	*/
	List<Movie>getContextByInput(String input);
	/*
	 * url：/getALSMovieList
	传入参数： userId:int
	返回结果：List<Movie>，以JSON格式
	描述：输入userId，获取ALS训练结果：推荐的电影列表，获取Movie，放入List以JSON格式返回
	*/
	List<Movie>getALSMovieList(int userId);
	/*url：/getMoviesTypeInfo
	传入参数：无
	返回结果：List<MovieType>，以JSON格式
	描述：获取MovieType的相关统计电影，放入List以JSON格式返回
	 */
	List<MovieType>getMoviesTypeInfo();
	/*
	 * url：/getMovieClick
	传入参数：无
	返回结果：List<Map>，以JSON格式
	描述：获取最近一段时间内的Movie实时点击统计数据，<movieName，num>放入Map以JSON格式返回*
	 */
	List<Map>getMovieClick();
	/*url：/ getSimilarMovie
	传入参数： movieId:String, page:int
	返回结果：Map，以JSON格式
	描述：取电影相似电影,将Movie对象放入List再经过Map包装以JSON格式返回 
	*/
	Map getSimilarMovie(String movieId,int page);

	
	
}
