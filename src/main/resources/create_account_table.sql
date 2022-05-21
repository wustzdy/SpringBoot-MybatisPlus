--liquibase formatted sql

--changeset zhudayang:20200905-01
CREATE TABLE `zdy_user` (
    `id` int (11) NOT NULL AUTO_INCREMENT,
    `user_name` varchar(64) NOT NULL COMMENT '用户名称',
    `money` int(64) NOT NULL COMMENT '订单金额',
    PRIMARY KEY (`id`)
) ENGINE =InnoDB DEFAULT CHARSET =utf8mb4 COLLATE =utf8mb4_unicode_ci COMMENT '用户表';
