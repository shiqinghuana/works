package com.territory.workswebs;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
// @ComponentScan("com.territory")

// @EnableTransactionManagement
public class WorksWebsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorksWebsApplication.class, args);
	}

}
