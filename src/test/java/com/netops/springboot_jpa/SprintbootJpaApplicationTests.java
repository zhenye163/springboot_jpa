package com.netops.springboot_jpa;

import com.netops.springboot_jpa.common.DataSourceContextHolder;
import com.netops.springboot_jpa.common.DataSourceTypeEnum;
import com.netops.springboot_jpa.entity.Student;
import com.netops.springboot_jpa.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SprintbootJpaApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void contextLoads() {

        DataSourceContextHolder.setDataSourceType(DataSourceTypeEnum.primary);
		List<Student> pStudentList = studentRepository.findAll();
		System.out.println(pStudentList);

        DataSourceContextHolder.setDataSourceType(DataSourceTypeEnum.secondary);
        List<Student> sStudentList = studentRepository.findAll();
        System.out.println(sStudentList);
	}

}
