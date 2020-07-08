package com.neu.service;

import java.util.List;

import com.neu.po.CommMovieJson;
import com.neu.po.Comment;
import com.neu.po.StarJson;

public interface CommentController {
	/*
	 * url��/getCommentByCommentId
	���������commentId:int
	���ؽ����Comment������JSON��ʽ
	������ͨ��commentId��ȡָ��Comment����
	 */
	Comment getCommentByCommentId(int commentId);
	/*url��/getCommentByUserIdMovieId
	���������userId:int��movieId:Strings
	���ؽ����Comment������JSON��ʽ
	������ͨ��userId��movieId��ȡָ��Comment����
	 */
	Comment getCommentByUserIdMovieId(int userId,String movieId);

	
	/*url��/get RankedListByUserIdForTimeStamp
	���������userId:int
	���ؽ����List<Comment>����JSON��ʽ
	������ͨ��userId�������ύʱ��������ȡ���Comment�������List
	*/
	List<Comment>getRankedListByUserIdForTimeStamp(int userId);
	/*url��/get RankedListByUserIdForLikesNum
	���������userId:int
	���ؽ����List<Comment>����JSON��ʽ
	������ͨ��userId�����ձ��������������ȡ���Comment�������List
	*/
	List<Comment>getRankedListByUserIdForLikesNum(int userId);
	/*url��/get RankedListByMovieIdForTimeStamp
	���������movieId:String
	���ؽ����List<Comment>����JSON��ʽ
	������ͨ��movieId�������ύʱ��������ȡ���Comment�������List
	*/
	List<Comment>getRankedListByMovieIdForTimeStamp(String movieId);
	/*
	 *url��/get RankedListByMovieIdForLikesNum
	���������movieId:String
	���ؽ����List<Comment>����JSON��ʽ
	������ͨ��movieId�����ձ��������������ȡ���Comment�������List
	 */
	List<Comment>getRankedListByMovieIdForLikesNum(String movieId);
	/*
	 * url��/deleteCommentById
	���������commentId:int
	���ؽ����boolean����JSON��ʽ
	������ͨ��commentIdɾ��ָ��Comment
	*/
	boolean deleteCommentById(int commentId);
	/*url��/insertComment
	���������userId:int��movieId:String��score:int��content:String
	���ؽ����boolean����JSON��ʽ
	������д��Comment
	*/
	boolean insertComment(int userId,String movieId,int score,String content);
	/*url��/insertComment
	���������userId:int��movieId:String
	���ؽ����boolean����JSON��ʽ
	�������ı�ָ��Comment�ı�������
	*/
	boolean addCommentLikesNum(int userId,String movieId);
	/*url��/getRatio
	���������movieId:String
	���ؽ����List<StarJson>����JSON��ʽ
	���������ص�Ӱ�����ֲַ�
	 */
	List<StarJson>getRatio(String movieId);
	/*url��/getRankedListByUserIdWithReviewNum
	���������userId:String��reviewNum:Integer
	���ؽ����List<CommMovieJson>����JSON��ʽ
	����������userId��reviewNum��ȡ������5�����ۣ��������ݼ���movieName
	*/
	List<CommMovieJson>getRankedListByUserIdWithReviewNum(String userId,Integer reviewNum);
	
	
}
