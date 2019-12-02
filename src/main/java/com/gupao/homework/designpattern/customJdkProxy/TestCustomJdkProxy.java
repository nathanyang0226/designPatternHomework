package com.gupao.homework.designpattern.customJdkProxy;

import com.gupao.homework.designpattern.dynamicproxy.Customer;
import com.gupao.homework.designpattern.propxy.staticProxy.Person;

public class TestCustomJdkProxy {
    public static void main(String[] args) {
        try {
            Person person= (Person) new GpMeipo().getTarget(new Customer());
            person.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
