package com.test.pattern.factory.abstractfactory;

/**
 * Created by zhangsan.
 */
public class PythonCourseFactory implements CourseFactory {

    public INote createNote() {
        return new PythonNote();
    }


    public IVideo createVideo() {
        return new PythonVideo();
    }
}
