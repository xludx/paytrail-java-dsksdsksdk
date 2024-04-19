

# TokenCITPaymentResponse

Response for a successful customer initiated transaction payment request. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | Checkout assigned transaction ID for the payment. |  |
|**threeDSecureUrl** | **String** | URL for 3DS authentication step-up. If this is returned, merchants needs to redirect customer to this given URL for 3DS authentication. |  [optional] |



