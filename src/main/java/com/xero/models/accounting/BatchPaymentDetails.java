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
 * Bank details for use on a batch payment stored with each contact
 */
@ApiModel(description = "Bank details for use on a batch payment stored with each contact")

public class BatchPaymentDetails {
  StringUtil util = new StringUtil();

  @JsonProperty("BankAccountNumber")
  private String bankAccountNumber;

  @JsonProperty("BankAccountName")
  private String bankAccountName;

  @JsonProperty("Details")
  private String details;

  @JsonProperty("Code")
  private String code;

  @JsonProperty("Reference")
  private String reference;
  public BatchPaymentDetails bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * Bank account number for use with Batch Payments
   * @return bankAccountNumber
  **/
  @ApiModelProperty(example = "123-456-1111111", value = "Bank account number for use with Batch Payments")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public BatchPaymentDetails bankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
    return this;
  }

   /**
   * Name of bank for use with Batch Payments
   * @return bankAccountName
  **/
  @ApiModelProperty(example = "ACME Bank", value = "Name of bank for use with Batch Payments")
  public String getBankAccountName() {
    return bankAccountName;
  }

  public void setBankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
  }

  public BatchPaymentDetails details(String details) {
    this.details = details;
    return this;
  }

   /**
   * (Non-NZ Only) These details are sent to the org’s bank as a reference for the batch payment transaction. They will also show with the batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your individual bank, the detail may also show on the bank statement imported into Xero. Maximum field length &#x3D; 18
   * @return details
  **/
  @ApiModelProperty(example = "Hello World", value = "(Non-NZ Only) These details are sent to the org’s bank as a reference for the batch payment transaction. They will also show with the batch payment transaction in the bank reconciliation Find & Match screen. Depending on your individual bank, the detail may also show on the bank statement imported into Xero. Maximum field length = 18")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public BatchPaymentDetails code(String code) {
    this.code = code;
    return this;
  }

   /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.
   * @return code
  **/
  @ApiModelProperty(example = "ABC", value = "(NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find & Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BatchPaymentDetails reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.
   * @return reference
  **/
  @ApiModelProperty(example = "Foobar", value = "(NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find & Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchPaymentDetails batchPaymentDetails = (BatchPaymentDetails) o;
    return Objects.equals(this.bankAccountNumber, batchPaymentDetails.bankAccountNumber) &&
        Objects.equals(this.bankAccountName, batchPaymentDetails.bankAccountName) &&
        Objects.equals(this.details, batchPaymentDetails.details) &&
        Objects.equals(this.code, batchPaymentDetails.code) &&
        Objects.equals(this.reference, batchPaymentDetails.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankAccountName, details, code, reference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchPaymentDetails {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankAccountName: ").append(toIndentedString(bankAccountName)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

