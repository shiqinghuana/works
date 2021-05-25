package com.territory.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Expiration {


    public static Date getExpiration() throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2099-12-31 24:59:59");
    }
}
