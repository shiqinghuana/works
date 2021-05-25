package com.territory.worksdaos.mapper;

import com.territory.client.entity.WorksContract;
import com.territory.client.entity.WorksContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorksContractMapper {
    long countByExample(WorksContractExample example);

    int deleteByExample(WorksContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorksContract record);

    int insertSelective(WorksContract record);

    List<WorksContract> selectByExample(WorksContractExample example);

    WorksContract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorksContract record, @Param("example") WorksContractExample example);

    int updateByExample(@Param("record") WorksContract record, @Param("example") WorksContractExample example);

    int updateByPrimaryKeySelective(WorksContract record);

    int updateByPrimaryKey(WorksContract record);
}