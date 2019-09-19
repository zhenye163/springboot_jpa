package com.netops.springboot_jpa.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhenye 2019/9/19
 */
@Configuration
public class SecondaryDataSourceConfig {

    /**
     * 数据源对象
     */
    @Bean(name = "secondaryDataSource")
    @ConfigurationProperties("second.datasource")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }

}
