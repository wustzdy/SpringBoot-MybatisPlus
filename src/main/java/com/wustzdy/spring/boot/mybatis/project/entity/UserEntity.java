package com.wustzdy.spring.boot.mybatis.project.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(UserEntity.TABLE_NAME)
public class UserEntity {
    public static final String TABLE_NAME = "zdy_user";
    @TableField
    private Integer id;
    @TableField
    private String userName;
    @TableField
    private String passWord;
}
