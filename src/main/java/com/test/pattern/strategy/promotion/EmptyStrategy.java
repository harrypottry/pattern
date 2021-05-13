package com.test.pattern.strategy.promotion;
/**
 * 无优惠
 * Created by zhangsan
 */
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
