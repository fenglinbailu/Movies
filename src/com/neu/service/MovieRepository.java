package com.neu.service;

import java.util.List;

import com.neu.po.Movie;
import com.neu.po.MovieType;

public interface MovieRepository {
	Movie selectByMovieName(String MovieName);
//	��������selectByMovieName
//	�������:MovieName:String
//	���ؽ����Movie
//	������ͨ����Ӱ����ȷ��ѯ

	Movie selectByMovieId(String MovieId);
//  ��������selectByMovieId
//	���������MovieId:String
//	���ؽ����Movie
//	������ͨ��id��ѯMovie

	List<Movie> selectListByMovieName(String MovieName);
//  ��������selectListByMovieName
//	���������MovieName:String
//	���ؽ����:List<Movie>
//	������ͨ����Ӱ��ģ����ѯ

	List<Movie> selectListByStar(String star);
//	��������selectListByStar
//	���������star:String
//	���ؽ����List<Movie>
//	������ͨ�����ݾ�ȷ��ѯ

	List<Movie> selectListByType(String type);
//  ��������selectListByType
//	���������type:String
//	���ؽ����List<Movie>
//	������ͨ��Movie���ͻ�ȡ����б�

	List<Movie> selectRankedListByScore(int num);
//	��������selectRankedListByScore
//	���������num:int
//	���ؽ����List<Movie>
//	����������ָ������Ϊnum�İ����������Movie

	List<Movie> selectRankedListByPopularity(int num);
//  ��������selectRankedListByPopularity
//	���������num:int
//	���ؽ����List<Movie>
//	����������ָ������Ϊnum�İ��ȶ������Movie

	List<Movie> selectRankedListByCoin(int num);
//	��������selectRankedListByCoin
//	���������num:int
//	���ؽ����List<Movie>
//	����������ָ������Ϊnum�İ�coin�����Movie

	List<String> getSimilarMovie(String MovieID);
//  ��������getSimilarMovie
//	���������MovieID:String
//	���ؽ����List<String>
//	���������ָ��Movie�����Ƶ�Movie

	boolean addCommentNum(String MovieID);
//  ��������addCommentNum
//	���������MovieID:String
//	���ؽ����boolean
//	������������������

	boolean subCommentNum(String MovieID);
//  ��������subCommentNum
//	���������MovieID:String
//	���ؽ����boolean
//	����������������

	List<MovieType> selectMovieTypeList();
//  ��������selectMovieTypeList
//	�����������
//	���ؽ����List<MovieType>
//	��������ȡ���ݷ���ͳ������

}
