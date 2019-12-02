package com.gupao.homework.designpattern.factorymethod;

import com.gupao.homework.designpattern.simplefactory.ICourse;
import com.gupao.homework.designpattern.simplefactory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
