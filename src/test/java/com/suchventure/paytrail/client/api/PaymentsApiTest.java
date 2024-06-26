/*
 * Payment API
 * Paytrail Payment API 
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.suchventure.paytrail.client.api;

import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.model.ActivateInvoiceResponse;
import com.suchventure.paytrail.client.model.BasePaymentMethodProvider;
import com.suchventure.paytrail.client.model.Error;
import com.suchventure.paytrail.client.model.GroupedPaymentProvidersResponse;
import java.time.OffsetDateTime;
import com.suchventure.paytrail.client.model.Payment;
import com.suchventure.paytrail.client.model.PaymentRequest;
import com.suchventure.paytrail.client.model.PaymentRequestResponse;
import com.suchventure.paytrail.client.model.Refund;
import com.suchventure.paytrail.client.model.RefundResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Disabled
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    /**
     * Activate invoice
     *
     * Manually activate invoice by transaction ID. Can only be used if payment was paid with Collector and is in pending status. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateInvoiceByTransactionIdTest() throws ApiException {
        UUID transactionId = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        UUID checkoutTransactionId = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String signature = null;
        ActivateInvoiceResponse response = api.activateInvoiceByTransactionId(transactionId)
                .checkoutAccount(checkoutAccount)
                .checkoutAlgorithm(checkoutAlgorithm)
                .checkoutMethod(checkoutMethod)
                .checkoutTransactionId(checkoutTransactionId)
                .checkoutTimestamp(checkoutTimestamp)
                .checkoutNonce(checkoutNonce)
                .signature(signature)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a new open payment
     *
     * Create a new open payment, returns a list of available payment methods.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPaymentTest() throws ApiException {
        PaymentRequest paymentRequest = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        PaymentRequestResponse response = api.createPayment(paymentRequest)
                .checkoutAccount(checkoutAccount)
                .checkoutAlgorithm(checkoutAlgorithm)
                .checkoutMethod(checkoutMethod)
                .checkoutTimestamp(checkoutTimestamp)
                .checkoutNonce(checkoutNonce)
                .platformName(platformName)
                .signature(signature)
                .execute();
        // TODO: test validations
    }

    /**
     * List grouped merchant payment methods
     *
     * Similar to the /merchants/payment-providers, but in addition of a flat list of providers, it returns payment group data containing localized names, icon URLs and grouped providers, and a localized text with a link to the terms of payment. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupedPaymentProvidersTest() throws ApiException {
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String signature = null;
        Integer amount = null;
        List<String> groups = null;
        String language = null;
        GroupedPaymentProvidersResponse response = api.getGroupedPaymentProviders()
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
        // TODO: test validations
    }

    /**
     * Get a payment by Checkout transaction ID
     *
     * Get a single payment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPaymentByTransactionIdTest() throws ApiException {
        UUID transactionId = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        UUID checkoutTransactionId = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        Payment response = api.getPaymentByTransactionId(transactionId)
                .checkoutAccount(checkoutAccount)
                .checkoutAlgorithm(checkoutAlgorithm)
                .checkoutMethod(checkoutMethod)
                .checkoutTransactionId(checkoutTransactionId)
                .checkoutTimestamp(checkoutTimestamp)
                .checkoutNonce(checkoutNonce)
                .platformName(platformName)
                .signature(signature)
                .execute();
        // TODO: test validations
    }

    /**
     * List merchant payment methods
     *
     * Returns the payment methods available for merchant without creating a new payment to the system. Useful for displaying payment provider icons during different phases of checkout before finally actually creating the payment request when customer decides to pay 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPaymentProvidersTest() throws ApiException {
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String signature = null;
        Integer amount = null;
        List<String> groups = null;
        List<BasePaymentMethodProvider> response = api.getPaymentProviders()
                .checkoutAccount(checkoutAccount)
                .checkoutAlgorithm(checkoutAlgorithm)
                .checkoutMethod(checkoutMethod)
                .checkoutTimestamp(checkoutTimestamp)
                .checkoutNonce(checkoutNonce)
                .signature(signature)
                .amount(amount)
                .groups(groups)
                .execute();
        // TODO: test validations
    }

    /**
     * Refund a payment
     *
     * Refund a payment by transaction ID. Refund operation is asynchronous. Refund request is validated, and if the refund can be done a 201 is returned. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refundPaymentByTransactionIdTest() throws ApiException {
        UUID transactionId = null;
        Refund refund = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        UUID checkoutTransactionId = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        RefundResponse response = api.refundPaymentByTransactionId(transactionId, refund)
                .checkoutAccount(checkoutAccount)
                .checkoutAlgorithm(checkoutAlgorithm)
                .checkoutMethod(checkoutMethod)
                .checkoutTransactionId(checkoutTransactionId)
                .checkoutTimestamp(checkoutTimestamp)
                .checkoutNonce(checkoutNonce)
                .platformName(platformName)
                .signature(signature)
                .execute();
        // TODO: test validations
    }

}
