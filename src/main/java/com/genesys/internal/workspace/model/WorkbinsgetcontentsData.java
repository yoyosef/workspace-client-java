/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.22.2269
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
 * WorkbinsgetcontentsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-19T13:11:01.474Z")
public class WorkbinsgetcontentsData {
  @SerializedName("workbinIds")
  private String workbinIds = null;

  @SerializedName("ownerId")
  private String ownerId = null;

  public WorkbinsgetcontentsData workbinIds(String workbinIds) {
    this.workbinIds = workbinIds;
    return this;
  }

   /**
   * comma-separated list of Workbin Ids
   * @return workbinIds
  **/
  @ApiModelProperty(required = true, value = "comma-separated list of Workbin Ids")
  public String getWorkbinIds() {
    return workbinIds;
  }

  public void setWorkbinIds(String workbinIds) {
    this.workbinIds = workbinIds;
  }

  public WorkbinsgetcontentsData ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Id of the owner of the workbins
   * @return ownerId
  **/
  @ApiModelProperty(value = "Id of the owner of the workbins")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkbinsgetcontentsData workbinsgetcontentsData = (WorkbinsgetcontentsData) o;
    return Objects.equals(this.workbinIds, workbinsgetcontentsData.workbinIds) &&
        Objects.equals(this.ownerId, workbinsgetcontentsData.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workbinIds, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkbinsgetcontentsData {\n");
    
    sb.append("    workbinIds: ").append(toIndentedString(workbinIds)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

