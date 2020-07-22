package com.neuedu.dao;

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
        @Result(property = "rank1", column = "rank1")
        
      })
	
	@Insert("insert into review(m_id,u_id,content,rank1) values(#{m_id},#{u_id},#{content},#{rank1})") 
    int insertreview(review record)throws IOException;
	
	@Update("update review set content=#{content},rank1=#{rank1} where m_id=#{m_id} and u_id=#{u_id}")
	int updatereview(review record) throws IOException;
	
	@Delete("delete from review where m_id=#{arg0} and u_id=#{arg1}")
	int deletereview(String m_id,String u_id)throws IOException;

    //int insertSelective(User_info record) throws IOException;
    
    
    @Select("select * from review where m_id=#{arg0} and u_id=#{arg1}")
    review find( String m_id,String u_id) throws IOException;

}
