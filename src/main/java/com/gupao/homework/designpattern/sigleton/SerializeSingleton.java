package com.gupao.homework.designpattern.sigleton;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 反序列化破坏单例
 */
public class SerializeSingleton implements Serializable {
    /**
     * 序列化-->把内存中的状态转换成字节码的形式
     * 从而转化成IO流，写入到其他地方(磁盘，网络)
     * 内存中的状态永久低保存下来了
     */


    /**
     * 反序列化-->已经序列化好的字节码内容 转化成IO流
     * 通过IO流的读取，转化为Java对象
     * 转化过程中 会重新创建对象
     */

    private SerializeSingleton(){}

    public final static SerializeSingleton serializeSingleton=new SerializeSingleton();

    public static  SerializeSingleton getInstance(){
        return serializeSingleton;
    }

    private Object readResolve(){
        return  serializeSingleton;
    }

}
