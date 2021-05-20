package com.test.pattern.prototype.deep;


public class DeepCloneTest {

    public static void main(String[] args) {

        Person person = new Person();
        try {
            Person clone = (Person) person.clone();
            System.out.println("深克隆：" + (person.position == clone.position));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person q = new Person();
        Person n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.position == n.position));
        System.out.println(q == n);

        //源码案例： clone
//        ArrayList arrayList = new ArrayList();
    }
}
