package com.mybatis.mapper;

import com.mybatis.entity.TbUserSpecialityField;
import java.util.List;

public interface TbUserSpecialityFieldMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUserSpecialityField record);

    TbUserSpecialityField selectByPrimaryKey(Integer id);

    List<TbUserSpecialityField> selectAll();

    int updateByPrimaryKey(TbUserSpecialityField record);
}