package com.neu.service;

import java.util.List;

import com.neu.po.Diary;

public interface DiaryService {
	
//	(1) ��������getDiaryByDiaryId
//	���������diaryId:int
//	���ؽ����Diary
//	��������ȡָ��diaryId��Diary����
	Diary getDiaryByDiaryId (int diaryId);
//	(2) ��������getDiaryListByUserIdForLikesNum
//	���������userId:int
//	���ؽ����List<Diary>
//	������ͨ��userId�����ձ��������������ȡ���Diary�������List
	List<Diary> getDiaryListByUserIdForLikesNum(int userId);
//	(3) ��������getDiaryListByUserIdForSubmitDate
//	���������userId:int
//	���ؽ����List<Diary>
//	������ͨ��userId�������ύʱ��������ȡ���Diary�������List
	List<Diary> getDiaryListByUserIdForSubmitDate(int userId);
//	(4) ��������deleteDiaryId
//	���������diaryId:int
//	���ؽ����boolean
//	������ͨ��diaryIdɾ��ָ�� Diary
	boolean deleteDiaryId(int diaryId);
//	(5) ��������insertDiaryId
//	���������diaryId:Diary
//	���ؽ����boolean
//	������д����Diary
	boolean insertDiaryId(Diary diaryId);
//	(6) ��������updateDiaryId
//	���������diaryId:Diary
//	���ؽ����boolean
//	����������ָ��Diary������
	boolean updateDiaryId(Diary diaryId);
//	(7) ��������updateDiaryLikesNum
//	���������diaryId:int��likesNum:int
//	���ؽ����boolean
//	������ͨ��diaryId����ָ�� Diary�ı����������blacklist�¼�¼
	boolean updateDiaryLikesNum(int diaryId ,int likesNum);

}
