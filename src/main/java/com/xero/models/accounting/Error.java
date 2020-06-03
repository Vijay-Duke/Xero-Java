/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Element;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Error
 */

public class Error {
  StringUtil util = new StringUtil();

  @JsonProperty("ErrorNumber")
  private Integer errorNumber;

  @JsonProperty("Type")
  private String type;

  @JsonProperty("Message")
  private String message;

  @JsonProperty("Elements")
  private List<Element> elements = new ArrayList<Element>();
  public Error errorNumber(Integer errorNumber) {
    this.errorNumber = errorNumber;
    return this;
  }

   /**
   * Exception number
   * @return errorNumber
  **/
  @ApiModelProperty(value = "Exception number")
  public Integer getErrorNumber() {
    return errorNumber;
  }

  public void setErrorNumber(Integer errorNumber) {
    this.errorNumber = errorNumber;
  }

  public Error type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Exception type
   * @return type
  **/
  @ApiModelProperty(value = "Exception type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Exception message
   * @return message
  **/
  @ApiModelProperty(value = "Exception message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error elements(List<Element> elements) {
    this.elements = elements;
    return this;
  }

  public Error addElementsItem(Element elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<Element>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Array of Elements of validation Errors
   * @return elements
  **/
  @ApiModelProperty(value = "Array of Elements of validation Errors")
  public List<Element> getElements() {
    return elements;
  }

  public void setElements(List<Element> elements) {
    this.elements = elements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorNumber, error.errorNumber) &&
        Objects.equals(this.type, error.type) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.elements, error.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorNumber, type, message, elements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    errorNumber: ").append(toIndentedString(errorNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

