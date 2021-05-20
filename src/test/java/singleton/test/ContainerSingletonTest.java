package singleton.test;


import com.test.pattern.singleton.register.ContainerSingleton;

/**
 * Created by zhangsan.
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        //try {
        //    long start = System.currentTimeMillis();
        //    ConcurrentExecutor.execute(() -> {
        //        Object obj = ContainerSingleton.getInstance("singleton.test.Pojo");;
        //        System.out.println(System.currentTimeMillis() + ": " + obj);
        //    }, 10,6);
        //    long end = System.currentTimeMillis();
        //    System.out.println("总耗时：" + (end - start) + " ms.");
        //}catch (Exception e){
        //    e.printStackTrace();
        //}

        try {
            ConcurrentExecutor.execute(()->{
                Object instance = ContainerSingleton.getInstance("singleton.test.Pojo");
                System.out.println(System.currentTimeMillis() + ":" +instance);
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
