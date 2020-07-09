package com.neuedu.dao;

import com.neu.po.Movie;

public interface MovieMapper {
    int deleteByPrimaryKey(String mId);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(String mId);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}