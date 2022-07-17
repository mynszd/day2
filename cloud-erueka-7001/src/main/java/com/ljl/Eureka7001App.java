package com.ljl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cwj
 * @create 2022-05-30 11:39
 */
@SpringBootApplication
@EnableEurekaServer  //表明这是Eureka服务端
public class Eureka7001App {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7001App.class, args);
    }
}
