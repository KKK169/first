package com.jia.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "employee")
public class Employee {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String title;
    private Integer salary;
    //@TableField(value = "isPartyMember")
    private Integer isPartyMember;

}
