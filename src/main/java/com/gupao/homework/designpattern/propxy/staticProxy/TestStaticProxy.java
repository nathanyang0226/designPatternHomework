package com.gupao.homework.designpattern.propxy.staticProxy;

public class TestStaticProxy {
    public static void main(String[] args) {
        Father father=new Father(new Son());
        father.findLove();
    }
}
