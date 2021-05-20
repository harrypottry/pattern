package com.test.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangsan.
 * ǳ����
 */
public class PrototypeTest {

    public static void main(String[] args) {

        // ����һ���������Ҫ��¡�Ķ���
        ConcretePrototype concretePrototype = new ConcretePrototype();
        // ������ԣ��������
        concretePrototype.setAge(18);
        System.out.println(concretePrototype);

        // ����Client����׼����ʼ��¡
        Client client = new Client();
        ConcretePrototype concretePrototypeClone = (ConcretePrototype) client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);

        System.out.println("��¡�����е��������͵�ֵַ��" + concretePrototypeClone.getAge());
        System.out.println("ԭ�����е��������͵�ֵַ��" + concretePrototype.getAge());
        System.out.println("�����ַ�Ƚϣ�"+(concretePrototypeClone.getAge() == concretePrototype.getAge()));


    }
}
