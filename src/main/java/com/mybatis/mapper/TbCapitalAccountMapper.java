package com.mybatis.mapper;

import com.mybatis.entity.TbCapitalAccount;
import java.util.List;

public interface TbCapitalAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCapitalAccount record);

    TbCapitalAccount selectByPrimaryKey(Integer id);

    List<TbCapitalAccount> selectAll();

    int updateByPrimaryKey(TbCapitalAccount record);
}