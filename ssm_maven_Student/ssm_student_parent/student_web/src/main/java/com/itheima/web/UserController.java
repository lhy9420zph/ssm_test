package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-14 10:37
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String checkLogin(User user, HttpSession session, Model model){
        User login = userService.checkLogin(user);
        if(login != null){
            session.setAttribute("user",login);
            return "/student/find";
        }else{
            String msg = "用户名或密码错误";
            model.addAttribute("msg",msg);
         return "/login.jsp";
        }
    }
}
