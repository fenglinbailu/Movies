package com.neu.service;

import java.io.IOException;
import java.util.List;

import com.neu.po.Movie;
import com.neu.po.Recommend_movie;
import com.neu.po.User;

public interface ALSService {
//	(1) ��������getALSMovieList
//	���������userId:int
//	���ؽ����List<Movie>
//	��������ȡΪָ���û��Ƽ��ĵ�Ӱ�б�
	Recommend_movie getALSMovieList(String userId) throws IOException;
//	(2) ��������getALSUserList
//	���������userId:int
//	���ؽ����List<User>
//	��������ȡΪָ���û��Ƽ����û��б�
	List<User> getALSUserList(String userId);
}
