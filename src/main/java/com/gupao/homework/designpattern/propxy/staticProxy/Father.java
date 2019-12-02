package com.gupao.homework.designpattern.propxy.staticProxy;

public class Father implements Person {
    private Son son;

    public Father(Son son){
        this.son=son;
    }


    public void findLove() {
        System.out.println("父亲物色对象");
        son.findLove();
        System.out.println("父母同意交往，确定关系");
    }
}
