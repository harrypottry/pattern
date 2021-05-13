package com.test.pattern.decorator.battercake.v2;

/**
 * Created by zhangsan on 2021/5/17.
 */
public class BaseBattercake extends Battercake {
    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}
