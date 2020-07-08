package com.neu.service;

import java.util.List;

import com.neu.po.Movie;
import com.neu.po.MovieType;

public interface MovieRepository {
	Movie selectByMovieName(String MovieName);
//	方法名：selectByMovieName
//	传入参数:MovieName:String
//	返回结果：Movie
//	描述：通过电影名精确查询

	Movie selectByMovieId(String MovieId);
//  方法名：selectByMovieId
//	传入参数：MovieId:String
//	返回结果：Movie
//	描述：通过id查询Movie

	List<Movie> selectListByMovieName(String MovieName);
//  方法名：selectListByMovieName
//	传入参数：MovieName:String
//	返回结果：:List<Movie>
//	描述：通过电影名模糊查询

	List<Movie> selectListByStar(String star);
//	方法名：selectListByStar
//	传入参数：star:String
//	返回结果：List<Movie>
//	描述：通过主演精确查询

	List<Movie> selectListByType(String type);
//  方法名：selectListByType
//	传入参数：type:String
//	返回结果：List<Movie>
//	描述：通过Movie类型获取相关列表

	List<Movie> selectRankedListByScore(int num);
//	方法名：selectRankedListByScore
//	传入参数：num:int
//	返回结果：List<Movie>
//	描述：搜索指定个数为num的按评分排序的Movie

	List<Movie> selectRankedListByPopularity(int num);
//  方法名：selectRankedListByPopularity
//	传入参数：num:int
//	返回结果：List<Movie>
//	描述：搜索指定个数为num的按热度排序的Movie

	List<Movie> selectRankedListByCoin(int num);
//	方法名：selectRankedListByCoin
//	传入参数：num:int
//	返回结果：List<Movie>
//	描述：搜索指定个数为num的按coin排序的Movie

	List<String> getSimilarMovie(String MovieID);
//  方法名：getSimilarMovie
//	传入参数：MovieID:String
//	返回结果：List<String>
//	描述：获得指定Movie的相似的Movie

	boolean addCommentNum(String MovieID);
//  方法名：addCommentNum
//	传入参数：MovieID:String
//	返回结果：boolean
//	描述：增加了评论数

	boolean subCommentNum(String MovieID);
//  方法名：subCommentNum
//	传入参数：MovieID:String
//	返回结果：boolean
//	描述：减少评论数

	List<MovieType> selectMovieTypeList();
//  方法名：selectMovieTypeList
//	传入参数：无
//	返回结果：List<MovieType>
//	描述：获取数据分类统计数据

}
