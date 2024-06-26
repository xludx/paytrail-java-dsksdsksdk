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
import com.suchventure.paytrail.client.model.PaymentMethodGroupData;
import com.suchventure.paytrail.client.model.PaymentMethodProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
 * Response for a successful payment request. Mechant ecom site can then either redirect the user to the URL given in href, or render the payment provider forms onsite. For each payment method an HTML form needs to be rendered using the parameters returned for each payment method provider. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-19T20:23:13.800614+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class PaymentRequestResponse {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private UUID transactionId;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  private String terms;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<PaymentMethodGroupData> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  private List<PaymentMethodProvider> providers = new ArrayList<>();

  public PaymentRequestResponse() {
  }

  public PaymentRequestResponse transactionId(UUID transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Checkout assigned transaction ID for the payment.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  public UUID getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }


  public PaymentRequestResponse href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Unique URL to hosted payment gateway
   * @return href
  **/
  @javax.annotation.Nonnull
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public PaymentRequestResponse terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Text containing a link to the terms of payment
   * @return terms
  **/
  @javax.annotation.Nullable
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }


  public PaymentRequestResponse groups(List<PaymentMethodGroupData> groups) {
    this.groups = groups;
    return this;
  }

  public PaymentRequestResponse addGroupsItem(PaymentMethodGroupData groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Contains data about the payment method groups. Contains only the groups found in the response&#39;s providers.
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<PaymentMethodGroupData> getGroups() {
    return groups;
  }

  public void setGroups(List<PaymentMethodGroupData> groups) {
    this.groups = groups;
  }


  public PaymentRequestResponse providers(List<PaymentMethodProvider> providers) {
    this.providers = providers;
    return this;
  }

  public PaymentRequestResponse addProvidersItem(PaymentMethodProvider providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @javax.annotation.Nullable
  public List<PaymentMethodProvider> getProviders() {
    return providers;
  }

  public void setProviders(List<PaymentMethodProvider> providers) {
    this.providers = providers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequestResponse paymentRequestResponse = (PaymentRequestResponse) o;
    return Objects.equals(this.transactionId, paymentRequestResponse.transactionId) &&
        Objects.equals(this.href, paymentRequestResponse.href) &&
        Objects.equals(this.terms, paymentRequestResponse.terms) &&
        Objects.equals(this.groups, paymentRequestResponse.groups) &&
        Objects.equals(this.providers, paymentRequestResponse.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, href, terms, groups, providers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestResponse {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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
    openapiFields.add("transactionId");
    openapiFields.add("href");
    openapiFields.add("terms");
    openapiFields.add("groups");
    openapiFields.add("providers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transactionId");
    openapiRequiredFields.add("href");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentRequestResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentRequestResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentRequestResponse is not found in the empty JSON string", PaymentRequestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentRequestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentRequestResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentRequestResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      if (!jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("terms") != null && !jsonObj.get("terms").isJsonNull()) && !jsonObj.get("terms").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terms` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terms").toString()));
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            PaymentMethodGroupData.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
      if (jsonObj.get("providers") != null && !jsonObj.get("providers").isJsonNull()) {
        JsonArray jsonArrayproviders = jsonObj.getAsJsonArray("providers");
        if (jsonArrayproviders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("providers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `providers` to be an array in the JSON string but got `%s`", jsonObj.get("providers").toString()));
          }

          // validate the optional field `providers` (array)
          for (int i = 0; i < jsonArrayproviders.size(); i++) {
            PaymentMethodProvider.validateJsonElement(jsonArrayproviders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentRequestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentRequestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentRequestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentRequestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentRequestResponse>() {
           @Override
           public void write(JsonWriter out, PaymentRequestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentRequestResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentRequestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentRequestResponse
  * @throws IOException if the JSON string is invalid with respect to PaymentRequestResponse
  */
  public static PaymentRequestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentRequestResponse.class);
  }

 /**
  * Convert an instance of PaymentRequestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

