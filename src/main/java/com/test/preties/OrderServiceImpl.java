package com.test.preties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author: heluwei
 * @Date: 2020/4/22 18:02
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    HandlerLabelContext handlerOrderContext;
    @Override
    public void handleOrder(Integer type) {
        //使用策略处理订单
        OrderStrategy orderStrategy = handlerOrderContext.getOrderStrategy(type);
        orderStrategy.handleOrder(type);
    }
}
