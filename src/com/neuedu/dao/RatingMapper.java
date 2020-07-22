package com.neuedu.dao;

import com.neu.po.Rating;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface RatingMapper {
	@Delete("delete from rating where id=#{id}")
    int deleteByPrimaryKey(Integer id);
	
	@Insert("insert into rating values(#{id},#{u_id},#{m_id},#{type},#{rate})")
    int insert(Rating record);

  //  int insertSelective(Rating record);
	
	@Select("select * from rating where u_id=#{uid},m_id=#{mid}")
    Rating select(String uid,String mid);
   
    int updateByPrimaryKeySelective(Rating record);
    
	@Update("update rating set u_id=#{uid},mid=#{mid},rate=#{rate}")
    int update(String uid,String mid,Integer rate);
}