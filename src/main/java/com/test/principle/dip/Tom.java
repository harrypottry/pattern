package com.test.principle.dip;

/**
 *
 */
public class Tom {

//    public void study(ICourse course){
//        course.study();
//    }

    private ICourse course;

    /**
     * 构造方法注入
     * @param course
     */
    public Tom(ICourse course){
        this.course = course;
    }

    public void study(){
        course.study();
    }

    public static void main(String[] args) {
        Tom tom = new Tom(new JavaCourse());
        Tom tom1 = new Tom(new PythonCourse());
        tom.study();
        tom1.study();
    }

}
