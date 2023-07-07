package com.jia.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jia.domain.Employee;

public interface IEmployeeService extends IService<Employee> {
    boolean saveEmployee(Employee employee);
    boolean modify(Employee employee);
    boolean delete(Integer id);

    IPage<Employee> getPage(int currentPage,int pageSize);
}
