package com.neu.util;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.Flumemov;
import com.neu.po.Movie;
import com.neu.po.User_info;
import com.neuedu.dao.AvgranklistMapper;
import com.neuedu.dao.MovieMapper;
import com.neuedu.dao.TimeMapper;
import com.neuedu.dao.User_infoMapper;

public class Flumerec {
	
	public List<Movie> find() throws IOException{
		
		Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession  ss=ssf.openSession();
		TimeMapper   cdao=ss.getMapper(TimeMapper.class);
		MovieMapper adao=ss.getMapper(MovieMapper.class);
		List<String> a =cdao.findall();
		
		List<Movie> list=new ArrayList<Movie>();
		for(int i=0;i<a.size();i++) {
			Movie movie=adao.selectByPrimaryKey(a.get(i));
			list.add(movie);
		}
		return list;	
        
	}

}
