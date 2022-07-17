package com.ljl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Erueka7002App {

    public static void main(String[] args) {
        SpringApplication.run(Erueka7002App.class, args);
    }
}
