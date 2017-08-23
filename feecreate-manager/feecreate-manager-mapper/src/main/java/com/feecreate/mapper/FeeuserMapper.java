package com.feecreate.mapper;

import com.feecreate.pojo.Feeuser;
import com.feecreate.pojo.FeeuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeuserMapper {
    int countByExample(FeeuserExample example);

    int deleteByExample(FeeuserExample example);

    int deleteByPrimaryKey(Integer feeuserid);

    int insert(Feeuser record);

    int insertSelective(Feeuser record);

    List<Feeuser> selectByExample(FeeuserExample example);

    Feeuser selectByPrimaryKey(Integer feeuserid);

    int updateByExampleSelective(@Param("record") Feeuser record, @Param("example") FeeuserExample example);

    int updateByExample(@Param("record") Feeuser record, @Param("example") FeeuserExample example);

    int updateByPrimaryKeySelective(Feeuser record);

    int updateByPrimaryKey(Feeuser record);
}