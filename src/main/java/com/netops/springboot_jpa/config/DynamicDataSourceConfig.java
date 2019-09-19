package com.netops.springboot_jpa.config;

import com.netops.springboot_jpa.common.DataSourceTypeEnum;
import com.netops.springboot_jpa.common.DynamicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * basePackages---该数据源对应的Repository接口存放位置
 * entityManagerFactoryRef---该数据源对应的实体管理工厂实例
 * transactionManagerRef---该数据源对应的事务控制实例
 * @author zhenye 2019/9/19
 */
@Configuration
@EnableTransactionManagement
public class DynamicDataSourceConfig {

    @Bean(name = "dynamicDataSource")
    public DynamicDataSource dynamicDataSource(
            @Qualifier("primaryDataSource") DataSource primaryDataSource,
            @Qualifier("secondDataSource") DataSource secondDataSource,
            @Qualifier("thirdDataSource") DataSource thirdDataSource ){
        DynamicDataSource dynamicDataSource= new DynamicDataSource();
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceTypeEnum.primary, primaryDataSource);
        targetDataSources.put(DataSourceTypeEnum.second, secondDataSource);
        targetDataSources.put(DataSourceTypeEnum.third, thirdDataSource);

        dynamicDataSource.setTargetDataSources(targetDataSources);
        dynamicDataSource.setDefaultTargetDataSource(primaryDataSource);
        return dynamicDataSource;
    }

    /**
     * 实体管理对象
     */
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(
            EntityManagerFactoryBuilder builder, DynamicDataSource dynamicDataSource) {
        return builder
                .dataSource(dynamicDataSource)
                .packages("com.netops.springboot_jpa.entity")
                .persistenceUnit("myPersistenceUnit")
                .build();
    }

    /**
     * 事务管理对象
     */
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(
            EntityManagerFactoryBuilder builder, DynamicDataSource dynamicDataSource) {
        return new JpaTransactionManager(entityManagerFactoryBean(builder, dynamicDataSource).getObject());
    }
}
