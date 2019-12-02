package com.gupao.homework.designpattern.propxy.staticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService{
    private SimpleDateFormat format=new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService=orderService;
    }
    public int createOrder(Order order) {
         before();
        Long createTime = order.getCreateTime();
        Integer db_router = Integer.valueOf(format.format(new Date(createTime)));
        System.out.println("静态代理自动分配到【DB_"+db_router+"】数据源处理数据。");
        DynamicDatasourceEntity.set(db_router);
        //创建订单
        orderService.createOrder(order);
        after();
        return 0;
    }

    private void after() {
        System.out.println("Proxy after method");
    }

    private void before() {
        System.out.println("Proxy before method");
    }
}
