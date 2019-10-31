/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * SuperfundProduct
 */

public class SuperfundProduct {
  
  @JsonProperty("ABN")
  private Object ABN = null;

  
  @JsonProperty("USI")
  private Object USI = null;

  
  @JsonProperty("SPIN")
  private Object SPIN = null;

  
  @JsonProperty("ProductName")
  private Object productName = null;

  public SuperfundProduct ABN(Object ABN) {
    this.ABN = ABN;
    return this;
  }

   /**
   * The ABN of the Regulated SuperFund
   * @return ABN
  **/
  @ApiModelProperty(example = "839182848805", value = "The ABN of the Regulated SuperFund")
  public Object getABN() {
    return ABN;
  }

  public void setABN(Object ABN) {
    this.ABN = ABN;
  }

  public SuperfundProduct USI(Object USI) {
    this.USI = USI;
    return this;
  }

   /**
   * The USI of the Regulated SuperFund
   * @return USI
  **/
  @ApiModelProperty(example = "839182848805001", value = "The USI of the Regulated SuperFund")
  public Object getUSI() {
    return USI;
  }

  public void setUSI(Object USI) {
    this.USI = USI;
  }

  public SuperfundProduct SPIN(Object SPIN) {
    this.SPIN = SPIN;
    return this;
  }

   /**
   * The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds will not have a SPIN value. The USI field should be used instead of SPIN
   * @return SPIN
  **/
  @ApiModelProperty(example = "NML0117AU", value = "The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds will not have a SPIN value. The USI field should be used instead of SPIN")
  public Object getSPIN() {
    return SPIN;
  }

  public void setSPIN(Object SPIN) {
    this.SPIN = SPIN;
  }

  public SuperfundProduct productName(Object productName) {
    this.productName = productName;
    return this;
  }

   /**
   * The name of the Regulated SuperFund
   * @return productName
  **/
  @ApiModelProperty(example = "MLC Navigator Retirement Plan - Superannuation Service (including Series 2) (MLC Superannuation Fund)", value = "The name of the Regulated SuperFund")
  public Object getProductName() {
    return productName;
  }

  public void setProductName(Object productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperfundProduct superfundProduct = (SuperfundProduct) o;
    return Objects.equals(this.ABN, superfundProduct.ABN) &&
        Objects.equals(this.USI, superfundProduct.USI) &&
        Objects.equals(this.SPIN, superfundProduct.SPIN) &&
        Objects.equals(this.productName, superfundProduct.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ABN, USI, SPIN, productName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperfundProduct {\n");
    sb.append("    ABN: ").append(toIndentedString(ABN)).append("\n");
    sb.append("    USI: ").append(toIndentedString(USI)).append("\n");
    sb.append("    SPIN: ").append(toIndentedString(SPIN)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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

