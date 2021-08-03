package com.bestrookie.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : bestrookie
 * @date : 11:06 2021/3/5
 */
public class UserPoxy implements InvocationHandler {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getPoxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
