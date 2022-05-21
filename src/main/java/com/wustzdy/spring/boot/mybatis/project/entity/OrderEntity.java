package com.wustzdy.spring.boot.mybatis.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(OrderEntity.TABLE_NAME)
public class OrderEntity {
    public static final String TABLE_NAME = "order";
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "money")
    private Integer money;
    @TableField(value = "user_id")
    private Integer userId;
}