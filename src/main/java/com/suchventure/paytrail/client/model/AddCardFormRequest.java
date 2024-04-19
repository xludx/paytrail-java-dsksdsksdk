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


package com.suchventure.paytrail.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.suchventure.paytrail.client.JSON;

/**
 * Add card form request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-19T20:23:13.800614+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class AddCardFormRequest {
  public static final String SERIALIZED_NAME_CHECKOUT_ACCOUNT = "checkout-account";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ACCOUNT)
  private Integer checkoutAccount;

  /**
   * HMAC algorithm
   */
  @JsonAdapter(CheckoutAlgorithmEnum.Adapter.class)
  public enum CheckoutAlgorithmEnum {
    SHA256("sha256"),
    
    SHA512("sha512");

    private String value;

    CheckoutAlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CheckoutAlgorithmEnum fromValue(String value) {
      for (CheckoutAlgorithmEnum b : CheckoutAlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CheckoutAlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CheckoutAlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CheckoutAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CheckoutAlgorithmEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CheckoutAlgorithmEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHECKOUT_ALGORITHM = "checkout-algorithm";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ALGORITHM)
  private CheckoutAlgorithmEnum checkoutAlgorithm;

  /**
   * HTTP method of the request
   */
  @JsonAdapter(CheckoutMethodEnum.Adapter.class)
  public enum CheckoutMethodEnum {
    GET("GET"),
    
    POST("POST");

    private String value;

    CheckoutMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CheckoutMethodEnum fromValue(String value) {
      for (CheckoutMethodEnum b : CheckoutMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CheckoutMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CheckoutMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CheckoutMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CheckoutMethodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CheckoutMethodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHECKOUT_METHOD = "checkout-method";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_METHOD)
  private CheckoutMethodEnum checkoutMethod;

  public static final String SERIALIZED_NAME_CHECKOUT_NONCE = "checkout-nonce";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_NONCE)
  private String checkoutNonce;

  public static final String SERIALIZED_NAME_CHECKOUT_TIMESTAMP = "checkout-timestamp";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_TIMESTAMP)
  private OffsetDateTime checkoutTimestamp;

  public static final String SERIALIZED_NAME_CHECKOUT_REDIRECT_SUCCESS_URL = "checkout-redirect-success-url";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_REDIRECT_SUCCESS_URL)
  private String checkoutRedirectSuccessUrl;

  public static final String SERIALIZED_NAME_CHECKOUT_REDIRECT_CANCEL_URL = "checkout-redirect-cancel-url";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_REDIRECT_CANCEL_URL)
  private String checkoutRedirectCancelUrl;

  public static final String SERIALIZED_NAME_CHECKOUT_CALLBACK_SUCCESS_URL = "checkout-callback-success-url";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_CALLBACK_SUCCESS_URL)
  private String checkoutCallbackSuccessUrl;

  public static final String SERIALIZED_NAME_CHECKOUT_CALLBACK_CANCEL_URL = "checkout-callback-cancel-url";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_CALLBACK_CANCEL_URL)
  private String checkoutCallbackCancelUrl;

  /**
   * Alpha-2 language code for the card addition form
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    FI("FI"),
    
    SV("SV"),
    
    EN("EN");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LanguageEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LanguageEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private LanguageEnum language;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public AddCardFormRequest() {
  }

  public AddCardFormRequest checkoutAccount(Integer checkoutAccount) {
    this.checkoutAccount = checkoutAccount;
    return this;
  }

   /**
   * Merchant ID
   * @return checkoutAccount
  **/
  @javax.annotation.Nonnull
  public Integer getCheckoutAccount() {
    return checkoutAccount;
  }

  public void setCheckoutAccount(Integer checkoutAccount) {
    this.checkoutAccount = checkoutAccount;
  }


  public AddCardFormRequest checkoutAlgorithm(CheckoutAlgorithmEnum checkoutAlgorithm) {
    this.checkoutAlgorithm = checkoutAlgorithm;
    return this;
  }

   /**
   * HMAC algorithm
   * @return checkoutAlgorithm
  **/
  @javax.annotation.Nonnull
  public CheckoutAlgorithmEnum getCheckoutAlgorithm() {
    return checkoutAlgorithm;
  }

  public void setCheckoutAlgorithm(CheckoutAlgorithmEnum checkoutAlgorithm) {
    this.checkoutAlgorithm = checkoutAlgorithm;
  }


  public AddCardFormRequest checkoutMethod(CheckoutMethodEnum checkoutMethod) {
    this.checkoutMethod = checkoutMethod;
    return this;
  }

   /**
   * HTTP method of the request
   * @return checkoutMethod
  **/
  @javax.annotation.Nullable
  public CheckoutMethodEnum getCheckoutMethod() {
    return checkoutMethod;
  }

  public void setCheckoutMethod(CheckoutMethodEnum checkoutMethod) {
    this.checkoutMethod = checkoutMethod;
  }


  public AddCardFormRequest checkoutNonce(String checkoutNonce) {
    this.checkoutNonce = checkoutNonce;
    return this;
  }

   /**
   * Unique random identifier
   * @return checkoutNonce
  **/
  @javax.annotation.Nullable
  public String getCheckoutNonce() {
    return checkoutNonce;
  }

  public void setCheckoutNonce(String checkoutNonce) {
    this.checkoutNonce = checkoutNonce;
  }


  public AddCardFormRequest checkoutTimestamp(OffsetDateTime checkoutTimestamp) {
    this.checkoutTimestamp = checkoutTimestamp;
    return this;
  }

   /**
   * Current timestamp in ISO 8601 format
   * @return checkoutTimestamp
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCheckoutTimestamp() {
    return checkoutTimestamp;
  }

  public void setCheckoutTimestamp(OffsetDateTime checkoutTimestamp) {
    this.checkoutTimestamp = checkoutTimestamp;
  }


  public AddCardFormRequest checkoutRedirectSuccessUrl(String checkoutRedirectSuccessUrl) {
    this.checkoutRedirectSuccessUrl = checkoutRedirectSuccessUrl;
    return this;
  }

   /**
   * Merchant&#39;s url for user redirect on successful card addition
   * @return checkoutRedirectSuccessUrl
  **/
  @javax.annotation.Nonnull
  public String getCheckoutRedirectSuccessUrl() {
    return checkoutRedirectSuccessUrl;
  }

  public void setCheckoutRedirectSuccessUrl(String checkoutRedirectSuccessUrl) {
    this.checkoutRedirectSuccessUrl = checkoutRedirectSuccessUrl;
  }


  public AddCardFormRequest checkoutRedirectCancelUrl(String checkoutRedirectCancelUrl) {
    this.checkoutRedirectCancelUrl = checkoutRedirectCancelUrl;
    return this;
  }

   /**
   * Merchant&#39;s url for user redirect on failed card addition
   * @return checkoutRedirectCancelUrl
  **/
  @javax.annotation.Nonnull
  public String getCheckoutRedirectCancelUrl() {
    return checkoutRedirectCancelUrl;
  }

  public void setCheckoutRedirectCancelUrl(String checkoutRedirectCancelUrl) {
    this.checkoutRedirectCancelUrl = checkoutRedirectCancelUrl;
  }


  public AddCardFormRequest checkoutCallbackSuccessUrl(String checkoutCallbackSuccessUrl) {
    this.checkoutCallbackSuccessUrl = checkoutCallbackSuccessUrl;
    return this;
  }

   /**
   * Merchant&#39;s url called on successful card addition
   * @return checkoutCallbackSuccessUrl
  **/
  @javax.annotation.Nullable
  public String getCheckoutCallbackSuccessUrl() {
    return checkoutCallbackSuccessUrl;
  }

  public void setCheckoutCallbackSuccessUrl(String checkoutCallbackSuccessUrl) {
    this.checkoutCallbackSuccessUrl = checkoutCallbackSuccessUrl;
  }


  public AddCardFormRequest checkoutCallbackCancelUrl(String checkoutCallbackCancelUrl) {
    this.checkoutCallbackCancelUrl = checkoutCallbackCancelUrl;
    return this;
  }

   /**
   * Merchant&#39;s url called on failed card addition
   * @return checkoutCallbackCancelUrl
  **/
  @javax.annotation.Nullable
  public String getCheckoutCallbackCancelUrl() {
    return checkoutCallbackCancelUrl;
  }

  public void setCheckoutCallbackCancelUrl(String checkoutCallbackCancelUrl) {
    this.checkoutCallbackCancelUrl = checkoutCallbackCancelUrl;
  }


  public AddCardFormRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Alpha-2 language code for the card addition form
   * @return language
  **/
  @javax.annotation.Nullable
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  public AddCardFormRequest signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * HMAC signature calculated over the request headers and payload
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCardFormRequest addCardFormRequest = (AddCardFormRequest) o;
    return Objects.equals(this.checkoutAccount, addCardFormRequest.checkoutAccount) &&
        Objects.equals(this.checkoutAlgorithm, addCardFormRequest.checkoutAlgorithm) &&
        Objects.equals(this.checkoutMethod, addCardFormRequest.checkoutMethod) &&
        Objects.equals(this.checkoutNonce, addCardFormRequest.checkoutNonce) &&
        Objects.equals(this.checkoutTimestamp, addCardFormRequest.checkoutTimestamp) &&
        Objects.equals(this.checkoutRedirectSuccessUrl, addCardFormRequest.checkoutRedirectSuccessUrl) &&
        Objects.equals(this.checkoutRedirectCancelUrl, addCardFormRequest.checkoutRedirectCancelUrl) &&
        Objects.equals(this.checkoutCallbackSuccessUrl, addCardFormRequest.checkoutCallbackSuccessUrl) &&
        Objects.equals(this.checkoutCallbackCancelUrl, addCardFormRequest.checkoutCallbackCancelUrl) &&
        Objects.equals(this.language, addCardFormRequest.language) &&
        Objects.equals(this.signature, addCardFormRequest.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAccount, checkoutAlgorithm, checkoutMethod, checkoutNonce, checkoutTimestamp, checkoutRedirectSuccessUrl, checkoutRedirectCancelUrl, checkoutCallbackSuccessUrl, checkoutCallbackCancelUrl, language, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCardFormRequest {\n");
    sb.append("    checkoutAccount: ").append(toIndentedString(checkoutAccount)).append("\n");
    sb.append("    checkoutAlgorithm: ").append(toIndentedString(checkoutAlgorithm)).append("\n");
    sb.append("    checkoutMethod: ").append(toIndentedString(checkoutMethod)).append("\n");
    sb.append("    checkoutNonce: ").append(toIndentedString(checkoutNonce)).append("\n");
    sb.append("    checkoutTimestamp: ").append(toIndentedString(checkoutTimestamp)).append("\n");
    sb.append("    checkoutRedirectSuccessUrl: ").append(toIndentedString(checkoutRedirectSuccessUrl)).append("\n");
    sb.append("    checkoutRedirectCancelUrl: ").append(toIndentedString(checkoutRedirectCancelUrl)).append("\n");
    sb.append("    checkoutCallbackSuccessUrl: ").append(toIndentedString(checkoutCallbackSuccessUrl)).append("\n");
    sb.append("    checkoutCallbackCancelUrl: ").append(toIndentedString(checkoutCallbackCancelUrl)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("checkout-account");
    openapiFields.add("checkout-algorithm");
    openapiFields.add("checkout-method");
    openapiFields.add("checkout-nonce");
    openapiFields.add("checkout-timestamp");
    openapiFields.add("checkout-redirect-success-url");
    openapiFields.add("checkout-redirect-cancel-url");
    openapiFields.add("checkout-callback-success-url");
    openapiFields.add("checkout-callback-cancel-url");
    openapiFields.add("language");
    openapiFields.add("signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("checkout-account");
    openapiRequiredFields.add("checkout-algorithm");
    openapiRequiredFields.add("checkout-redirect-success-url");
    openapiRequiredFields.add("checkout-redirect-cancel-url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddCardFormRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddCardFormRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddCardFormRequest is not found in the empty JSON string", AddCardFormRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddCardFormRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddCardFormRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddCardFormRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("checkout-algorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout-algorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout-algorithm").toString()));
      }
      // validate the required field `checkout-algorithm`
      CheckoutAlgorithmEnum.validateJsonElement(jsonObj.get("checkout-algorithm"));
      if ((jsonObj.get("checkout-method") != null && !jsonObj.get("checkout-method").isJsonNull()) && !jsonObj.get("checkout-method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout-method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout-method").toString()));
      }
      // validate the optional field `checkout-method`
      if (jsonObj.get("checkout-method") != null && !jsonObj.get("checkout-method").isJsonNull()) {
        CheckoutMethodEnum.validateJsonElement(jsonObj.get("checkout-method"));
      }
      if ((jsonObj.get("checkout-nonce") != null && !jsonObj.get("checkout-nonce").isJsonNull()) && !jsonObj.get("checkout-nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout-nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout-nonce").toString()));
      }
      if (!jsonObj.get("checkout-redirect-success-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout-redirect-success-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout-redirect-success-url").toString()));
      }
      if (!jsonObj.get("checkout-redirect-cancel-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout-redirect-cancel-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout-redirect-cancel-url").toString()));
      }
      if ((jsonObj.get("checkout-callback-success-url") != null && !jsonObj.get("checkout-callback-success-url").isJsonNull()) && !jsonObj.get("checkout-callback-success-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout-callback-success-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout-callback-success-url").toString()));
      }
      if ((jsonObj.get("checkout-callback-cancel-url") != null && !jsonObj.get("checkout-callback-cancel-url").isJsonNull()) && !jsonObj.get("checkout-callback-cancel-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout-callback-cancel-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout-callback-cancel-url").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // validate the optional field `language`
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) {
        LanguageEnum.validateJsonElement(jsonObj.get("language"));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddCardFormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddCardFormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddCardFormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddCardFormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddCardFormRequest>() {
           @Override
           public void write(JsonWriter out, AddCardFormRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddCardFormRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddCardFormRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddCardFormRequest
  * @throws IOException if the JSON string is invalid with respect to AddCardFormRequest
  */
  public static AddCardFormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddCardFormRequest.class);
  }

 /**
  * Convert an instance of AddCardFormRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

