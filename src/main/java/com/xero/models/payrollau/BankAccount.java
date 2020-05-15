/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.1.3
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
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * BankAccount
 */

public class BankAccount {
  StringUtil util = new StringUtil();

  @JsonProperty("StatementText")
  private String statementText;

  @JsonProperty("AccountName")
  private String accountName;

  @JsonProperty("BSB")
  private String BSB;

  @JsonProperty("AccountNumber")
  private String accountNumber;

  @JsonProperty("Remainder")
  private Boolean remainder;

  @JsonProperty("Amount")
  private Float amount;
  public BankAccount statementText(String statementText) {
    this.statementText = statementText;
    return this;
  }

   /**
   * The text that will appear on your employee&#39;s bank statement when they receive payment
   * @return statementText
  **/
  @ApiModelProperty(example = "Salary", value = "The text that will appear on your employee's bank statement when they receive payment")
  public String getStatementText() {
    return statementText;
  }

  public void setStatementText(String statementText) {
    this.statementText = statementText;
  }

  public BankAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * The name of the account
   * @return accountName
  **/
  @ApiModelProperty(example = "James Lebron Savings", value = "The name of the account")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public BankAccount BSB(String BSB) {
    this.BSB = BSB;
    return this;
  }

   /**
   * The BSB number of the account
   * @return BSB
  **/
  @ApiModelProperty(example = "122344", value = "The BSB number of the account")
  public String getBSB() {
    return BSB;
  }

  public void setBSB(String BSB) {
    this.BSB = BSB;
  }

  public BankAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The account number
   * @return accountNumber
  **/
  @ApiModelProperty(example = "345678", value = "The account number")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BankAccount remainder(Boolean remainder) {
    this.remainder = remainder;
    return this;
  }

   /**
   * If this account is the Remaining bank account
   * @return remainder
  **/
  @ApiModelProperty(example = "false", value = "If this account is the Remaining bank account")
  public Boolean getRemainder() {
    return remainder;
  }

  public void setRemainder(Boolean remainder) {
    this.remainder = remainder;
  }

  public BankAccount amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Fixed amounts (for example, if an employee wants to have $100 of their salary transferred to one account, and the remaining amount to another)
   * @return amount
  **/
  @ApiModelProperty(example = "200.0", value = "Fixed amounts (for example, if an employee wants to have $100 of their salary transferred to one account, and the remaining amount to another)")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.statementText, bankAccount.statementText) &&
        Objects.equals(this.accountName, bankAccount.accountName) &&
        Objects.equals(this.BSB, bankAccount.BSB) &&
        Objects.equals(this.accountNumber, bankAccount.accountNumber) &&
        Objects.equals(this.remainder, bankAccount.remainder) &&
        Objects.equals(this.amount, bankAccount.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementText, accountName, BSB, accountNumber, remainder, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccount {\n");
    sb.append("    statementText: ").append(toIndentedString(statementText)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    BSB: ").append(toIndentedString(BSB)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    remainder: ").append(toIndentedString(remainder)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

