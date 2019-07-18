package com.itheima.service.impl;

import com.itheima.dao.LogDao;
import com.itheima.domain.Log;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-15 16:35
 **/
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;
    @Override
    public void insert(Log log) {
        logDao.insert(log);
    }
}
