package singleton.test;

import com.test.pattern.proxy.dynamicproxy.jdkproxy.Customer;
import com.test.pattern.singleton.hungry.HungrySingleton;
import com.test.pattern.singleton.hungry.HungryStaticSingleton;
import org.springframework.beans.BeanUtils;

public class HungrySingletonTest {

    public static void main(String[] args) throws CloneNotSupportedException {
//        //��ʽ����
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
//
//        System.out.println(hungrySingleton1 == hungrySingleton2);
//
//        //��̬��ʽ����
//        HungryStaticSingleton hungryStaticSingleton1 = HungryStaticSingleton.getInstance();
//        HungryStaticSingleton hungryStaticSingleton2 = HungryStaticSingleton.getInstance();
//
//        System.out.println(hungryStaticSingleton1 == hungryStaticSingleton2);


        BeanUtils.copyProperties(new Customer(), new Customer());





























        //// cloneable �ƻ�����ģʽ
        HungrySingleton hungrySingletonClone = (HungrySingleton)HungrySingleton.getInstance().clone();
        System.out.println(hungrySingleton1 == hungrySingletonClone);
    }
}
