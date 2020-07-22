package com.neu.util;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.User_info;
import com.neuedu.dao.User_infoMapper;

public class user_info_mybatis {
	
	public static int insertUserinfo(User_info user_info) throws IOException{
			Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
					.build(inputStream);
			SqlSession  ss=ssf.openSession();
			User_infoMapper  cdao=ss.getMapper(User_infoMapper.class);
			
			cdao.insert(user_info);
			ss.commit();

		 return 1;
		}
	public static int updateUserinfo(User_info user_info)throws IOException{
		Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession  ss=ssf.openSession();
		User_infoMapper  cdao=ss.getMapper(User_infoMapper.class);
		if (cdao.find(user_info.getmId() )!=null) {
		cdao.updateinfo(user_info);
		ss.commit();
		return 1;
		}
		else return 0;
	}
	public static int deleteUserinfo(String userId) throws IOException{
		Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession  ss=ssf.openSession();
		User_infoMapper  cdao=ss.getMapper(User_infoMapper.class);
		if (cdao.find(userId)!=null) {
		cdao.deleteinfo(userId);
		ss.commit();
		return 1;
		}
		else return 0;
			
		
	}
	public static User_info findUserinfo(String userId) throws IOException{
		Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession  ss=ssf.openSession();
		User_infoMapper  cdao=ss.getMapper(User_infoMapper.class);
		User_info a = cdao.find(userId);
		return a;
			
		
	}
	
	
	
	/*public static void main(String[] args)throws IOException {
		
		//User record = new User("1001456","bcsss");
		int a = loginIn("63721389","bcsss");
		System.out.println(a);
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	

}
