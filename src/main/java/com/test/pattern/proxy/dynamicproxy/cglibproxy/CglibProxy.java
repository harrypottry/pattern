package com.test.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhangsan on 2021/5/11.
 */
public class CglibProxy  {

    public Object getInstance (Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            before();
            Object o = proxy.invokeSuper(obj, args);
            after();
            return o;
        });
        return enhancer.create();
    }

    private void before(){
        System.out.println("before ...");
    }

    private void after(){
        System.out.println("after ...");
    }
}
