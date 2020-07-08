package com.neu.service;

import java.util.List;

import com.neu.po.BlackList;

public interface BlackListRepository{
    //(1)��������addBlackList
    //���������userId:int��movieId:String
    //���ؽ����boolean
    //���������blacklist�¼�¼
    boolean addBlackList(int userId,String movieId);
    //(2)��������deleteBlackList
    //���������userId:int��movieId:String
    //���ؽ����boolean
    //������ɾ��ָ��blacklist��¼
    boolean deleteBlackList(int userId,String movieId);
    //(3)��������getAllBlackListByUid
    //���������userId:int
    //���ؽ����List<BlackList>
    //��������ȡһ��uid�����к�����
    List<BlackList> getAllBlackListByUid(int userId);
}