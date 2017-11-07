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
import java.util.ArrayList;
import java.util.List;

/**
 * MediamediatypeinteractionsiddeleteuserdataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T07:13:24.317Z")
public class MediamediatypeinteractionsiddeleteuserdataData {
  @SerializedName("keys")
  private List<String> keys = new ArrayList<String>();

  public MediamediatypeinteractionsiddeleteuserdataData keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public MediamediatypeinteractionsiddeleteuserdataData addKeysItem(String keysItem) {
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypeinteractionsiddeleteuserdataData mediamediatypeinteractionsiddeleteuserdataData = (MediamediatypeinteractionsiddeleteuserdataData) o;
    return Objects.equals(this.keys, mediamediatypeinteractionsiddeleteuserdataData.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypeinteractionsiddeleteuserdataData {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

