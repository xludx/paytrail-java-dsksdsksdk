

# Refund


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Long** | The amount to refund. Required for normal merchant accounts. SiS aggregate can refund the whole purchase by providing just the amount  |  [optional] |
|**refundStamp** | **String** | Merchant specific unique stamp for the refund |  [optional] |
|**refundReference** | **String** | Merchant reference for the refund |  [optional] |
|**items** | [**List&lt;RefundItem&gt;**](RefundItem.md) | Item level refund information for SiS refunds. |  [optional] |
|**callbackUrls** | [**Callbacks**](Callbacks.md) |  |  |



