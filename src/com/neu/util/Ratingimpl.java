package com.neu.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.Movie;
import com.neu.service.Ratingservice;
import com.neuedu.dao.RatingMapper;
import com.neuedu.dao.Recommend_movieMapper;

public class Ratingimpl implements Ratingservice {
	private RatingMapper cdao;
	private SqlSession  ss;
	public  Ratingimpl() throws IOException {
	//Reader inputStream = Resources.getResourceAsReader("SqlMapConfig.xml");
	FileInputStream inputStream = new FileInputStream("Eclipesworkplace/moviesRecommendSystem/resources/SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	
	RatingMapper cdao=ss.getMapper(RatingMapper.class);
	//Recommend_movie recmov =cc.selectByPrimaryKey(userId);
	this.ss=ss;
	this.cdao=cdao;
	}
	
	@Override
	public com.neu.po.Rating select(String uid,String mid) throws IOException{

		com.neu.po.Rating result = cdao.select(uid, mid);
		if( result!=null) {
		System.out.println("评分电影类型"+result.getType());
		
		return result;
		}
		else
			return null;
	}
	
	@Override
	public int update(String uid,String mid,Integer rate) throws IOException{

		int result = cdao.update(uid, mid, rate);
		if( result!=0) {
		System.out.println("评分:"+result);
		
		return result;
		}
		else
			return 0;
	}
	

}
