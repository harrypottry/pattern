package singleton.test;


import com.test.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * Created by zhangsan.
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {

        //在主线程 main 中无论调用多少次，获取到的实例都是同一个
//        System.out.println(ThreadLocalSingleton.getInstance());
//        System.out.println(ThreadLocalSingleton.getInstance());
//        System.out.println(ThreadLocalSingleton.getInstance());
//        System.out.println(ThreadLocalSingleton.getInstance());
//        System.out.println(ThreadLocalSingleton.getInstance());

        //子线程：分别获取到了不同的实例

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("finally");
    }
}
