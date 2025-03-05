package com.dunnhumby.AdCampaignService.repository;

import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class DataSourcePool {

    private Map<String, DataSource> tenantDataSourceMap;

    public DataSourcePool() {
        tenantDataSourceMap = new ConcurrentHashMap<>();
    }

    @EventListener(RefreshScopeRefreshedEvent.class)
    public void onConfigurationRefreshed() {
        // code to reread the datascource properties from config and update the datasource map above.
    }

    public DataSource getDataSource() {
        String tenantId = null; // code to fetch current tenent id from the request scope.
        return this.tenantDataSourceMap.get(tenantId);
    }
}
