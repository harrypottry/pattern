package com.test.pattern.proxy.dbroute.order.dao;

import com.test.pattern.proxy.dbroute.order.bean.Order;

/**
 * Created by zhangsan.
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
