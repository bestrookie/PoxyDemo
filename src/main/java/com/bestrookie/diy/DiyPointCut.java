package com.bestrookie.diy;

/**
 * @author : bestrookie
 * @date : 15:30 2021/3/5
 */
public class DiyPointCut {
    public void before() {
        System.out.println("方法执行前");
    }

    public void after() {
        System.out.println("方法执行后");
    }
}
