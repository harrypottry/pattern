package com.test.pattern.singleton.threadlocal;

/**
 * Created by zhangsan.
 */
public class ThreadLocalSingleton {


//    private final static ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = ThreadLocal.withInitial(ThreadLocalSingleton::new);
//
//    private ThreadLocalSingleton(){}
//
//    public static ThreadLocalSingleton getInstance (){
//        return threadLocalSingleton.get();
//    }

    private ThreadLocalSingleton(){}

    private final static ThreadLocal<ThreadLocalSingleton> singleton = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public static ThreadLocalSingleton getInstance() {
        return singleton.get();
    }
}
