package com.test.pattern.proxy.dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * Created by zhangsan on 2021/5/10.
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
