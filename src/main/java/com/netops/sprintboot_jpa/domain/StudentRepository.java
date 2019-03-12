package com.netops.sprintboot_jpa.domain;

import com.netops.sprintboot_jpa.entity.Student;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student>{

    List<Student> findByNameLike(String surname);
    List<Student> findAll(Specification<Student> mySpec);
}
