# PaymentsApi

All URIs are relative to *https://services.paytrail.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateInvoiceByTransactionId**](PaymentsApi.md#activateInvoiceByTransactionId) | **POST** /payments/{transactionId}/activate-invoice | Activate invoice |
| [**createPayment**](PaymentsApi.md#createPayment) | **POST** /payments | Create a new open payment |
| [**getGroupedPaymentProviders**](PaymentsApi.md#getGroupedPaymentProviders) | **GET** /merchants/grouped-payment-providers | List grouped merchant payment methods |
| [**getPaymentByTransactionId**](PaymentsApi.md#getPaymentByTransactionId) | **GET** /payments/{transactionId} | Get a payment by Checkout transaction ID |
| [**getPaymentProviders**](PaymentsApi.md#getPaymentProviders) | **GET** /merchants/payment-providers | List merchant payment methods |
| [**refundPaymentByTransactionId**](PaymentsApi.md#refundPaymentByTransactionId) | **POST** /payments/{transactionId}/refund | Refund a payment |


<a id="activateInvoiceByTransactionId"></a>
# **activateInvoiceByTransactionId**
> ActivateInvoiceResponse activateInvoiceByTransactionId(transactionId).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTransactionId(checkoutTransactionId).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).signature(signature).execute();

Activate invoice

Manually activate invoice by transaction ID. Can only be used if payment was paid with Collector and is in pending status. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID transactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | Transaction ID of payment to activate invoice
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    UUID checkoutTransactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | The same transaction ID as in route
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      ActivateInvoiceResponse result = apiInstance.activateInvoiceByTransactionId(transactionId)
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTransactionId(checkoutTransactionId)
            .checkoutTimestamp(checkoutTimestamp)
            .checkoutNonce(checkoutNonce)
            .signature(signature)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#activateInvoiceByTransactionId");
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
| **transactionId** | **UUID**| Transaction ID of payment to activate invoice | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTransactionId** | **UUID**| The same transaction ID as in route | [optional] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**ActivateInvoiceResponse**](ActivateInvoiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoice activated succesfully |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **0** | Unexpected error |  -  |

<a id="createPayment"></a>
# **createPayment**
> PaymentRequestResponse createPayment(paymentRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Create a new open payment

Create a new open payment, returns a list of available payment methods.

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | Payment body payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      PaymentRequestResponse result = apiInstance.createPayment(paymentRequest)
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTimestamp(checkoutTimestamp)
            .checkoutNonce(checkoutNonce)
            .platformName(platformName)
            .signature(signature)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#createPayment");
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
| **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)| Payment body payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**PaymentRequestResponse**](PaymentRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Payment request created successfully |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

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
import com.suchventure.paytrail.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
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
      System.err.println("Exception when calling PaymentsApi#getGroupedPaymentProviders");
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

<a id="getPaymentByTransactionId"></a>
# **getPaymentByTransactionId**
> Payment getPaymentByTransactionId(transactionId).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTransactionId(checkoutTransactionId).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Get a payment by Checkout transaction ID

Get a single payment

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID transactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | Transaction ID of payment to fetch
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    UUID checkoutTransactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | The same transaction ID as in route
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      Payment result = apiInstance.getPaymentByTransactionId(transactionId)
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTransactionId(checkoutTransactionId)
            .checkoutTimestamp(checkoutTimestamp)
            .checkoutNonce(checkoutNonce)
            .platformName(platformName)
            .signature(signature)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getPaymentByTransactionId");
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
| **transactionId** | **UUID**| Transaction ID of payment to fetch | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTransactionId** | **UUID**| The same transaction ID as in route | [optional] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment response |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
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
import com.suchventure.paytrail.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
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
      System.err.println("Exception when calling PaymentsApi#getPaymentProviders");
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

<a id="refundPaymentByTransactionId"></a>
# **refundPaymentByTransactionId**
> RefundResponse refundPaymentByTransactionId(transactionId, refund).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTransactionId(checkoutTransactionId).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Refund a payment

Refund a payment by transaction ID. Refund operation is asynchronous. Refund request is validated, and if the refund can be done a 201 is returned. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID transactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | Transaction ID of payment to refund
    Refund refund = new Refund(); // Refund | Refund payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    UUID checkoutTransactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | The same transaction ID as in route
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      RefundResponse result = apiInstance.refundPaymentByTransactionId(transactionId, refund)
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTransactionId(checkoutTransactionId)
            .checkoutTimestamp(checkoutTimestamp)
            .checkoutNonce(checkoutNonce)
            .platformName(platformName)
            .signature(signature)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#refundPaymentByTransactionId");
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
| **transactionId** | **UUID**| Transaction ID of payment to refund | |
| **refund** | [**Refund**](Refund.md)| Refund payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTransactionId** | **UUID**| The same transaction ID as in route | [optional] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**RefundResponse**](RefundResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Refund created succesfully |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **422** | Payment method provider does not support refunds |  -  |
| **0** | Unexpected error |  -  |

