package com.test.principle.dip;

/**
 * ���� zhangsan ����ѧϰ AI �˹����ܵĿγ̡�
 * ���ʱ��ҵ����չ�����ǵĴ���Ҫ�ӵײ㵽�߲㣨���ò㣩һ���޸Ĵ��롣
 * �� zhangsan �������� studyAICourse()�ķ������ڸ߲�ҲҪ׷�ӵ��á�
 */
public class Tom1 {

    public void studyJavaCourse(){
        System.out.println("tom ��ѧϰ Java �Ŀγ�");
    }

    public void studyPythonCourse(){
        System.out.println("tom ��ѧϰ Python �Ŀγ�");
    }

    public static void main(String[] args) {
        Tom1 tom1 = new Tom1();
        tom1.studyJavaCourse();
        tom1.studyPythonCourse();
    }
}
