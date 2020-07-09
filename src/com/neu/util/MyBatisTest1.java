package com.neu.util;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import com.neu.po.User;
import com.neuedu.dao.UserMapper;
public class MyBatisTest1 {
	public static void main(String[] args) throws IOException {
	Reader inputStream=Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlSessionFactory  ssf=	new SqlSessionFactoryBuilder()
			.build(inputStream);
	SqlSession  ss=ssf.openSession();
	
	UserMapper  cdao=ss.getMapper(UserMapper.class);
	List<User> list=cdao.findAll();
	System.out.println("size="+list.size()+" "+list.get(0).getuId());

}
}
