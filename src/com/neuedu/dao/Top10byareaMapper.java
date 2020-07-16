package com.neuedu.dao;

import org.apache.ibatis.annotations.Select;


public interface Top10byareaMapper {
	@Select("select area_ranked_m_id from top10byarea where area=#{id}")
	String selectByPrimaryKey(String id);

}
