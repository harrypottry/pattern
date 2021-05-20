package com.test.pattern.proxy.dynamicproxy.jdkproxy;


import java.lang.reflect.Proxy;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class JDKProxy {

    public Object getInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> method.invoke(target, args));
    }

    private void before(){
        System.out.println("before ...");
    }

    private void after(){
        System.out.println("after ...");
    }
}
