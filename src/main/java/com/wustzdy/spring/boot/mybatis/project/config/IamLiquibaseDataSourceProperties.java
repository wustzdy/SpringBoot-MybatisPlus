package com.wustzdy.spring.boot.mybatis.project.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mysql.iam.liquibasedatasource")
@Data
public class IamLiquibaseDataSourceProperties {
    private String driver;
    private String url;
    private String userName;
    private String password;
    private int maxPoolSize;
    private int connectionTimeout;
    private int maxLifetime;
}
