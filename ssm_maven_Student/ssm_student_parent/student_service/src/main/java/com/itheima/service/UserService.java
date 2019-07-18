package com.itheima.service;

import com.itheima.domain.User;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-14 09:46
 **/
public interface UserService {
    User checkLogin(User user);
}
