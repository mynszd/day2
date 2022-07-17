package com.ljl.controller;

import com.ljl.pojo.Dept;
import com.ljl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Dept> list() {
        return deptService.list();
    }


}
