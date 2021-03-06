/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.23.2279
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UcscontactsidgethistoryData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T13:13:22.851Z")
public class UcscontactsidgethistoryData {
  @SerializedName("returnedAttributes")
  private List<String> returnedAttributes = new ArrayList<String>();

  @SerializedName("fromDate")
  private String fromDate = null;

  @SerializedName("toDate")
  private String toDate = null;

  public UcscontactsidgethistoryData returnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
    return this;
  }

  public UcscontactsidgethistoryData addReturnedAttributesItem(String returnedAttributesItem) {
    this.returnedAttributes.add(returnedAttributesItem);
    return this;
  }

   /**
   * The list of custom contact attributes to be returned for each interaction of the contact
   * @return returnedAttributes
  **/
  @ApiModelProperty(required = true, value = "The list of custom contact attributes to be returned for each interaction of the contact")
  public List<String> getReturnedAttributes() {
    return returnedAttributes;
  }

  public void setReturnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
  }

  public UcscontactsidgethistoryData fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * The date from which the interactions should be retrieved (UCS format)
   * @return fromDate
  **/
  @ApiModelProperty(value = "The date from which the interactions should be retrieved (UCS format)")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public UcscontactsidgethistoryData toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * The date to which the interactions should be retrieved (UCS format)
   * @return toDate
  **/
  @ApiModelProperty(value = "The date to which the interactions should be retrieved (UCS format)")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcscontactsidgethistoryData ucscontactsidgethistoryData = (UcscontactsidgethistoryData) o;
    return Objects.equals(this.returnedAttributes, ucscontactsidgethistoryData.returnedAttributes) &&
        Objects.equals(this.fromDate, ucscontactsidgethistoryData.fromDate) &&
        Objects.equals(this.toDate, ucscontactsidgethistoryData.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnedAttributes, fromDate, toDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcscontactsidgethistoryData {\n");
    
    sb.append("    returnedAttributes: ").append(toIndentedString(returnedAttributes)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

