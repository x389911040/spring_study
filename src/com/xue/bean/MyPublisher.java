package com.xue.bean;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author xuejh
 * @description 我的广播器
 * @create 2020-07-01 16:57
 **/
public class MyPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publisherEvent(MyEvent event) {
        publisher.publishEvent(event);
    }
}
