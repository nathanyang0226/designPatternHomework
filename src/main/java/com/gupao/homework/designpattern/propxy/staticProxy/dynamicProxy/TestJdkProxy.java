package com.gupao.homework.designpattern.propxy.staticProxy.dynamicProxy;

import com.gupao.homework.designpattern.propxy.staticProxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class TestJdkProxy {
    public static void main(String[] args) {
        try {
            Person person = (Person) new JdkMeipo().getInstance(new Customer());
            person.findLove();

            //通过反编译工具可以查看源代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os=new FileOutputStream("D://$Proxy0.class");
            os.write(bytes);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
