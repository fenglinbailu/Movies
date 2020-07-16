package com.neu.util;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neu.po.Movie;
import com.neu.po.Recommend_movie;
import com.neu.po.User;
import com.neu.service.ALSService;
import com.neuedu.dao.Recommend_movieMapper;

public class ALSServieimpl implements ALSService {
	private SqlSession ss;
	public  ALSServieimpl() throws IOException {
	Reader inputStream = Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	this.ss=ss;
	}
	@Override
	public Recommend_movie getALSMovieList(String userId) {
		
		// TODO Auto-generated method stub
		Recommend_movieMapper cc=ss.getMapper(Recommend_movieMapper.class);
		Recommend_movie recmov =cc.selectByPrimaryKey(userId);
       // System.out.print(recmov.getmId()+recmov.getRecommendMovieId());
		return recmov;
	}

	@Override
	public List<User> getALSUserList(String userId) {
		// TODO Auto-generated method stub
		return null;
	}


}
