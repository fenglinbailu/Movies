package com.neuedu.dao;

import com.neu.po.Recommend_movie;

public interface Recommend_movieMapper {
    int deleteByPrimaryKey(String mId);

    int insert(Recommend_movie record);

    int insertSelective(Recommend_movie record);

    Recommend_movie selectByPrimaryKey(String mId);

    int updateByPrimaryKeySelective(Recommend_movie record);

    int updateByPrimaryKey(Recommend_movie record);
}