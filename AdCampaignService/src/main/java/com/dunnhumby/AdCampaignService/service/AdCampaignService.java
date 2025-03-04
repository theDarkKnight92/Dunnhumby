package com.dunnhumby.AdCampaignService.service;

import com.dunnhumby.AdCampaignService.dto.AdMetricDto;

import java.time.LocalDateTime;

public interface AdCampaignService {

    void pushEvent(long camapaignId, String eventType, LocalDateTime eventDateTime);

    long getClicksOnAdCampaign(long campaignId, LocalDateTime startDateTime, LocalDateTime endDateTime);

    long getViewsOnAdCampaign(long campaignId, LocalDateTime startDateTime, LocalDateTime endDateTime);

    long getAddToCartCountForAdCampaign(long campaignId, LocalDateTime startDateTime, LocalDateTime endDateTime);
}
