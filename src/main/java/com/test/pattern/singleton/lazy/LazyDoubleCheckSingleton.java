package com.test.pattern.singleton.lazy;

import com.alibaba.csp.sentinel.node.ClusterNode;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * Created by zhangsan.
 */

public class LazyDoubleCheckSingleton {
//    private  static LazyDoubleCheckSingleton lazy = null;
//
//    private LazyDoubleCheckSingleton(){}
//    public static LazyDoubleCheckSingleton getInstance(){
//        // 2种情况：
//        // 1：thread1 未跳过第一层判空，未进入sync，因为 thread2 已经执行完sync，初始化了对象。 这种情况只会执行一次
//        // 2：thread1 跳过过第一层判空，进入sync，这时 thread2 也通过第一层判空，进入sync，这时，thread1执行完毕，thread2 从阻塞队列里出来继续执行sync
//
//        if(lazy == null){
//            synchronized (LazyDoubleCheckSingleton.class){
//                // 可能会有多个线程一起进入同步快外的if，如果在同步快内不进行二次检验的话就会生成多个实例了
////                if(lazy == null){
//                    lazy = new LazyDoubleCheckSingleton();
//                    //1.分配内存给这个对象
//                    //2.初始化对象
//                    //3.设置lazy指向刚分配的内存地址
//                    //4.初次访问对象
////                }
//            }
//        }
////        LazyDoubleCheckSingleton extension = ExtensionLoader.getExtensionLoader(LazyDoubleCheckSingleton.class).getExtension("myExtension");
//        return lazy;
//    }

//    private LazyDoubleCheckSingleton () {}
//
//    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
//
//    public static LazyDoubleCheckSingleton getInstance() {
//        if (lazyDoubleCheckSingleton == null) {
//            synchronized (LazyDoubleCheckSingleton.class) {
//                if (lazyDoubleCheckSingleton == null) {
//                    lazyDoubleCheckSingleton =  new LazyDoubleCheckSingleton();
//                }
//            }
//        }
//        return lazyDoubleCheckSingleton;
//    }

    private LazyDoubleCheckSingleton(){}

    private volatile static LazyDoubleCheckSingleton instance = null;

    public static LazyDoubleCheckSingleton  getInstance() {
        if (instance == null){
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
