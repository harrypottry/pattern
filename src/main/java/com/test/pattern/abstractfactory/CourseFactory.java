package com.test.pattern.abstractfactory;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 * Created by zhangsan.
 */
public interface CourseFactory {

    INote createNote();

    IVideo createVideo();

}
