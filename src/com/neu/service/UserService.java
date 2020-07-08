package com.neu.service;


import java.util.List;

import com.neu.po.User;

public interface UserService {
	int insertUser(User user);
	int updateUser(User user);
	int deleteUser(int userId);
	int loginIn(User userId,String password);
	List<User> getUserByName(String nickname);
	User getUserById(int userId);
	boolean insertEigenvalues(int userId, String Eigenvalues);

}
