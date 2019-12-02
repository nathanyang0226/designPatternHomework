package com.gupao.homework.designpattern.propxy.staticProxy.dynamicProxy;

import com.gupao.homework.designpattern.propxy.staticProxy.DynamicDatasourceEntity;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDydamicProxy implements InvocationHandler {

    private SimpleDateFormat format=new SimpleDateFormat("yyyy");

    private  Object target;

    public Object getTarget(Object target) {
        this.target=target;
        Class<?> targetClass = target.getClass();
        return Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(target, args);
        after();
        return object;
    }

    private void after() {
        System.out.println("execute method after proxy");
    }

    private void before(Object target) {
        try {
            System.out.println("Proxy Before method .");

            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);

            Integer db_route=Integer.valueOf(format.format(new Date(time)));

            System.out.println("代理自动分配到【DB"+db_route+"】数据源处理数据");
            DynamicDatasourceEntity.set(db_route);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
