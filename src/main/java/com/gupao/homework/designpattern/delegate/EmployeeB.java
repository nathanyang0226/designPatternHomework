package com.gupao.homework.designpattern.delegate;

public class EmployeeB implements IEmployee {
    public void doing(String command) {
        System.out.println("我是员工B,现在开始干"+command+"工作");
    }
}
