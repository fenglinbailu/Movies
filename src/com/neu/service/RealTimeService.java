package com.neu.service;

import java.util.List;
import java.util.Map;

public interface RealTimeService {
	Map<String,Integer> getMOvieClick();
//	��������getMovieClick
//	�����������
//	���ؽ����Map<String,Integer>
//	��������ȡ���һ��ʱ����Movie��ʵʱ�����

	Map<String,Integer> getMovieTypeClick();
//  ��������getMovieTypeClick
//	�����������
//	���ؽ����Map<String,Integer>
//	��������ȡ���һ��ʱ���ڸ�����Movie��ʵʱ�����
	List<Map> addMapKeyName(Map<String,Integer> map,String keyName,String valueName);
//	��������addMapKeyName
//	���������map:Map<String,Integer>��keyName:String��valueName:String
//	���ؽ����List<Map>
//	������Ϊmap��key��value����
}
