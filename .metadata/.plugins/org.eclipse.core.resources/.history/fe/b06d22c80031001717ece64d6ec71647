package com.ecf.mapper;

import com.ecf.pojo.Pcategory;
import com.ecf.pojo.PcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcategoryMapper {
    int countByExample(PcategoryExample example);

    int deleteByExample(PcategoryExample example);

    int deleteByPrimaryKey(Integer pcategoryid);

    int insert(Pcategory record);

    int insertSelective(Pcategory record);

    List<Pcategory> selectByExample(PcategoryExample example);

    Pcategory selectByPrimaryKey(Integer pcategoryid);

    int updateByExampleSelective(@Param("record") Pcategory record, @Param("example") PcategoryExample example);

    int updateByExample(@Param("record") Pcategory record, @Param("example") PcategoryExample example);

    int updateByPrimaryKeySelective(Pcategory record);

    int updateByPrimaryKey(Pcategory record);
}