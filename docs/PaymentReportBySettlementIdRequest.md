

# PaymentReportBySettlementIdRequest

Payment report request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestType** | [**RequestTypeEnum**](#RequestTypeEnum) | In which format is the report delivered in |  |
|**callbackUrl** | **String** | To which URL is the report delivered to |  |
|**reportFields** | [**List&lt;ReportFieldsEnum&gt;**](#List&lt;ReportFieldsEnum&gt;) | Limit the amount of fields included in the report. By default all fields are included. |  [optional] |
|**submerchant** | **Integer** | Get submerchant&#39;s payment report |  [optional] |



## Enum: RequestTypeEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| CSV | &quot;csv&quot; |



## Enum: List&lt;ReportFieldsEnum&gt;

| Name | Value |
|---- | -----|
| ENTRYDATE | &quot;entryDate&quot; |
| CREATED | &quot;created&quot; |
| AMOUNT | &quot;amount&quot; |
| STATUS | &quot;status&quot; |
| FIRSTNAME | &quot;firstname&quot; |
| FAMILYNAME | &quot;familyname&quot; |
| DESCRIPTION | &quot;description&quot; |
| REFERENCE | &quot;reference&quot; |
| PAYMENTMETHOD | &quot;paymentMethod&quot; |
| STAMP | &quot;stamp&quot; |
| ADDRESS | &quot;address&quot; |
| POSTCODE | &quot;postcode&quot; |
| POSTOFFICE | &quot;postoffice&quot; |
| COUNTRY | &quot;country&quot; |
| CHECKOUTREFERENCE | &quot;checkoutReference&quot; |
| ARCHIVENUMBER | &quot;archiveNumber&quot; |
| PAYERNAME | &quot;payerName&quot; |
| SETTLEMENTID | &quot;settlementId&quot; |
| SETTLEMENTDATE | &quot;settlementDate&quot; |
| ORIGINALTRADEREFERENCE | &quot;originalTradeReference&quot; |
| VATPERCENTAGE | &quot;vatPercentage&quot; |
| VATAMOUNT | &quot;vatAmount&quot; |
| PAYMENTMETHODFEE | &quot;paymentMethodFee&quot; |
| PAYMENTMETHODCOMMISSION | &quot;paymentMethodCommission&quot; |
| SHOPINSHOPCOMMISSION | &quot;shopInShopCommission&quot; |
| SHOPINSHOPCOMMISSIONVATPERCENTAGE | &quot;shopInShopCommissionVatPercentage&quot; |
| SHOPINSHOPCOMMISSIONVATAMOUNT | &quot;shopInShopCommissionVatAmount&quot; |



