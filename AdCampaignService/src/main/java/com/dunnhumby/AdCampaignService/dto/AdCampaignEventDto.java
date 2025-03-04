package com.dunnhumby.AdCampaignService.dto;

import com.dunnhumby.AdCampaignService.constant.AdCampaignUserEvent;

import java.time.LocalDateTime;

public class AdCampaignEventDto {

    private long adCampaignId;

    private AdCampaignUserEvent event;

    private LocalDateTime eventDateTime;

    public long getAdCampaignId() {
        return adCampaignId;
    }

    public void setAdCampaignId(long adCampaignId) {
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
