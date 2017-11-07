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
import com.genesys.internal.workspace.model.StatisticValueForPeekResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The list of all the statitstics in given subscription as kvp.
 */
@ApiModel(description = "The list of all the statitstics in given subscription as kvp.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T07:13:24.317Z")
public class InlineResponse2002DataStatistics {
  @SerializedName("statisticId1")
  private StatisticValueForPeekResponse statisticId1 = null;

  @SerializedName("...")
  private StatisticValueForPeekResponse ___ = null;

  public InlineResponse2002DataStatistics statisticId1(StatisticValueForPeekResponse statisticId1) {
    this.statisticId1 = statisticId1;
    return this;
  }

   /**
   * Get statisticId1
   * @return statisticId1
  **/
  @ApiModelProperty(value = "")
  public StatisticValueForPeekResponse getStatisticId1() {
    return statisticId1;
  }

  public void setStatisticId1(StatisticValueForPeekResponse statisticId1) {
    this.statisticId1 = statisticId1;
  }

  public InlineResponse2002DataStatistics ___(StatisticValueForPeekResponse ___) {
    this.___ = ___;
    return this;
  }

   /**
   * Get ___
   * @return ___
  **/
  @ApiModelProperty(value = "")
  public StatisticValueForPeekResponse get_() {
    return ___;
  }

  public void set_(StatisticValueForPeekResponse ___) {
    this.___ = ___;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002DataStatistics inlineResponse2002DataStatistics = (InlineResponse2002DataStatistics) o;
    return Objects.equals(this.statisticId1, inlineResponse2002DataStatistics.statisticId1) &&
        Objects.equals(this.___, inlineResponse2002DataStatistics.___);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statisticId1, ___);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002DataStatistics {\n");
    
    sb.append("    statisticId1: ").append(toIndentedString(statisticId1)).append("\n");
    sb.append("    ___: ").append(toIndentedString(___)).append("\n");
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

