package com.ljl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cwj
 * @create 2022-05-30 11:04
 */
@MapperScan("com.ljl.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  //启用断路器
public class DeptProvider8002 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002.class, args);
    }
}
