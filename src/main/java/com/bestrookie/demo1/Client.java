package com.bestrookie.demo1;

/**
 * @author : bestrookie
 * @date : 11:05 2021/3/5
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
//        PoxyUser poxyUser = new PoxyUser();
//        poxyUser.setUser(userService);
//        poxyUser.add();
        UserPoxy userPoxy = new UserPoxy();
        userPoxy.setObject(userService);
        UserService poxy = (UserService) userPoxy.getPoxy();
        poxy.add();
    }
}
