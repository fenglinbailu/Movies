package com.neu.service;

import java.util.List;

import com.neu.po.BlackList;
import com.neu.po.Movie;

public interface BlackListService {
//	(1) 方法名：addBlackList
//	传入参数：userId:int，movieId:String
//	返回结果：Boolean
//	描述：添加blacklist新记录
	Boolean addBlackList(int userId ,String movieId);
//	(2) 方法名：deleteBlackList
//	传入参数：userId:int，movieId:String
//	返回结果：Boolean
//	描述：删除指定blacklist记录
	Boolean deleteBlackList(int userId ,String movieId);
//	(3) 方法名：getAllBlackListByUid
//	传入参数：userId:int
//	返回结果：List<BlackList>
//	描述：获得指定uid的所有黑名单
	List<BlackList> getAllBlackListByUid(int userId);
//	(4) 方法名：changeToMovie
//	传入参数：List<BlackList>
//	返回结果：List<Movie>
//	描述：返回黑名单指定的电影
	List<Movie> changeToMovie(List<BlackList> BlackList);

}
