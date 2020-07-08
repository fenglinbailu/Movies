package com.neu.service;

import java.util.List;
import java.util.Map;
import com.neu.po.Comment;

public interface CommentRepository {
    //(1)方法名：selectById
    //传入参数：commentId:int
    //返回结果：Comment
    //描述：通过commentId获取指定Comment对象
    Comment selectById(int commentId);
    //(2)方法名：selectByUserIdMovieId
    //传入参数：userId:int，movieId:String
    //返回结果：List<Comment>
    //描述：通过userId、movieId获取指定Comment对象
    List<Comment> selectByUserIdMovieId(int userId,String movieId);
    //(3)方法名：selectRankedListByUserId
    //传入参数：paramType:String ，userId:int
    //返回结果：List<Comment>
    //描述：通过userId，按照指定排序方式获取相关Comment对象
    List<Comment> selectRankedListByUserId(String paramType,int userId);
    //(4)方法名：selectRankedListByMovieId
    //传入参数：paramType:String ，movieId:String
    //返回结果：List<Comment>
    //描述：通过movieId，按照指定排序方式获取相关Comment对象
    List<Comment> selectRankedListByMovieId(String paramType,String movieId);
    //(5)方法名：deleteCommentById
    //传入参数：commentId:int
    //返回结果：boolean
    //描述：通过commentId删除指定Comment
    boolean deleteCommentById(int commentId);
    //(6)方法名：insertComment
    //传入参数：comment:Comment
    //返回结果：boolean
    //描述：写入Comment
    boolean insertComment(Comment comment);
    //(7)方法名：updateComment
    //传入参数：comment:Comment
    //返回结果：boolean
    //描述：更新指定Comment
    boolean updateComment(Comment comment);
    //(8)方法名：updateCommentLikesNum
    //传入参数：commentId:int，likesNum:int
    //返回结果：boolean
    //描述：改变指定Comment的被点赞数
    boolean updateCommentLikesNum(int commentId,int likesNum);
    //(9)方法名：getRatio
    //传入参数：movieId:String
    //返回结果：Map
    //描述：返回评分分布情况
    Map getRatio(String movieId);
}
