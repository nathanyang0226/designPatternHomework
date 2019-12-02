package com.gupao.homework.designpattern.sigleton;

/**
 * 主线程main中无论调用多次，获得的实例都是一个
 *
 * 其他不同线程 获取的是不同对象
 *
 * ThreadLocal保证在单个线程中获得的实例是同一个
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1=new Thread(new ExcecutorThread());

        Thread t2=new Thread(new ExcecutorThread());

        t1.start();
        t2.start();

        System.out.println("End");

    }
}
