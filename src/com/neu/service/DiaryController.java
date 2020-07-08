package com.neu.service;

import java.util.List;

import com.neu.po.Diary;

public interface DiaryController {
	/*(1) 方法名：getDiaryByDiaryId
	url：/ getDiaryByDiaryId
	传入参数：diaryId:int
	返回结果：Diary
	描述：获取指定diaryId的Diary对象
	*/
	Diary getDiaryByDiaryId(int diaryId);
	/*(2) 方法名：getDiaryListByUserIdForLikesNum
	url：/ getDiaryListByUserIdForLikesNum
	传入参数：userId:int
	返回结果：List<Diary>
	描述：通过userId，按照被点赞数的排序获取相关Diary对象放入List
	 */
	List<Diary>getDiaryListByUserIdForLikesNum(int userId);
	/*(3) 方法名：getDiaryListByUserIdForSubmitDate
	url：/ getDiaryListByUserIdForSubmitDate
	传入参数：userId:int
	返回结果：List<Diary>
	*/
	List<Diary>getDiaryListByUserIdForSubmitDate(int userId);
	/*(4) 方法名：deleteDiaryById
	url：/ deleteDiaryById
	传入参数：diaryId:int
	返回结果：boolean
	描述：通过diaryId删除指定 Diary
	*/
	boolean deleteDiaryById(int diaryId);
	/*(5) 方法名：insertDiary
	url：/ insertDiary
	传入参数：diaryId:int
	返回结果：boolean
	描述：通过diaryId删除指定 Diary*/
	boolean insertDiary(int diaryId);
	/*(6) 方法名：updateDiary
	url：/ updateDiary
	传入参数：diaryId:int
	返回结果：boolean
	描述：通过diaryId更新指定 Diary
	*/
	boolean updateDiary(int dairyId);
	/*(7) 方法名：updateDiaryLikesNum
	url：/ updateDiaryLikesNum
	传入参数：diaryId:int，likesNum:int
	返回结果：boolean
	描述：通过diaryId更新指定 Diary的被点赞数
	*/
	boolean updateDiaryLikesNum(int diaryId,int likesNum);
	
}
