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
import com.neu.po.Recommend_movie;
import com.neu.service.Recommend;
import com.neuedu.dao.MovieMapper;
import com.neuedu.dao.Recommend_movieMapper;
import com.neuedu.dao.Recommend_usersMapper;

public class Recommendbyuserimpl implements Recommend {

	private Recommend_usersMapper cdao;
	private SqlSession  ss;
	public  Recommendbyuserimpl() throws IOException {
	//Reader inputStream = Resources.getResourceAsReader("SqlMapConfig.xml");
	FileInputStream inputStream = new FileInputStream("Eclipesworkplace/moviesRecommendSystem/resources/SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	
	Recommend_usersMapper cdao=ss.getMapper(Recommend_usersMapper.class);
	//Recommend_movie recmov =cc.selectByPrimaryKey(userId);
	this.ss=ss;
	this.cdao=cdao;
	}
	
	@Override
	public List <Movie> Recommendbyuser(String uid) throws IOException{
//		String result = cdao.selectByuser(uid);
//		List<String> idList = Arrays.asList(result.split(",")).stream().map(s -> (s.trim())).collect(Collectors.toList());;//根据逗号分隔转化为list
//		Iterator it = idList.iterator();  //获取Iterator对象
//		List <Movie> list1=new ArrayList<Movie>();
//		//list.add(Movie);
//	    while(it.hasNext()){  //循环遍历Iterator对象
//	    System.out.println(it.next());  //输出Iterator对象中的值
//	    MovieServiceImpl aa = new MovieServiceImpl();
//	    a.add(aa.getMovieName(it.next().toString()));
	//  }
		String result = cdao.selectByuser(uid);
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
