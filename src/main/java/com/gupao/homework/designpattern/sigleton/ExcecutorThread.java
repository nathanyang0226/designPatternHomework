package com.gupao.homework.designpattern.sigleton;

public class ExcecutorThread implements Runnable {
    public void run() {
        ThreadLocalSingleton threadLocalSingleton=ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+threadLocalSingleton);
    }
}
