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
import io.swagger.annotations.ApiModel;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * See Tax Types – can only be used on update calls
 */
public enum TaxType {
  
  OUTPUT("OUTPUT"),
  
  INPUT("INPUT"),
  
  CAPEXINPUT("CAPEXINPUT"),
  
  EXEMPTEXPORT("EXEMPTEXPORT"),
  
  EXEMPTEXPENSES("EXEMPTEXPENSES"),
  
  EXEMPTCAPITAL("EXEMPTCAPITAL"),
  
  EXEMPTOUTPUT("EXEMPTOUTPUT"),
  
  INPUTTAXED("INPUTTAXED"),
  
  BASEXCLUDED("BASEXCLUDED"),
  
  GSTONCAPIMPORTS("GSTONCAPIMPORTS"),
  
  GSTONIMPORTS("GSTONIMPORTS"),
  
  NONE("NONE"),
  
  INPUT2("INPUT2"),
  
  ZERORATED("ZERORATED"),
  
  OUTPUT2("OUTPUT2"),
  
  CAPEXINPUT2("CAPEXINPUT2"),
  
  CAPEXOUTPUT("CAPEXOUTPUT"),
  
  CAPEXOUTPUT2("CAPEXOUTPUT2"),
  
  CAPEXSRINPUT("CAPEXSRINPUT"),
  
  CAPEXSROUTPUT("CAPEXSROUTPUT"),
  
  ECACQUISITIONS("ECACQUISITIONS"),
  
  ECZRINPUT("ECZRINPUT"),
  
  ECZROUTPUT("ECZROUTPUT"),
  
  ECZROUTPUTSERVICES("ECZROUTPUTSERVICES"),
  
  EXEMPTINPUT("EXEMPTINPUT"),
  
  REVERSECHARGES("REVERSECHARGES"),
  
  RRINPUT("RRINPUT"),
  
  RROUTPUT("RROUTPUT"),
  
  SRINPUT("SRINPUT"),
  
  SROUTPUT("SROUTPUT"),
  
  ZERORATEDINPUT("ZERORATEDINPUT"),
  
  ZERORATEDOUTPUT("ZERORATEDOUTPUT"),
  
  BLINPUT("BLINPUT"),
  
  DSOUTPUT("DSOUTPUT"),
  
  EPINPUT("EPINPUT"),
  
  ES33OUTPUT("ES33OUTPUT"),
  
  ESN33OUTPUT("ESN33OUTPUT"),
  
  IGDSINPUT2("IGDSINPUT2"),
  
  IMINPUT2("IMINPUT2"),
  
  MEINPUT("MEINPUT"),
  
  NRINPUT("NRINPUT"),
  
  OPINPUT("OPINPUT"),
  
  OSOUTPUT("OSOUTPUT"),
  
  TXESSINPUT("TXESSINPUT"),
  
  TXN33INPUT("TXN33INPUT"),
  
  TXPETINPUT("TXPETINPUT"),
  
  TXREINPUT("TXREINPUT"),
  
  INPUT3("INPUT3"),
  
  INPUT4("INPUT4"),
  
  OUTPUT3("OUTPUT3"),
  
  OUTPUT4("OUTPUT4"),
  
  SROUTPUT2("SROUTPUT2"),
  
  TXCA("TXCA"),
  
  SRCAS("SRCAS"),
  
  BLINPUT2("BLINPUT2"),
  
  DRCHARGESUPPLY20("DRCHARGESUPPLY20"),
  
  DRCHARGE20("DRCHARGE20"),
  
  DRCHARGESUPPLY5("DRCHARGESUPPLY5"),
  
  DRCHARGE5("DRCHARGE5");

  private String value;

  TaxType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TaxType fromValue(String value) {
    for (TaxType b : TaxType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

