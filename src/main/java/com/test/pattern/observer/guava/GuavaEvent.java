package com.test.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * Created by zhangsan on 2021/5/17.
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }

}
