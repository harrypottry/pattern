package com.test.principle.srp;

/**
 * ��һְ��ԭ��һ���ദ��һ������
 */
public class Course1 {

    public void study(String courseName){
        if("ֱ����".equals(courseName)){
            System.out.println(courseName + "���ܿ��");
        }else{
            System.out.println(courseName + "���Է����ؿ�");
        }
    }

    public static void main(String[] args) {
        Course1 course = new Course1();
        course.study("ֱ����");
        course.study("¼����");
    }
}
