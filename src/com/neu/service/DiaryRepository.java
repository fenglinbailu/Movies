package com.neu.service;

import java.util.List;

import com.neu.po.Diary;

public interface DiaryRepository{
    //(1)��������selectById
    //���������diaryId:int
    //���ؽ����Diary
    //��������ȡָ��diaryId��Diary����
    Diary selectById(int diaryId);
    //(2)��������selectRankedListByUserId
    //���������paramType:String��userId:int
    //���ؽ����List<Diary>
    //������ͨ��userId������ָ��������ʽ��ȡ���Diary�������List
 List<Diary> selectRankedListByUserId(String paramType,int userId);
    //(3)��������deleteDiaryById
    //���������diaryId:int
    //���ؽ����boolean
    //������ͨ��diaryIdɾ��ָ�� Diary
 boolean deleteDiaryById(int diaryId);
    //(4)��������insertDiary
    //���������diary:Diary
    //���ؽ����boolean
    //������д����Diary
 boolean insertDiary(Diary diary);
    //(5)��������updateDiary
    //���������diary:Diary
    //���ؽ����boolean
    //����������ָ��Diary
 boolean updateDiary(Diary diary);
    //(6)��������updateDiaryLikesNum
    //���������diaryId:int��likesNum:int
    //���ؽ����boolean
    //������ͨ��diaryId����ָ�� Diary�ı�������
 boolean updateDiaryLikesNum(int diaryId,int likesNum);
 }