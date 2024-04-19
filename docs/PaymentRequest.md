

# PaymentRequest

Payment request payload

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stamp** | **String** | Merchant specific unique stamp |  |
|**reference** | **String** | Merchant reference for the payment |  |
|**amount** | **Long** | Total amount of the payment (sum of items), VAT should be included in amount unless &#x60;usePricesWithoutVat&#x60; is set to true |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  |
|**language** | [**LanguageEnum**](#LanguageEnum) | Alpha-2 language code for the payment process |  |
|**orderId** | **String** | Order ID. Used for eg. Collector payments order ID. If not given, merchant reference is used instead. |  [optional] |
|**items** | [**List&lt;Item&gt;**](Item.md) |  |  |
|**customer** | [**Customer**](Customer.md) |  |  |
|**deliveryAddress** | [**Address**](Address.md) |  |  [optional] |
|**invoicingAddress** | [**Address**](Address.md) |  |  [optional] |
|**manualInvoiceActivation** | **Boolean** | If paid with invoice payment method, the invoice will not be activated automatically immediately. Currently only supported with Collector. |  [optional] |
|**redirectUrls** | [**Callbacks**](Callbacks.md) |  |  |
|**callbackUrls** | [**Callbacks**](Callbacks.md) |  |  [optional] |
|**callbackDelay** | **Integer** | Callback delay in seconds. If callback URLs and delay are provided, callbacks will be called after the delay. |  [optional] |
|**groups** | [**List&lt;GroupsEnum&gt;**](#List&lt;GroupsEnum&gt;) | Optionally return only payment methods for selected groups |  [optional] |
|**usePricesWithoutVat** | **Boolean** | If true, &#x60;amount&#x60; and &#x60;items.unitPrice&#x60; should be sent to API without VAT, and final VAT-included prices are calculated by Paytrail&#39;s system (with prices rounded to closest cent). Also, when true, items must be included. |  [optional] |



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



## Enum: List&lt;GroupsEnum&gt;

| Name | Value |
|---- | -----|
| MOBILE | &quot;mobile&quot; |
| BANK | &quot;bank&quot; |
| CREDITCARD | &quot;creditcard&quot; |
| CREDIT | &quot;credit&quot; |
| OTHER | &quot;other&quot; |



