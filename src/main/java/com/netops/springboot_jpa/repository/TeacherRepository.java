package com.netops.springboot_jpa.repository;

import com.netops.springboot_jpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer>{
}
