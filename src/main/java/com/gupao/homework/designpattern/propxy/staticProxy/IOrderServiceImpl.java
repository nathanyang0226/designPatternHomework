package com.gupao.homework.designpattern.propxy.staticProxy;

public class IOrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public IOrderServiceImpl(){
        orderDao=new OrderDao();
    }
    public int createOrder(Order order) {
        System.out.println("OrderService 调用orderDao 创建订单");
        return orderDao.insert(order);
    }
}
