package com.test.pattern.strategy.pay.payport;

/**
 * Created by zhangsan.
 */
public class WechatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 256;
    }

}
