package com.gupao.homework.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class TestPrototype {
    //复制的是对象引用地址 不是值
    public static void main(String[] args) {
        ConconcreteType conconcreteType=new ConconcreteType();

        conconcreteType.setName("nick");
        conconcreteType.setAge(18);
        List hobbies=new ArrayList();
        conconcreteType.setHobbies(hobbies);
        System.out.println(conconcreteType);
        Client client=new Client(conconcreteType);
        ConconcreteType cloneType = (ConconcreteType)client.startClone(conconcreteType);
        System.out.println("cloneType=="+cloneType);

        System.out.println("对象地址比较"+(conconcreteType.getHobbies()==cloneType.getHobbies()));
    }
}
