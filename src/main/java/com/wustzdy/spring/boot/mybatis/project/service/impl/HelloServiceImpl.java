package com.wustzdy.spring.boot.mybatis.project.service.impl;

import com.wustzdy.spring.boot.mybatis.project.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getTest() {
        return "Hello world service";
    }
}
