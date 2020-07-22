package com.neuedu.dao;
import java.util.List;

import java.io.IOException;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neu.po.review;

public interface review_Mapper {

	@Results({
        @Result(property = "m_id", column = "m_id"),
        @Result(property = "u_id", column = "u_id"),
        @Result(property = "content", column = "content"),
        @Result(property = "rate", column = "rate"),
        @Result(property = "type", column = "type")
        
      })
	
	@Insert("insert into rating(m_id,u_id,type,rate,content) values(#{arg0},#{arg1},#{arg2},#{arg3},#{arg4})") 
    int insertreview(String m_id,String u_id,String type,String rate,String content)throws IOException;
	
	@Update("update rating set type=#{arg2},content=#{arg4},rate=#{arg3} where m_id=#{arg0} and u_id=#{arg1}")
	int updatereview(String m_id,String u_id,String type,String content,String rate) throws IOException;
	
	@Delete("delete from rating where m_id=#{arg0} and u_id=#{arg1}")
	int deletereview(String m_id,String u_id)throws IOException;

    //int insertSelective(User_info record) throws IOException;
    
    
    @Select("select m_id,u_id,rate,content from rating where m_id=#{arg0} and u_id=#{arg1}")
    review find( String m_id,String u_id) throws IOException;
    
    @Select("select m_id,u_id,rate,content from rating  where m_id=#{m_id} order by id desc limit 5")
    List<review> find5(String m_id) throws IOException;
}
