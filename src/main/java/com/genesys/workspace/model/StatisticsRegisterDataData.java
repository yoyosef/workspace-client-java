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
 * StatisticsRegisterDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T20:02:52.448Z")
public class StatisticsRegisterDataData {
  @SerializedName("statistics")
  private List<Object> statistics = new ArrayList<Object>();

  public StatisticsRegisterDataData statistics(List<Object> statistics) {
    this.statistics = statistics;
    return this;
  }

  public StatisticsRegisterDataData addStatisticsItem(Object statisticsItem) {
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<Object> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<Object> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsRegisterDataData statisticsRegisterDataData = (StatisticsRegisterDataData) o;
    return Objects.equals(this.statistics, statisticsRegisterDataData.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsRegisterDataData {\n");
    
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

