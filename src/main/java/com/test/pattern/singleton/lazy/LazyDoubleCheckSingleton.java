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
//        // 2�������
//        // 1��thread1 δ������һ���пգ�δ����sync����Ϊ thread2 �Ѿ�ִ����sync����ʼ���˶��� �������ֻ��ִ��һ��
//        // 2��thread1 ��������һ���пգ�����sync����ʱ thread2 Ҳͨ����һ���пգ�����sync����ʱ��thread1ִ����ϣ�thread2 �������������������ִ��sync
//
//        if(lazy == null){
//            synchronized (LazyDoubleCheckSingleton.class){
//                // ���ܻ��ж���߳�һ�����ͬ�������if�������ͬ�����ڲ����ж��μ���Ļ��ͻ����ɶ��ʵ����
////                if(lazy == null){
//                    lazy = new LazyDoubleCheckSingleton();
//                    //1.�����ڴ���������
//                    //2.��ʼ������
//                    //3.����lazyָ��շ�����ڴ��ַ
//                    //4.���η��ʶ���
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
