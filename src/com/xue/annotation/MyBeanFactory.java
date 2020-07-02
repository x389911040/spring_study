package com.xue.annotation;

import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * @author xuejh
 * @description 我的Bean工厂
 * @create 2020-07-02 11:46
 **/
public class MyBeanFactory {

    public static Object getBean() {
        UserController userController = new UserController();

        // 获取Class文件
        Class<? extends UserController> userControllerClass = userController.getClass();
        // 获取属性
        Field[] declaredFields = userControllerClass.getDeclaredFields();
        // 遍历属性，获取注解
        if (declaredFields != null && declaredFields.length > 0) {
            Stream.of(declaredFields).forEach(field -> {
                // 获取指定注解信息
                MyAutowired myAutowired = field.getDeclaredAnnotation(MyAutowired.class);
                if (myAutowired != null) {
                    // 说明此属性被指定注解标识，实现自动注入
                    field.setAccessible(true);
                    // 获取属性Class
                    Class<?> type = field.getType();
                    try {
                        // 获取对象
                        Object o = type.newInstance();
                        // 设置注入
                        field.set(userController, o);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        return userController;
    }
}
