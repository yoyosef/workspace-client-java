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
 * UcslucenesearchinteractionData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-20T20:42:53.681Z")
public class UcslucenesearchinteractionData {
  @SerializedName("maxResults")
  private Integer maxResults = null;

  @SerializedName("searchMyHistory")
  private Boolean searchMyHistory = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("contactAttributes")
  private List<String> contactAttributes = null;

  public UcslucenesearchinteractionData maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of contacts to be returned
   * @return maxResults
  **/
  @ApiModelProperty(value = "The maximum number of contacts to be returned")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public UcslucenesearchinteractionData searchMyHistory(Boolean searchMyHistory) {
    this.searchMyHistory = searchMyHistory;
    return this;
  }

   /**
   * Indicates if the search is performed among the history of interactions of the logged in agent
   * @return searchMyHistory
  **/
  @ApiModelProperty(value = "Indicates if the search is performed among the history of interactions of the logged in agent")
  public Boolean isSearchMyHistory() {
    return searchMyHistory;
  }

  public void setSearchMyHistory(Boolean searchMyHistory) {
    this.searchMyHistory = searchMyHistory;
  }

  public UcslucenesearchinteractionData query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The query to do the lucene search for contacts
   * @return query
  **/
  @ApiModelProperty(required = true, value = "The query to do the lucene search for contacts")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public UcslucenesearchinteractionData contactAttributes(List<String> contactAttributes) {
    this.contactAttributes = contactAttributes;
    return this;
  }

  public UcslucenesearchinteractionData addContactAttributesItem(String contactAttributesItem) {
    if (this.contactAttributes == null) {
      this.contactAttributes = new ArrayList<String>();
    }
    this.contactAttributes.add(contactAttributesItem);
    return this;
  }

   /**
   * The list of contact attributes to be returned for each contact in response
   * @return contactAttributes
  **/
  @ApiModelProperty(value = "The list of contact attributes to be returned for each contact in response")
  public List<String> getContactAttributes() {
    return contactAttributes;
  }

  public void setContactAttributes(List<String> contactAttributes) {
    this.contactAttributes = contactAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcslucenesearchinteractionData ucslucenesearchinteractionData = (UcslucenesearchinteractionData) o;
    return Objects.equals(this.maxResults, ucslucenesearchinteractionData.maxResults) &&
        Objects.equals(this.searchMyHistory, ucslucenesearchinteractionData.searchMyHistory) &&
        Objects.equals(this.query, ucslucenesearchinteractionData.query) &&
        Objects.equals(this.contactAttributes, ucslucenesearchinteractionData.contactAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, searchMyHistory, query, contactAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcslucenesearchinteractionData {\n");
    
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    searchMyHistory: ").append(toIndentedString(searchMyHistory)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    contactAttributes: ").append(toIndentedString(contactAttributes)).append("\n");
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

