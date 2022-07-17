package com.ljl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "CLOUD-DEPT", fallback = HystrixServiceImpl.class)
public interface FeignService {

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List list();
}
