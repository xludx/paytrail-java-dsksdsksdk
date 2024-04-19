# SettlementsApi

All URIs are relative to *https://services.paytrail.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listSettlementIds**](SettlementsApi.md#listSettlementIds) | **GET** /settlements | List settlement IDs |


<a id="listSettlementIds"></a>
# **listSettlementIds**
> List&lt;SettlementIdItem&gt; listSettlementIds().startDate(startDate).endDate(endDate).bankReference(bankReference).limit(limit).submerchant(submerchant).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).signature(signature).execute();

List settlement IDs

Returns settlement IDs 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.SettlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    SettlementsApi apiInstance = new SettlementsApi(defaultClient);
    LocalDate startDate = LocalDate.parse("2019-01-01"); // LocalDate | Filter out settlements created before given date.
    LocalDate endDate = LocalDate.parse("2019-01-01"); // LocalDate | Filter out settlements created after given date.
    String bankReference = "1234567890-1111"; // String | Only include settlements with the given bank reference
    Integer limit = 1; // Integer | Limit the number of settlement IDs returned
    Integer submerchant = 695874; // Integer | Get submerchant's payment report
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      List<SettlementIdItem> result = apiInstance.listSettlementIds()
            .startDate(startDate)
            .endDate(endDate)
            .bankReference(bankReference)
            .limit(limit)
            .submerchant(submerchant)
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTimestamp(checkoutTimestamp)
            .signature(signature)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettlementsApi#listSettlementIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | **LocalDate**| Filter out settlements created before given date. | [optional] |
| **endDate** | **LocalDate**| Filter out settlements created after given date. | [optional] |
| **bankReference** | **String**| Only include settlements with the given bank reference | [optional] |
| **limit** | **Integer**| Limit the number of settlement IDs returned | [optional] |
| **submerchant** | **Integer**| Get submerchant&#39;s payment report | [optional] |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**List&lt;SettlementIdItem&gt;**](SettlementIdItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of settlement IDs |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **0** | Unexpected error |  -  |

