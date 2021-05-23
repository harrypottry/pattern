package com.test.preties;

import java.lang.annotation.*;

/**
 * <p>
 *     自定义策略注解
 * </p>
 *
 * @author: heluwei
 * @Date: 2020/4/22 17:52
 */
@Target(ElementType.TYPE)  //作用在类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited  //子类可以继承此注解
@interface HandlerLabelType {


    /**
     * 策略类型
     */
    int value();
}
