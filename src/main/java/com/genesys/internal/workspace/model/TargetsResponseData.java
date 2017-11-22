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
import com.genesys.internal.workspace.model.Target;
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
 * TargetsResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-22T15:04:38.586Z")
public class TargetsResponseData {
  @SerializedName("targets")
  private List<Target> targets = null;

  @SerializedName("totalMatches")
  private Integer totalMatches = null;

  public TargetsResponseData targets(List<Target> targets) {
    this.targets = targets;
    return this;
  }

  public TargetsResponseData addTargetsItem(Target targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<Target>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * An array containing target results
   * @return targets
  **/
  @ApiModelProperty(value = "An array containing target results")
  public List<Target> getTargets() {
    return targets;
  }

  public void setTargets(List<Target> targets) {
    this.targets = targets;
  }

  public TargetsResponseData totalMatches(Integer totalMatches) {
    this.totalMatches = totalMatches;
    return this;
  }

   /**
   * The total number of matches to the query.
   * @return totalMatches
  **/
  @ApiModelProperty(value = "The total number of matches to the query.")
  public Integer getTotalMatches() {
    return totalMatches;
  }

  public void setTotalMatches(Integer totalMatches) {
    this.totalMatches = totalMatches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetsResponseData targetsResponseData = (TargetsResponseData) o;
    return Objects.equals(this.targets, targetsResponseData.targets) &&
        Objects.equals(this.totalMatches, targetsResponseData.totalMatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets, totalMatches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetsResponseData {\n");
    
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    totalMatches: ").append(toIndentedString(totalMatches)).append("\n");
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

