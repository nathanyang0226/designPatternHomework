package com.gupao.homework.designpattern.simplefactory;

public class SimpleFactoryClient {

    public static void main(String[] args) {
        /*ICourse course=new JavaCourse();
        course.record();*/
        CourseFactory factory=new CourseFactory();
        ICourse course = factory.create(PythonCourse.class);
        course.record();
    }
}
