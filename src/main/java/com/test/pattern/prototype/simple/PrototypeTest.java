package com.test.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangsan.
 * 浅拷贝
 */
public class PrototypeTest {

    public static void main(String[] args) {

        // 创建一个具体的需要克隆的对象
        ConcretePrototype concretePrototype = new ConcretePrototype();
        // 填充属性，方便测试
        concretePrototype.setAge(18);
        System.out.println(concretePrototype);

        // 创建Client对象，准备开始克隆
        Client client = new Client();
        ConcretePrototype concretePrototypeClone = (ConcretePrototype) client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);

        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getAge());
        System.out.println("原对象中的引用类型地址值：" + concretePrototype.getAge());
        System.out.println("对象地址比较："+(concretePrototypeClone.getAge() == concretePrototype.getAge()));


    }
}
