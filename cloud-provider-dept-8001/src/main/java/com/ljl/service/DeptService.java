package com.ljl.service;


import com.ljl.pojo.Dept;

import java.util.List;

/**
 * @author cwj
 * @create 2022-05-30 11:15
 */
public interface DeptService {

    int add(Dept dept);

    Dept get(Long id);

    List<Dept> list();

}
