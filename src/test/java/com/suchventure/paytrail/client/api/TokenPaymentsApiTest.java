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
import com.suchventure.paytrail.client.model.AddCardFormRequest;
import com.suchventure.paytrail.client.model.Error;
import com.suchventure.paytrail.client.model.GetTokenRequest;
import java.time.OffsetDateTime;
import com.suchventure.paytrail.client.model.TokenCITPaymentResponse;
import com.suchventure.paytrail.client.model.TokenMITPaymentResponse;
import com.suchventure.paytrail.client.model.TokenPaymentRequest;
import com.suchventure.paytrail.client.model.TokenizationRequestResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenPaymentsApi
 */
@Disabled
public class TokenPaymentsApiTest {

    private final TokenPaymentsApi api = new TokenPaymentsApi();

    /**
     * Request a redirect to card addition form
     *
     * Request a redirect to card addition form. This will redirect user to the card addition form, then back to Checkout servers, and finally to merchant&#39;s redirect url. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCardFormTest() throws ApiException {
        AddCardFormRequest addCardFormRequest = null;
        api.addCardForm(addCardFormRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Request a card token for given tokenization id
     *
     * Use checkout-tokenization-id received from /tokenization/addcard-form redirect to request a token which can be used for payments. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestTokenForTokenizationIdTest() throws ApiException {
        UUID checkoutTokenizationId = null;
        GetTokenRequest getTokenRequest = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        UUID checkoutTokenizationId2 = null;
        String platformName = null;
        String signature = null;
        TokenizationRequestResponse response = api.requestTokenForTokenizationId(checkoutTokenizationId, getTokenRequest)
                .checkoutAccount(checkoutAccount)
                .checkoutAlgorithm(checkoutAlgorithm)
                .checkoutMethod(checkoutMethod)
                .checkoutTimestamp(checkoutTimestamp)
                .checkoutNonce(checkoutNonce)
                .checkoutTokenizationId2(checkoutTokenizationId2)
                .platformName(platformName)
                .signature(signature)
                .execute();
        // TODO: test validations
    }

    /**
     * Request customer initiated transaction authorization hold on token
     *
     * Request customer initiated transaction authorization hold on token. CIT authorization holds can sometimes require further 3DS authentication step-up. See detailed documentation at https://checkoutfinland.github.io/psp-api/#/?id&#x3D;customer-initiated-transactions-cit 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenCitAuthorizationHoldTest() throws ApiException {
        TokenPaymentRequest tokenPaymentRequest = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        TokenMITPaymentResponse response = api.tokenCitAuthorizationHold(tokenPaymentRequest)
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
     * Request customer initiated transaction charge on token
     *
     * Request customer initiated transaction charge on token. CIT charges can sometimes require further 3DS authentication step-up. See detailed documentation at https://checkoutfinland.github.io/psp-api/#/?id&#x3D;customer-initiated-transactions-cit 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenCitChargeTest() throws ApiException {
        TokenPaymentRequest tokenPaymentRequest = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        TokenMITPaymentResponse response = api.tokenCitCharge(tokenPaymentRequest)
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
     * Request committing (charging) of previously created authorization hold on token
     *
     * Request committing of previously created authorization hold. The final amount committed can either equal or be less than the authorization hold. The committed amount may not exceed the authorization hold. The final items may differ from the ones used when creating the authorization hold. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenCommitTest() throws ApiException {
        UUID transactionId = null;
        TokenPaymentRequest tokenPaymentRequest = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        UUID checkoutTransactionId = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        TokenMITPaymentResponse response = api.tokenCommit(transactionId, tokenPaymentRequest)
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
     * Request merchant initiated transaction authorization hold on token
     *
     * Request merchant initiated transaction authorization hold on token. This method should be used when creating an authorization hold on the customer&#39;s card in a context, where the customer is not actively participating in the transaction. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenMitAuthorizationHoldTest() throws ApiException {
        TokenPaymentRequest tokenPaymentRequest = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        TokenMITPaymentResponse response = api.tokenMitAuthorizationHold(tokenPaymentRequest)
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
     * Request merchant initiated transaction charge on token
     *
     * Request merchant initiated transaction charge on token. This method should be used when charging the customer&#39;s card in a context, where the customer is not actively participating in the transaction. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenMitChargeTest() throws ApiException {
        TokenPaymentRequest tokenPaymentRequest = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        TokenMITPaymentResponse response = api.tokenMitCharge(tokenPaymentRequest)
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
     * Revert (removal) of previously created authorization hold on token
     *
     * Request committing of previously created authorization hold. A successful revert will remove the authorization hold from the payer&#39;s bank account. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenRevertTest() throws ApiException {
        UUID transactionId = null;
        Integer checkoutAccount = null;
        String checkoutAlgorithm = null;
        String checkoutMethod = null;
        UUID checkoutTransactionId = null;
        OffsetDateTime checkoutTimestamp = null;
        String checkoutNonce = null;
        String platformName = null;
        String signature = null;
        TokenMITPaymentResponse response = api.tokenRevert(transactionId)
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
