package com.wustzdy.spring.boot.mybatis.project.others;

public class Client {
    public static void main(String[] args) {
        // 创建一个订单业务的真实处理对象
        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
        // 创建一个代理对象
        OrderServiceImplProxy orderServiceImplProxy = new OrderServiceImplProxy(orderServiceImpl);
        // 执行代理对象的校验订单方法
        orderServiceImplProxy.verifyOrderParameters();
        System.out.println("--------------------------------------------");
        // 执行代理对象的保存订单方法
        orderServiceImplProxy.saveOrder();
    }
}
