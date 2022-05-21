package com.wustzdy.spring.boot.mybatis.project.model;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private String name;
    private Integer userId;
    private Integer money;
}
