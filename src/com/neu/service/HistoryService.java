package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.po.Movie;
import com.neu.po.SearchHistory;

public interface HistoryService {
//	(1) 方法名：getHistoryByBidAndDate
//	传入参数：movieId:String，timestamp:String
//	返回结果：SearchHistory
//	描述：通过movieId和date来获取某电影指定日期的访问数据点击数据
	SearchHistory getHistoryByBidAndDate(String movieId ,String timestamp);
//	(2) 方法名：getHistoryByDate
//	传入参数：timestamp:String
//	返回结果：Map
//	描述：通过date来获取指定日期的访问数据点击数据
	Map getHistoryByDate(String timestamp);
//	(3) 方法名：getTopSevenHistoryByDate
//	传入参数：timestamp:String
//	返回结果：List<Map>
//	描述：通过date来获取指定日期的访问数据点击数据前七名
	List<Map> getTopSevenHistoryByDate(String timestamp);
//	(4) 方法名：getHistoryByMovieId
//	传入参数：movieId:String
//	返回结果：Map
//	描述：得到指定电影最近七天的点击与搜索
	Map getHistoryByMovieId(String movieId);
//	(5) 方法名：getTopSearch
//	传入参数：无
//	返回结果：List<Map>
//	描述：返回历史搜索最高的电影信息
	List<Map> getTopSearch ();
//	(6) 方法名：addOnceSearch
//	传入参数：list: List<Movie>
//	返回结果：boolean
//	描述：对于以下电影，搜索量都进行+1
	boolean addOnceSearch(List<Movie> list );
//	(7) 方法名：addOnceClick
//	传入参数：list: List<Movie>
//	返回结果：boolean
//	描述：对于以下电影，点击量都进行+1
	boolean addOnceClick(List<Movie> list );

}
