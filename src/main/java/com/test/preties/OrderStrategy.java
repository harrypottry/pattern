package com.test.preties;

/**
 * <p>
 *      定义else的策略接口
 * </p>
 *
 * @author: heluwei
 * @Date: 2020/4/22 17:54
 */
public interface OrderStrategy {
    void handleOrder(Integer type);
}