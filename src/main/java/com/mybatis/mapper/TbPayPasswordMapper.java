package com.mybatis.mapper;

import com.mybatis.entity.TbPayPassword;
import java.util.List;

public interface TbPayPasswordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPayPassword record);

    TbPayPassword selectByPrimaryKey(Integer id);

    List<TbPayPassword> selectAll();

    int updateByPrimaryKey(TbPayPassword record);
}