package com.ljl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author cwj
 * @create 2022-05-31 9:34
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    //在这里往注册中心发请求，进行消费。
    // spring官方提供了一个用于发restful请求的类。RestTemplate
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/list")
    @ResponseBody
    public List list() {

        //使用restTemplate发送请求
        return restTemplate.getForObject("http://CLOUD-DEPT/dept/list", List.class);
    }

}
