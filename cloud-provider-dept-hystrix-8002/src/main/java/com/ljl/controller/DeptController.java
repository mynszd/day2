package com.ljl.controller;

import com.ljl.pojo.Dept;
import com.ljl.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwj
 * @create 2022-05-30 11:17
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping("/list")
    @HystrixCommand(fallbackMethod = "fallBack")  //出异常了执行哪个方法
    public List<Dept> list() {
        //return deptService.list();
        throw new RuntimeException();
    }

    //当出现异常的时候，返回预期结果
    public List<Dept> fallBack() {
        List<Dept> resultList = new ArrayList<>();
        resultList.add(new Dept("1出异常啦，我是预期结果"));
        return resultList;
    }


}
