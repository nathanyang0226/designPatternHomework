package com.gupao.homework.designpattern.other;


/**
 * 类装载工作由ClassLoder和其子类负责。JVM在运行时会产生三个ClassLoader：根装载器，ExtClassLoader(扩展类装载器)和AppClassLoader，
 * 其中根装载器不是ClassLoader的子类，由C++编写，因此在java中看不到他，负责装载JRE的核心类库，如java.*,。ExtClassLoader是ClassLoder的子类，负责装载JRE扩展目录ext下的jar类包；
 * AppClassLoader负责装载classpath路径下的类包，这三个类装载器存在父子层级关系，即根装载器是ExtClassLoader的父装载器，ExtClassLoader是AppClassLoader的父装载器。
 * 默认情况下使用AppClassLoader装载应用程序的类
 */
public class TestClassloader {
    public static void main(String[] args) {
        ClassLoader parentClassloader = TestClassloader.class.getClassLoader();
        System.out.println(parentClassloader);//

        ClassLoader extClassloader = parentClassloader.getParent();
        System.out.println(extClassloader);

        ClassLoader appClassloader = extClassloader.getParent();
        System.out.println(appClassloader);
    }
}
