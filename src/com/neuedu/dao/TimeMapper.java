package com.neuedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;


public interface TimeMapper {
	@Select("select m_id from flume_movierecommend ")
	List<String> findall();

}
