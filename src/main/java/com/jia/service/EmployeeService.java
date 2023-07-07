package com.jia.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jia.domain.Employee;

import java.util.List;

public interface EmployeeService {
    boolean save(Employee employee);
    boolean update(Employee employee);
    boolean delete(Integer id);
    Employee getById(Integer id);
    List<Employee> getAll();
    IPage<Employee> getPage(int currentPage,int pageSize);
}
