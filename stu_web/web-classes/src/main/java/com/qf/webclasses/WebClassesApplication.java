package com.qf.webclasses;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@MapperScan(basePackages = "com.qf.dao")
public class WebClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClassesApplication.class, args);
    }

}
