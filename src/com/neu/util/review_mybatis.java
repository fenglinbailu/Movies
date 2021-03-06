package com.neu.util;
import java.util.List;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.review;
import com.neuedu.dao.review_Mapper;

public class review_mybatis {
	public static int insertreview(review user_review,String type) throws IOException{
		Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession  ss=ssf.openSession();
		review_Mapper  cdao=ss.getMapper(review_Mapper.class);
		
		cdao.insertreview(user_review.getmId(),user_review.getuId(),type,user_review.getrate(),user_review.getcontent());
		ss.commit();

	 return 1;
	}
public static int updatereview(review user_review,String type)throws IOException{
	Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	review_Mapper  cdao=ss.getMapper(review_Mapper.class);
	if (cdao.find(user_review.getmId(),user_review.getuId())!=null) {
	cdao.updatereview(user_review.getmId(),user_review.getuId(),type,user_review.getrate(),user_review.getcontent());
	ss.commit();
	
	}
	else {
		cdao.insertreview(user_review.getmId(),user_review.getuId(),type,user_review.getrate(),user_review.getcontent());
		ss.commit();
		
	}
	return 1;
}
public static int deletereview(String m_id,String u_id) throws IOException{
	Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	review_Mapper  cdao=ss.getMapper(review_Mapper.class);
	if (cdao.find(m_id,u_id)!=null) {
	cdao.deletereview(m_id, u_id);
	ss.commit();
	return 1;
	}
	else return 0;
		
	
}
public static review findreview(String m_id,String u_id) throws IOException{
	Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	review_Mapper  cdao=ss.getMapper(review_Mapper.class);
	review a = cdao.find(m_id, u_id);
	return a;
		
	
}
public static List<review> find5review(String m_id) throws IOException{
	Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	review_Mapper  cdao=ss.getMapper(review_Mapper.class);
	List<review> a = cdao.find5(m_id);
	return a;
		
	
}


}
