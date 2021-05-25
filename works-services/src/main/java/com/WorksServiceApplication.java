package com;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.territory.worksdaos.mapper")
public class WorksServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorksServiceApplication.class, args);
    }
}
