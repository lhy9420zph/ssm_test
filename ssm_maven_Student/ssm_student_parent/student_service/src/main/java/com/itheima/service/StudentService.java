package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Student;

import java.util.List;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-13 20:39
 **/
public interface StudentService {
    /**
     * 添加学生信息
     * @param student
     */
    void addStudent(Student student);

    /**
     * 删除学生信息
     * @param id
     */
    void delStudentById(Integer id);

    /**
     * 查询所有学生信息
     * @return
     */
    PageInfo<Student> findAll(Integer pageNum,Integer pageSize);

    /**
     * 批量删除学生信息
     * @param ids
     */
    void delByIds(Integer[] ids);
    /**
     * 修改学生信息
     * @param student
     */
    void updateStudent(Student student);

    Student findById(Integer id);
}
