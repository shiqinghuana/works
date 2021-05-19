package com.territory.workswebs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.territory")
@MapperScan("com.territory.worksdaos.mapper")
@EnableTransactionManagement
public class WorksWebsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorksWebsApplication.class, args);
	}

}
