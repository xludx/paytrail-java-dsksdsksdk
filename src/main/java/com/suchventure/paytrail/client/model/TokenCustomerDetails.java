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
 * TokenCustomerDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-19T20:23:13.800614+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class TokenCustomerDetails {
  public static final String SERIALIZED_NAME_NETWORK_ADDRESS = "network_address";
  @SerializedName(SERIALIZED_NAME_NETWORK_ADDRESS)
  private String networkAddress;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public TokenCustomerDetails() {
  }

  public TokenCustomerDetails networkAddress(String networkAddress) {
    this.networkAddress = networkAddress;
    return this;
  }

   /**
   * Customer IP address
   * @return networkAddress
  **/
  @javax.annotation.Nonnull
  public String getNetworkAddress() {
    return networkAddress;
  }

  public void setNetworkAddress(String networkAddress) {
    this.networkAddress = networkAddress;
  }


  public TokenCustomerDetails countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Customer country code
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCustomerDetails tokenCustomerDetails = (TokenCustomerDetails) o;
    return Objects.equals(this.networkAddress, tokenCustomerDetails.networkAddress) &&
        Objects.equals(this.countryCode, tokenCustomerDetails.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkAddress, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCustomerDetails {\n");
    sb.append("    networkAddress: ").append(toIndentedString(networkAddress)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("network_address");
    openapiFields.add("country_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("network_address");
    openapiRequiredFields.add("country_code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenCustomerDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenCustomerDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenCustomerDetails is not found in the empty JSON string", TokenCustomerDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenCustomerDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenCustomerDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenCustomerDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("network_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network_address").toString()));
      }
      if (!jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenCustomerDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenCustomerDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenCustomerDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenCustomerDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenCustomerDetails>() {
           @Override
           public void write(JsonWriter out, TokenCustomerDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenCustomerDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenCustomerDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenCustomerDetails
  * @throws IOException if the JSON string is invalid with respect to TokenCustomerDetails
  */
  public static TokenCustomerDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenCustomerDetails.class);
  }

 /**
  * Convert an instance of TokenCustomerDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
