package com.gupao.homework.designpattern.dynamicproxy;

import com.gupao.homework.designpattern.propxy.staticProxy.Person;

public class Customer implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高190cm");
        System.out.println("颜值高");
    }
}
