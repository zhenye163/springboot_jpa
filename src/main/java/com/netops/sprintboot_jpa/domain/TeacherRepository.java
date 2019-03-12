package com.netops.sprintboot_jpa.domain;

import com.netops.sprintboot_jpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer>{
}
