package com.gupao.homework.designpattern.sigleton;

import java.lang.reflect.Constructor;

public class ReflectLazyInnerClassTest {

    public static void main(String[] args) {
        try {
            Class<?> singletonClass = LazyInnerClassSingleton.class;
            //反射拿到私有构造方法
            Constructor constructor = singletonClass.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object object1 = constructor.newInstance();
            Object object2 = constructor.newInstance();
            System.out.println(object1 == object2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
