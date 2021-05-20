package com.test.pattern.factory.factorymethod;

import com.test.pattern.factory.ICourse;
import com.test.pattern.factory.PythonCourse;

/**
 * Created by zhangsan.
 */
public class PythonCourseFactory implements  ICourseFactory{

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
