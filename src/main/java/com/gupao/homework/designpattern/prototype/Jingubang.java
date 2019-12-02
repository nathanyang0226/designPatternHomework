package com.gupao.homework.designpattern.prototype;

import java.io.Serializable;

public class Jingubang implements Serializable{

    public float h=100;
    public float d=10;

    public void  big(){
        this.h *=2;
        this.d *=2;
    }

    public void samll(){
        this.d/=2;
        this.h/=2;
    }
}
