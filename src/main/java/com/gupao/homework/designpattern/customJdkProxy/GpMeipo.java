package com.gupao.homework.designpattern.customJdkProxy;

import java.lang.reflect.Method;

public class GpMeipo implements GPInvocationHandler {

    private Object target;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    public Object getTarget(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GpProxy.newInstance(new GpClassLoader(), clazz.getInterfaces(), this);
    }

    private void before() {
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("OK的话，准备办事");
    }
}
