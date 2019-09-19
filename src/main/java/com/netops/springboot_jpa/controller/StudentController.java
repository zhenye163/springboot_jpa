package com.netops.springboot_jpa.controller;

import com.netops.springboot_jpa.entity.Student;
import com.netops.springboot_jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/springboot_jpa")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //找出所有的学生
    @RequestMapping("/student/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    //找出所有姓 “surname”的学生
    @RequestMapping("/student/findByNameLike")
    public List<Student> findByNameLike(@RequestParam("surname") String surname){
        return studentService.findByNameLike( surname );
    }

    //动态查询:
    @RequestMapping("/student/findByCases")
    public List<Student> findByDynamicCases(){
        return studentService.findByDynamicCases();
    }
}
