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
 * UcsgetcontactsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-18T17:23:07.059Z")
public class UcsgetcontactsData {
  @SerializedName("searchCriteria")
  private Object searchCriteria = null;

  @SerializedName("attributeList")
  private List<String> attributeList = new ArrayList<String>();

  @SerializedName("startIndex")
  private Integer startIndex = null;

  @SerializedName("maxCount")
  private Integer maxCount = null;

  @SerializedName("sortCriteria")
  private List<Object> sortCriteria = new ArrayList<Object>();

  public UcsgetcontactsData searchCriteria(Object searchCriteria) {
    this.searchCriteria = searchCriteria;
    return this;
  }

   /**
   * The search criteria
   * @return searchCriteria
  **/
  @ApiModelProperty(example = "null", required = true, value = "The search criteria")
  public Object getSearchCriteria() {
    return searchCriteria;
  }

  public void setSearchCriteria(Object searchCriteria) {
    this.searchCriteria = searchCriteria;
  }

  public UcsgetcontactsData attributeList(List<String> attributeList) {
    this.attributeList = attributeList;
    return this;
  }

  public UcsgetcontactsData addAttributeListItem(String attributeListItem) {
    this.attributeList.add(attributeListItem);
    return this;
  }

   /**
   * The list of contact attributes to be returned for each contact in response
   * @return attributeList
  **/
  @ApiModelProperty(example = "null", required = true, value = "The list of contact attributes to be returned for each contact in response")
  public List<String> getAttributeList() {
    return attributeList;
  }

  public void setAttributeList(List<String> attributeList) {
    this.attributeList = attributeList;
  }

  public UcsgetcontactsData startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * The start index
   * @return startIndex
  **/
  @ApiModelProperty(example = "null", required = true, value = "The start index")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public UcsgetcontactsData maxCount(Integer maxCount) {
    this.maxCount = maxCount;
    return this;
  }

   /**
   * The maximum number of contacts to be returned
   * @return maxCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of contacts to be returned")
  public Integer getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(Integer maxCount) {
    this.maxCount = maxCount;
  }

  public UcsgetcontactsData sortCriteria(List<Object> sortCriteria) {
    this.sortCriteria = sortCriteria;
    return this;
  }

  public UcsgetcontactsData addSortCriteriaItem(Object sortCriteriaItem) {
    this.sortCriteria.add(sortCriteriaItem);
    return this;
  }

   /**
   * The sorting criteria
   * @return sortCriteria
  **/
  @ApiModelProperty(example = "null", value = "The sorting criteria")
  public List<Object> getSortCriteria() {
    return sortCriteria;
  }

  public void setSortCriteria(List<Object> sortCriteria) {
    this.sortCriteria = sortCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsgetcontactsData ucsgetcontactsData = (UcsgetcontactsData) o;
    return Objects.equals(this.searchCriteria, ucsgetcontactsData.searchCriteria) &&
        Objects.equals(this.attributeList, ucsgetcontactsData.attributeList) &&
        Objects.equals(this.startIndex, ucsgetcontactsData.startIndex) &&
        Objects.equals(this.maxCount, ucsgetcontactsData.maxCount) &&
        Objects.equals(this.sortCriteria, ucsgetcontactsData.sortCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchCriteria, attributeList, startIndex, maxCount, sortCriteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsgetcontactsData {\n");
    
    sb.append("    searchCriteria: ").append(toIndentedString(searchCriteria)).append("\n");
    sb.append("    attributeList: ").append(toIndentedString(attributeList)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    sortCriteria: ").append(toIndentedString(sortCriteria)).append("\n");
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

