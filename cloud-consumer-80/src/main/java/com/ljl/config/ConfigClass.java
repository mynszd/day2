package com.ljl.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author cwj
 * @create 2022-05-31 9:37
 */
@Configuration   //表明这是配置类。类似于之前的xml
public class ConfigClass {

    @Bean
    @LoadBalanced    //@LoadBalanced开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
