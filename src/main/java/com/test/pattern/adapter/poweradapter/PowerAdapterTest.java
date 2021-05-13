package com.test.pattern.adapter.poweradapter;

/**
 * Created by zhangsan on 2021/5/16.
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outoupDC5V();
    }
}
