package com.wustzdy.spring.boot.mybatis.project.service.impl;

import com.wustzdy.spring.boot.mybatis.project.entity.OrderEntity;
import com.wustzdy.spring.boot.mybatis.project.mapper.OrderMapper;
import com.wustzdy.spring.boot.mybatis.project.model.Order;
import com.wustzdy.spring.boot.mybatis.project.service.AccountService;
import com.wustzdy.spring.boot.mybatis.project.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AccountService accountService;

    @Override
    @Transactional
    public void addOrder(Order order) throws Exception {
        log.info("--addUser-user:{}", order.toString());
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setMoney(order.getMoney());
        orderEntity.setUserId(order.getUserId());
        orderEntity.setName(order.getName());
        orderMapper.insert(orderEntity);

        accountService.deduction(order.getUserId(), order.getMoney());

    }
}
