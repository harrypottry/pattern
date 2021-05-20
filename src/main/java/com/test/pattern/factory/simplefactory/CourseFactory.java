package com.test.pattern.factory.simplefactory;


import com.test.pattern.factory.ICourse;

/**
 * Created by zhangsan.
 */
public class CourseFactory {


    public ICourse create(Class<? extends ICourse> clazz) {
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
       return null;
    }
}
