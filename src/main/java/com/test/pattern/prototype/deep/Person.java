package com.test.pattern.prototype.deep;


import java.io.*;
import java.util.Date;

/**
 * Created by zhangsan.
 */
public class Person extends Properties implements Cloneable,Serializable {

    public Position position;

    public Person(){
        //只是初始化
        this.birthday = new Date();
        this.position = new Position();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }


    public Object deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Person copy = (Person)ois.readObject();
            copy.birthday = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


    public Person shallowClone(Person target){

        Person person = new Person();
        person.height = target.height;
        person.weight = target.weight;

        person.position = target.position;
        person.birthday = new Date();
        return person;
    }


}
