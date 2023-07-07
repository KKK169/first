package com.jia.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jia.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EmployeeServiceTestCase {
    @Autowired
    private EmployeeService employeeService;
    @Test
    void testGetById(){
        System.out.println(employeeService.getById(1));
    }
    @Test
    void setSave(){
        Employee employee = new Employee();
        employee.setName("孙悟空");
        employee.setGender("男");
        employee.setAge(16);
        employee.setTitle("中级");
        employee.setSalary(3000);
        employee.setIsPartyMember(1);
        employeeService.save(employee);
    }

    @Test
    void setUpdate(){
        Employee employee = new Employee();
        employee.setId(17);
        employee.setName("孙悟空123");
        employee.setGender("女");
        employee.setAge(25);
        employee.setTitle("中级");
        employee.setSalary(3000);
        employee.setIsPartyMember(1);
        employeeService.update(employee);
    }

    @Test
    void setDelete(){
        employeeService.delete(19);
    }

    @Test
    void setGetAll(){
        List<Employee> employees = employeeService.getAll();
        System.out.println(employees);
    }

    @Test
    void setGetPage(){

        IPage<Employee> page = employeeService.getPage(1, 5);
        System.out.println("当前页码："+page.getCurrent());
        System.out.println("每页数据数据"+page.getSize());
        System.out.println("总页数"+ page.getPages());
        System.out.println("数据总量"+page.getTotal());
        System.out.println("当前页数据"+page.getRecords());
    }


}
