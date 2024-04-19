

# Card


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Card type, for example ‘Visa’ |  [optional] |
|**partialPan** | **String** | Last four digits of the card |  [optional] |
|**expireYear** | **String** | Card expiration year |  [optional] |
|**expireMonth** | **String** | Card expiration month |  [optional] |
|**cvcRequired** | **String** | Whether the CVC is required for paying with this card. Can be one of yes, no or not_tested. |  [optional] |
|**bin** | **String** | First 2 or 6 digits of the card number. (6 MC/VISA, 2 Amex/Diners) |  [optional] |
|**funding** | **String** | credit, debit or unknown |  [optional] |
|**countryCode** | **String** | e.g. FI |  |
|**category** | **String** | business, prepaid or unknown |  [optional] |
|**cardFingerprint** | **String** | Identifies a specific card number. Cards with the same PAN but different expiry dates will have the same PAN fingerprint. Hex string of length 64. |  [optional] |
|**panFingerprint** | **String** | Identifies a specific card, including the expiry date. Hex string of length 64. |  [optional] |



