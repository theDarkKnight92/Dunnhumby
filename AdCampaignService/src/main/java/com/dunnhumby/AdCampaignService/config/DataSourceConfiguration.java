package com.dunnhumby.AdCampaignService.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.Map;

@RefreshScope
@ConfigurationProperties("tenants")
public class DataSourceConfiguration {

    private Map<String, TenantDataSource> datasources;

    private class TenantDataSource {

        private String connectionUrl;

        private int minPoolSize;

        private int maxPoolSize;

        private int connectionTimeout;
    }

    public TenantDataSource getDataSource(String tenantId) {
        return datasources.get(tenantId);
    }
}
