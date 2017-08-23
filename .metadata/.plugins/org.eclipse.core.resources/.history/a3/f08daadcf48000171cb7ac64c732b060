package com.feecreate.mapper;

import com.feecreate.pojo.Feehospital;
import com.feecreate.pojo.FeehospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeehospitalMapper {
    int countByExample(FeehospitalExample example);

    int deleteByExample(FeehospitalExample example);

    int deleteByPrimaryKey(Integer hospitalid);

    int insert(Feehospital record);

    int insertSelective(Feehospital record);

    List<Feehospital> selectByExample(FeehospitalExample example);

    Feehospital selectByPrimaryKey(Integer hospitalid);

    int updateByExampleSelective(@Param("record") Feehospital record, @Param("example") FeehospitalExample example);

    int updateByExample(@Param("record") Feehospital record, @Param("example") FeehospitalExample example);

    int updateByPrimaryKeySelective(Feehospital record);

    int updateByPrimaryKey(Feehospital record);
}