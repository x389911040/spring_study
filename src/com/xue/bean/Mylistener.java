package com.xue.bean;

import org.springframework.context.ApplicationListener;

/**
 * @author xuejh
 * @description 我的监听器
 * @create 2020-07-01 16:42
 **/
public class Mylistener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("-------Mylistener收到消息了：" + event.getMsg());
    }
}
