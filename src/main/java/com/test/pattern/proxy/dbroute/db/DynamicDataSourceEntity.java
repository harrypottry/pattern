package com.test.pattern.proxy.dbroute.db;

/**
 * Created by zhangsan on 2021/5/10.
 * 动态代理实体类
 */
public class DynamicDataSourceEntity {

    public final static String DEFAULE_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntity(){}


    public static String get(){return  local.get();}

    public static void restore(){
         local.set(DEFAULE_SOURCE);
    }

    //DB_2018
    //DB_2019
    public static void set(String source){local.set(source);}

    public static void set(int year){local.set("DB_" + year);}

}
