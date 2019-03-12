package com.netops.sprintboot_jpa.controller;

import com.netops.sprintboot_jpa.entity.Teacher;
import com.netops.sprintboot_jpa.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/springboot_jpa")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    //查看所有的老师
    @RequestMapping("/teacher/findAll")
    public List<Teacher> findAll(){
        return teacherService.findAll();
    }

    //根据id查找对应的老师
    @RequestMapping("/teacher/findOne/{id}")
    public Teacher findOne(@PathVariable(value = "id")Integer id){
        return teacherService.findOne(id);
    }

}
