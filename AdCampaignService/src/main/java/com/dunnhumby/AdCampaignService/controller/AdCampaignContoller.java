package com.dunnhumby.AdCampaignService.controller;


import com.dunnhumby.AdCampaignService.dto.AdCampaignEventDto;
import com.dunnhumby.AdCampaignService.dto.AdMetricDto;
import com.dunnhumby.AdCampaignService.service.AdCampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDateTime;


/**
 * Controller class for ad campaign related apis.
 */
@RestController("/ad")
public class AdCampaignContoller {

    private AdCampaignService adCampaignService;

    @Autowired
    public AdCampaignContoller(AdCampaignService adCampaignService) {
        this.adCampaignService = adCampaignService;
    }

    @PostMapping("/event")
    public ResponseEntity<Void> addEvent(@RequestBody AdCampaignEventDto event) {
        adCampaignService.pushEvent(event.getAdCampaignId(), event.getEvent().name(), event.getEventDateTime());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{campaignId}/clicks")
    public ResponseEntity<AdMetricDto> getClicks(@PathVariable("campaignId") long campaignId, @RequestParam("duration") Duration duration) {
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.minusMinutes(duration.toMinutes());
        long clicks = adCampaignService.getClicksOnAdCampaign(campaignId, startDateTime, endDateTime);
        AdMetricDto responseDto = new AdMetricDto();
        responseDto.setClicks(clicks);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/{campaignId}/impressions")
    public ResponseEntity<AdMetricDto> getImpressions(@PathVariable("campaignId") long campaignId, @RequestParam("duration") Duration duration) {
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.minusMinutes(duration.toMinutes());
        long views = adCampaignService.getViewsOnAdCampaign(campaignId, startDateTime, endDateTime);
        AdMetricDto responseDto = new AdMetricDto();
        responseDto.setViews(views);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/{campaignId}/clickToBasket")
    public ResponseEntity<AdMetricDto> getAddToBasket(@PathVariable("campaignId") long campaignId, @RequestParam("duration") Duration duration) {
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.minusMinutes(duration.toMinutes());
        long cartAddtions = adCampaignService.getAddToCartCountForAdCampaign(campaignId, startDateTime, endDateTime);
        AdMetricDto responseDto = new AdMetricDto();
        responseDto.setAdditionsToCart(cartAddtions);
        return ResponseEntity.ok(responseDto);
    }
}
