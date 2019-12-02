package com.gupao.homework.designpattern.sigleton;


/**
 * ThreadLocal 将所有的对象全部放在 ThreadLocalMap 中，
 * 为每个线程都提供一个对象，实际上是以 空间换时间来实现线程间隔离的
 */
public class ThreadLocalSingletonCopy {

    private ThreadLocalSingletonCopy(){}

    public static final ThreadLocal<ThreadLocalSingletonCopy> threadlocalInnstance=new ThreadLocal<ThreadLocalSingletonCopy>(){
        @Override
        protected ThreadLocalSingletonCopy initialValue() {
            return new ThreadLocalSingletonCopy();
        }
    };

    public static ThreadLocalSingletonCopy getInstance(){
       return threadlocalInnstance.get();
    }
}
