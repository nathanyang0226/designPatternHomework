package com.gupao.homework.designpattern.prototype;

public class Client {

    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype=prototype;
    }

    public Prototype startClone(Prototype concreteprototype){
        return (Prototype)concreteprototype.clone();
    }
}
