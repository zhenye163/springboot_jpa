package com.netops.springboot_jpa.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author zhenye 2019/9/19
 */
@Configuration
public class MultiDataSourceConfig {
    /**
     * 数据源对象
     */
    @Bean(name = "primaryDataSource")
    @ConfigurationProperties("primary.datasource")
    @Primary
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 数据源对象
     */
    @Bean(name = "secondDataSource")
    @ConfigurationProperties("second.datasource")
    public DataSource secondDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 数据源对象
     */
    @Bean(name = "thirdDataSource")
    @ConfigurationProperties("third.datasource")
    public DataSource thirdDataSource() {
        return DataSourceBuilder.create().build();
    }
}
