

# PaymentReportCallbackJSON

The returned fields can be filtered out by specifying \"reportFields\" parameter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entryDate** | **String** | When the payment was paid or initialized |  [optional] |
|**created** | **String** | Hour and minute of the payment creation |  [optional] |
|**amount** | **Float** | Payment amount in Euros |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Payment status |  [optional] |
|**firstname** | **String** | First name |  [optional] |
|**familyname** | **String** | Last name |  [optional] |
|**description** | **String** | Payment description |  [optional] |
|**reference** | **String** | Merchant&#39;s reference |  [optional] |
|**paymentMethod** | **String** | Payment method |  [optional] |
|**stamp** | **String** | Payment Stamp |  [optional] |
|**address** | **String** | Delivery address |  [optional] |
|**postcode** | **String** | Postal code |  [optional] |
|**postoffice** | **String** | Post office |  [optional] |
|**country** | **String** | Country of delivery |  [optional] |
|**checkoutReference** | **String** | Checkout reference |  [optional] |
|**archiveNumber** | **String** | Archive number |  [optional] |
|**payerName** | **String** | Name from bank |  [optional] |
|**settlementId** | **BigDecimal** | Settlement (report) id |  [optional] |
|**settlementDate** | **String** | When the payment is settled |  [optional] |
|**originalTradeReference** | **String** | Merchant&#39;s reference of the original payment in case of refund |  [optional] |
|**vatPercentage** | **Float** | Payment VAT percentage |  [optional] |
|**vatAmount** | **Float** | Payment VAT amount in Euros |  [optional] |
|**paymentMethodFee** | **Float** | Payment method fee in Euros |  [optional] |
|**paymentMethodCommission** | **Float** | Payment method commission amount in Euros |  [optional] |
|**shopInShopCommission** | **Float** | Payment method commission amount in Euros |  [optional] |
|**shopInShopCommissionVatPercentage** | **Float** | Payment method commission VAT percentage |  [optional] |
|**shopInShopCommissionVatAmount** | **Float** | Payment method commission VAT amount in Euros |  [optional] |
|**refunditems** | **String** | Contains a &#x60;|&#x60; (pipe) -delimited list of *stamp*:*amount* pairs. Pairs are delimited by a &#x60;:&#x60; (colon). Stamp refers to the payment item&#39;s stamp that was refunded. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;New&quot; |
| PAID | &quot;Paid&quot; |
| WAITING_FOR_APPROVAL | &quot;waiting for approval&quot; |
| CANCELLED | &quot;Cancelled&quot; |
| TIMEOUT | &quot;Timeout&quot; |
| HALTED | &quot;Halted&quot; |
| DELAYED | &quot;Delayed&quot; |
| PAID_AND_SETTLED | &quot;Paid and settled&quot; |



