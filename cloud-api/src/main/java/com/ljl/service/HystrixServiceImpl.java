package com.ljl.service;

import com.ljl.pojo.Dept;

import java.util.ArrayList;
import java.util.List;

public class HystrixServiceImpl implements FeignService {


    @Override
    public List list() {
        List<Dept> resultList = new ArrayList<>();
        resultList.add(new Dept("出异常啦，我是feign预期结果"));
        return resultList;
    }
}
