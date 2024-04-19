# ProvidersApi

All URIs are relative to *https://services.paytrail.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGroupedPaymentProviders**](ProvidersApi.md#getGroupedPaymentProviders) | **GET** /merchants/grouped-payment-providers | List grouped merchant payment methods |
| [**getPaymentProviders**](ProvidersApi.md#getPaymentProviders) | **GET** /merchants/payment-providers | List merchant payment methods |


<a id="getGroupedPaymentProviders"></a>
# **getGroupedPaymentProviders**
> GroupedPaymentProvidersResponse getGroupedPaymentProviders().checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).signature(signature).amount(amount).groups(groups).language(language).execute();

List grouped merchant payment methods

Similar to the /merchants/payment-providers, but in addition of a flat list of providers, it returns payment group data containing localized names, icon URLs and grouped providers, and a localized text with a link to the terms of payment. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    Integer amount = 500; // Integer | Optional amount in minor unit (eg. EUR cents) for the payment providers. Some providers have minimum or maximum amounts that can be purchased. 
    List<String> groups = Arrays.asList(); // List<String> | Comma separated list of payment method groups to include in the reply.
    String language = "FI"; // String | Language code of the language the terms of payment and the payment group names will be localized in. Defaults to FI if left undefined 
    try {
      GroupedPaymentProvidersResponse result = apiInstance.getGroupedPaymentProviders()
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTimestamp(checkoutTimestamp)
            .checkoutNonce(checkoutNonce)
            .signature(signature)
            .amount(amount)
            .groups(groups)
            .language(language)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#getGroupedPaymentProviders");
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
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |
| **amount** | **Integer**| Optional amount in minor unit (eg. EUR cents) for the payment providers. Some providers have minimum or maximum amounts that can be purchased.  | [optional] |
| **groups** | [**List&lt;String&gt;**](String.md)| Comma separated list of payment method groups to include in the reply. | [optional] [enum: mobile, bank, creditcard, credit, other] |
| **language** | **String**| Language code of the language the terms of payment and the payment group names will be localized in. Defaults to FI if left undefined  | [optional] [enum: FI, SV, EN] |

### Return type

[**GroupedPaymentProvidersResponse**](GroupedPaymentProvidersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment methods available |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

<a id="getPaymentProviders"></a>
# **getPaymentProviders**
> List&lt;BasePaymentMethodProvider&gt; getPaymentProviders().checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).signature(signature).amount(amount).groups(groups).execute();

List merchant payment methods

Returns the payment methods available for merchant without creating a new payment to the system. Useful for displaying payment provider icons during different phases of checkout before finally actually creating the payment request when customer decides to pay 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    Integer amount = 500; // Integer | Optional amount in minor unit (eg. EUR cents) for the payment providers. Some providers have minimum or maximum amounts that can be purchased. 
    List<String> groups = Arrays.asList(); // List<String> | Comma separated list of payment method groups to include in the reply.
    try {
      List<BasePaymentMethodProvider> result = apiInstance.getPaymentProviders()
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTimestamp(checkoutTimestamp)
            .checkoutNonce(checkoutNonce)
            .signature(signature)
            .amount(amount)
            .groups(groups)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#getPaymentProviders");
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
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |
| **amount** | **Integer**| Optional amount in minor unit (eg. EUR cents) for the payment providers. Some providers have minimum or maximum amounts that can be purchased.  | [optional] |
| **groups** | [**List&lt;String&gt;**](String.md)| Comma separated list of payment method groups to include in the reply. | [optional] [enum: mobile, bank, creditcard, credit, other] |

### Return type

[**List&lt;BasePaymentMethodProvider&gt;**](BasePaymentMethodProvider.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment methods available |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

