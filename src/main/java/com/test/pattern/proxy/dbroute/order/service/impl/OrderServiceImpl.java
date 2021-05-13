package com.test.pattern.proxy.dbroute.order.service.impl;

import com.test.pattern.proxy.dbroute.order.bean.Order;
import com.test.pattern.proxy.dbroute.order.dao.OrderDao;
import com.test.pattern.proxy.dbroute.order.service.IOrderService;

/**
 * Created by zhangsan.
 */
public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl(){
        //如果使用Spring应该是自动注入的
        //我们为了使用方便，在构造方法中将orderDao直接初始化了
        orderDao = new OrderDao();
    }

    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
