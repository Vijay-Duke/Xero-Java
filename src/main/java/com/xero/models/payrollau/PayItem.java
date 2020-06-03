/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.DeductionType;
import com.xero.models.payrollau.EarningsRate;
import com.xero.models.payrollau.LeaveType;
import com.xero.models.payrollau.ReimbursementType;
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
 * PayItem
 */

public class PayItem {
  StringUtil util = new StringUtil();

  @JsonProperty("EarningsRates")
  private List<EarningsRate> earningsRates = new ArrayList<EarningsRate>();

  @JsonProperty("DeductionTypes")
  private List<DeductionType> deductionTypes = new ArrayList<DeductionType>();

  @JsonProperty("LeaveTypes")
  private List<LeaveType> leaveTypes = new ArrayList<LeaveType>();

  @JsonProperty("ReimbursementTypes")
  private List<ReimbursementType> reimbursementTypes = new ArrayList<ReimbursementType>();
  public PayItem earningsRates(List<EarningsRate> earningsRates) {
    this.earningsRates = earningsRates;
    return this;
  }

  public PayItem addEarningsRatesItem(EarningsRate earningsRatesItem) {
    if (this.earningsRates == null) {
      this.earningsRates = new ArrayList<EarningsRate>();
    }
    this.earningsRates.add(earningsRatesItem);
    return this;
  }

   /**
   * Get earningsRates
   * @return earningsRates
  **/
  @ApiModelProperty(value = "")
  public List<EarningsRate> getEarningsRates() {
    return earningsRates;
  }

  public void setEarningsRates(List<EarningsRate> earningsRates) {
    this.earningsRates = earningsRates;
  }

  public PayItem deductionTypes(List<DeductionType> deductionTypes) {
    this.deductionTypes = deductionTypes;
    return this;
  }

  public PayItem addDeductionTypesItem(DeductionType deductionTypesItem) {
    if (this.deductionTypes == null) {
      this.deductionTypes = new ArrayList<DeductionType>();
    }
    this.deductionTypes.add(deductionTypesItem);
    return this;
  }

   /**
   * Get deductionTypes
   * @return deductionTypes
  **/
  @ApiModelProperty(value = "")
  public List<DeductionType> getDeductionTypes() {
    return deductionTypes;
  }

  public void setDeductionTypes(List<DeductionType> deductionTypes) {
    this.deductionTypes = deductionTypes;
  }

  public PayItem leaveTypes(List<LeaveType> leaveTypes) {
    this.leaveTypes = leaveTypes;
    return this;
  }

  public PayItem addLeaveTypesItem(LeaveType leaveTypesItem) {
    if (this.leaveTypes == null) {
      this.leaveTypes = new ArrayList<LeaveType>();
    }
    this.leaveTypes.add(leaveTypesItem);
    return this;
  }

   /**
   * Get leaveTypes
   * @return leaveTypes
  **/
  @ApiModelProperty(value = "")
  public List<LeaveType> getLeaveTypes() {
    return leaveTypes;
  }

  public void setLeaveTypes(List<LeaveType> leaveTypes) {
    this.leaveTypes = leaveTypes;
  }

  public PayItem reimbursementTypes(List<ReimbursementType> reimbursementTypes) {
    this.reimbursementTypes = reimbursementTypes;
    return this;
  }

  public PayItem addReimbursementTypesItem(ReimbursementType reimbursementTypesItem) {
    if (this.reimbursementTypes == null) {
      this.reimbursementTypes = new ArrayList<ReimbursementType>();
    }
    this.reimbursementTypes.add(reimbursementTypesItem);
    return this;
  }

   /**
   * Get reimbursementTypes
   * @return reimbursementTypes
  **/
  @ApiModelProperty(value = "")
  public List<ReimbursementType> getReimbursementTypes() {
    return reimbursementTypes;
  }

  public void setReimbursementTypes(List<ReimbursementType> reimbursementTypes) {
    this.reimbursementTypes = reimbursementTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayItem payItem = (PayItem) o;
    return Objects.equals(this.earningsRates, payItem.earningsRates) &&
        Objects.equals(this.deductionTypes, payItem.deductionTypes) &&
        Objects.equals(this.leaveTypes, payItem.leaveTypes) &&
        Objects.equals(this.reimbursementTypes, payItem.reimbursementTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRates, deductionTypes, leaveTypes, reimbursementTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayItem {\n");
    sb.append("    earningsRates: ").append(toIndentedString(earningsRates)).append("\n");
    sb.append("    deductionTypes: ").append(toIndentedString(deductionTypes)).append("\n");
    sb.append("    leaveTypes: ").append(toIndentedString(leaveTypes)).append("\n");
    sb.append("    reimbursementTypes: ").append(toIndentedString(reimbursementTypes)).append("\n");
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

