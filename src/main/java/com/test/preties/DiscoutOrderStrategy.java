package com.test.preties;


import org.springframework.stereotype.Component;

/**
 * <p>
 *      实现策略接口
 * </p>
 *
 * @author: heluwei
 * @Date: 2020/4/22 17:55
 */
@Component
@HandlerLabelType(LabelType.DISCOUT)
public class DiscoutOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(Integer order) {
        System.out.println("----处理打折订单----");
    }
}
