
package com.test.pattern.singleton.register;

import org.springframework.beans.BeanWrapper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhangsan.
 */

//Spring中的做法，就是用这种注册式单例
public class ContainerSingleton {
//    private ContainerSingleton(){}
//    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
//    public static Object getInstance(String className){
//        synchronized (ioc) {
//            if (!ioc.containsKey(className)) {
//                Object obj = null;
//                try {
//                    obj = Class.forName(className).newInstance();
//                    ioc.put(className, obj);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                return obj;
//            } else {
//                return ioc.get(className);
//            }
//        }
//    }
//    private static final Map<String, Object> factoryBeanInstanceCache = new ConcurrentHashMap<>();
//
//    private ContainerSingleton () {}
//
//    public static Object getInstance (String className) {
//        synchronized (ContainerSingleton.class) {
//            if (!factoryBeanInstanceCache.containsKey(className)) {
//                Object instance = null;
//                try {
//                    instance = Class.forName(className).newInstance();
//                    factoryBeanInstanceCache.put(className, instance);
//                } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//                return instance;
//            }else {
//                return factoryBeanInstanceCache.get(className);
//            }
//        }
//    }

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className){
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return obj;
            }else {
                return ioc.get(className);
            }
        }
    }
}