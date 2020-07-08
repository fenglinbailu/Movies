package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.po.Movie;
import com.neu.po.SearchHistory;

public interface HistoryService {
//	(1) ��������getHistoryByBidAndDate
//	���������movieId:String��timestamp:String
//	���ؽ����SearchHistory
//	������ͨ��movieId��date����ȡĳ��Ӱָ�����ڵķ������ݵ������
	SearchHistory getHistoryByBidAndDate(String movieId ,String timestamp);
//	(2) ��������getHistoryByDate
//	���������timestamp:String
//	���ؽ����Map
//	������ͨ��date����ȡָ�����ڵķ������ݵ������
	Map getHistoryByDate(String timestamp);
//	(3) ��������getTopSevenHistoryByDate
//	���������timestamp:String
//	���ؽ����List<Map>
//	������ͨ��date����ȡָ�����ڵķ������ݵ������ǰ����
	List<Map> getTopSevenHistoryByDate(String timestamp);
//	(4) ��������getHistoryByMovieId
//	���������movieId:String
//	���ؽ����Map
//	�������õ�ָ����Ӱ�������ĵ��������
	Map getHistoryByMovieId(String movieId);
//	(5) ��������getTopSearch
//	�����������
//	���ؽ����List<Map>
//	������������ʷ������ߵĵ�Ӱ��Ϣ
	List<Map> getTopSearch ();
//	(6) ��������addOnceSearch
//	���������list: List<Movie>
//	���ؽ����boolean
//	�������������µ�Ӱ��������������+1
	boolean addOnceSearch(List<Movie> list );
//	(7) ��������addOnceClick
//	���������list: List<Movie>
//	���ؽ����boolean
//	�������������µ�Ӱ�������������+1
	boolean addOnceClick(List<Movie> list );

}
