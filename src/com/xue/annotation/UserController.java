package com.xue.annotation;

/**
 * @author xuejh
 * @description 用户控制类
 * @create 2020-07-02 11:16
 **/
public class UserController {

    @MyAutowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
