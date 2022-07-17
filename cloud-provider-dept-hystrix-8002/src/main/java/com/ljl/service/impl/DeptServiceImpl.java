package com.ljl.service.impl;

import com.ljl.mapper.DeptMapper;
import com.ljl.pojo.Dept;
import com.ljl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cwj
 * @create 2022-05-30 11:16
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public int add(Dept dept) {
        return deptMapper.save(dept);
    }

    @Override
    public Dept get(Long id) {

        return deptMapper.getById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.queryAll();
    }
}
