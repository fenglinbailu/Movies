package com.neuedu.dao;

import com.neu.po.Hot_list;

public interface Hot_listMapper {
    int insert(Hot_list record);

    int insertSelective(Hot_list record);
}