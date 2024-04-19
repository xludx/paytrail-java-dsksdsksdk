

# Item


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unitPrice** | **Long** | Unit price of an item in currency minor unit, eg. EUR cents. VAT should be included in amount unless &#x60;usePricesWithoutVat&#x60; is set to true. |  |
|**units** | **Long** | Number of units |  |
|**vatPercentage** | **Long** | Item VAT percentage |  |
|**productCode** | **String** | Merchant specific product code |  |
|**deliveryDate** | **LocalDate** | Estimated delivery date |  [optional] |
|**description** | **String** | Merchant specific product description |  [optional] |
|**category** | **String** | Item product category |  [optional] |
|**merchant** | **String** | Submerchant ID. Required for shop-in-shop payments, leave out from normal payments. |  [optional] |
|**stamp** | **String** | Submerchant specific unique stamp. Required for shop-in-shop payments, leave out from normal payments. |  [optional] |
|**reference** | **String** | Submerchant reference for the item. Required for shop-in-shop payments, leave out from normal payments. |  [optional] |
|**orderId** | **String** | Order ID. Used for eg. Collector payments order ID. If not given, merchant reference is used instead. |  [optional] |
|**commission** | [**ItemCommission**](ItemCommission.md) |  |  [optional] |



