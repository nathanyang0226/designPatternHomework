package com.gupao.homework.designpattern.delegate;

public class TestDelegate {

    public static void main(String[] args) {

        //委派模式，
        new Boss().doing("撤退",new Leader());
    }
}
