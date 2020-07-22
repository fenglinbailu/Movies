package com.neuedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neu.po.Hot_list;

public interface Hot_listMapper {
    int insert(Hot_list record);

    int insertSelective(Hot_list record);
    
    @Select("select m_id from hot_list limit #{num}")
    List<String> getMovieListByHot(int num);
}