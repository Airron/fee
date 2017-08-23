package com.feecreate.mapper;

import com.feecreate.pojo.Feediagnosescount;
import com.feecreate.pojo.FeediagnosescountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeediagnosescountMapper {
    int countByExample(FeediagnosescountExample example);

    int deleteByExample(FeediagnosescountExample example);

    int deleteByPrimaryKey(Integer diagnosesid);

    int insert(Feediagnosescount record);

    int insertSelective(Feediagnosescount record);

    List<Feediagnosescount> selectByExample(FeediagnosescountExample example);

    Feediagnosescount selectByPrimaryKey(Integer diagnosesid);

    int updateByExampleSelective(@Param("record") Feediagnosescount record, @Param("example") FeediagnosescountExample example);

    int updateByExample(@Param("record") Feediagnosescount record, @Param("example") FeediagnosescountExample example);

    int updateByPrimaryKeySelective(Feediagnosescount record);

    int updateByPrimaryKey(Feediagnosescount record);
}