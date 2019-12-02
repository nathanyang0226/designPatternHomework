package com.gupao.homework.designpattern.gpadvice;

import java.util.Observable;

/**
 * 被观察者
 */
public class Gper extends Observable {

    String name="Gper生态圈";
    private static Gper gper=null;
    private Gper(){}

    public static Gper GetInstance(){
        if (null==gper){
            gper=new Gper();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.getName()+"上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
