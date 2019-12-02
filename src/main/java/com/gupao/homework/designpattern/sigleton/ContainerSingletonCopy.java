package com.gupao.homework.designpattern.sigleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 非线程安全
 */
public class ContainerSingletonCopy {

    private ContainerSingletonCopy() {
    }

    private static Map<String, Object> IOC = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {
        synchronized (IOC) {
            Object object = null;
            if (!IOC.containsKey(className)) {
                try {
                    object = Class.forName(className).newInstance();
                    IOC.put(className, object);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return object;
            } else {
                return IOC.get(className);
            }
        }
    }
}
