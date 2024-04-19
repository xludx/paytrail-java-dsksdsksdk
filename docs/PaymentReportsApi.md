# PaymentReportsApi

All URIs are relative to *https://services.paytrail.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**requestPaymentReport**](PaymentReportsApi.md#requestPaymentReport) | **POST** /payments/report | Request a payment report |
| [**requestPaymentReportBySettlementId**](PaymentReportsApi.md#requestPaymentReportBySettlementId) | **POST** /settlements/{settlementId}/payments/report | Request a report of payments contained in a given settlement |


<a id="requestPaymentReport"></a>
# **requestPaymentReport**
> PaymentReportRequestResponse requestPaymentReport(paymentReportRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).signature(signature).execute();

Request a payment report

Request a report of payments to be sent to the given callback url. Callback schema defined in PaymentReportCallbackJSON. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.PaymentReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    PaymentReportsApi apiInstance = new PaymentReportsApi(defaultClient);
    PaymentReportRequest paymentReportRequest = new PaymentReportRequest(); // PaymentReportRequest | Payment body payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      PaymentReportRequestResponse result = apiInstance.requestPaymentReport(paymentReportRequest)
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTimestamp(checkoutTimestamp)
            .signature(signature)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentReportsApi#requestPaymentReport");
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
| **paymentReportRequest** | [**PaymentReportRequest**](PaymentReportRequest.md)| Payment body payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**PaymentReportRequestResponse**](PaymentReportRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment report request response |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **0** | Unexpected error |  -  |

<a id="requestPaymentReportBySettlementId"></a>
# **requestPaymentReportBySettlementId**
> PaymentReportRequestResponse requestPaymentReportBySettlementId(settlementId, paymentReportBySettlementIdRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).signature(signature).execute();

Request a report of payments contained in a given settlement

Request a report of payments contained in a given settlement to be sent to the given callback url. Callback schema defined in PaymentReportCallbackJSON. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.PaymentReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    PaymentReportsApi apiInstance = new PaymentReportsApi(defaultClient);
    String settlementId = "2397548234"; // String | Settlement ID
    PaymentReportBySettlementIdRequest paymentReportBySettlementIdRequest = new PaymentReportBySettlementIdRequest(); // PaymentReportBySettlementIdRequest | Payment body payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      PaymentReportRequestResponse result = apiInstance.requestPaymentReportBySettlementId(settlementId, paymentReportBySettlementIdRequest)
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTimestamp(checkoutTimestamp)
            .signature(signature)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentReportsApi#requestPaymentReportBySettlementId");
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
| **settlementId** | **String**| Settlement ID | |
| **paymentReportBySettlementIdRequest** | [**PaymentReportBySettlementIdRequest**](PaymentReportBySettlementIdRequest.md)| Payment body payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**PaymentReportRequestResponse**](PaymentReportRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment report request response |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **0** | Unexpected error |  -  |

