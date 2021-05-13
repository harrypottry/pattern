package singleton.test;

import com.test.pattern.singleton.hungry.HungrySingleton;
import com.test.pattern.singleton.hungry.HungryStaticSingleton;

public class HungrySingletonTest {

    public static void main(String[] args) {
//        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
//        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
//
//        System.out.println(hungrySingleton1 == hungrySingleton2);

        HungryStaticSingleton hungryStaticSingleton1 = HungryStaticSingleton.getInstance();
        HungryStaticSingleton hungryStaticSingleton2 = HungryStaticSingleton.getInstance();

        System.out.println(hungryStaticSingleton1 == hungryStaticSingleton2);

    }
}
