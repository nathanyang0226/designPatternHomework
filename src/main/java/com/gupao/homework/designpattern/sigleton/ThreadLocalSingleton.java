package com.gupao.homework.designpattern.sigleton;

public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadlocalCache = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadlocalCache.get();
    }
}
