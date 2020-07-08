package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.po.SearchHistory;

public interface  SearchHistoryRepository{
    //(1)��������getHistoryByMidAndDate
    //���������movieId:String��timestamp:String
    //���ؽ����SearchHistory
    //������ͨ��movieId��date����ȡĳ��Ӱָ�����ڵķ������ݵ������
    SearchHistory getHistoryByMidAndDate(String movieId,String timestamp);
    //(2)��������getHistoryByDate
    //���������timestamp:String
    //���ؽ����Map
    //������ͨ��date����ȡָ�����ڵķ������ݵ������
    Map  getHistoryByDate(String timestamp);
    //(3)��������getHistory
    //���������
    //���ؽ����List<Map>
    //�������õ��������ڵ��ܵ����������
    List<Map>  getHistory();
    //(4)��������getTopSevenHistoryByDate
    //���������timestamp:String
    //���ؽ����List<Map>
    //������ͨ��date����ȡָ�����ڵķ������ݵ������
    List<Map> getTopSevenHistoryByDate(String timestamp);
    //(5)��������getTopSearch
    //���������
    //���ؽ����List<Map>
    //������ͨ����ʷ��ѯ��ߵ�����
    List<Map> getTopSearch();
    //(6)��������insertHistoryByMidAndDate
    //���������movieId:String, timestamp:String
    //���ؽ����boolean
    //����������һ����Ӱһ�յ�һ�β�ѯ��¼
    boolean insertHistoryByMidAndDate(String movieId,String timestamp);
    //(7)��������updateClickTimesByMidAndDate
    //���������movieId:String, timestamp:String
    //���ؽ����boolean
    //����������һ����Ӱһ�յ�һ�ε����¼
    boolean  updateClickTimesByMidAndDate(String movieId,String timestamp);
}