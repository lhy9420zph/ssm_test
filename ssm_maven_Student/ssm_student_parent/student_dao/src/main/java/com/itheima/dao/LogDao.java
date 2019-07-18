package com.itheima.dao;

import com.itheima.domain.Log;
import org.apache.ibatis.annotations.Insert;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-15 16:28
 **/
public interface LogDao {
    @Insert("insert into t_log (name,time,url,cost) values(#{name},#{time},#{url},#{cost})")
    void insert(Log log);
}
