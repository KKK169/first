package com.jia.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jia.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Emdao extends BaseMapper<Employee> {

}
