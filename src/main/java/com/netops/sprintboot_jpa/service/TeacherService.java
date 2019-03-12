package com.netops.sprintboot_jpa.service;

import com.netops.sprintboot_jpa.domain.TeacherRepository;
import com.netops.sprintboot_jpa.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    public Teacher findOne(Integer id) {
        return teacherRepository.findOne(id);
    }
}
