package com.xue.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;

/**
 * @author xuejh
 * @description 我的Bean工厂后处理
 * @create 2020-07-01 15:31
 **/
public class MyBeanFactory implements BeanFactoryPostProcessor {

    @Bean
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();

        while (beanNamesIterator.hasNext()) {
            String beanName = beanNamesIterator.next();
            System.out.println(beanName);
        }

        System.out.println("------");

//        Person person = (Person) beanFactory.getBean("person");

//        if (person == null) {
//            return;
//        }
//
//        person.setName("lisi");

    }
}
