package com.dunnhumby.AdCampaignService.dto;

public class AdMetricDto {

    private long clicks;

    private long views;

    private long additionsToCart;

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public long getAdditionsToCart() {
        return additionsToCart;
    }

    public void setAdditionsToCart(long additionsToCart) {
        this.additionsToCart = additionsToCart;
    }
}
