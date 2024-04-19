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
import com.suchventure.paytrail.client.model.ItemCommission;
import java.io.IOException;
import java.time.LocalDate;
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
 * Item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-19T20:23:13.800614+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class Item {
  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Long unitPrice;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Long units;

  public static final String SERIALIZED_NAME_VAT_PERCENTAGE = "vatPercentage";
  @SerializedName(SERIALIZED_NAME_VAT_PERCENTAGE)
  private Long vatPercentage;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_DELIVERY_DATE = "deliveryDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE)
  private LocalDate deliveryDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_STAMP = "stamp";
  @SerializedName(SERIALIZED_NAME_STAMP)
  private String stamp;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_COMMISSION = "commission";
  @SerializedName(SERIALIZED_NAME_COMMISSION)
  private ItemCommission commission;

  public Item() {
  }

  public Item unitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Unit price of an item in currency minor unit, eg. EUR cents. VAT should be included in amount unless &#x60;usePricesWithoutVat&#x60; is set to true.
   * minimum: 0
   * maximum: 99999999
   * @return unitPrice
  **/
  @javax.annotation.Nonnull
  public Long getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
  }


  public Item units(Long units) {
    this.units = units;
    return this;
  }

   /**
   * Number of units
   * minimum: 1
   * maximum: 10000000
   * @return units
  **/
  @javax.annotation.Nonnull
  public Long getUnits() {
    return units;
  }

  public void setUnits(Long units) {
    this.units = units;
  }


  public Item vatPercentage(Long vatPercentage) {
    this.vatPercentage = vatPercentage;
    return this;
  }

   /**
   * Item VAT percentage
   * minimum: 0
   * maximum: 100
   * @return vatPercentage
  **/
  @javax.annotation.Nonnull
  public Long getVatPercentage() {
    return vatPercentage;
  }

  public void setVatPercentage(Long vatPercentage) {
    this.vatPercentage = vatPercentage;
  }


  public Item productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Merchant specific product code
   * @return productCode
  **/
  @javax.annotation.Nonnull
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public Item deliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Estimated delivery date
   * @return deliveryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public Item description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Merchant specific product description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Item category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Item product category
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public Item merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Submerchant ID. Required for shop-in-shop payments, leave out from normal payments.
   * @return merchant
  **/
  @javax.annotation.Nullable
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public Item stamp(String stamp) {
    this.stamp = stamp;
    return this;
  }

   /**
   * Submerchant specific unique stamp. Required for shop-in-shop payments, leave out from normal payments.
   * @return stamp
  **/
  @javax.annotation.Nullable
  public String getStamp() {
    return stamp;
  }

  public void setStamp(String stamp) {
    this.stamp = stamp;
  }


  public Item reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Submerchant reference for the item. Required for shop-in-shop payments, leave out from normal payments.
   * @return reference
  **/
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  public Item orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID. Used for eg. Collector payments order ID. If not given, merchant reference is used instead.
   * @return orderId
  **/
  @javax.annotation.Nullable
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Item commission(ItemCommission commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @javax.annotation.Nullable
  public ItemCommission getCommission() {
    return commission;
  }

  public void setCommission(ItemCommission commission) {
    this.commission = commission;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.unitPrice, item.unitPrice) &&
        Objects.equals(this.units, item.units) &&
        Objects.equals(this.vatPercentage, item.vatPercentage) &&
        Objects.equals(this.productCode, item.productCode) &&
        Objects.equals(this.deliveryDate, item.deliveryDate) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.category, item.category) &&
        Objects.equals(this.merchant, item.merchant) &&
        Objects.equals(this.stamp, item.stamp) &&
        Objects.equals(this.reference, item.reference) &&
        Objects.equals(this.orderId, item.orderId) &&
        Objects.equals(this.commission, item.commission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPrice, units, vatPercentage, productCode, deliveryDate, description, category, merchant, stamp, reference, orderId, commission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    stamp: ").append(toIndentedString(stamp)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
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
    openapiFields.add("unitPrice");
    openapiFields.add("units");
    openapiFields.add("vatPercentage");
    openapiFields.add("productCode");
    openapiFields.add("deliveryDate");
    openapiFields.add("description");
    openapiFields.add("category");
    openapiFields.add("merchant");
    openapiFields.add("stamp");
    openapiFields.add("reference");
    openapiFields.add("orderId");
    openapiFields.add("commission");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("unitPrice");
    openapiRequiredFields.add("units");
    openapiRequiredFields.add("vatPercentage");
    openapiRequiredFields.add("productCode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Item
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Item.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Item is not found in the empty JSON string", Item.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Item.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Item` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Item.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()) && !jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
      if ((jsonObj.get("stamp") != null && !jsonObj.get("stamp").isJsonNull()) && !jsonObj.get("stamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stamp").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      // validate the optional field `commission`
      if (jsonObj.get("commission") != null && !jsonObj.get("commission").isJsonNull()) {
        ItemCommission.validateJsonElement(jsonObj.get("commission"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Item.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Item' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Item> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Item.class));

       return (TypeAdapter<T>) new TypeAdapter<Item>() {
           @Override
           public void write(JsonWriter out, Item value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Item read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Item given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Item
  * @throws IOException if the JSON string is invalid with respect to Item
  */
  public static Item fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Item.class);
  }

 /**
  * Convert an instance of Item to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

