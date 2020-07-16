package com.neu.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.User;
import com.neu.service.UserRepository;
import com.neuedu.dao.MovieMapper;
import com.neuedu.dao.UserMapper;

public class UserRepositoryimpl implements UserRepository {
	private UserMapper cdao;
	private SqlSession  ss;
	public  UserRepositoryimpl() throws IOException {
	System.out.println(System.getProperty("user.dir"));
	FileInputStream inputStream = new FileInputStream("Eclipesworkplace\\\\moviesRecommendSystem\\\\resources/SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	
	UserMapper cdao=ss.getMapper(UserMapper.class);
	//Recommend_movie recmov =cc.selectByPrimaryKey(userId);
	this.ss=ss;
	this.cdao=cdao;
	}

	@Override
	public int insertUser(User user) throws IOException {
		// TODO Auto-generated method stub
		if (cdao.find(user.getuId() )==null) {
			cdao.insert(user);
			ss.commit();
			return 1;
			}
			else return 0;
	}

	@Override
	public int updateUser(User user) throws IOException {
		// TODO Auto-generated method stub
		if (cdao.find(user.getuId() )!=null) {
			cdao.updateUser(user);
			ss.commit();
			return 1;
			}
			else return 0;
	}

	@Override
	public int deleteUser(String userId) throws IOException {
		// TODO Auto-generated method stub
		if (cdao.find(userId)!=null) {
			cdao.deleteUser(userId);
			ss.commit();
			return 1;
			}
			else return 0;
	}

	@Override
	public int loginIn(String userId, String password) throws IOException {
		// TODO Auto-generated method stub

		String string = cdao.find(userId);
        
		if(string!=null&&string.equals(password)) 
			
			return 1;
		else 
			return 0;
	}

	@Override
	public List<User> getUserByName(String nickname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectUsersById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> selectALSMovieIdList(int userIde) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> selectALSUserIdList(int userIde) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertEigenvalues(int userIde, String eigenvalues) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCommentNum(int userIde) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean subCommentNum(int userIde) {
		// TODO Auto-generated method stub
		return false;
	}



}
