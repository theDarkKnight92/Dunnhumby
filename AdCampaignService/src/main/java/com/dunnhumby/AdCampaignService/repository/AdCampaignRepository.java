package com.dunnhumby.AdCampaignService.repository;

import java.time.LocalDateTime;

public interface AdCampaignRepository {

    int fetchClicksByAdCampaignIdForCurrentTenant(long adCampaignId, LocalDateTime startDateTime, LocalDateTime endDateTime);

    int fetchViewsByAdCampaignIdForCurrentTenant(long adCampaignId, LocalDateTime startDateTime, LocalDateTime endDateTime);

    int fetchAddToCartCountByAdCampaignIdForCurrentTenant(long adCampaignId, LocalDateTime startDateTime, LocalDateTime endDateTime);
}
