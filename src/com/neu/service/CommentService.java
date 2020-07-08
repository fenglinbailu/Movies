package com.neu.service;

import java.util.List;

import com.neu.po.CommJson;
import com.neu.po.Comment;

import com.neu.po.StarJson;

public interface CommentService {
	Comment getCommentByCommentId(int commentId);
	List<Comment> getCommentByUserIdMovieId(int userId,String movieId);
	List<Comment> getRankedListByUserIdForTimeStamp(int userId);
	List<Comment> getRankedListByUserIdForLikesNum(int userId);
	List<Comment> getRankedListByMovieIdForTimeStamp(String movieId);
	List<Comment> getRankedListByMovieIdForLikesNum(String movieId);
	boolean deleteCommentById(int commentId);
	boolean insertCommentById(Comment comment);
	boolean updateComment(Comment comment);
	boolean addCommentForLikesNum(int userId,String movieId);
	List<CommJson> changeToCommJson(List<Comment> list);
	List<CommJson> ToCommJson(Comment comment);
	List<StarJson> getRatio(String movieId);
	
}
