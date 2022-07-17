package com.ljl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cwj
 * @create 2022-05-30 11:04
 */
@MapperScan("com.ljl.mapper")
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003.class, args);
    }
}
