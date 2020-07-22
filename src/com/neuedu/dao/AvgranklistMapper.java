package com.neuedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neu.po.Avgranklist;

public interface AvgranklistMapper {
    int insert(Avgranklist record);

    int insertSelective(Avgranklist record);
    
    @Select("select m_id from avgranklist limit #{num}")
    List<String> getMovieListByRate(int num);
    
}