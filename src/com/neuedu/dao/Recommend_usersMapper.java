package com.neuedu.dao;

import org.apache.ibatis.annotations.Select;


public interface Recommend_usersMapper {
	@Select("select result from recommend_users where u_id=#{u_id}")
    String selectByuser(String u_id);
}