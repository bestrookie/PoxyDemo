package com.bestrookie.demo1;

/**
 * @author : bestrookie
 * @date : 11:03 2021/3/5
 */
public class PoxyUser implements UserService {
    private UserServiceImpl user;

    public void setUser(UserServiceImpl user) {
        this.user = user;
    }

    @Override
    public void add() {
        user.add();
    }

    @Override
    public void delete() {
        user.delete();
    }
}
