

# Payment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | Transaction ID |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction status |  |
|**amount** | **Long** |  |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  |
|**stamp** | **String** |  |  |
|**reference** | **String** |  |  |
|**createdAt** | **String** |  |  |
|**href** | **String** | If transaction is in status &#39;new&#39;, link to the hosted payment gateway |  [optional] |
|**provider** | **String** | If processed, the name of the payment method provider |  [optional] |
|**filingCode** | **String** | If paid, the filing code issued by the payment method provider if any |  [optional] |
|**paidAt** | **String** | Timestamp when the transaction was paid |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;new&quot; |
| OK | &quot;ok&quot; |
| FAIL | &quot;fail&quot; |
| PENDING | &quot;pending&quot; |
| DELAYED | &quot;delayed&quot; |
| AUTHORIZATION_HOLD | &quot;authorization-hold&quot; |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| EUR | &quot;EUR&quot; |



