package com.gupao.homework.designpattern.propxy.staticProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeipo implements InvocationHandler {

    //被代理的对象
    private Object target;

    public Object getInstance(Object target){
        this.target=target;
        Class<?> targetClass = target.getClass();

        return Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    private void after() {
        System.out.println("如果合适的话，就准备举行婚礼吧");
    }

    private void before() {
        System.out.println("我是媒婆，我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
}
