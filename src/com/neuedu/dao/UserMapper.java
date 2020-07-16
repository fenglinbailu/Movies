package com.neuedu.dao;

import java.util.List;
import java.io.IOException;
import com.neu.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
public interface UserMapper {
	
	@Results({
        @Result(property = "u_id", column = "u_id"),
        @Result(property = "u_Passwd", column = "u_Passwd"),
      })
	
	@Insert("insert into user(u_id,u_Passwd) values(#{u_id},#{u_Passwd})") 
    int insert(User record)throws IOException;
	
	@Update("update user set u_Passwd=#{u_Passwd} where u_id=#{u_id}")
	int updateUser(User user) throws IOException;
	
	@Delete("delete from user where u_id=#{u_id}")
	int deleteUser(String userId)throws IOException;

    //int insertSelective(User record) throws IOException;
    
    
    @Select("select  u_Passwd from user where u_id=#{u_id}")
    String find(String u_id) throws IOException;
    
   // @Select("select u_id from user where u_id=#{u_id},u_Passwd=#{u_Passwd}")
   // String findip(User user) throws IOException;
}
//
//
//import java.io.IOException;
//import java.util.List;
//
//import org.apache.ibatis.annotations.Select;
//
//import com.neuedu.po.IdCardPo;
//
//public interface IdCardDAO {
//	@Select("select *from idcard") 
//	List<IdCardPo> findAll() throws IOException;
//
//}
