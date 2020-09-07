package com.wustzdy.spring.boot.mybatis.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wustzdy.spring.boot.mybatis.project.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
