package com.gupao.homework.designpattern.factorymethod;

import com.gupao.homework.designpattern.simplefactory.ICourse;

public class FactoryMethodClient {
    public static void main(String[] args) {
        ICourseFactory javaCourse=new JavaCourseFactory();
        ICourse jourse = javaCourse.create();
        jourse.record();


        ICourseFactory pythonCourse=new PythonCourseFactory();
        ICourse pcourse = pythonCourse.create();
        pcourse.record();
    }
}
