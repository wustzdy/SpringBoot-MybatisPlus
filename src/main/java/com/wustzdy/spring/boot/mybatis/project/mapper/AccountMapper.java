package com.wustzdy.spring.boot.mybatis.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wustzdy.spring.boot.mybatis.project.entity.AccountEntity;
import com.wustzdy.spring.boot.mybatis.project.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface AccountMapper extends BaseMapper<AccountEntity> {
}
