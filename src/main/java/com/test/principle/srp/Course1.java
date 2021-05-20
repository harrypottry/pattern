package com.test.principle.srp;

/**
 * 单一职责原则：一个类处理一件事情
 */
public class Course1 {

    public void study(String courseName){
        if("直播课".equals(courseName)){
            System.out.println(courseName + "不能快进");
        }else{
            System.out.println(courseName + "可以反复回看");
        }
    }

    public static void main(String[] args) {
        Course1 course = new Course1();
        course.study("直播课");
        course.study("录播课");
    }
}
