package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.po.HomeContent;
import com.neu.po.Movie;
import com.neu.po.MovieType;

public interface MovieController {
	//url��/getMovieByName
	//���������movieName:String
	//���ؽ����Movie����JSON��ʽ
	//��������ȷ����ָ����Ӱ������Movie������JSON��ʽ����
	Movie getMovieByName(String movieName);
	//url��/getMovieById
	//�������:movieId:String
	//���ؽ����Movie����JSON��ʽ
	//����������ָ��movieId����Movie������JSON��ʽ����
	Movie getMovieById(String  movieId);
	//url��/getMovieListByAuthor
	//���������author:String��page:int
	//���ؽ����Map����JSON��ʽ
	//��������ȡָ����Ա�������Ʒ����Movie�������List�پ���Map��װ��JSON��ʽ����
	Map getMovieListByActor(String actor,int page);
	//url��/getMovieListByName
	//�������:movieName:String��page:int
	//���ؽ����Map����JSON��ʽ
	//��������ȷ����ָ����Ӱ������ȡ�����Ʒ����Movie�������List�پ���Map��װ��JSON��ʽ����
	Map getMovieListByName(String movieName,int page);
	//url��/getRankedMovieListByScore
	//���������num:int
	//���ؽ����List<Movie>����JSON��ʽ
	//����������ָ������Ϊnum�İ����������Movie�������б���JSON��ʽ����
	List<Movie>getRankedMovieListByScore(int num);
	/*
	 	url��/getRankedMovieListByPopularity
		���������num:int
		���ؽ����List<Movie>����JSON��ʽ
		����������ָ������Ϊnum�İ��ȶ������Movie�������б���JSON��ʽ����
	 */
	List<Movie>getRankedMovieListByPopularity(int num);
	/*
	 * url��/getMoviesByType
		���������type:String��page:int
		���ؽ����Map����JSON��ʽ
		��������ȡָ�����͵�Movie������Map��JSON��ʽ����
	*/
	Map getMoviesByType(String type,int page);
	/*url��/getHome
	���������userID��int
	���ؽ����HomeContent����JSON��ʽ
	����������home�������дӺ�˻�ȡ�����ݣ��������š��������Ƽ����µ�Ӱ��
	*/
	HomeContent getHome(int UserId);
	/*url��/getContextByInput
	���������input:String
	���ؽ����List<Movie>����JSON��ʽ
	�����������û��������ݷ���6����Ӱ
	*/
	List<Movie>getContextByInput(String input);
	/*
	 * url��/getALSMovieList
	��������� userId:int
	���ؽ����List<Movie>����JSON��ʽ
	����������userId����ȡALSѵ��������Ƽ��ĵ�Ӱ�б���ȡMovie������List��JSON��ʽ����
	*/
	List<Movie>getALSMovieList(int userId);
	/*url��/getMoviesTypeInfo
	�����������
	���ؽ����List<MovieType>����JSON��ʽ
	��������ȡMovieType�����ͳ�Ƶ�Ӱ������List��JSON��ʽ����
	 */
	List<MovieType>getMoviesTypeInfo();
	/*
	 * url��/getMovieClick
	�����������
	���ؽ����List<Map>����JSON��ʽ
	��������ȡ���һ��ʱ���ڵ�Movieʵʱ���ͳ�����ݣ�<movieName��num>����Map��JSON��ʽ����*
	 */
	List<Map>getMovieClick();
	/*url��/ getSimilarMovie
	��������� movieId:String, page:int
	���ؽ����Map����JSON��ʽ
	������ȡ��Ӱ���Ƶ�Ӱ,��Movie�������List�پ���Map��װ��JSON��ʽ���� 
	*/
	Map getSimilarMovie(String movieId,int page);

	
	
}
