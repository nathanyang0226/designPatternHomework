package com.gupao.homework.designpattern.sigleton;

public class LazySingletonTest {
    public static void main(String[] args) {


        Thread t1=new Thread(new ExcecutorThread());

        Thread t2=new Thread(new ExcecutorThread());

        t1.start();
        t2.start();

        System.out.println("END");

    }
}
