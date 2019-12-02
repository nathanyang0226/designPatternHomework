package com.gupao.homework.designpattern.prototype;

public class DeepCloneTest {
    public static void main(String[] args) {
        Qitiandasha qitiandasha = new Qitiandasha();
        try {
            Qitiandasha clone = (Qitiandasha) qitiandasha.clone();
            System.out.println("深克隆" + (qitiandasha.jingubang == clone.jingubang));

        } catch (Exception e) {
            e.printStackTrace();
        }

        Qitiandasha qitiandasha1 = new Qitiandasha();
        Qitiandasha shadowCopy = qitiandasha1.shadowCopy(qitiandasha1);

        System.out.println("浅克隆" + (qitiandasha1.jingubang == shadowCopy.jingubang
        ));
    }
}
