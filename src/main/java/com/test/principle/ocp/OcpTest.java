package com.test.principle.ocp;

public class OcpTest {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse(1,"test", 10.0);
        System.out.println(javaCourse.getPrice());

        //
        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(2, "test2", 10.0);
        System.out.println(javaDiscountCourse.getPrice());
    }
}
