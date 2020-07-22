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
import com.neuedu.dao.UserMapper;

public class user_mybatis {
	
	public static int insertUser(User user) throws IOException{
			//Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		FileInputStream inputStream = new FileInputStream("Eclipesworkplace/moviesRecommendSystem/resources/SqlMapConfig.xml");
			SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
					.build(inputStream);
			SqlSession  ss=ssf.openSession();
			UserMapper  cdao=ss.getMapper(UserMapper.class);
			if (cdao.find(user.getuId() )==null) {
			cdao.insert(user);
			ss.commit();
			return 1;
			}
			else return 0;
		}
	public static int updateUser(User user)throws IOException{
		//Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		FileInputStream inputStream = new FileInputStream("Eclipesworkplace/moviesRecommendSystem/resources/SqlMapConfig.xml");
		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession  ss=ssf.openSession();
		UserMapper  cdao=ss.getMapper(UserMapper.class);
		if (cdao.find(user.getuId() )!=null) {
		cdao.updateUser(user);
		ss.commit();
		return 1;
		}
		else return 0;
	}
	public static int deleteUser(String userId) throws IOException{
		//Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		FileInputStream inputStream = new FileInputStream("Eclipesworkplace/moviesRecommendSystem/resources/SqlMapConfig.xml");
		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession  ss=ssf.openSession();
		UserMapper  cdao=ss.getMapper(UserMapper.class);
		if (cdao.find(userId)!=null) {
		cdao.deleteUser(userId);
		ss.commit();
		return 1;
		}
		else return 0;
			
		
	}
	public static int loginIn(String userId,String password) throws IOException{
		
		Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession  ss=ssf.openSession();
		UserMapper  cdao=ss.getMapper(UserMapper.class);
		String string = cdao.find(userId);

		if(string.equals(password)) 
			
			return 1;
		else 
			return 0;
	}
	
	
	/*public static void main(String[] args)throws IOException {
		
		//User record = new User("1001456","bcsss");
		int a = loginIn("63721389","bcsss");
		System.out.println(a);
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	

}
