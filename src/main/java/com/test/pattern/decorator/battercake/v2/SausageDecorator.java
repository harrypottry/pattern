package com.test.pattern.decorator.battercake.v2;

/**
 * Created by zhangsan on 2021/5/17.
 */
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
