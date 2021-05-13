package singleton.test;

import com.test.pattern.singleton.lazy.LazyDoubleCheckSingleton;

public class ThreadExcutor implements Runnable{

    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + singleton);
    }
}
