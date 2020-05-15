/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Bill;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * PaymentTerm
 */

public class PaymentTerm {
  StringUtil util = new StringUtil();

  @JsonProperty("Bills")
  private Bill bills = null;

  @JsonProperty("Sales")
  private Bill sales = null;
  public PaymentTerm bills(Bill bills) {
    this.bills = bills;
    return this;
  }

   /**
   * Get bills
   * @return bills
  **/
  @ApiModelProperty(value = "")
  public Bill getBills() {
    return bills;
  }

  public void setBills(Bill bills) {
    this.bills = bills;
  }

  public PaymentTerm sales(Bill sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Get sales
   * @return sales
  **/
  @ApiModelProperty(value = "")
  public Bill getSales() {
    return sales;
  }

  public void setSales(Bill sales) {
    this.sales = sales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerm paymentTerm = (PaymentTerm) o;
    return Objects.equals(this.bills, paymentTerm.bills) &&
        Objects.equals(this.sales, paymentTerm.sales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bills, sales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerm {\n");
    sb.append("    bills: ").append(toIndentedString(bills)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
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

