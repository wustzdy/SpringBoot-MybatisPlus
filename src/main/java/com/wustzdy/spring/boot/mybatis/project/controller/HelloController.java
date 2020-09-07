package com.wustzdy.spring.boot.mybatis.project.controller;

import com.wustzdy.spring.boot.mybatis.project.model.User;
import com.wustzdy.spring.boot.mybatis.project.service.HelloService;
import com.wustzdy.spring.boot.mybatis.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("zdy/user")
public class HelloController {
    @Resource
    private HelloService helloService;
    @Resource
    private UserService userService;

    @RequestMapping(value = "/test",method = {RequestMethod.GET})
    public String getTest() {
        return helloService.getTest();
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public User createUser(User user) {
        return userService.addUser(user);
    }
}
