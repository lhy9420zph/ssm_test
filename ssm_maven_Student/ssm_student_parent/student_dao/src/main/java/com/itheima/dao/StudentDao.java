package com.itheima.dao;

import com.itheima.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-13 17:46
 **/
public interface StudentDao {
    /**
     * 添加学生信息
     * @param student
     */
    @Insert("insert into t_student values(null,#{name},#{sex},#{age},#{address})")
    void addStudent(Student student);


    /**
     * 删除学生信息
     * @param id
     */
    @Delete("delete from t_student where id=#{id}")
    void delStudentById(Integer id);

    /**
     * 修改学生信息
     * @param student
     */
    @Update("update t_student set name=#{name},sex=#{sex},age=#{age},address=#{address} where id=#{id}")
    void updateStudent(Student student);


    /**
     * 查询所有学生信息
     * @return
     */
    @Select("select * from t_student")
    List<Student> findAll();

    @Select("select * from t_student where id=#{id}")
    Student findById(Integer id);
}
