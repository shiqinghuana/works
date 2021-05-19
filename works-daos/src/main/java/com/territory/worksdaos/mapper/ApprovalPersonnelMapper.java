package com.territory.worksdaos.mapper;

import com.territory.worksdaos.entity.ApprovalPersonnel;
import com.territory.worksdaos.entity.ApprovalPersonnelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalPersonnelMapper {
    long countByExample(ApprovalPersonnelExample example);

    int deleteByExample(ApprovalPersonnelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApprovalPersonnel record);

    int insertSelective(ApprovalPersonnel record);

    List<ApprovalPersonnel> selectByExample(ApprovalPersonnelExample example);

    ApprovalPersonnel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApprovalPersonnel record, @Param("example") ApprovalPersonnelExample example);

    int updateByExample(@Param("record") ApprovalPersonnel record, @Param("example") ApprovalPersonnelExample example);

    int updateByPrimaryKeySelective(ApprovalPersonnel record);

    int updateByPrimaryKey(ApprovalPersonnel record);
}