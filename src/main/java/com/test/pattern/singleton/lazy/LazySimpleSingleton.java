package com.test.pattern.singleton.lazy;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.Hashtable;

/**
 * Created by zhangsan.
 * 在线程数量比较多情况下，如果CPU分配压力上升，会导致大批量线程出现阻塞，从而导致程序运行性能大幅下降
 */

//懒汉式单例
//在外部需要使用的时候才进行实例化
public class LazySimpleSingleton {

//    private LazySimpleSingleton(){}
//    //静态块，公共内存区域
//    private static LazySimpleSingleton lazy = null;
//
//    /**
//     * 不加sync & 加sync
//     * 当我们将其中一个线程执行并调用getInstance()方法时，另一个线程在调用getInstance()方法，
//     * 线程的状态由RUNNING变成了MONITOR,出现阻塞。直到第一个线程执行完，第二个线程才恢复RUNNING状态继续调用getInstance()方法。
//     * @return
//     */
//    public static LazySimpleSingleton getInstance(){
//        if(lazy == null){
//            lazy = new LazySimpleSingleton();
//        }
//        return lazy;
//    }

}
