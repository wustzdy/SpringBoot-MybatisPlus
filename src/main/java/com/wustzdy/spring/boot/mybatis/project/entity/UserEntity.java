package com.wustzdy.spring.boot.mybatis.project.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("zdy_user")
public class UserEntity {
    private Long id;
    private String userNaame;
    private String passWord;
}
