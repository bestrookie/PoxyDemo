package com.bestrookie.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : bestrookie
 * @date : 15:46 2021/3/5
 */
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.bestrookie.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }
}
