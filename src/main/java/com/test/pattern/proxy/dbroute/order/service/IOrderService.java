package com.test.pattern.proxy.dbroute.order.service;

import com.test.pattern.proxy.dbroute.order.bean.Order;

/**
 * Created by zhangsan.
 */
public interface IOrderService {
    int createOrder(Order order);
}
