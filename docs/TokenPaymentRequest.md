

# TokenPaymentRequest

Payment request payload

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stamp** | **String** | Merchant specific unique stamp |  |
|**reference** | **String** | Merchant reference for the payment |  |
|**amount** | **Long** | Total amount of the payment (sum of items), VAT included |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  |
|**language** | [**LanguageEnum**](#LanguageEnum) | Alpha-2 language code for the payment process |  |
|**orderId** | **String** | Order ID. Used for eg. Collector payments order ID. If not given, merchant reference is used instead. |  [optional] |
|**items** | [**List&lt;Item&gt;**](Item.md) |  |  |
|**customer** | [**Customer**](Customer.md) |  |  |
|**deliveryAddress** | [**Address**](Address.md) |  |  [optional] |
|**invoicingAddress** | [**Address**](Address.md) |  |  [optional] |
|**redirectUrls** | [**Callbacks**](Callbacks.md) |  |  |
|**callbackUrls** | [**Callbacks**](Callbacks.md) |  |  [optional] |
|**callbackDelay** | **Integer** | Callback delay in seconds. If callback URLs and delay are provided, callbacks will be called after the delay. |  [optional] |
|**token** | **String** | Payment card token received from request to /tokenization/{checkout-tokenization-id} |  |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| EUR | &quot;EUR&quot; |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| FI | &quot;FI&quot; |
| SV | &quot;SV&quot; |
| EN | &quot;EN&quot; |



