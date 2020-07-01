package com.xue.bean;

import org.springframework.context.ApplicationListener;

/**
 * @author xuejh
 * @description 测试类A
 * @create 2020-07-01 9:17
 **/
public class A implements ApplicationListener<MyEvent> {

    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("-------A收到消息了----" + event.getMsg());
    }
}
