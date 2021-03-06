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
import java.math.BigDecimal;

/**
 * UcsresponsesidgetdetailsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T13:13:22.851Z")
public class UcsresponsesidgetdetailsData {
  @SerializedName("version")
  private BigDecimal version = null;

  @SerializedName("attachments")
  private Boolean attachments = null;

  public UcsresponsesidgetdetailsData version(BigDecimal version) {
    this.version = version;
    return this;
  }

   /**
   * Standard Response version number
   * @return version
  **/
  @ApiModelProperty(value = "Standard Response version number")
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public UcsresponsesidgetdetailsData attachments(Boolean attachments) {
    this.attachments = attachments;
    return this;
  }

   /**
   * true to get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "true to get attachments")
  public Boolean Attachments() {
    return attachments;
  }

  public void setAttachments(Boolean attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsresponsesidgetdetailsData ucsresponsesidgetdetailsData = (UcsresponsesidgetdetailsData) o;
    return Objects.equals(this.version, ucsresponsesidgetdetailsData.version) &&
        Objects.equals(this.attachments, ucsresponsesidgetdetailsData.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsresponsesidgetdetailsData {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

