package com.feecreate.mapper;

import com.feecreate.pojo.Feefile;
import com.feecreate.pojo.FeefileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeefileMapper {
    int countByExample(FeefileExample example);

    int deleteByExample(FeefileExample example);

    int deleteByPrimaryKey(Integer filleid);

    int insert(Feefile record);

    int insertSelective(Feefile record);

    List<Feefile> selectByExample(FeefileExample example);

    Feefile selectByPrimaryKey(Integer filleid);

    int updateByExampleSelective(@Param("record") Feefile record, @Param("example") FeefileExample example);

    int updateByExample(@Param("record") Feefile record, @Param("example") FeefileExample example);

    int updateByPrimaryKeySelective(Feefile record);

    int updateByPrimaryKey(Feefile record);
}