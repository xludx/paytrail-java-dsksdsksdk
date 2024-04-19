

# AddCardFormRequest

Add card form request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkoutAccount** | **Integer** | Merchant ID |  |
|**checkoutAlgorithm** | [**CheckoutAlgorithmEnum**](#CheckoutAlgorithmEnum) | HMAC algorithm |  |
|**checkoutMethod** | [**CheckoutMethodEnum**](#CheckoutMethodEnum) | HTTP method of the request |  [optional] |
|**checkoutNonce** | **String** | Unique random identifier |  [optional] |
|**checkoutTimestamp** | **OffsetDateTime** | Current timestamp in ISO 8601 format |  [optional] |
|**checkoutRedirectSuccessUrl** | **String** | Merchant&#39;s url for user redirect on successful card addition |  |
|**checkoutRedirectCancelUrl** | **String** | Merchant&#39;s url for user redirect on failed card addition |  |
|**checkoutCallbackSuccessUrl** | **String** | Merchant&#39;s url called on successful card addition |  [optional] |
|**checkoutCallbackCancelUrl** | **String** | Merchant&#39;s url called on failed card addition |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) | Alpha-2 language code for the card addition form |  [optional] |
|**signature** | **String** | HMAC signature calculated over the request headers and payload |  [optional] |



## Enum: CheckoutAlgorithmEnum

| Name | Value |
|---- | -----|
| SHA256 | &quot;sha256&quot; |
| SHA512 | &quot;sha512&quot; |



## Enum: CheckoutMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| FI | &quot;FI&quot; |
| SV | &quot;SV&quot; |
| EN | &quot;EN&quot; |



