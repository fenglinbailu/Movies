package com.neu.service;

import java.util.List;

import com.neu.po.BlackList;

public interface BlackListRepository{
    //(1)方法名：addBlackList
    //传入参数：userId:int，movieId:String
    //返回结果：boolean
    //描述：添加blacklist新纪录
    boolean addBlackList(int userId,String movieId);
    //(2)方法名：deleteBlackList
    //传入参数：userId:int，movieId:String
    //返回结果：boolean
    //描述：删除指定blacklist纪录
    boolean deleteBlackList(int userId,String movieId);
    //(3)方法名：getAllBlackListByUid
    //传入参数：userId:int
    //返回结果：List<BlackList>
    //描述：获取一个uid的所有黑名单
    List<BlackList> getAllBlackListByUid(int userId);
}