package com.netops.springboot_jpa.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zhenye 2019/9/19
 */
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        DataSourceTypeEnum dataSourceType = DataSourceContextHolder.getDataSourceType();
        log.debug("thread:{},determine,dataSource:{}", Thread.currentThread().getName(), dataSourceType);
        return dataSourceType;
    }
}
