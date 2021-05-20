package com.test.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhangsan on 2021/5/11.
 */
public class CglibProxy  {


    //public Object getInstance(Class<?> clazz) throws Exception{
    //    //相当于Proxy，代理的工具类
    //    Enhancer enhancer = new Enhancer();
    //    enhancer.setSuperclass(clazz);
    //    enhancer.setCallback(this);
    //    return enhancer.create();
    //}
    //
    //public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
    //    before();
    //    Object obj = methodProxy.invokeSuper(o,objects);
    //    after();
    //    return obj;
    //}

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}