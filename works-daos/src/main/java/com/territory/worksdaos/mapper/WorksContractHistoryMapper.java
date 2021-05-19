package com.territory.worksdaos.mapper;

import com.territory.worksdaos.entity.WorksContractHistory;
import com.territory.worksdaos.entity.WorksContractHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorksContractHistoryMapper {
    long countByExample(WorksContractHistoryExample example);

    int deleteByExample(WorksContractHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorksContractHistory record);

    int insertSelective(WorksContractHistory record);

    List<WorksContractHistory> selectByExample(WorksContractHistoryExample example);

    WorksContractHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorksContractHistory record, @Param("example") WorksContractHistoryExample example);

    int updateByExample(@Param("record") WorksContractHistory record, @Param("example") WorksContractHistoryExample example);

    int updateByPrimaryKeySelective(WorksContractHistory record);

    int updateByPrimaryKey(WorksContractHistory record);
}