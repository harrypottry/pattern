package com.test.pattern.proxy.staticproxy;

import com.test.pattern.proxy.Person;

/**
 * Created by zhangsan on 2021/5/10.
 */
public class Father implements Person {

//    private Son person;
//
//    public Father(Son person){
//        this.person = person;
//    }
//
//    public void findLove(){
//        System.out.println("父亲物色对象");
//        this.person.findLove();
//        System.out.println("双方父母同意，确立关系");
//    }
//
//    public void findJob(){
//
//    }
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        before();
        son.findLove();
        after();
    }

    private void before() {

        System.out.println("before...");
    }

    private void after() {
        System.out.println("after...");
    }
}
