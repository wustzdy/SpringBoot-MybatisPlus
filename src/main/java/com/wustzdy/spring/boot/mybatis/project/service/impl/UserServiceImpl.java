package com.wustzdy.spring.boot.mybatis.project.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.wustzdy.spring.boot.mybatis.project.entity.UserEntity;
import com.wustzdy.spring.boot.mybatis.project.mapper.UserMapper;
import com.wustzdy.spring.boot.mybatis.project.model.User;
import com.wustzdy.spring.boot.mybatis.project.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    @DS("iam")
    public User addUser(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        if (userMapper.insert(userEntity) != 1) {
            throw new RuntimeException("error");
        }
        User user1 = new User();
        BeanUtils.copyProperties(userEntity, user1);
        return user1;
    }
}
