# openapi-java-client

Payment API
- API version: 2.0.0
  - Build date: 2024-04-19T20:23:13.800614+03:00[Europe/Helsinki]
  - Generator version: 7.5.0

Paytrail Payment API


  For more information, please visit [https://github.com/paytrail/api-documentation/issues](https://github.com/paytrail/api-documentation/issues)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.suchventure.paytrail.client</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.suchventure.paytrail.client:openapi-java-client:2.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://services.paytrail.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PaymentReportsApi* | [**requestPaymentReport**](docs/PaymentReportsApi.md#requestPaymentReport) | **POST** /payments/report | Request a payment report
*PaymentReportsApi* | [**requestPaymentReportBySettlementId**](docs/PaymentReportsApi.md#requestPaymentReportBySettlementId) | **POST** /settlements/{settlementId}/payments/report | Request a report of payments contained in a given settlement
*PaymentsApi* | [**activateInvoiceByTransactionId**](docs/PaymentsApi.md#activateInvoiceByTransactionId) | **POST** /payments/{transactionId}/activate-invoice | Activate invoice
*PaymentsApi* | [**createPayment**](docs/PaymentsApi.md#createPayment) | **POST** /payments | Create a new open payment
*PaymentsApi* | [**getGroupedPaymentProviders**](docs/PaymentsApi.md#getGroupedPaymentProviders) | **GET** /merchants/grouped-payment-providers | List grouped merchant payment methods
*PaymentsApi* | [**getPaymentByTransactionId**](docs/PaymentsApi.md#getPaymentByTransactionId) | **GET** /payments/{transactionId} | Get a payment by Checkout transaction ID
*PaymentsApi* | [**getPaymentProviders**](docs/PaymentsApi.md#getPaymentProviders) | **GET** /merchants/payment-providers | List merchant payment methods
*PaymentsApi* | [**refundPaymentByTransactionId**](docs/PaymentsApi.md#refundPaymentByTransactionId) | **POST** /payments/{transactionId}/refund | Refund a payment
*ProvidersApi* | [**getGroupedPaymentProviders**](docs/ProvidersApi.md#getGroupedPaymentProviders) | **GET** /merchants/grouped-payment-providers | List grouped merchant payment methods
*ProvidersApi* | [**getPaymentProviders**](docs/ProvidersApi.md#getPaymentProviders) | **GET** /merchants/payment-providers | List merchant payment methods
*SettlementsApi* | [**listSettlementIds**](docs/SettlementsApi.md#listSettlementIds) | **GET** /settlements | List settlement IDs
*TokenPaymentsApi* | [**addCardForm**](docs/TokenPaymentsApi.md#addCardForm) | **POST** /tokenization/addcard-form | Request a redirect to card addition form
*TokenPaymentsApi* | [**requestTokenForTokenizationId**](docs/TokenPaymentsApi.md#requestTokenForTokenizationId) | **POST** /tokenization/{checkout-tokenization-id} | Request a card token for given tokenization id
*TokenPaymentsApi* | [**tokenCitAuthorizationHold**](docs/TokenPaymentsApi.md#tokenCitAuthorizationHold) | **POST** /payments/token/cit/authorization-hold | Request customer initiated transaction authorization hold on token
*TokenPaymentsApi* | [**tokenCitCharge**](docs/TokenPaymentsApi.md#tokenCitCharge) | **POST** /payments/token/cit/charge | Request customer initiated transaction charge on token
*TokenPaymentsApi* | [**tokenCommit**](docs/TokenPaymentsApi.md#tokenCommit) | **POST** /payments/{transactionId}/token/commit | Request committing (charging) of previously created authorization hold on token
*TokenPaymentsApi* | [**tokenMitAuthorizationHold**](docs/TokenPaymentsApi.md#tokenMitAuthorizationHold) | **POST** /payments/token/mit/authorization-hold | Request merchant initiated transaction authorization hold on token
*TokenPaymentsApi* | [**tokenMitCharge**](docs/TokenPaymentsApi.md#tokenMitCharge) | **POST** /payments/token/mit/charge | Request merchant initiated transaction charge on token
*TokenPaymentsApi* | [**tokenRevert**](docs/TokenPaymentsApi.md#tokenRevert) | **POST** /payments/{transactionId}/token/revert | Revert (removal) of previously created authorization hold on token


## Documentation for Models

 - [ActivateInvoiceResponse](docs/ActivateInvoiceResponse.md)
 - [AddCardFormRequest](docs/AddCardFormRequest.md)
 - [Address](docs/Address.md)
 - [BasePaymentMethodProvider](docs/BasePaymentMethodProvider.md)
 - [Callbacks](docs/Callbacks.md)
 - [Card](docs/Card.md)
 - [Customer](docs/Customer.md)
 - [Error](docs/Error.md)
 - [GetTokenRequest](docs/GetTokenRequest.md)
 - [GroupedPaymentProvidersResponse](docs/GroupedPaymentProvidersResponse.md)
 - [Item](docs/Item.md)
 - [ItemCommission](docs/ItemCommission.md)
 - [Payment](docs/Payment.md)
 - [PaymentMethodGroupData](docs/PaymentMethodGroupData.md)
 - [PaymentMethodGroupDataWithProviders](docs/PaymentMethodGroupDataWithProviders.md)
 - [PaymentMethodProvider](docs/PaymentMethodProvider.md)
 - [PaymentMethodProviderAllOfParameters](docs/PaymentMethodProviderAllOfParameters.md)
 - [PaymentReportBySettlementIdRequest](docs/PaymentReportBySettlementIdRequest.md)
 - [PaymentReportCallbackJSON](docs/PaymentReportCallbackJSON.md)
 - [PaymentReportRequest](docs/PaymentReportRequest.md)
 - [PaymentReportRequestResponse](docs/PaymentReportRequestResponse.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PaymentRequestResponse](docs/PaymentRequestResponse.md)
 - [Refund](docs/Refund.md)
 - [RefundItem](docs/RefundItem.md)
 - [RefundResponse](docs/RefundResponse.md)
 - [SettlementIdItem](docs/SettlementIdItem.md)
 - [TokenCITPaymentResponse](docs/TokenCITPaymentResponse.md)
 - [TokenCustomerDetails](docs/TokenCustomerDetails.md)
 - [TokenMITPaymentResponse](docs/TokenMITPaymentResponse.md)
 - [TokenPaymentRequest](docs/TokenPaymentRequest.md)
 - [TokenizationRequestResponse](docs/TokenizationRequestResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



