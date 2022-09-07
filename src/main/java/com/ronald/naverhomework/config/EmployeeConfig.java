package com.ronald.naverhomework.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
@Slf4j
public class EmployeeConfig {

    @Before("execution(* com.ronald.naverhomework.service.impl.EmployeeServiceImpl.getEmployeeDto(..))")
    public void beforeGetEmployeeDto(JoinPoint joinPoint) {
      log.warn("before employeeDto method");
    }

    @After("execution(* com.ronald.naverhomework.service.impl.EmployeeServiceImpl.getEmployeeDto(..))")
    public void afterGetEmployeeDto(JoinPoint joinPoint) {
        log.warn("After employeeDto method");
    }

    @AfterThrowing("execution(* com.ronald.naverhomework.service.impl.EmployeeServiceImpl.getEmployeeDto(..))")
    public void afterThrowingGetEmployeeDto(JoinPoint joinPoint) {
        log.warn("after throwing employeeDto method!!");
    }

}
