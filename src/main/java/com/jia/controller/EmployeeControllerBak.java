package com.jia.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jia.domain.Employee;
import com.jia.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/Employees")
public class EmployeeControllerBak {
    //@Autowired
    private IEmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.list();
    }
    @PostMapping
    public boolean save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @PutMapping
    public boolean update(@RequestBody Employee employee){
        return employeeService.modify(employee);
    }
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){
        return employeeService.delete(id);
    }

    @GetMapping("{id}")
    public Employee getById(@PathVariable Integer id){
        return employeeService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Employee> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return employeeService.getPage(currentPage,pageSize);
    }

}
