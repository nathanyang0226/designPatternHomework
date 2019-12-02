package com.gupao.homework.designpattern.sigleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式容器单例
 */
public class CotainerSingleton {

    private CotainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object object = null;
                try {
                    object = Class.forName(className).newInstance();
                    ioc.put(className, object);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return object;
            } else {
                return ioc.get(className);
            }
        }
    }
}

