package com.test.pattern.proxy.dbroute;

import com.test.pattern.proxy.dbroute.order.service.IOrderService;
import com.test.pattern.proxy.dbroute.order.bean.Order;
import com.test.pattern.proxy.dbroute.order.service.impl.OrderServiceImpl;
import com.test.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            // 静态代理测试:
            Order order = new Order();
            order.setCreateTime(new SimpleDateFormat("yyyy/MM/dd").parse("2021/05/14").getTime());
            IOrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());
            orderService.createOrder(order);
            // jdk动态代理测试：
//            IOrderService  orderService= (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
//            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
