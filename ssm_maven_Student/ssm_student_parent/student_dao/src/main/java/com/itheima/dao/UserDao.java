package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-14 09:25
 **/
public interface UserDao {
    @Select("select * from t_user where username = #{username} and password = #{password}")
    User findByUsernamePassword(User user);
}
