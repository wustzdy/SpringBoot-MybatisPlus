package com.wustzdy.spring.boot.mybatis.project.service;

import com.wustzdy.spring.boot.mybatis.project.model.Account;

public interface AccountService {
    void deduction(Integer userId, Integer money) throws Exception;
}
