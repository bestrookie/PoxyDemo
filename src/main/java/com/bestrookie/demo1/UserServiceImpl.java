package com.bestrookie.demo1;

/**
 * @author : bestrookie
 * @date : 11:01 2021/3/5
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("执行了add方法");
    }

    @Override
    public void delete() {
        System.out.println("执行了delete方法");
    }
}
