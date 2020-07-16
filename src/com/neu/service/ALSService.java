package com.neu.service;

import java.io.IOException;
import java.util.List;

import com.neu.po.Movie;
import com.neu.po.Recommend_movie;
import com.neu.po.User;

public interface ALSService {
//	(1) 方法名：getALSMovieList
//	传入参数：userId:int
//	返回结果：List<Movie>
//	描述：获取为指定用户推荐的电影列表
	Recommend_movie getALSMovieList(String userId) throws IOException;
//	(2) 方法名：getALSUserList
//	传入参数：userId:int
//	返回结果：List<User>
//	描述：获取为指定用户推荐的用户列表
	List<User> getALSUserList(String userId);
}
