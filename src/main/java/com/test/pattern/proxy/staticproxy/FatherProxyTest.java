package com.test.pattern.proxy.staticproxy;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class FatherProxyTest {

    public static void main(String[] args) {

        Father father = new Father(new Son());
        father.findLove();

        //农村，媒婆
        //婚介所

        //大家每天都在用的一种静态代理的形式
        //对数据库进行分库分表
        //ThreadLocal
        //进行数据源动态切换
    }

}