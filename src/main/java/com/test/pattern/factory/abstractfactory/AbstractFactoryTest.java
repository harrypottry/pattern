package com.test.pattern.factory.abstractfactory;

import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * Created by zhangsan.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

        //源码实现
        AbstractBeanFactory abstractBeanFactory = new DefaultListableBeanFactory();

        // option + command + b  :查看实现类

    }

}
