package com.neu.util;
import java.io.FileInputStream;
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
import com.neuedu.dao.UserMapper;
import com.neu.util.ALSServieimpl;
public class MyBatisTest1 {
	public static void main(String[] args) throws IOException {
		
	//Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
	//SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
	//		.build(inputStream);
	//SqlSession  ss=ssf.openSession();
	
	//UserMapper  cdao=ss.getMapper(UserMapper.class);
	//String list=cdao.find(null);
	//System.out.println("size1="+list.size()+" "+list.get(0).getuId());
	
//	 ALSServieimpl a =new ALSServieimpl();
//	Recommend_movie aa=a.getALSMovieList("10047547");
//	String[] bb=aa.getRecommendMovieId().split(",");
//	System.out.println(bb[1]);
//	MovieControllerimpl ssd=new MovieControllerimpl();
//	Movie kk=ssd.getMovieById("10047547");
//	System.out.println(kk.getmName());
//	
		
	//	FileInputStream inputStream = new FileInputStream("resources/SqlMapConfig.xml");
		//File file = new File("//resources/SqlMapConfig.xml");
//		InputStream inputStream = new FileInputStream("src/resources/SqlMapConfig.xml");
		//inputStream = new FileInputStream(file);
		//Reader inputStream = FileInputStream("SqlMapConfig.xml");
//		System.out.println("xmlºó");
//		SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
//				.build(inputStream);
//		SqlSession  ss=ssf.openSession();
////		
//		UserMapper cdao=ss.getMapper(UserMapper.class);
	UserRepositoryimpl  userRepository=new UserRepositoryimpl();
	int a=userRepository.loginIn("100059883","cloudA7301");
	System.out.println(a);
	
//	UserMapper  cdao1=ss.getMapper(UserMapper.class);
//	User reco = new User("63721381121","bcs");
//	User reco = new User();
//	reco.setuId("63721381);	
//	reco.setuPasswd("bchbalv");
	
//	String a=reco.getuId();
//	System.out.println("D:"+a);
//	int HH=cdao1.insert(reco);
//	System.out.println(HH);
//	ss.commit();
//	User a1 = cdao1.find("63721381121");
//	System.out.println(a1.getuId()+a1.getuPasswd());

}

	private static List<Movie> getALSMovieList(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
