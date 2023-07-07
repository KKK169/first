package com.jia.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jia.controller.utils.Code;
import com.jia.controller.utils.Result;
import com.jia.domain.Employee;
import com.jia.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping
    public Result getAll(){
        List<Employee> list = employeeService.list();
        Integer code = list!=null ? Code.SAVE_OK:Code.SAVE_ERR;
        return new Result(list,code);
    }
    @PostMapping
    public Result save(@RequestBody Employee employee){
        boolean save = employeeService.save(employee);
        Integer code = save ? Code.SAVE_OK:Code.SAVE_ERR;
        return new Result(save,code);
    }
    @PutMapping
    public Result update(@RequestBody Employee employee){
        boolean modify = employeeService.modify(employee);
        Integer code = modify ? Code.UPDATE_OK:Code.UPDATE_ERR;
        return new Result(modify,code);
    }
    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        boolean delete = employeeService.delete(id);
        Integer code = delete ? Code.DELETE_OK:Code.DELETE_ERR;
        return new Result(delete,code);
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        Employee employee = employeeService.getById(id);
        Integer code = employee != null ? Code.GET_OK:Code.GET_ERR;
        String msg = employee != null ? "":"数据查询失败，请重试!";
        return new Result(employee,code,msg);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        IPage<Employee> page = employeeService.getPage(currentPage, pageSize);
        Integer code = page != null ? Code.GET_OK:Code.GET_ERR;
        String msg = page != null ? "":"数据查询失败，请重试!";
        return new Result(page,code,msg);
    }

}
