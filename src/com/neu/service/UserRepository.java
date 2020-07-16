package com.neu.service;

import java.io.IOException;
import java.util.List;

import com.neu.po.User;
import com.neuedu.dao.UserMapper;



public interface UserRepository {

	
	int insertUser(User user) throws IOException;


//  ��������insertUser
//	���������user:User
//	���ؽ����int
//	�������������û�

    int updateUser(User user) throws IOException;
//  ��������updateUser
//	���������user:User
//	���ؽ����int
//	�����������û���Ϣ

    int deleteUser(String userId) throws IOException;
// 	��������deleteUser
//	���������userId:int
//	���ؽ����int
//	������ɾ��ָ���û�

	int loginIn(String userId,String password) throws IOException;
//	��������loginIn
//	���������userId:int��password:String
//	���ؽ����boolean
//	�������û���¼

	List<User> getUserByName(String nickname);
//	��������getUserByName
//	���������nickname:String
//	���ؽ����List<User>
//	������ͨ���ǳƲ�ѯ�û��б�

	User getUserById(int userId);
//	��������getUserById
//	���������userId:int
//	���ؽ����User
//	������ͨ��userId��ѯָ��User

	List<User> selectUsersById(int userId);
//  ��������selectUsersById
//	���������userId:int
//	���ؽ����List<User>
//	������ͨ��userId��ѯ���User

	List<String> selectALSMovieIdList(int userIde);
//  ��������selectALSMOvieIdList
//	���������userIde:int
//	���ؽ����List<String>
//	��������ȡָ���û����Ƽ�Movie�б�

	List<Integer> selectALSUserIdList(int userIde);
//  ��������selectALSUserIdList
//	���������userIde:int
//	���ؽ����List<Integer>
//	��������ȡָ���û����Ƽ��û��б�

	boolean insertEigenvalues(int userIde,String eigenvalues);
//  ��������insertEigenvalues
//	���������userIde:int��eigenvalues��String
//	���ؽ����boolean
//	�����������û�������ֵ

	boolean addCommentNum(int userIde);
//	��������addCommentNum
//	���������userIde:int
//	���ؽ����boolean
//	�����������û�������

	boolean subCommentNum(int userIde);
//  ��������subCommentNum
//	���������userIde:int
//	���ؽ����boolean
//	�����������û�������




}