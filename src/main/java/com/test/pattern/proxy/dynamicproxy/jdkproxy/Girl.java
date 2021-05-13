package com.test.pattern.proxy.dynamicproxy.jdkproxy;

import com.test.pattern.proxy.Person;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class Girl implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
