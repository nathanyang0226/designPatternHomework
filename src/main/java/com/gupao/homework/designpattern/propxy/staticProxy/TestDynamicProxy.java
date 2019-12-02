package com.gupao.homework.designpattern.propxy.staticProxy;

import com.gupao.homework.designpattern.propxy.staticProxy.dynamicProxy.OrderServiceDydamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDynamicProxy {
    public static void main(String[] args) {
        try {
            Order order=new Order();
            SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
            Date date = format.parse("2019/11/23");
            order.setCreateTime(date.getTime());

            IOrderService orderService= (IOrderService)new OrderServiceDydamicProxy().getTarget(new IOrderServiceImpl());
            orderService.createOrder(order);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
