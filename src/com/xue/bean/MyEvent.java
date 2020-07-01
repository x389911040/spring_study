package com.xue.bean;

import org.springframework.context.ApplicationEvent;

/**
 * @author xuejh
 * @description 我的自定义事件
 * @create 2020-07-01 16:50
 **/
public class MyEvent extends ApplicationEvent {

    // 消息
    private String msg;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
