package com.jia.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jia.dao.Emdao;
import com.jia.domain.Employee;
import com.jia.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<Emdao, Employee> implements IEmployeeService {
    @Autowired
    private Emdao emdao;

    @Override
    public boolean saveEmployee(Employee employee) {
        return emdao.insert(employee) > 0;
    }

    @Override
    public boolean modify(Employee employee) {
        return emdao.updateById(employee) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return emdao.deleteById(id) > 0;
    }

    @Override
    public IPage<Employee> getPage(int currentPage, int pageSize) {
        IPage<Employee> page = new Page<>(currentPage,pageSize);
        return emdao.selectPage(page, null);
    }
}
