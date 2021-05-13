package com.test.pattern.observer.gperadvice;

/**
 * Created by zhangsan on 2021/5/17.
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher zhangsan = new Teacher("zhangsan");
        Teacher mic = new Teacher("Mic");


        //这为没有@zhangsan老师
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        gper.addObserver(zhangsan);
        gper.addObserver(mic);
        gper.publishQuestion(question);


    }

}
