package com.test.pattern.singleton.lazy;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.Hashtable;

/**
 * Created by zhangsan.
 * ���߳������Ƚ϶�����£����CPU����ѹ���������ᵼ�´������̳߳����������Ӷ����³����������ܴ���½�
 */

//����ʽ����
//���ⲿ��Ҫʹ�õ�ʱ��Ž���ʵ����
public class LazySimpleSingleton {

//    private LazySimpleSingleton(){}
//    //��̬�飬�����ڴ�����
//    private static LazySimpleSingleton lazy = null;
//
//    /**
//     * ����sync & ��sync
//     * �����ǽ�����һ���߳�ִ�в�����getInstance()����ʱ����һ���߳��ڵ���getInstance()������
//     * �̵߳�״̬��RUNNING�����MONITOR,����������ֱ����һ���߳�ִ���꣬�ڶ����̲߳Żָ�RUNNING״̬��������getInstance()������
//     * @return
//     */
//    public static LazySimpleSingleton getInstance(){
//        if(lazy == null){
//            lazy = new LazySimpleSingleton();
//        }
//        return lazy;
//    }

}
