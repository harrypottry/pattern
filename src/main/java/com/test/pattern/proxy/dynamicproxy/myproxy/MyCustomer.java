package com.test.pattern.proxy.dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class MyCustomer  {


    public Object getInstance(Object target){
        return MyProxy.newProxyInstance(new MyClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> method.invoke(target, args));
    }

    private void before() {
        System.out.println("before...");
    }

    private void after() {
        System.out.println("after...");
    }
}
