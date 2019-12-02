package com.gupao.homework.designpattern.propxy.staticProxy;

public class OrderDao {

    public int insert(Order order){
        System.out.println("OrderDao 创建order成功");
        return 1;
    }
}
