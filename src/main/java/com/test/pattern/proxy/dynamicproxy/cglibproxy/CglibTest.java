package com.test.pattern.proxy.dynamicproxy.cglibproxy;


/**
 * Created by zhangsan on 2021/5/11.
 */
public class CglibTest {
    public static void main(String[] args) {

        try {
            CglibProxy cglibProxy  = new CglibProxy();
            Customer instance = (Customer)cglibProxy.getInstance(Customer.class);
            instance.findJob();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
