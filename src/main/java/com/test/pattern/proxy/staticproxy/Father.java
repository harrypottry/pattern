package com.test.pattern.proxy.staticproxy;

import com.test.pattern.proxy.Person;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class Father implements Person{
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findJob() {
        before();
        son.findJob();
        after();
    }

    private void before() {
        System.out.println("before...");
    }

    private void after() {
        System.out.println("after...");
    }
}
