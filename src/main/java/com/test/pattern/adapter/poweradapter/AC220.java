package com.test.pattern.adapter.poweradapter;

/**
 * Created by zhangsan on 2021/5/16.
 */
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电流" + output + "V");
        return output;
    }
}
