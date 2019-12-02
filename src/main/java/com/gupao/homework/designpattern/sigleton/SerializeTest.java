package com.gupao.homework.designpattern.sigleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {

    public static void main(String[] args) {
        SerializeSingleton singleton1=null;
        SerializeSingleton singleton2 = SerializeSingleton.getInstance();

        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("1SerializeSingleton.sss");
            ObjectOutputStream outputStream=new ObjectOutputStream(fos);
            outputStream.writeObject(singleton2);
            outputStream.flush();
            outputStream.close();

            FileInputStream in=new FileInputStream("1SerializeSingleton.sss");
            ObjectInputStream inputStream=new ObjectInputStream(in);
            singleton1 = (SerializeSingleton)inputStream.readObject();
            System.out.println(singleton1);
            System.out.println(singleton2);

            System.out.println(singleton1==singleton2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
