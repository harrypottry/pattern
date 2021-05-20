package com.test.pattern.proxy.dynamicproxy.jdkproxy;

import com.test.pattern.proxy.Person;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class Customer implements Person {
    public void findJob() {
        System.out.println("proxy ...");
    }
}
