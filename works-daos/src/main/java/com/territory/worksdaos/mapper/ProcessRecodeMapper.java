package com.territory.worksdaos.mapper;

import com.territory.worksdaos.entity.ProcessRecode;
import com.territory.worksdaos.entity.ProcessRecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessRecodeMapper {
    long countByExample(ProcessRecodeExample example);

    int deleteByExample(ProcessRecodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessRecode record);

    int insertSelective(ProcessRecode record);

    List<ProcessRecode> selectByExample(ProcessRecodeExample example);

    ProcessRecode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessRecode record, @Param("example") ProcessRecodeExample example);

    int updateByExample(@Param("record") ProcessRecode record, @Param("example") ProcessRecodeExample example);

    int updateByPrimaryKeySelective(ProcessRecode record);

    int updateByPrimaryKey(ProcessRecode record);
}