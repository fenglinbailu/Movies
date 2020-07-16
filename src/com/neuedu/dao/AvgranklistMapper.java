package com.neuedu.dao;

import com.neu.po.Avgranklist;

public interface AvgranklistMapper {
    int insert(Avgranklist record);

    int insertSelective(Avgranklist record);
}