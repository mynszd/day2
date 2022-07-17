package com.ljl.cotroller;

import com.ljl.pojo.Dept;
import com.ljl.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/dept")
public class feignCotroller {

    @Autowired
    FeignService feignService;

    @RequestMapping("/list")
    public List<Dept> list() {
        return feignService.list();
    }
}
