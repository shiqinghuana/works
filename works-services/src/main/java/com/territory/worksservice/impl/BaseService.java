package com.territory.worksservice.impl;

import java.util.Arrays;

public abstract class BaseService {

    public String handleErrMessage(String className,String methedName,String msg,String ...args){

        return "类：" +className + "方法："+methedName+"出现异常，异常信息:"+msg+"备注信息："+ Arrays.toString(args);
    }

}
