package com.neuedu.dao;

import java.util.List;
import java.io.IOException;
import com.neu.po.User_info;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
public interface User_infoMapper {
	
	@Results({
        @Result(property = "m_id", column = "m_id"),
        @Result(property = "u_name", column = "u_name"),
        @Result(property = "p_number", column = "p_number"),
        @Result(property = "p_d", column = "p_d"),
        @Result(property = "u_sex", column = "u_sex"),
        @Result(property = "m_type", column = "m_type"),
      })
	
	@Insert("insert into user_info(m_id,u_name,p_number,p_d,u_sex,m_type) values(#{m_id},#{u_name},#{p_number},#{p_d},#{u_sex},#{m_type})") 
    int insert(User_info record)throws IOException;
	
	@Update("update user_info set u_name=#{u_name},p_number=#{p_number},p_d=#{p_d},u_sex=#{u_sex},m_type=#{m_type} where m_id=#{m_id}")
	int updateinfo(User_info record) throws IOException;
	
	@Delete("delete from user_info where m_id=#{m_id}")
	int deleteinfo(String userId)throws IOException;

    //int insertSelective(User_info record) throws IOException;
    
    
    @Select("select  * from user_info where m_id=#{m_id}")
    User_info find(String s) throws IOException;
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
//,p_number=#{p_number},p_d=#{p_d},u_sex=#{u_sex},m_type=#{m_type}
//
//}
