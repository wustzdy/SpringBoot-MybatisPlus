package com.wustzdy.spring.boot.mybatis.project.config.test;

import com.wustzdy.spring.boot.mybatis.project.model.User;
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
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setUserName("zhangdan");
        user.setId(10);
        user.setPassWord("222");
        userService.addUser(user);
    }
}
