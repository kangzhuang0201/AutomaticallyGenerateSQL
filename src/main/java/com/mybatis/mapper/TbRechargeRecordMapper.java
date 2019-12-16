package com.mybatis.mapper;

import com.mybatis.entity.TbRechargeRecord;
import java.util.List;

public interface TbRechargeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRechargeRecord record);

    TbRechargeRecord selectByPrimaryKey(Integer id);

    List<TbRechargeRecord> selectAll();

    int updateByPrimaryKey(TbRechargeRecord record);
}