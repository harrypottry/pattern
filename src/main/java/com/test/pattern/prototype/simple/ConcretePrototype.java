package com.test.pattern.prototype.simple;

import java.util.List;

/**
 * Created by zhangsan.
 */
public class ConcretePrototype implements Prototype {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        return concretePrototype;
    }

}
