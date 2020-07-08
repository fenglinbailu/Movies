package com.neu.service;

import java.util.List;

import com.neu.po.Diary;

public interface DiaryService {
	
//	(1) 方法名：getDiaryByDiaryId
//	传入参数：diaryId:int
//	返回结果：Diary
//	描述：获取指定diaryId的Diary对象
	Diary getDiaryByDiaryId (int diaryId);
//	(2) 方法名：getDiaryListByUserIdForLikesNum
//	传入参数：userId:int
//	返回结果：List<Diary>
//	描述：通过userId，按照被点赞数的排序获取相关Diary对象放入List
	List<Diary> getDiaryListByUserIdForLikesNum(int userId);
//	(3) 方法名：getDiaryListByUserIdForSubmitDate
//	传入参数：userId:int
//	返回结果：List<Diary>
//	描述：通过userId，按照提交时间的排序获取相关Diary对象放入List
	List<Diary> getDiaryListByUserIdForSubmitDate(int userId);
//	(4) 方法名：deleteDiaryId
//	传入参数：diaryId:int
//	返回结果：boolean
//	描述：通过diaryId删除指定 Diary
	boolean deleteDiaryId(int diaryId);
//	(5) 方法名：insertDiaryId
//	传入参数：diaryId:Diary
//	返回结果：boolean
//	描述：写入新Diary
	boolean insertDiaryId(Diary diaryId);
//	(6) 方法名：updateDiaryId
//	传入参数：diaryId:Diary
//	返回结果：boolean
//	描述：更新指定Diary的内容
	boolean updateDiaryId(Diary diaryId);
//	(7) 方法名：updateDiaryLikesNum
//	传入参数：diaryId:int，likesNum:int
//	返回结果：boolean
//	描述：通过diaryId更新指定 Diary的被点赞数添加blacklist新纪录
	boolean updateDiaryLikesNum(int diaryId ,int likesNum);

}
