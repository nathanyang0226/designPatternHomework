package com.gupao.homework.designpattern.dynamicproxy;

import com.gupao.homework.designpattern.propxy.staticProxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class TestDynamicProxy {
    public static void main(String[] args) {
        try {
            Person  instance = (Person) new JdkMeipo().getInstance(new Customer());
            instance.findLove();
            //通过反编译工具查看源代码

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream  os=new FileOutputStream("D://$Proxy0.class");
           os.write(bytes);
           os.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
