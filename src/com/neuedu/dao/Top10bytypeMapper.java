package com.neuedu.dao;

import org.apache.ibatis.annotations.Select;


public interface Top10bytypeMapper {
	@Select("select ranked_m_id from top10bytype where type=#{id}")
    String selectByPrimaryKey(String id);
}
