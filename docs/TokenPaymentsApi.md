# TokenPaymentsApi

All URIs are relative to *https://services.paytrail.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCardForm**](TokenPaymentsApi.md#addCardForm) | **POST** /tokenization/addcard-form | Request a redirect to card addition form |
| [**requestTokenForTokenizationId**](TokenPaymentsApi.md#requestTokenForTokenizationId) | **POST** /tokenization/{checkout-tokenization-id} | Request a card token for given tokenization id |
| [**tokenCitAuthorizationHold**](TokenPaymentsApi.md#tokenCitAuthorizationHold) | **POST** /payments/token/cit/authorization-hold | Request customer initiated transaction authorization hold on token |
| [**tokenCitCharge**](TokenPaymentsApi.md#tokenCitCharge) | **POST** /payments/token/cit/charge | Request customer initiated transaction charge on token |
| [**tokenCommit**](TokenPaymentsApi.md#tokenCommit) | **POST** /payments/{transactionId}/token/commit | Request committing (charging) of previously created authorization hold on token |
| [**tokenMitAuthorizationHold**](TokenPaymentsApi.md#tokenMitAuthorizationHold) | **POST** /payments/token/mit/authorization-hold | Request merchant initiated transaction authorization hold on token |
| [**tokenMitCharge**](TokenPaymentsApi.md#tokenMitCharge) | **POST** /payments/token/mit/charge | Request merchant initiated transaction charge on token |
| [**tokenRevert**](TokenPaymentsApi.md#tokenRevert) | **POST** /payments/{transactionId}/token/revert | Revert (removal) of previously created authorization hold on token |


<a id="addCardForm"></a>
# **addCardForm**
> addCardForm(addCardFormRequest).execute();

Request a redirect to card addition form

Request a redirect to card addition form. This will redirect user to the card addition form, then back to Checkout servers, and finally to merchant&#39;s redirect url. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.TokenPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    TokenPaymentsApi apiInstance = new TokenPaymentsApi(defaultClient);
    AddCardFormRequest addCardFormRequest = new AddCardFormRequest(); // AddCardFormRequest | Add card payload
    try {
      apiInstance.addCardForm(addCardFormRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenPaymentsApi#addCardForm");
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
| **addCardFormRequest** | [**AddCardFormRequest**](AddCardFormRequest.md)| Add card payload | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Redirect to card addition form (or checkout-redirect-cancel-url) |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Tokenization not allowed for merchant |  -  |

<a id="requestTokenForTokenizationId"></a>
# **requestTokenForTokenizationId**
> TokenizationRequestResponse requestTokenForTokenizationId(checkoutTokenizationId, getTokenRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).checkoutTokenizationId2(checkoutTokenizationId2).platformName(platformName).signature(signature).execute();

Request a card token for given tokenization id

Use checkout-tokenization-id received from /tokenization/addcard-form redirect to request a token which can be used for payments. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.TokenPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    TokenPaymentsApi apiInstance = new TokenPaymentsApi(defaultClient);
    UUID checkoutTokenizationId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | Tokenization id received from /tokenization/addcard-form
    GetTokenRequest getTokenRequest = new GetTokenRequest(); // GetTokenRequest | Tokenization request payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    UUID checkoutTokenizationId2 = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | Tokenization id received from /tokenization/addcard-form
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      TokenizationRequestResponse result = apiInstance.requestTokenForTokenizationId(checkoutTokenizationId, getTokenRequest)
            .checkoutAccount(checkoutAccount)
            .checkoutAlgorithm(checkoutAlgorithm)
            .checkoutMethod(checkoutMethod)
            .checkoutTimestamp(checkoutTimestamp)
            .checkoutNonce(checkoutNonce)
            .checkoutTokenizationId2(checkoutTokenizationId2)
            .platformName(platformName)
            .signature(signature)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenPaymentsApi#requestTokenForTokenizationId");
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
| **checkoutTokenizationId** | **UUID**| Tokenization id received from /tokenization/addcard-form | |
| **getTokenRequest** | [**GetTokenRequest**](GetTokenRequest.md)| Tokenization request payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **checkoutTokenizationId2** | **UUID**| Tokenization id received from /tokenization/addcard-form | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**TokenizationRequestResponse**](TokenizationRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tokenization request response |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Credit cards and/or AMEX not enabled for merchant |  -  |

<a id="tokenCitAuthorizationHold"></a>
# **tokenCitAuthorizationHold**
> TokenMITPaymentResponse tokenCitAuthorizationHold(tokenPaymentRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Request customer initiated transaction authorization hold on token

Request customer initiated transaction authorization hold on token. CIT authorization holds can sometimes require further 3DS authentication step-up. See detailed documentation at https://checkoutfinland.github.io/psp-api/#/?id&#x3D;customer-initiated-transactions-cit 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.TokenPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    TokenPaymentsApi apiInstance = new TokenPaymentsApi(defaultClient);
    TokenPaymentRequest tokenPaymentRequest = new TokenPaymentRequest(); // TokenPaymentRequest | CIT authorization hold payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      TokenMITPaymentResponse result = apiInstance.tokenCitAuthorizationHold(tokenPaymentRequest)
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
      System.err.println("Exception when calling TokenPaymentsApi#tokenCitAuthorizationHold");
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
| **tokenPaymentRequest** | [**TokenPaymentRequest**](TokenPaymentRequest.md)| CIT authorization hold payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**TokenMITPaymentResponse**](TokenMITPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CIT authorization hold request created successfully. |  -  |
| **403** | CIT authorization hold requires 3DS authentication step up. Please redirect user to given URL. |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

<a id="tokenCitCharge"></a>
# **tokenCitCharge**
> TokenMITPaymentResponse tokenCitCharge(tokenPaymentRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Request customer initiated transaction charge on token

Request customer initiated transaction charge on token. CIT charges can sometimes require further 3DS authentication step-up. See detailed documentation at https://checkoutfinland.github.io/psp-api/#/?id&#x3D;customer-initiated-transactions-cit 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.TokenPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    TokenPaymentsApi apiInstance = new TokenPaymentsApi(defaultClient);
    TokenPaymentRequest tokenPaymentRequest = new TokenPaymentRequest(); // TokenPaymentRequest | CIT Charge payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      TokenMITPaymentResponse result = apiInstance.tokenCitCharge(tokenPaymentRequest)
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
      System.err.println("Exception when calling TokenPaymentsApi#tokenCitCharge");
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
| **tokenPaymentRequest** | [**TokenPaymentRequest**](TokenPaymentRequest.md)| CIT Charge payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**TokenMITPaymentResponse**](TokenMITPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CIT charge request created successfully. |  -  |
| **403** | CIT charge requires 3DS authentication step up. Please redirect user to given URL. |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

<a id="tokenCommit"></a>
# **tokenCommit**
> TokenMITPaymentResponse tokenCommit(transactionId, tokenPaymentRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTransactionId(checkoutTransactionId).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Request committing (charging) of previously created authorization hold on token

Request committing of previously created authorization hold. The final amount committed can either equal or be less than the authorization hold. The committed amount may not exceed the authorization hold. The final items may differ from the ones used when creating the authorization hold. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.TokenPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    TokenPaymentsApi apiInstance = new TokenPaymentsApi(defaultClient);
    UUID transactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | The transaction ID
    TokenPaymentRequest tokenPaymentRequest = new TokenPaymentRequest(); // TokenPaymentRequest | CIT commit payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    UUID checkoutTransactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | The same transaction ID as in route
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      TokenMITPaymentResponse result = apiInstance.tokenCommit(transactionId, tokenPaymentRequest)
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
      System.err.println("Exception when calling TokenPaymentsApi#tokenCommit");
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
| **transactionId** | **UUID**| The transaction ID | |
| **tokenPaymentRequest** | [**TokenPaymentRequest**](TokenPaymentRequest.md)| CIT commit payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTransactionId** | **UUID**| The same transaction ID as in route | [optional] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**TokenMITPaymentResponse**](TokenMITPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CIT authorization hold committed successfully. |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

<a id="tokenMitAuthorizationHold"></a>
# **tokenMitAuthorizationHold**
> TokenMITPaymentResponse tokenMitAuthorizationHold(tokenPaymentRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Request merchant initiated transaction authorization hold on token

Request merchant initiated transaction authorization hold on token. This method should be used when creating an authorization hold on the customer&#39;s card in a context, where the customer is not actively participating in the transaction. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.TokenPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    TokenPaymentsApi apiInstance = new TokenPaymentsApi(defaultClient);
    TokenPaymentRequest tokenPaymentRequest = new TokenPaymentRequest(); // TokenPaymentRequest | MIT Charge payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      TokenMITPaymentResponse result = apiInstance.tokenMitAuthorizationHold(tokenPaymentRequest)
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
      System.err.println("Exception when calling TokenPaymentsApi#tokenMitAuthorizationHold");
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
| **tokenPaymentRequest** | [**TokenPaymentRequest**](TokenPaymentRequest.md)| MIT Charge payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**TokenMITPaymentResponse**](TokenMITPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | MIT authorization hold request created successfully |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

<a id="tokenMitCharge"></a>
# **tokenMitCharge**
> TokenMITPaymentResponse tokenMitCharge(tokenPaymentRequest).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Request merchant initiated transaction charge on token

Request merchant initiated transaction charge on token. This method should be used when charging the customer&#39;s card in a context, where the customer is not actively participating in the transaction. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.TokenPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    TokenPaymentsApi apiInstance = new TokenPaymentsApi(defaultClient);
    TokenPaymentRequest tokenPaymentRequest = new TokenPaymentRequest(); // TokenPaymentRequest | MIT Charge payload
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      TokenMITPaymentResponse result = apiInstance.tokenMitCharge(tokenPaymentRequest)
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
      System.err.println("Exception when calling TokenPaymentsApi#tokenMitCharge");
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
| **tokenPaymentRequest** | [**TokenPaymentRequest**](TokenPaymentRequest.md)| MIT Charge payload | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**TokenMITPaymentResponse**](TokenMITPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | MIT charge request created successfully |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

<a id="tokenRevert"></a>
# **tokenRevert**
> TokenMITPaymentResponse tokenRevert(transactionId).checkoutAccount(checkoutAccount).checkoutAlgorithm(checkoutAlgorithm).checkoutMethod(checkoutMethod).checkoutTransactionId(checkoutTransactionId).checkoutTimestamp(checkoutTimestamp).checkoutNonce(checkoutNonce).platformName(platformName).signature(signature).execute();

Revert (removal) of previously created authorization hold on token

Request committing of previously created authorization hold. A successful revert will remove the authorization hold from the payer&#39;s bank account. 

### Example
```java
// Import classes:
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.models.*;
import com.suchventure.paytrail.client.api.TokenPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://services.paytrail.com");

    TokenPaymentsApi apiInstance = new TokenPaymentsApi(defaultClient);
    UUID transactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | The transaction ID
    Integer checkoutAccount = 375917; // Integer | Merchant ID
    String checkoutAlgorithm = "sha256"; // String | HMAC algorithm
    String checkoutMethod = "GET"; // String | HTTP method of the request
    UUID checkoutTransactionId = UUID.fromString("93ee8d18-10db-410b-92ac-7d6e49369ce3"); // UUID | The same transaction ID as in route
    OffsetDateTime checkoutTimestamp = OffsetDateTime.parse("2018-08-08T10:10:59Z"); // OffsetDateTime | Current timestamp in ISO 8601 format
    String checkoutNonce = "39da40b8-5fb0-499c-869d-35e575b9a6cd"; // String | Unique random identifier
    String platformName = "platformName_example"; // String | For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration.
    String signature = "signature_example"; // String | HMAC signature calculated over the request headers and payload
    try {
      TokenMITPaymentResponse result = apiInstance.tokenRevert(transactionId)
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
      System.err.println("Exception when calling TokenPaymentsApi#tokenRevert");
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
| **transactionId** | **UUID**| The transaction ID | |
| **checkoutAccount** | **Integer**| Merchant ID | [optional] |
| **checkoutAlgorithm** | **String**| HMAC algorithm | [optional] [enum: sha256, sha512] |
| **checkoutMethod** | **String**| HTTP method of the request | [optional] [enum: GET, POST] |
| **checkoutTransactionId** | **UUID**| The same transaction ID as in route | [optional] |
| **checkoutTimestamp** | **OffsetDateTime**| Current timestamp in ISO 8601 format | [optional] |
| **checkoutNonce** | **String**| Unique random identifier | [optional] |
| **platformName** | **String**| For SaaS services, use the marketing name of the platform (for example, shopify). For third party eCommerce platform plugins, use the platform name and your identifier, like company name (for example, woocommerce-yourcompany). Platform and integrator information helps customer service to provide better assistance for the merchants using the integration. | [optional] |
| **signature** | **String**| HMAC signature calculated over the request headers and payload | [optional] |

### Return type

[**TokenMITPaymentResponse**](TokenMITPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authorization hold reverted successfully. |  -  |
| **400** | Request did not pass input validation |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

