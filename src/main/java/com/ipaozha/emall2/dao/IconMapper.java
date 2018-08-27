package com.ipaozha.emall2.dao;

import com.ipaozha.emall2.pojo.Icon;

public interface IconMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Icon record);

    int insertSelective(Icon record);

    Icon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Icon record);

    int updateByPrimaryKey(Icon record);
}