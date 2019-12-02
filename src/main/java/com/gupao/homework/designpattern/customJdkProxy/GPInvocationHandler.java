package com.gupao.homework.designpattern.customJdkProxy;

import java.lang.reflect.Method;

public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method,Object[] objects) throws Throwable;
}
