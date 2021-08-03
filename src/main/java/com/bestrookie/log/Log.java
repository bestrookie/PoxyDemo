package com.bestrookie.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author : bestrookie
 * @date : 12:16 2021/3/5
 */
public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] target, Object o) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被指醒了");
    }
}
