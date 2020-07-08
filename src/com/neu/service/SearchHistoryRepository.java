package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.po.SearchHistory;

public interface  SearchHistoryRepository{
    //(1)方法名：getHistoryByMidAndDate
    //传入参数：movieId:String，timestamp:String
    //返回结果：SearchHistory
    //描述：通过movieId和date来获取某电影指定日期的访问数据点击数据
    SearchHistory getHistoryByMidAndDate(String movieId,String timestamp);
    //(2)方法名：getHistoryByDate
    //传入参数：timestamp:String
    //返回结果：Map
    //描述：通过date来获取指定日期的访问数据点击数据
    Map  getHistoryByDate(String timestamp);
    //(3)方法名：getHistory
    //传入参数：
    //返回结果：List<Map>
    //描述：得到所有日期的总点击、总搜索
    List<Map>  getHistory();
    //(4)方法名：getTopSevenHistoryByDate
    //传入参数：timestamp:String
    //返回结果：List<Map>
    //描述：通过date来获取指定日期的访问数据点击数据
    List<Map> getTopSevenHistoryByDate(String timestamp);
    //(5)方法名：getTopSearch
    //传入参数：
    //返回结果：List<Map>
    //描述：通过历史查询最高的数据
    List<Map> getTopSearch();
    //(6)方法名：insertHistoryByMidAndDate
    //传入参数：movieId:String, timestamp:String
    //返回结果：boolean
    //描述：增加一个电影一日的一次查询记录
    boolean insertHistoryByMidAndDate(String movieId,String timestamp);
    //(7)方法名：updateClickTimesByMidAndDate
    //传入参数：movieId:String, timestamp:String
    //返回结果：boolean
    //描述：增加一个电影一日的一次点击记录
    boolean  updateClickTimesByMidAndDate(String movieId,String timestamp);
}