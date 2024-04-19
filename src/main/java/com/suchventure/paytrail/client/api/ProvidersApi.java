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

import com.suchventure.paytrail.client.ApiCallback;
import com.suchventure.paytrail.client.ApiClient;
import com.suchventure.paytrail.client.ApiException;
import com.suchventure.paytrail.client.ApiResponse;
import com.suchventure.paytrail.client.Configuration;
import com.suchventure.paytrail.client.Pair;
import com.suchventure.paytrail.client.ProgressRequestBody;
import com.suchventure.paytrail.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.suchventure.paytrail.client.model.BasePaymentMethodProvider;
import com.suchventure.paytrail.client.model.Error;
import com.suchventure.paytrail.client.model.GroupedPaymentProvidersResponse;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvidersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProvidersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvidersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getGroupedPaymentProvidersCall(Integer checkoutAccount, String checkoutAlgorithm, String checkoutMethod, OffsetDateTime checkoutTimestamp, String checkoutNonce, String signature, Integer amount, List<String> groups, String language, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merchants/grouped-payment-providers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (amount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("amount", amount));
        }

        if (groups != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "groups", groups));
        }

        if (language != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("language", language));
        }

        if (checkoutAccount != null) {
            localVarHeaderParams.put("checkout-account", localVarApiClient.parameterToString(checkoutAccount));
        }

        if (checkoutAlgorithm != null) {
            localVarHeaderParams.put("checkout-algorithm", localVarApiClient.parameterToString(checkoutAlgorithm));
        }

        if (checkoutMethod != null) {
            localVarHeaderParams.put("checkout-method", localVarApiClient.parameterToString(checkoutMethod));
        }

        if (checkoutTimestamp != null) {
            localVarHeaderParams.put("checkout-timestamp", localVarApiClient.parameterToString(checkoutTimestamp));
        }

        if (checkoutNonce != null) {
            localVarHeaderParams.put("checkout-nonce", localVarApiClient.parameterToString(checkoutNonce));
        }

        if (signature != null) {
            localVarHeaderParams.put("signature", localVarApiClient.parameterToString(signature));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGroupedPaymentProvidersValidateBeforeCall(Integer checkoutAccount, String checkoutAlgorithm, String checkoutMethod, OffsetDateTime checkoutTimestamp, String checkoutNonce, String signature, Integer amount, List<String> groups, String language, final ApiCallback _callback) throws ApiException {
        return getGroupedPaymentProvidersCall(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, language, _callback);

    }


    private ApiResponse<GroupedPaymentProvidersResponse> getGroupedPaymentProvidersWithHttpInfo(Integer checkoutAccount, String checkoutAlgorithm, String checkoutMethod, OffsetDateTime checkoutTimestamp, String checkoutNonce, String signature, Integer amount, List<String> groups, String language) throws ApiException {
        okhttp3.Call localVarCall = getGroupedPaymentProvidersValidateBeforeCall(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, language, null);
        Type localVarReturnType = new TypeToken<GroupedPaymentProvidersResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getGroupedPaymentProvidersAsync(Integer checkoutAccount, String checkoutAlgorithm, String checkoutMethod, OffsetDateTime checkoutTimestamp, String checkoutNonce, String signature, Integer amount, List<String> groups, String language, final ApiCallback<GroupedPaymentProvidersResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGroupedPaymentProvidersValidateBeforeCall(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, language, _callback);
        Type localVarReturnType = new TypeToken<GroupedPaymentProvidersResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetGroupedPaymentProvidersRequest {
        private Integer checkoutAccount;
        private String checkoutAlgorithm;
        private String checkoutMethod;
        private OffsetDateTime checkoutTimestamp;
        private String checkoutNonce;
        private String signature;
        private Integer amount;
        private List<String> groups;
        private String language;

        private APIgetGroupedPaymentProvidersRequest() {
        }

        /**
         * Set checkoutAccount
         * @param checkoutAccount Merchant ID (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest checkoutAccount(Integer checkoutAccount) {
            this.checkoutAccount = checkoutAccount;
            return this;
        }

        /**
         * Set checkoutAlgorithm
         * @param checkoutAlgorithm HMAC algorithm (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest checkoutAlgorithm(String checkoutAlgorithm) {
            this.checkoutAlgorithm = checkoutAlgorithm;
            return this;
        }

        /**
         * Set checkoutMethod
         * @param checkoutMethod HTTP method of the request (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest checkoutMethod(String checkoutMethod) {
            this.checkoutMethod = checkoutMethod;
            return this;
        }

        /**
         * Set checkoutTimestamp
         * @param checkoutTimestamp Current timestamp in ISO 8601 format (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest checkoutTimestamp(OffsetDateTime checkoutTimestamp) {
            this.checkoutTimestamp = checkoutTimestamp;
            return this;
        }

        /**
         * Set checkoutNonce
         * @param checkoutNonce Unique random identifier (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest checkoutNonce(String checkoutNonce) {
            this.checkoutNonce = checkoutNonce;
            return this;
        }

        /**
         * Set signature
         * @param signature HMAC signature calculated over the request headers and payload (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Set amount
         * @param amount Optional amount in minor unit (eg. EUR cents) for the payment providers. Some providers have minimum or maximum amounts that can be purchased.  (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Set groups
         * @param groups Comma separated list of payment method groups to include in the reply. (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest groups(List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Set language
         * @param language Language code of the language the terms of payment and the payment group names will be localized in. Defaults to FI if left undefined  (optional)
         * @return APIgetGroupedPaymentProvidersRequest
         */
        public APIgetGroupedPaymentProvidersRequest language(String language) {
            this.language = language;
            return this;
        }

        /**
         * Build call for getGroupedPaymentProviders
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getGroupedPaymentProvidersCall(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, language, _callback);
        }

        /**
         * Execute getGroupedPaymentProviders request
         * @return GroupedPaymentProvidersResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
         </table>
         */
        public GroupedPaymentProvidersResponse execute() throws ApiException {
            ApiResponse<GroupedPaymentProvidersResponse> localVarResp = getGroupedPaymentProvidersWithHttpInfo(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, language);
            return localVarResp.getData();
        }

        /**
         * Execute getGroupedPaymentProviders request with HTTP info returned
         * @return ApiResponse&lt;GroupedPaymentProvidersResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GroupedPaymentProvidersResponse> executeWithHttpInfo() throws ApiException {
            return getGroupedPaymentProvidersWithHttpInfo(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, language);
        }

        /**
         * Execute getGroupedPaymentProviders request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GroupedPaymentProvidersResponse> _callback) throws ApiException {
            return getGroupedPaymentProvidersAsync(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, language, _callback);
        }
    }

    /**
     * List grouped merchant payment methods
     * Similar to the /merchants/payment-providers, but in addition of a flat list of providers, it returns payment group data containing localized names, icon URLs and grouped providers, and a localized text with a link to the terms of payment. 
     * @return APIgetGroupedPaymentProvidersRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public APIgetGroupedPaymentProvidersRequest getGroupedPaymentProviders() {
        return new APIgetGroupedPaymentProvidersRequest();
    }
    private okhttp3.Call getPaymentProvidersCall(Integer checkoutAccount, String checkoutAlgorithm, String checkoutMethod, OffsetDateTime checkoutTimestamp, String checkoutNonce, String signature, Integer amount, List<String> groups, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merchants/payment-providers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (amount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("amount", amount));
        }

        if (groups != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "groups", groups));
        }

        if (checkoutAccount != null) {
            localVarHeaderParams.put("checkout-account", localVarApiClient.parameterToString(checkoutAccount));
        }

        if (checkoutAlgorithm != null) {
            localVarHeaderParams.put("checkout-algorithm", localVarApiClient.parameterToString(checkoutAlgorithm));
        }

        if (checkoutMethod != null) {
            localVarHeaderParams.put("checkout-method", localVarApiClient.parameterToString(checkoutMethod));
        }

        if (checkoutTimestamp != null) {
            localVarHeaderParams.put("checkout-timestamp", localVarApiClient.parameterToString(checkoutTimestamp));
        }

        if (checkoutNonce != null) {
            localVarHeaderParams.put("checkout-nonce", localVarApiClient.parameterToString(checkoutNonce));
        }

        if (signature != null) {
            localVarHeaderParams.put("signature", localVarApiClient.parameterToString(signature));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentProvidersValidateBeforeCall(Integer checkoutAccount, String checkoutAlgorithm, String checkoutMethod, OffsetDateTime checkoutTimestamp, String checkoutNonce, String signature, Integer amount, List<String> groups, final ApiCallback _callback) throws ApiException {
        return getPaymentProvidersCall(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, _callback);

    }


    private ApiResponse<List<BasePaymentMethodProvider>> getPaymentProvidersWithHttpInfo(Integer checkoutAccount, String checkoutAlgorithm, String checkoutMethod, OffsetDateTime checkoutTimestamp, String checkoutNonce, String signature, Integer amount, List<String> groups) throws ApiException {
        okhttp3.Call localVarCall = getPaymentProvidersValidateBeforeCall(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, null);
        Type localVarReturnType = new TypeToken<List<BasePaymentMethodProvider>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getPaymentProvidersAsync(Integer checkoutAccount, String checkoutAlgorithm, String checkoutMethod, OffsetDateTime checkoutTimestamp, String checkoutNonce, String signature, Integer amount, List<String> groups, final ApiCallback<List<BasePaymentMethodProvider>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentProvidersValidateBeforeCall(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, _callback);
        Type localVarReturnType = new TypeToken<List<BasePaymentMethodProvider>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetPaymentProvidersRequest {
        private Integer checkoutAccount;
        private String checkoutAlgorithm;
        private String checkoutMethod;
        private OffsetDateTime checkoutTimestamp;
        private String checkoutNonce;
        private String signature;
        private Integer amount;
        private List<String> groups;

        private APIgetPaymentProvidersRequest() {
        }

        /**
         * Set checkoutAccount
         * @param checkoutAccount Merchant ID (optional)
         * @return APIgetPaymentProvidersRequest
         */
        public APIgetPaymentProvidersRequest checkoutAccount(Integer checkoutAccount) {
            this.checkoutAccount = checkoutAccount;
            return this;
        }

        /**
         * Set checkoutAlgorithm
         * @param checkoutAlgorithm HMAC algorithm (optional)
         * @return APIgetPaymentProvidersRequest
         */
        public APIgetPaymentProvidersRequest checkoutAlgorithm(String checkoutAlgorithm) {
            this.checkoutAlgorithm = checkoutAlgorithm;
            return this;
        }

        /**
         * Set checkoutMethod
         * @param checkoutMethod HTTP method of the request (optional)
         * @return APIgetPaymentProvidersRequest
         */
        public APIgetPaymentProvidersRequest checkoutMethod(String checkoutMethod) {
            this.checkoutMethod = checkoutMethod;
            return this;
        }

        /**
         * Set checkoutTimestamp
         * @param checkoutTimestamp Current timestamp in ISO 8601 format (optional)
         * @return APIgetPaymentProvidersRequest
         */
        public APIgetPaymentProvidersRequest checkoutTimestamp(OffsetDateTime checkoutTimestamp) {
            this.checkoutTimestamp = checkoutTimestamp;
            return this;
        }

        /**
         * Set checkoutNonce
         * @param checkoutNonce Unique random identifier (optional)
         * @return APIgetPaymentProvidersRequest
         */
        public APIgetPaymentProvidersRequest checkoutNonce(String checkoutNonce) {
            this.checkoutNonce = checkoutNonce;
            return this;
        }

        /**
         * Set signature
         * @param signature HMAC signature calculated over the request headers and payload (optional)
         * @return APIgetPaymentProvidersRequest
         */
        public APIgetPaymentProvidersRequest signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Set amount
         * @param amount Optional amount in minor unit (eg. EUR cents) for the payment providers. Some providers have minimum or maximum amounts that can be purchased.  (optional)
         * @return APIgetPaymentProvidersRequest
         */
        public APIgetPaymentProvidersRequest amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Set groups
         * @param groups Comma separated list of payment method groups to include in the reply. (optional)
         * @return APIgetPaymentProvidersRequest
         */
        public APIgetPaymentProvidersRequest groups(List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Build call for getPaymentProviders
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getPaymentProvidersCall(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, _callback);
        }

        /**
         * Execute getPaymentProviders request
         * @return List&lt;BasePaymentMethodProvider&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
         </table>
         */
        public List<BasePaymentMethodProvider> execute() throws ApiException {
            ApiResponse<List<BasePaymentMethodProvider>> localVarResp = getPaymentProvidersWithHttpInfo(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups);
            return localVarResp.getData();
        }

        /**
         * Execute getPaymentProviders request with HTTP info returned
         * @return ApiResponse&lt;List&lt;BasePaymentMethodProvider&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<BasePaymentMethodProvider>> executeWithHttpInfo() throws ApiException {
            return getPaymentProvidersWithHttpInfo(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups);
        }

        /**
         * Execute getPaymentProviders request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<BasePaymentMethodProvider>> _callback) throws ApiException {
            return getPaymentProvidersAsync(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutTimestamp, checkoutNonce, signature, amount, groups, _callback);
        }
    }

    /**
     * List merchant payment methods
     * Returns the payment methods available for merchant without creating a new payment to the system. Useful for displaying payment provider icons during different phases of checkout before finally actually creating the payment request when customer decides to pay 
     * @return APIgetPaymentProvidersRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment methods available </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public APIgetPaymentProvidersRequest getPaymentProviders() {
        return new APIgetPaymentProvidersRequest();
    }
}