

# PaymentRequestResponse

Response for a successful payment request. Mechant ecom site can then either redirect the user to the URL given in href, or render the payment provider forms onsite. For each payment method an HTML form needs to be rendered using the parameters returned for each payment method provider. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | Checkout assigned transaction ID for the payment. |  |
|**href** | **String** | Unique URL to hosted payment gateway |  |
|**terms** | **String** | Text containing a link to the terms of payment |  [optional] |
|**groups** | [**List&lt;PaymentMethodGroupData&gt;**](PaymentMethodGroupData.md) | Contains data about the payment method groups. Contains only the groups found in the response&#39;s providers. |  [optional] |
|**providers** | [**List&lt;PaymentMethodProvider&gt;**](PaymentMethodProvider.md) |  |  [optional] |



