package com.gupao.homework.designpattern.prototype;

import java.util.List;

public class ConconcreteType implements Prototype {

    private Integer age;
    private String name;
    private List hobbies;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public Prototype clone() {
        ConconcreteType conconcreteType=new ConconcreteType();
        conconcreteType.setAge(this.age);
        conconcreteType.setHobbies(this.hobbies);
        conconcreteType.setName(this.name);
        return conconcreteType;
    }
}
