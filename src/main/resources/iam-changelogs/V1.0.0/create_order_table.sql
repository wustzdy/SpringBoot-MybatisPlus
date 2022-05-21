--liquibase formatted sql

--changeset zhudayang:20200905-01
CREATE TABLE `zdy_order` (
    `id` int (11) NOT NULL AUTO_INCREMENT,
    `name` varchar(64) NOT NULL COMMENT '产品名称',
    `user_id` int (11) NOT NULL COMMENT '用户id',
    `money` int(64) NOT NULL COMMENT '订单金额',
    PRIMARY KEY (`id`)
) ENGINE =InnoDB DEFAULT CHARSET =utf8mb4 COLLATE =utf8mb4_unicode_ci COMMENT '订单信息表';
