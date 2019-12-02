package com.gupao.homework.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeipo implements InvocationHandler {


    //被代理的对象，把对象引用保留下来
    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        Class<?> targetClass = target.getClass();

        return Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object returnObje = method.invoke(this.target, args);
        after();
        return returnObje;
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }

    private void before() {
        System.out.println("我是媒婆，准备给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
}
