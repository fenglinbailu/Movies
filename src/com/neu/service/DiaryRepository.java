package com.neu.service;

import java.util.List;

import com.neu.po.Diary;

public interface DiaryRepository{
    //(1)方法名：selectById
    //传入参数：diaryId:int
    //返回结果：Diary
    //描述：获取指定diaryId的Diary对象
    Diary selectById(int diaryId);
    //(2)方法名：selectRankedListByUserId
    //传入参数：paramType:String，userId:int
    //返回结果：List<Diary>
    //描述：通过userId，按照指定的排序方式获取相关Diary对象放入List
 List<Diary> selectRankedListByUserId(String paramType,int userId);
    //(3)方法名：deleteDiaryById
    //传入参数：diaryId:int
    //返回结果：boolean
    //描述：通过diaryId删除指定 Diary
 boolean deleteDiaryById(int diaryId);
    //(4)方法名：insertDiary
    //传入参数：diary:Diary
    //返回结果：boolean
    //描述：写入新Diary
 boolean insertDiary(Diary diary);
    //(5)方法名：updateDiary
    //传入参数：diary:Diary
    //返回结果：boolean
    //描述：更新指定Diary
 boolean updateDiary(Diary diary);
    //(6)方法名：updateDiaryLikesNum
    //传入参数：diaryId:int，likesNum:int
    //返回结果：boolean
    //描述：通过diaryId更新指定 Diary的被点赞数
 boolean updateDiaryLikesNum(int diaryId,int likesNum);
 }