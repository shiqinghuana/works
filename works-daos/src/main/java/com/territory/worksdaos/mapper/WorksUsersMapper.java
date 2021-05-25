package com.territory.worksdaos.mapper;

import com.territory.client.entity.WorksUsers;
import com.territory.client.entity.WorksUsersExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface WorksUsersMapper {
    long countByExample(WorksUsersExample example);

    int deleteByExample(WorksUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorksUsers record);

    int insertSelective(WorksUsers record);

    List<WorksUsers> selectByExample(WorksUsersExample example);

    WorksUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorksUsers record, @Param("example") WorksUsersExample example);

    int updateByExample(@Param("record") WorksUsers record, @Param("example") WorksUsersExample example);

    int updateByPrimaryKeySelective(WorksUsers record);

    int updateByPrimaryKey(WorksUsers record);
}