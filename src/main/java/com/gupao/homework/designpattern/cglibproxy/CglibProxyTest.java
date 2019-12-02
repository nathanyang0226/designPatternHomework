package com.gupao.homework.designpattern.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibProxyTest {
    public static void main(String[] args) {
        try {
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D://cglib_proxy_classes");
            SingeCustomer customer=  (SingeCustomer)new CglibMeipo().getInstance(SingeCustomer.class);
            customer.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
