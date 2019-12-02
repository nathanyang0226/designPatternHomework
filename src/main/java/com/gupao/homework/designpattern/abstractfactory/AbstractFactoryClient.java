package com.gupao.homework.designpattern.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory=new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();
    }
}
