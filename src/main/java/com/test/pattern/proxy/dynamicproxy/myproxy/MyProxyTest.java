package com.test.pattern.proxy.dynamicproxy.myproxy;

import com.test.pattern.proxy.Person;
import com.test.pattern.proxy.dynamicproxy.jdkproxy.Girl;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class MyProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new MyCustomer().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
