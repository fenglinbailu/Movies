package com.neu.service;

import java.util.List;

import com.neu.po.CommMovieJson;
import com.neu.po.Comment;
import com.neu.po.StarJson;

public interface CommentController {
	/*
	 * url：/getCommentByCommentId
	传入参数：commentId:int
	返回结果：Comment对象，以JSON格式
	描述：通过commentId获取指定Comment对象
	 */
	Comment getCommentByCommentId(int commentId);
	/*url：/getCommentByUserIdMovieId
	传入参数：userId:int，movieId:Strings
	返回结果：Comment对象，以JSON格式
	描述：通过userId、movieId获取指定Comment对象
	 */
	Comment getCommentByUserIdMovieId(int userId,String movieId);

	
	/*url：/get RankedListByUserIdForTimeStamp
	传入参数：userId:int
	返回结果：List<Comment>，以JSON格式
	描述：通过userId，按照提交时间的排序获取相关Comment对象放入List
	*/
	List<Comment>getRankedListByUserIdForTimeStamp(int userId);
	/*url：/get RankedListByUserIdForLikesNum
	传入参数：userId:int
	返回结果：List<Comment>，以JSON格式
	描述：通过userId，按照被点赞数的排序获取相关Comment对象放入List
	*/
	List<Comment>getRankedListByUserIdForLikesNum(int userId);
	/*url：/get RankedListByMovieIdForTimeStamp
	传入参数：movieId:String
	返回结果：List<Comment>，以JSON格式
	描述：通过movieId，按照提交时间的排序获取相关Comment对象放入List
	*/
	List<Comment>getRankedListByMovieIdForTimeStamp(String movieId);
	/*
	 *url：/get RankedListByMovieIdForLikesNum
	传入参数：movieId:String
	返回结果：List<Comment>，以JSON格式
	描述：通过movieId，按照被点赞数的排序获取相关Comment对象放入List
	 */
	List<Comment>getRankedListByMovieIdForLikesNum(String movieId);
	/*
	 * url：/deleteCommentById
	传入参数：commentId:int
	返回结果：boolean，以JSON格式
	描述：通过commentId删除指定Comment
	*/
	boolean deleteCommentById(int commentId);
	/*url：/insertComment
	传入参数：userId:int，movieId:String，score:int，content:String
	返回结果：boolean，以JSON格式
	描述：写入Comment
	*/
	boolean insertComment(int userId,String movieId,int score,String content);
	/*url：/insertComment
	传入参数：userId:int，movieId:String
	返回结果：boolean，以JSON格式
	描述：改变指定Comment的被点赞数
	*/
	boolean addCommentLikesNum(int userId,String movieId);
	/*url：/getRatio
	传入参数：movieId:String
	返回结果：List<StarJson>，以JSON格式
	描述：返回电影的评分分布
	 */
	List<StarJson>getRatio(String movieId);
	/*url：/getRankedListByUserIdWithReviewNum
	传入参数：userId:String，reviewNum:Integer
	返回结果：List<CommMovieJson>，以JSON格式
	描述：根据userId和reviewNum获取接下来5条评论，返回数据加入movieName
	*/
	List<CommMovieJson>getRankedListByUserIdWithReviewNum(String userId,Integer reviewNum);
	
	
}
