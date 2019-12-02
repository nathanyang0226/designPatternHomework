package com.gupao.homework.designpattern.sigleton;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton INSTANCE;

    static {
        INSTANCE = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return INSTANCE;
    }
}
