package com.test.principle.dip;

/**
 * 现在 zhangsan 还想学习 AI 人工智能的课程。
 * 这个时候，业务扩展，我们的代码要从底层到高层（调用层）一次修改代码。
 * 在 zhangsan 类中增加 studyAICourse()的方法，在高层也要追加调用。
 */
public class Tom1 {

    public void studyJavaCourse(){
        System.out.println("tom 在学习 Java 的课程");
    }

    public void studyPythonCourse(){
        System.out.println("tom 在学习 Python 的课程");
    }

    public static void main(String[] args) {
        Tom1 tom1 = new Tom1();
        tom1.studyJavaCourse();
        tom1.studyPythonCourse();
    }
}
