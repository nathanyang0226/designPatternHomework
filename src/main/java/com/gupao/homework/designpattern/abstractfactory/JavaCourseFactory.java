package com.gupao.homework.designpattern.abstractfactory;

public class JavaCourseFactory implements CourseAbstractFactory {
    public IVideo createVideo() {
        return new JavaVideo();
    }

    public INote createNote() {
        return new JavaNote();
    }
}
