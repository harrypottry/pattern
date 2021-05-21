package com.test.pattern.prototype.deep;


import java.io.*;
import java.util.Date;

/**
 * Created by zhangsan.
 */
public class Person  implements Cloneable,Serializable {

    public Properties position;

    public Person(){
        this.position = new Properties();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }


    /**
     * 深拷贝
     * @return
     */
    public Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 浅拷贝
     * @param target
     * @return
     */
    public Person shallowClone(Person target){
        Person person = new Person();
        person.position = target.position;
        return person;
    }

}
