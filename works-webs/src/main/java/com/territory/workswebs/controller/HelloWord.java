package com.territory.workswebs.controller;


import com.territory.worksdaos.entity.WorksUsers;
import com.territory.worksdaos.mapper.WorksUsersMapper;
import com.territory.worksservice.exception.BusinessException;
import com.territory.worksservice.exception.code.BaseResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @Autowired
    private WorksUsersMapper worksUsersMapper;

    @GetMapping("/hello")
    public WorksUsers helloword(){
        WorksUsers worksUsers = worksUsersMapper.selectByPrimaryKey(1);
        System.out.println(worksUsers);
        throw new BusinessException(BaseResponseCode.ACCOUNT_ERROR);
    }

}
