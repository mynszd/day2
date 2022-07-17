package com.ljl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author cwj
 * @create 2022-06-01 10:35
 */
@SpringBootApplication
@EnableHystrixDashboard  //启动监控仪表盘
public class HystrixDashboard9001App {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001App.class, args);
    }
}
