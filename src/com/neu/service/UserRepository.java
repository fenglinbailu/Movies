package com.neu.service;

import java.io.IOException;
import java.util.List;

import com.neu.po.User;
import com.neuedu.dao.UserMapper;



public interface UserRepository {

	
	int insertUser(User user) throws IOException;


//  方法名：insertUser
//	传入参数：user:User
//	返回结果：int
//	描述：创建新用户

    int updateUser(User user) throws IOException;
//  方法名：updateUser
//	传入参数：user:User
//	返回结果：int
//	描述：更新用户信息

    int deleteUser(String userId) throws IOException;
// 	方法名：deleteUser
//	传入参数：userId:int
//	返回结果：int
//	描述：删除指定用户

	int loginIn(String userId,String password) throws IOException;
//	方法名：loginIn
//	传入参数：userId:int，password:String
//	返回结果：boolean
//	描述：用户登录

	List<User> getUserByName(String nickname);
//	方法名：getUserByName
//	传入参数：nickname:String
//	返回结果：List<User>
//	描述：通过昵称查询用户列表

	User getUserById(int userId);
//	方法名：getUserById
//	传入参数：userId:int
//	返回结果：User
//	描述：通过userId查询指定User

	List<User> selectUsersById(int userId);
//  方法名：selectUsersById
//	传入参数：userId:int
//	返回结果：List<User>
//	描述：通过userId查询相关User

	List<String> selectALSMovieIdList(int userIde);
//  方法名：selectALSMOvieIdList
//	传入参数：userIde:int
//	返回结果：List<String>
//	描述：获取指定用户的推荐Movie列表

	List<Integer> selectALSUserIdList(int userIde);
//  方法名：selectALSUserIdList
//	传入参数：userIde:int
//	返回结果：List<Integer>
//	描述：获取指定用户的推荐用户列表

	boolean insertEigenvalues(int userIde,String eigenvalues);
//  方法名：insertEigenvalues
//	传入参数：userIde:int，eigenvalues：String
//	返回结果：boolean
//	描述：插入用户的特征值

	boolean addCommentNum(int userIde);
//	方法名：addCommentNum
//	传入参数：userIde:int
//	返回结果：boolean
//	描述：增加用户评论数

	boolean subCommentNum(int userIde);
//  方法名：subCommentNum
//	传入参数：userIde:int
//	返回结果：boolean
//	描述：减少用户评论数




}