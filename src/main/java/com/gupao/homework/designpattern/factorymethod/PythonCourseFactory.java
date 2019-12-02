package com.gupao.homework.designpattern.factorymethod;

import com.gupao.homework.designpattern.simplefactory.ICourse;
import com.gupao.homework.designpattern.simplefactory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
