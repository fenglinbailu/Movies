package com.neu.service;

import java.util.List;

import com.neu.po.Movie;
import com.neu.po.User;

public interface ALSService {
//	(1) ��������getALSMovieList
//	���������userId:int
//	���ؽ����List<Movie>
//	��������ȡΪָ���û��Ƽ��ĵ�Ӱ�б�
	List<Movie> getALSMovieList(int userId);
//	(2) ��������getALSUserList
//	���������userId:int
//	���ؽ����List<User>
//	��������ȡΪָ���û��Ƽ����û��б�
	List<User> getALSUserList(int userId);
}
