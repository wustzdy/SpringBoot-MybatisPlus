package com.wustzdy.spring.boot.mybatis.project.config.test;

import com.wustzdy.spring.boot.mybatis.project.model.Order;
import com.wustzdy.spring.boot.mybatis.project.model.User;
import com.wustzdy.spring.boot.mybatis.project.service.OrderService;
import com.wustzdy.spring.boot.mybatis.project.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void test() throws Exception {
        Order order = new Order();
        order.setMoney(20);
        order.setName("dianchi");
        order.setUserId(1);
        orderService.addOrder(order);
    }
}
