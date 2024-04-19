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
import com.suchventure.paytrail.client.model.BasePaymentMethodProvider;
import com.suchventure.paytrail.client.model.Error;
import com.suchventure.paytrail.client.model.GroupedPaymentProvidersResponse;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvidersApi
 */
@Disabled
public class ProvidersApiTest {

    private final ProvidersApi api = new ProvidersApi();

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

}