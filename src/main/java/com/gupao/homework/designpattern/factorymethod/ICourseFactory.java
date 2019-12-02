package com.gupao.homework.designpattern.factorymethod;

import com.gupao.homework.designpattern.simplefactory.ICourse;

public interface ICourseFactory {

    /**
     * 工厂方法模式：定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中实现
     *
     * 工厂方法适用场景：
     * 1.创建对象需要大量重复的代码
     * 2.客户端不依赖于产品类实例如何被创建、实现等细节
     * 3.一个类通过其子类来确定创建哪个对象
     * @return
     */

    ICourse create();
}
