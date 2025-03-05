package com.dunnhumby.AdCampaignService.dto;

import com.dunnhumby.AdCampaignService.constant.AdCampaignUserEvent;

import java.time.LocalDateTime;

public class AdCampaignEventDto {

    private String tenantId;

    private Long productId;

    private Long adCampaignId;

    private AdCampaignUserEvent event;

    private LocalDateTime eventDateTime;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getAdCampaignId() {
        return adCampaignId;
    }

    public void setAdCampaignId(Long adCampaignId) {
        this.adCampaignId = adCampaignId;
    }

    public AdCampaignUserEvent getEvent() {
        return event;
    }

    public void setEvent(AdCampaignUserEvent event) {
        this.event = event;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
}
