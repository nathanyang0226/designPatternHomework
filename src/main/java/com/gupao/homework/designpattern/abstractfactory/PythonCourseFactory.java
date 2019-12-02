package com.gupao.homework.designpattern.abstractfactory;

public class PythonCourseFactory implements CourseAbstractFactory {
    public IVideo createVideo() {
        return new PythonVideo();
    }

    public INote createNote() {
        return new PythonNote();
    }
}
