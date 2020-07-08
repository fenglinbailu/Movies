package com.neu.service;

import java.util.List;

import com.neu.po.Diary;

public interface DiaryController {
	/*(1) ��������getDiaryByDiaryId
	url��/ getDiaryByDiaryId
	���������diaryId:int
	���ؽ����Diary
	��������ȡָ��diaryId��Diary����
	*/
	Diary getDiaryByDiaryId(int diaryId);
	/*(2) ��������getDiaryListByUserIdForLikesNum
	url��/ getDiaryListByUserIdForLikesNum
	���������userId:int
	���ؽ����List<Diary>
	������ͨ��userId�����ձ��������������ȡ���Diary�������List
	 */
	List<Diary>getDiaryListByUserIdForLikesNum(int userId);
	/*(3) ��������getDiaryListByUserIdForSubmitDate
	url��/ getDiaryListByUserIdForSubmitDate
	���������userId:int
	���ؽ����List<Diary>
	*/
	List<Diary>getDiaryListByUserIdForSubmitDate(int userId);
	/*(4) ��������deleteDiaryById
	url��/ deleteDiaryById
	���������diaryId:int
	���ؽ����boolean
	������ͨ��diaryIdɾ��ָ�� Diary
	*/
	boolean deleteDiaryById(int diaryId);
	/*(5) ��������insertDiary
	url��/ insertDiary
	���������diaryId:int
	���ؽ����boolean
	������ͨ��diaryIdɾ��ָ�� Diary*/
	boolean insertDiary(int diaryId);
	/*(6) ��������updateDiary
	url��/ updateDiary
	���������diaryId:int
	���ؽ����boolean
	������ͨ��diaryId����ָ�� Diary
	*/
	boolean updateDiary(int dairyId);
	/*(7) ��������updateDiaryLikesNum
	url��/ updateDiaryLikesNum
	���������diaryId:int��likesNum:int
	���ؽ����boolean
	������ͨ��diaryId����ָ�� Diary�ı�������
	*/
	boolean updateDiaryLikesNum(int diaryId,int likesNum);
	
}
