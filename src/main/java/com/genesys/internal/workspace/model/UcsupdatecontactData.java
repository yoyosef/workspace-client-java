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
 * UcsupdatecontactData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-07T07:29:37.373Z")
public class UcsupdatecontactData {
  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("addedProperties")
  private List<Object> addedProperties = new ArrayList<Object>();

  @SerializedName("changedProperties")
  private List<Object> changedProperties = new ArrayList<Object>();

  @SerializedName("deletedProperties")
  private List<Object> deletedProperties = new ArrayList<Object>();

  public UcsupdatecontactData contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * The id of the contact
   * @return contactId
  **/
  @ApiModelProperty(required = true, value = "The id of the contact")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public UcsupdatecontactData addedProperties(List<Object> addedProperties) {
    this.addedProperties = addedProperties;
    return this;
  }

  public UcsupdatecontactData addAddedPropertiesItem(Object addedPropertiesItem) {
    this.addedProperties.add(addedPropertiesItem);
    return this;
  }

   /**
   * The list of contact attributes to be added to the contact
   * @return addedProperties
  **/
  @ApiModelProperty(required = true, value = "The list of contact attributes to be added to the contact")
  public List<Object> getAddedProperties() {
    return addedProperties;
  }

  public void setAddedProperties(List<Object> addedProperties) {
    this.addedProperties = addedProperties;
  }

  public UcsupdatecontactData changedProperties(List<Object> changedProperties) {
    this.changedProperties = changedProperties;
    return this;
  }

  public UcsupdatecontactData addChangedPropertiesItem(Object changedPropertiesItem) {
    this.changedProperties.add(changedPropertiesItem);
    return this;
  }

   /**
   * The list of contact attributes to be updated for the contact
   * @return changedProperties
  **/
  @ApiModelProperty(required = true, value = "The list of contact attributes to be updated for the contact")
  public List<Object> getChangedProperties() {
    return changedProperties;
  }

  public void setChangedProperties(List<Object> changedProperties) {
    this.changedProperties = changedProperties;
  }

  public UcsupdatecontactData deletedProperties(List<Object> deletedProperties) {
    this.deletedProperties = deletedProperties;
    return this;
  }

  public UcsupdatecontactData addDeletedPropertiesItem(Object deletedPropertiesItem) {
    this.deletedProperties.add(deletedPropertiesItem);
    return this;
  }

   /**
   * The list of contact attributes to be deleted for the contact
   * @return deletedProperties
  **/
  @ApiModelProperty(required = true, value = "The list of contact attributes to be deleted for the contact")
  public List<Object> getDeletedProperties() {
    return deletedProperties;
  }

  public void setDeletedProperties(List<Object> deletedProperties) {
    this.deletedProperties = deletedProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsupdatecontactData ucsupdatecontactData = (UcsupdatecontactData) o;
    return Objects.equals(this.contactId, ucsupdatecontactData.contactId) &&
        Objects.equals(this.addedProperties, ucsupdatecontactData.addedProperties) &&
        Objects.equals(this.changedProperties, ucsupdatecontactData.changedProperties) &&
        Objects.equals(this.deletedProperties, ucsupdatecontactData.deletedProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, addedProperties, changedProperties, deletedProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsupdatecontactData {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    addedProperties: ").append(toIndentedString(addedProperties)).append("\n");
    sb.append("    changedProperties: ").append(toIndentedString(changedProperties)).append("\n");
    sb.append("    deletedProperties: ").append(toIndentedString(deletedProperties)).append("\n");
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

