package com.test.pattern.proxy.simpleproxy;

/**
 * Created by zhangsan.
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
