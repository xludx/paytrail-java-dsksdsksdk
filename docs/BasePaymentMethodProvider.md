

# BasePaymentMethodProvider


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the provider |  |
|**name** | **String** | Display name of the payment method |  |
|**svg** | **String** | URL to payment method SVG icon (recommended to be used instead if PNG) |  |
|**icon** | **String** | URL to payment method PNG icon |  |
|**group** | [**GroupEnum**](#GroupEnum) |  |  |



## Enum: GroupEnum

| Name | Value |
|---- | -----|
| MOBILE | &quot;mobile&quot; |
| BANK | &quot;bank&quot; |
| CREDITCARD | &quot;creditcard&quot; |
| CREDIT | &quot;credit&quot; |



