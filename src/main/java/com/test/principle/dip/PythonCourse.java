package com.test.principle.dip;

public class PythonCourse implements ICourse {

    @Override
    public void study() {
        System.out.println("tom 在学习 Python 课程");
    }
}
