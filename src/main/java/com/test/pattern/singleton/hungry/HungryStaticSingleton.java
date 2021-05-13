package com.test.pattern.singleton.hungry;

/**
 * Created by zhangsan.
 */

//饿汉式静态块单例
public class HungryStaticSingleton {
//    private static final HungryStaticSingleton hungrySingleton;
//    static {
//        hungrySingleton = new HungryStaticSingleton();
//    }
//    private HungryStaticSingleton(){}
//    public static HungryStaticSingleton getInstance(){
//        return  hungrySingleton;
//    }

    private HungryStaticSingleton(){}

    private static HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
