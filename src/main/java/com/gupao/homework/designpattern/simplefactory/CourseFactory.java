package com.gupao.homework.designpattern.simplefactory;

public class CourseFactory {

    public ICourse create(Class<?extends ICourse> clazz){
          try {
              if (null!=clazz){
                  return clazz.newInstance();
              }
          } catch (IllegalAccessException e) {
              e.printStackTrace();
          } catch (InstantiationException e) {
              e.printStackTrace();
          }

          return null;
    }
}
