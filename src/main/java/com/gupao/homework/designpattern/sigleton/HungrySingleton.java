package com.gupao.homework.designpattern.sigleton;

public class HungrySingleton {

    /**饿汉式单例
     *
     * 类加载的时候就立即初始化，绝对线程安全，没用加任何的锁，执行效率高
     * 缺点：类记载的时候就初始化，不管用于不用都占空间
     */

    private static final HungrySingleton INSTANCE=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return  INSTANCE;
    }
}
