package com.wustzdy.spring.boot.mybatis.project.others;

public interface OrderService {
    /**
     * 校验订单参数
     */
    void verifyOrderParameters();

    /**
     * 保存订单
     */
    void saveOrder();
}
