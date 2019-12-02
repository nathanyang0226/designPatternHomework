package com.gupao.homework.designpattern.gpadvice;

public class GpAdviceTest {
    public static void main(String[] args) {
        Gper gper = Gper.GetInstance();

        Teacher tom=new Teacher("Tom");
        Teacher mic=new Teacher("mic");

        Question question=new Question();
        question.setUserName("小红");
        question.setContent("观察者设计模式适用于哪些场景？？");
        gper.addObserver(tom);
        gper.publishQuestion(question);
    }
}
