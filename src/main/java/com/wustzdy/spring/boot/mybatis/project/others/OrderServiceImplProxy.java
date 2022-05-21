package com.wustzdy.spring.boot.mybatis.project.others;

public class OrderServiceImplProxy implements OrderService {
    /**
     * 持有被代理的具体的目标对象
     */
    private OrderServiceImpl orderServiceImpl;

    public OrderServiceImplProxy(OrderServiceImpl orderServiceImpl) {
        this.orderServiceImpl = orderServiceImpl;
    }

    @Override
    public void verifyOrderParameters() {
        orderServiceImpl.verifyOrderParameters();
    }

    @Override
    public void saveOrder() {
        System.out.println("开启事务。。。");
        orderServiceImpl.saveOrder();
        System.out.println("提交事务。。。");
    }
}
