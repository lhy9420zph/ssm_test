package com.itheima.web;


import com.github.pagehelper.PageInfo;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-13 20:55
 **/
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/add")
    public ModelAndView addStudent(Student student,ModelAndView modelAndView){
        studentService.addStudent(student);
        modelAndView.setViewName("/student/find");
        return modelAndView;
    }
    @RequestMapping("/find")
    public String finStudentById(Model model,Integer pageNum,Integer pageSize){
        if(pageNum ==null || pageNum==0){
            pageNum=1;
        }
        if(pageSize ==null || pageSize==0){
            pageSize=2;
        }
        PageInfo<Student> studentPageInfo = studentService.findAll(pageNum,pageSize);
        model.addAttribute("pageInfo",studentPageInfo);
        return "/list.jsp";
    }
    @RequestMapping("/delete")
    public String delStudentById(Integer id){
        studentService.delStudentById(id);
        return "redirect:/student/find";
    }

    /**
     * 批量删除学生信息
     * @param ids
     * @return
     */
    @RequestMapping("/delByIds")
    public String delStudentById(Integer[] ids){
        studentService.delByIds(ids);
        return "redirect:/student/find";
    }
    @RequestMapping("/update")
    public String update(Student student){
        studentService.updateStudent(student);
        return "redirect:/student/find";
    }
    @RequestMapping("/updateBefore")
    public String updateBefore(Integer id,Model model){
        Student student = studentService.findById(id);
        model.addAttribute("student",student);
        return "/update.jsp";
    }
}
