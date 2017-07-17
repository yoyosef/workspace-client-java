/*
 * Workspace API
 * Application API used by Workspace Web Edition
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.workspace.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * UcsgetagenthistoryData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-17T16:23:02.314Z")
public class UcsgetagenthistoryData {
  @SerializedName("customAttributes")
  private List<String> customAttributes = new ArrayList<String>();

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("fromDate")
  private String fromDate = null;

  @SerializedName("toDate")
  private String toDate = null;

  @SerializedName("userId")
  private String userId = null;

  public UcsgetagenthistoryData customAttributes(List<String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public UcsgetagenthistoryData addCustomAttributesItem(String customAttributesItem) {
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * The list of custom contact attributes to be returned for each interaction
   * @return customAttributes
  **/
  @ApiModelProperty(example = "null", value = "The list of custom contact attributes to be returned for each interaction")
  public List<String> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<String> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public UcsgetagenthistoryData sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * The sorting order (desc or asc)
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "The sorting order (desc or asc)")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public UcsgetagenthistoryData fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * The date from which the interactions should be retrieved (UCS format)
   * @return fromDate
  **/
  @ApiModelProperty(example = "null", value = "The date from which the interactions should be retrieved (UCS format)")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public UcsgetagenthistoryData toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * The date to which the interactions should be retrieved (UCS format)
   * @return toDate
  **/
  @ApiModelProperty(example = "null", value = "The date to which the interactions should be retrieved (UCS format)")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public UcsgetagenthistoryData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the agent for which the interactions should be retrieved (if not set, current user is used)
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The id of the agent for which the interactions should be retrieved (if not set, current user is used)")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsgetagenthistoryData ucsgetagenthistoryData = (UcsgetagenthistoryData) o;
    return Objects.equals(this.customAttributes, ucsgetagenthistoryData.customAttributes) &&
        Objects.equals(this.sort, ucsgetagenthistoryData.sort) &&
        Objects.equals(this.fromDate, ucsgetagenthistoryData.fromDate) &&
        Objects.equals(this.toDate, ucsgetagenthistoryData.toDate) &&
        Objects.equals(this.userId, ucsgetagenthistoryData.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes, sort, fromDate, toDate, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsgetagenthistoryData {\n");
    
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

