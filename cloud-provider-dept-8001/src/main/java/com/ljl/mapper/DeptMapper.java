package com.ljl.mapper;

import com.ljl.pojo.Dept;

import java.util.List;

/**
 * @author cwj
 * @create 2022-05-30 11:08
 */
public interface DeptMapper {

    //@Select("select * from Dept") 直接使用注解
    List<Dept> queryAll();

    Dept getById(Long deptno);

    int save(Dept dept);

}
