package com.gupao.homework.designpattern.delegate;

public class Boss {

    public void doing(String command,Leader leader){
        leader.doing(command);
    }
}
