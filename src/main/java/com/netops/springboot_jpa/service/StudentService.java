package com.netops.springboot_jpa.service;

import com.netops.springboot_jpa.repository.StudentRepository;
import com.netops.springboot_jpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> findByNameLike(String surname) {
        return studentRepository.findByNameLike(surname + "%");//查询条件为 where name like surname%
    }

    /*
    先动态查询的条件：
        条件1:性别为 男;
        条件2:年龄在25-35之间；
        条件3：吴国人;
     */
    public List<Student> findByDynamicCases() {

        return studentRepository.findAll((root, query, cb) -> {
            Predicate predicate1,predicate2,predicate3;

            Path<String> sex = root.get("sex");
            Path<Integer> age = root.get("age");
            Path<String> address = root.get("address");

            predicate1 = cb.like(sex,"男");
            predicate2 = cb.between(age,25,35);
            predicate3 = cb.equal(address,"吴国");

            query.where(predicate1,predicate2,predicate3);
            return null;
        });
    }
}
