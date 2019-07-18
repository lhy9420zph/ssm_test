package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-13 20:41
 **/
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    /**
     * 添加
     * @param student
     */
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void delStudentById(Integer id) {
        studentDao.delStudentById(id);
    }

    /**
     * 查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Student> findAll(Integer pageNum,Integer pageSize) {
        //设置分页参数
        PageHelper.startPage(pageNum,pageSize);
        List<Student> students = studentDao.findAll();
        PageInfo<Student> studentPageInfo = new PageInfo<Student>(students);
        return studentPageInfo;
    }

    @Override
    public void delByIds(Integer[] ids) {
        for (Integer id : ids) {
            studentDao.delStudentById(id);
        }
    }

    @Override
    public void updateStudent(Student student) {
        //修改学生信息
        studentDao.updateStudent(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentDao.findById(id);
    }
}
