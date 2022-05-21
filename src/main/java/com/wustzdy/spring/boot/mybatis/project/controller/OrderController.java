package com.wustzdy.spring.boot.mybatis.project.controller;

import com.wustzdy.spring.boot.mybatis.project.model.Order;
import com.wustzdy.spring.boot.mybatis.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("zdy/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/createOrder", method = RequestMethod.POST)
    public void createUser(@RequestBody Order order) throws Exception {
        orderService.addOrder(order);
    }
}
