package com.gupao.homework.designpattern.sigleton;

//懒汉式单例
//在外部使用的时候才能进行实例化
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton lazySingleton=null;

    public synchronized static  LazySingleton getInstance(){
        if (null==lazySingleton){
            lazySingleton= new LazySingleton();
        }
        return lazySingleton;
    }
}
