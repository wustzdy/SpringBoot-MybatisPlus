package com.wustzdy.spring.boot.mybatis.project.service;

import com.wustzdy.spring.boot.mybatis.project.model.Order;

public interface OrderService {
    void addOrder(Order order) throws Exception;
}
