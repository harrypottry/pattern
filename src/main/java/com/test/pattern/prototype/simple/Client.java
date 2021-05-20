package com.test.pattern.prototype.simple;

/**
 * Created by zhangsan.
 */
public class Client {

    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }

}
