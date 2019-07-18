package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-14 09:47
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User checkLogin(User user) {
       return userDao.findByUsernamePassword(user);
    }
}
