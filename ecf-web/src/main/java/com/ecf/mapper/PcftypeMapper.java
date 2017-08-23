package com.ecf.mapper;

import com.ecf.pojo.Pcftype;
import com.ecf.pojo.PcftypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcftypeMapper {
    int countByExample(PcftypeExample example);

    int deleteByExample(PcftypeExample example);

    int deleteByPrimaryKey(Integer pcftypeid);

    int insert(Pcftype record);

    int insertSelective(Pcftype record);

    List<Pcftype> selectByExampleWithBLOBs(PcftypeExample example);

    List<Pcftype> selectByExample(PcftypeExample example);

    Pcftype selectByPrimaryKey(Integer pcftypeid);

    int updateByExampleSelective(@Param("record") Pcftype record, @Param("example") PcftypeExample example);

    int updateByExampleWithBLOBs(@Param("record") Pcftype record, @Param("example") PcftypeExample example);

    int updateByExample(@Param("record") Pcftype record, @Param("example") PcftypeExample example);

    int updateByPrimaryKeySelective(Pcftype record);

    int updateByPrimaryKeyWithBLOBs(Pcftype record);

    int updateByPrimaryKey(Pcftype record);
}