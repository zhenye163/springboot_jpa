package com.netops.springboot_jpa.entity;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;//主键
    private String name;//姓名
    private Integer age;//年龄
    private String sex;//性别
    private String subject;//所授学科名称
    private Integer classNo;//授课班级---注：一个老师可能同时在多个班级授课
    private String phoneNum;//手机号
    private String address;//地址

}
