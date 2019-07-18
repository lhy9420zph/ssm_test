package com.itheima.aspect;

import com.itheima.domain.Log;
import com.itheima.domain.User;
import com.itheima.service.LogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-15 15:34
 **/
@Component
@Aspect
public class LogAop {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private LogService logService;

    @Around("execution(* com.itheima.web.*.*(..))")
    public Object arround(ProceedingJoinPoint pjp) throws Throwable {
        //执行方法前的时间
        Date start = new Date();
        //执行方法
        Object proceed = pjp.proceed();
        //方法执行花费的时间
        long cost = new Date().getTime() - start.getTime();

//        获取要执行方法的类名
        String className = pjp.getTarget().getClass().getName();
        //获取执行方法的方法名
        String methodName = pjp.getSignature().getName();

        //获得登录的用户名
        HttpSession session = request.getSession();
        User username = (User) session.getAttribute("user");
        String user_name = "";
        if(username == null){
            user_name =  request.getParameter("username");
        }else{
            user_name = username.getUsername();
        }
        Log log = new Log();
        log.setName(user_name);
        log.setTime(start);
        log.setUrl("[类名]"+className+"[方法名]"+methodName);
        log.setCost(cost);
        logService.insert(log);

        return proceed;
    }
}
