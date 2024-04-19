

# RefundResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**transactionId** | **UUID** | Checkout transaction ID for the refund |  [optional] |
|**provider** | **String** | Payment method provider |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;ok&quot; |
| PENDING | &quot;pending&quot; |
| FAIL | &quot;fail&quot; |



