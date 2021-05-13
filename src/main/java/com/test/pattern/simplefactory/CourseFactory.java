package com.test.pattern.simplefactory;


import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.test.pattern.ICourse;

/**
 * Created by zhangsan.
 */
public class CourseFactory {

//    public ICourse create(String name){
//        if("java".equals(name)){
//            return new JavaCourse();
//        }else if("python".equals(name)){
//            return new PythonCourse();
//        }else {
//            return null;
//        }
//    }

//    public ICourse create(String className){
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

//    public ICourse create(Class<? extends ICourse> clazz){
//        try {
//            if (null != clazz) {
//                return clazz.newInstance();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

//    public ICourse create(Class<? extends ICourse> clazz) {
//        if (null != clazz) {
//            try {
//                return clazz.newInstance();
//            } catch (InstantiationException | IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }

//    public static void main(String[] args) {
//        //
//        CourseFactory extension = ExtensionLoader.getExtensionLoader(CourseFactory.class).getExtension("");
//    }

//    public ICourse create(Class<? extends ICourse> clazz) {
//        if (null != clazz) {
//            try {
//                return clazz.newInstance();
//            } catch (InstantiationException | IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }

//    public ICourse create(Class<? extends ICourse> clazz){
//        if (null != clazz) {
//            try {
//                return clazz.newInstance();
//            } catch (InstantiationException | IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }


}
