package com.neu.service;

import java.util.List;
import java.util.Map;
import com.neu.po.Comment;

public interface CommentRepository {
    //(1)��������selectById
    //���������commentId:int
    //���ؽ����Comment
    //������ͨ��commentId��ȡָ��Comment����
    Comment selectById(int commentId);
    //(2)��������selectByUserIdMovieId
    //���������userId:int��movieId:String
    //���ؽ����List<Comment>
    //������ͨ��userId��movieId��ȡָ��Comment����
    List<Comment> selectByUserIdMovieId(int userId,String movieId);
    //(3)��������selectRankedListByUserId
    //���������paramType:String ��userId:int
    //���ؽ����List<Comment>
    //������ͨ��userId������ָ������ʽ��ȡ���Comment����
    List<Comment> selectRankedListByUserId(String paramType,int userId);
    //(4)��������selectRankedListByMovieId
    //���������paramType:String ��movieId:String
    //���ؽ����List<Comment>
    //������ͨ��movieId������ָ������ʽ��ȡ���Comment����
    List<Comment> selectRankedListByMovieId(String paramType,String movieId);
    //(5)��������deleteCommentById
    //���������commentId:int
    //���ؽ����boolean
    //������ͨ��commentIdɾ��ָ��Comment
    boolean deleteCommentById(int commentId);
    //(6)��������insertComment
    //���������comment:Comment
    //���ؽ����boolean
    //������д��Comment
    boolean insertComment(Comment comment);
    //(7)��������updateComment
    //���������comment:Comment
    //���ؽ����boolean
    //����������ָ��Comment
    boolean updateComment(Comment comment);
    //(8)��������updateCommentLikesNum
    //���������commentId:int��likesNum:int
    //���ؽ����boolean
    //�������ı�ָ��Comment�ı�������
    boolean updateCommentLikesNum(int commentId,int likesNum);
    //(9)��������getRatio
    //���������movieId:String
    //���ؽ����Map
    //�������������ֲַ����
    Map getRatio(String movieId);
}
