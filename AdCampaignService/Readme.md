# AdCampaignService

### Purpose

* This service provides apis to ingest the incoming event stream from different tenants (retailers) for multiples events like ad view, click and addToCart action by the users on respective retailer website.
* Each retailer is treated as an individual tenant on the platform.

### Scope

Apis assumes in the incoming request the user in request context is registered or has access to only a single tenant at a time.Hence data lookup happens into that particular tenant only.

### Not in scope

Apis does not support aggregating results from multiple tenants if user in request context has acccess to multiple tenants.