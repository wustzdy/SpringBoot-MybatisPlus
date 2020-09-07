package com.wustzdy.spring.boot.mybatis.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wustzdy.spring.boot.mybatis.project.service")
@MapperScan(basePackages="com.wustzdy.spring.boot.mybatis.project.mapper")
public class SpringBootMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }
}
