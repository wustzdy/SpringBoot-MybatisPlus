package com.wustzdy.spring.boot.mybatis.project.service.impl;

import com.wustzdy.spring.boot.mybatis.project.entity.AccountEntity;
import com.wustzdy.spring.boot.mybatis.project.mapper.AccountMapper;
import com.wustzdy.spring.boot.mybatis.project.model.Account;
import com.wustzdy.spring.boot.mybatis.project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper mapper;

    @Override
    public void deduction(Integer userId, Integer money) throws Exception {
        AccountEntity accountEntity = mapper.selectById(userId);
        if (accountEntity != null && money < accountEntity.getMoney()) {
            accountEntity.setMoney(accountEntity.getMoney() - money);
            mapper.updateById(accountEntity);
        } else {
            throw new Exception("money 不够，无法购买");
        }
    }
}
