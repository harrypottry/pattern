package com.test.pattern.factory.factorymethod;

import com.test.pattern.factory.ICourse;
import com.test.pattern.factory.JavaCourse;

/**
 * Created by zhangsan.
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
