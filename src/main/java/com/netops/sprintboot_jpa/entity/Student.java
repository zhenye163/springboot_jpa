package com.netops.sprintboot_jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Integer id;//主键自增
    private String name;//姓名
    private Integer age;//年龄
    private String sex;//性别
    private Integer classNo;//班级号
    private String phoneNum;//手机号码
    private String address;//住址
}
