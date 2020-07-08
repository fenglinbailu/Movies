package com.neu.service;

import java.util.List;

import com.neu.po.Movie;

public interface BlackListController {
	boolean addBlackList(int userId,String movieId);
	boolean deleteBlackList(int userId,String movieId);
	List<Movie> getBlackListByUid(int userId,Integer blackNum);

}
