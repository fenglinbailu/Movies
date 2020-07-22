package com.neuedu.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neu.po.Recommend_movie;

public interface Recommend_movieMapper {
	
    @Delete("delete from recommend_movie where m_id=#{id}")
    int deleteByPrimaryKey(String mId);

	@Insert("insert into recommend_movie values(#{m_id},#{recommend_movie_id})")
    int insert(Recommend_movie record);

   // int insertSelective(Recommend_movie record);
	@Select("select * from recommend_movie where m_id=#{m_id}")
    Recommend_movie selectByPrimaryKey(String mId);
	
	@Select("select recommend_movie_id from recommend_movie where m_id=#{m_id}")
    String findcomov(String mId);
   // int updateByPrimaryKeySelective(Recommend_movie record);

	@Update("update recommend_movie set mid=#{m_id},recommend_movie_id=#{recommend_movie_id}")
    int updateByPrimaryKey(Recommend_movie record);
    
    
}