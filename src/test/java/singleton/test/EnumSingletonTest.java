package singleton.test;


import com.test.pattern.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by zhangsan.
 */
public class EnumSingletonTest {
    /**
     * 通过序列化 破坏枚举式单例
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            EnumSingleton instance1 = null;
//
//            EnumSingleton instance2 = EnumSingleton.getInstance();
//            instance2.setData(new Object());
//
//            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(instance2);
//            oos.flush();
//            oos.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            instance1 = (EnumSingleton) ois.readObject();
//            ois.close();
//
//            System.out.println(instance1.getData());
//            System.out.println(instance2.getData());
//            System.out.println(instance1.getData() == instance2.getData());
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    /**
     * 通过反射破坏枚举式单例(jad.exe 工具)
     */
    public static void main(String[] args) {
//        try {
//            //通过得知enum的反编译文件的构造方法为（String.class,int.class）
//            Class clazz = EnumSingleton.class;
//            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
//            c.setAccessible(true);
//            /**
//             * jdk层面-》 newInstance:这就是为什么不能用反射创建枚举类型
//             */
//            EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("test",666);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        Class clazz = EnumSingleton.class;

        try {
            Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true);
            Object o = declaredConstructor.newInstance();
            System.out.println(o);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}