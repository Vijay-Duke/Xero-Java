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
import com.xero.models.payrollau.LeavePeriod;
import com.xero.models.payrollau.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * LeaveApplication
 */

public class LeaveApplication {
  StringUtil util = new StringUtil();

  @JsonProperty("LeaveApplicationID")
  private UUID leaveApplicationID;

  @JsonProperty("EmployeeID")
  private UUID employeeID;

  @JsonProperty("LeaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("Title")
  private String title;

  @JsonProperty("StartDate")
  private String startDate;

  @JsonProperty("EndDate")
  private String endDate;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("LeavePeriods")
  private List<LeavePeriod> leavePeriods = new ArrayList<LeavePeriod>();

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  public LeaveApplication leaveApplicationID(UUID leaveApplicationID) {
    this.leaveApplicationID = leaveApplicationID;
    return this;
  }

   /**
   * The Xero identifier for Payroll Employee
   * @return leaveApplicationID
  **/
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "The Xero identifier for Payroll Employee")
  public UUID getLeaveApplicationID() {
    return leaveApplicationID;
  }

  public void setLeaveApplicationID(UUID leaveApplicationID) {
    this.leaveApplicationID = leaveApplicationID;
  }

  public LeaveApplication employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * The Xero identifier for Payroll Employee
   * @return employeeID
  **/
  @ApiModelProperty(example = "fb4ebd68-6568-41eb-96ab-628a0f54b4b8", value = "The Xero identifier for Payroll Employee")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public LeaveApplication leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

   /**
   * The Xero identifier for Leave Type
   * @return leaveTypeID
  **/
  @ApiModelProperty(example = "742998cb-7584-4ecf-aa88-d694f59c50f9", value = "The Xero identifier for Leave Type")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public LeaveApplication title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the leave
   * @return title
  **/
  @ApiModelProperty(example = "Annual Leave", value = "The title of the leave")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LeaveApplication startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the leave (YYYY-MM-DD)
   * @return startDate
  **/
  @ApiModelProperty(example = "/Date(322560000000+0000)/", value = "Start date of the leave (YYYY-MM-DD)")
  public String getStartDate() {
    return startDate;
  }
  public LocalDate getStartDateAsDate() {
    if (this.startDate != null) {
      try {
        return util.convertStringToDate(this.startDate);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(LocalDate startDate) {
    //CONVERT LocalDate args into MS DateFromat String
    Instant instant =  startDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();  
    long timeInMillis = instant.toEpochMilli();

    this.startDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public LeaveApplication endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the leave (YYYY-MM-DD)
   * @return endDate
  **/
  @ApiModelProperty(example = "/Date(322560000000+0000)/", value = "End date of the leave (YYYY-MM-DD)")
  public String getEndDate() {
    return endDate;
  }
  public LocalDate getEndDateAsDate() {
    if (this.endDate != null) {
      try {
        return util.convertStringToDate(this.endDate);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(LocalDate endDate) {
    //CONVERT LocalDate args into MS DateFromat String
    Instant instant =  endDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();  
    long timeInMillis = instant.toEpochMilli();

    this.endDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public LeaveApplication description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The Description of the Leave
   * @return description
  **/
  @ApiModelProperty(example = "My leave", value = "The Description of the Leave")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LeaveApplication leavePeriods(List<LeavePeriod> leavePeriods) {
    this.leavePeriods = leavePeriods;
    return this;
  }

  public LeaveApplication addLeavePeriodsItem(LeavePeriod leavePeriodsItem) {
    if (this.leavePeriods == null) {
      this.leavePeriods = new ArrayList<LeavePeriod>();
    }
    this.leavePeriods.add(leavePeriodsItem);
    return this;
  }

   /**
   * Get leavePeriods
   * @return leavePeriods
  **/
  @ApiModelProperty(value = "")
  public List<LeavePeriod> getLeavePeriods() {
    return leavePeriods;
  }

  public void setLeavePeriods(List<LeavePeriod> leavePeriods) {
    this.leavePeriods = leavePeriods;
  }

   /**
   * Last modified timestamp
   * @return updatedDateUTC
  **/
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public LeaveApplication validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public LeaveApplication addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Displays array of validation error messages from the API
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveApplication leaveApplication = (LeaveApplication) o;
    return Objects.equals(this.leaveApplicationID, leaveApplication.leaveApplicationID) &&
        Objects.equals(this.employeeID, leaveApplication.employeeID) &&
        Objects.equals(this.leaveTypeID, leaveApplication.leaveTypeID) &&
        Objects.equals(this.title, leaveApplication.title) &&
        Objects.equals(this.startDate, leaveApplication.startDate) &&
        Objects.equals(this.endDate, leaveApplication.endDate) &&
        Objects.equals(this.description, leaveApplication.description) &&
        Objects.equals(this.leavePeriods, leaveApplication.leavePeriods) &&
        Objects.equals(this.updatedDateUTC, leaveApplication.updatedDateUTC) &&
        Objects.equals(this.validationErrors, leaveApplication.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveApplicationID, employeeID, leaveTypeID, title, startDate, endDate, description, leavePeriods, updatedDateUTC, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveApplication {\n");
    sb.append("    leaveApplicationID: ").append(toIndentedString(leaveApplicationID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    leavePeriods: ").append(toIndentedString(leavePeriods)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

