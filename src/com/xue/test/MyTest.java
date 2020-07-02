package com.xue.test;

import com.xue.annotation.UserService;
import com.xue.bean.MyEvent;
import com.xue.bean.MyPublisher;
import com.xue.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//容器中的person对象是什么时候创建的？
//容器中的对象在容器创建完成之前就已经把对象创建好了
public class MyTest {
    public static void main(String[] args) throws Exception {
        /*
        * applicationContext:表示IOC容器的入口，想要获取对象的话，必须要创建该类
        *   该类有两个读取配置文件的实现类
        *       ClassPathXmlApplicationContext:表示从classpath中读取数据
        *       FileSystemXmlApplicationContext:表示从当前文件系统读取数据
        *
        *
        * * */
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        //获取具体的bean实例对象，需要进行强制类型转换
//        UserService userService = (UserService) context.getBean("userService");
        // 获取对象的时候不需要强制类型转换
//        UserService userService = context.getBean("userService", UserService.class);
//        System.out.println(userService);
        MyPublisher myPublisher = (MyPublisher)context.getBean("myPublisher");

        AtomicInteger loop = new AtomicInteger(1);
        while (loop.get() < 10) {
            myPublisher.publisherEvent(new MyEvent(1, "你好，小薛__" + loop.getAndIncrement()));
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
