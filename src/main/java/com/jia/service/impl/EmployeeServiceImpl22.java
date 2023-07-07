package com.jia.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jia.dao.Emdao;
import com.jia.domain.Employee;
import com.jia.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl22 implements EmployeeService {
    @Autowired
    private Emdao emdao;

    @Override
    public boolean save(Employee employee) {
        return emdao.insert(employee) > 0 ;
    }

    @Override
    public boolean update(Employee employee) {
        return emdao.updateById(employee) > 0 ;
    }

    @Override
    public boolean delete(Integer id) {
        return emdao.deleteById(id) > 0 ;
    }

    @Override
    public Employee getById(Integer id) {
        return emdao.selectById(id);
    }

    @Override
    public List<Employee> getAll() {
        return emdao.selectList(null);
    }

    @Override
    public IPage<Employee> getPage(int currentPage, int pageSize) {
        IPage<Employee> page = new Page<>(currentPage,pageSize);
        return emdao.selectPage(page, null);
    }
}
