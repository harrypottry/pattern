package singleton.test;


import com.test.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.test.pattern.singleton.lazy.LazySimpleSingleton;
import com.test.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * Created by zhangsan.
 */
public class ExecutorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
//        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
