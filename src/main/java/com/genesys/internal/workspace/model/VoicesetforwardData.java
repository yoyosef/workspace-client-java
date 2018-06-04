/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 1.0.0
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

/**
 * VoicesetforwardData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T15:37:05.061Z")
public class VoicesetforwardData {
  @SerializedName("forwardTo")
  private String forwardTo = null;

  public VoicesetforwardData forwardTo(String forwardTo) {
    this.forwardTo = forwardTo;
    return this;
  }

   /**
   * The number where Workspace should forward calls.
   * @return forwardTo
  **/
  @ApiModelProperty(required = true, value = "The number where Workspace should forward calls.")
  public String getForwardTo() {
    return forwardTo;
  }

  public void setForwardTo(String forwardTo) {
    this.forwardTo = forwardTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicesetforwardData voicesetforwardData = (VoicesetforwardData) o;
    return Objects.equals(this.forwardTo, voicesetforwardData.forwardTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicesetforwardData {\n");
    
    sb.append("    forwardTo: ").append(toIndentedString(forwardTo)).append("\n");
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

