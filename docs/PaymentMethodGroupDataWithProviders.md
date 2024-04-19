

# PaymentMethodGroupDataWithProviders


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**IdEnum**](#IdEnum) | ID of the group |  |
|**name** | **String** | Localized name of the group |  |
|**icon** | **String** | URL to the group PNG icon |  |
|**svg** | **String** | URL to the group SVG icon (recommended to be used instead if PNG) |  |
|**providers** | [**List&lt;PaymentMethodProvider&gt;**](PaymentMethodProvider.md) |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| MOBILE | &quot;mobile&quot; |
| BANK | &quot;bank&quot; |
| CREDITCARD | &quot;creditcard&quot; |
| CREDIT | &quot;credit&quot; |



