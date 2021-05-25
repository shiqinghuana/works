package com.territory.worksdaos.mapper;

import com.territory.client.entity.WorksPermissionsList;
import com.territory.client.entity.WorksPermissionsListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorksPermissionsListMapper {
    long countByExample(WorksPermissionsListExample example);

    int deleteByExample(WorksPermissionsListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorksPermissionsList record);

    int insertSelective(WorksPermissionsList record);

    List<WorksPermissionsList> selectByExample(WorksPermissionsListExample example);

    WorksPermissionsList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorksPermissionsList record, @Param("example") WorksPermissionsListExample example);

    int updateByExample(@Param("record") WorksPermissionsList record, @Param("example") WorksPermissionsListExample example);

    int updateByPrimaryKeySelective(WorksPermissionsList record);

    int updateByPrimaryKey(WorksPermissionsList record);
}