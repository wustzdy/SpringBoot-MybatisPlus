package com.wustzdy.spring.boot.mybatis.project.others;

import org.springframework.transaction.annotation.Transactional;

public class OrderServiceImpl implements OrderService {
    @Override
    public void verifyOrderParameters() {
        System.out.println("校验订单参数");
        // 调用保存订单方法
        saveOrder();
    }

    @Override
    @Transactional
    public void saveOrder() {
        System.out.println("保存订单信息到DB");
    }
}
