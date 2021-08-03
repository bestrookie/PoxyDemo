package com.bestrookie.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author : bestrookie
 * @date : 12:40 2021/3/5
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object resultValue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了" + method.getName() + "返回结果为" + resultValue);
    }
}
