package com.xue.test;

import com.xue.annotation.MyAutowired;
import com.xue.annotation.MyBeanFactory;
import com.xue.annotation.UserController;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * @author xuejh
 * @description 自定义注解启动测试
 * @create 2020-07-02 11:20
 **/
public class AnnotationTest {

    public static void main(String[] args) {
        UserController userController = (UserController) MyBeanFactory.getBean();

        System.out.println(userController.getUserService());
    }
}
