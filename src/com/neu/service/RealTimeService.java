package com.neu.service;

import java.util.List;
import java.util.Map;

public interface RealTimeService {
	Map<String,Integer> getMOvieClick();
//	方法名：getMovieClick
//	传入参数：无
//	返回结果：Map<String,Integer>
//	描述：获取最近一段时间内Movie的实时点击量

	Map<String,Integer> getMovieTypeClick();
//  方法名：getMovieTypeClick
//	传入参数：无
//	返回结果：Map<String,Integer>
//	描述：获取最近一段时间内各类型Movie的实时点击量
	List<Map> addMapKeyName(Map<String,Integer> map,String keyName,String valueName);
//	方法名：addMapKeyName
//	传入参数：map:Map<String,Integer>，keyName:String，valueName:String
//	返回结果：List<Map>
//	描述：为map的key和value命名
}
