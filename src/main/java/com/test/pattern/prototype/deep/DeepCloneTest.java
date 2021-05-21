package com.test.pattern.prototype.deep;


public class DeepCloneTest {

    public static void main(String[] args) {

        Person person = new Person();
        try {
            Person clone = (Person) person.clone();
            System.out.println("deep clone ->" + (person.position == clone.position));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person q = new Person();
        Person n = q.shallowClone(q);
        System.out.println("shallow clone ->" + (q.position == n.position));

        //源码案例： clone
//        ArrayList arrayList = new ArrayList();
    }
}
