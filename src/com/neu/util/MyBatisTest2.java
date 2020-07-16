package com.neu.util;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import com.neu.po.User;
import com.neu.po.Movie;
import com.neuedu.dao.UserMapper;
import com.neuedu.dao.MovieMapper;
public class MyBatisTest2 {
	public static void main(String[] args) throws IOException {
	Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	
	//UserMapper  cdao=ss.getMapper(UserMapper.class);
	//List<User> list=cdao.findAll();
	//System.out.println("size="+list.size()+" "+list.get(0).getuId());
	MovieServiceImpl cc = new MovieServiceImpl();
	List<Movie> llist=cc.searchmovie("阿加莎·克里斯蒂");
	//MovieMapper cc=ss.getMapper(MovieMapper.class);
	//List<Movie> llist=cc.search("阿加莎·克里斯蒂");
	 for (int j = 0; j < llist.size(); j++) {

		System.out.println(llist.get(j).getmName());

	 }
	//System.out.println("size="+llist.size()+" "+llist.get(1).getmId());
	
	//Movie lllist=cc.selectByPrimaryKey("10355625");
	//System.out.println(lllist.getmName());
	/*
	Movie record=new Movie("1","1",1,"1","1","1","1","1","1",1,"1","1");
	int lllist=cc.insert(record);
	System.out.println(lllist);
	ss.commit();
	*/
	
	/*int lllist=cc.deleteByPrimaryKey("1");
	System.out.println(lllist);
	ss.commit();*/
	
	/*Movie record=new Movie("1","2",2,"1","1","1","1","1","1",1,"1","1");
	int lllist=cc.updateByPrimaryKeySelective(record);
	System.out.println(lllist);
	ss.commit();*/
	

}
}
