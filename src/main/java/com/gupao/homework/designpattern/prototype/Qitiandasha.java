package com.gupao.homework.designpattern.prototype;

import java.io.*;
import java.util.Date;

public class Qitiandasha extends Monkey implements Cloneable,Serializable {

    public Jingubang jingubang;


    public Qitiandasha(){
        this.birthday=new Date();
        this.jingubang=new Jingubang();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream os=new ObjectOutputStream(bos);
            os.writeObject(this);

            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream oi=new ObjectInputStream(bis);
            Qitiandasha copy=(Qitiandasha)oi.readObject();
            copy.birthday=new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Qitiandasha shadowCopy(Qitiandasha target){
        Qitiandasha qitiandasha=new Qitiandasha();
        qitiandasha.setBirthday(new Date());
        qitiandasha.setHeight(target.height);
        qitiandasha.setWeight(target.weight);
        qitiandasha.jingubang=target.jingubang;

        return qitiandasha;
    }
}
