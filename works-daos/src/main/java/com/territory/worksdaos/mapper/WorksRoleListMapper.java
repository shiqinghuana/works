package com.territory.worksdaos.mapper;

import com.territory.worksdaos.entity.WorksRoleList;
import com.territory.worksdaos.entity.WorksRoleListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorksRoleListMapper {
    long countByExample(WorksRoleListExample example);

    int deleteByExample(WorksRoleListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorksRoleList record);

    int insertSelective(WorksRoleList record);

    List<WorksRoleList> selectByExample(WorksRoleListExample example);

    WorksRoleList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorksRoleList record, @Param("example") WorksRoleListExample example);

    int updateByExample(@Param("record") WorksRoleList record, @Param("example") WorksRoleListExample example);

    int updateByPrimaryKeySelective(WorksRoleList record);

    int updateByPrimaryKey(WorksRoleList record);
}