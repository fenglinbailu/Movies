package com.neu.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.Movie;
import com.neu.service.MovieRecommend;


import com.neuedu.dao.Recommend_movieMapper;


public class Recommendbymovieimpl implements MovieRecommend {

	private Recommend_movieMapper cdao;
	private SqlSession  ss;
	public  Recommendbymovieimpl() throws IOException {
	//Reader inputStream = Resources.getResourceAsReader("SqlMapConfig.xml");
	FileInputStream inputStream = new FileInputStream("Eclipesworkplace/moviesRecommendSystem/resources/SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	
	Recommend_movieMapper cdao=ss.getMapper(Recommend_movieMapper.class);
	//Recommend_movie recmov =cc.selectByPrimaryKey(userId);
	this.ss=ss;
	this.cdao=cdao;
	}
	
	@Override
	public List <Movie> Recommendbymovie(String mid) throws IOException{

		String result = cdao.findcomov(mid);
		if( result!=null) {
		System.out.println(result);
		String[] res =result.split(",");
		System.out.println(res);
		List <Movie> list1=new ArrayList<Movie>();
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
			MovieServiceImpl aa = new MovieServiceImpl();
			Movie m=aa.getMovieId(res[i]);
			//Movie m=aa.getMovieName(res[i]);
			list1.add(m);
		}
		
		// TODO Auto-generated method stub
		return list1;
		}
		else
			return null;
	}

}
