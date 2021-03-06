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
import com.genesys.internal.workspace.model.IxnReasonCode;
import com.genesys.internal.workspace.model.Kvpair;
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
 * MediachatinteractionsidputonholdData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T13:13:22.851Z")
public class MediachatinteractionsidputonholdData {
  @SerializedName("queue")
  private String queue = null;

  @SerializedName("reason")
  private IxnReasonCode reason = null;

  @SerializedName("extension")
  private List<Kvpair> extension = null;

  @SerializedName("addedProperties")
  private List<Kvpair> addedProperties = null;

  @SerializedName("changedProperties")
  private List<Kvpair> changedProperties = null;

  @SerializedName("deletedProperties")
  private List<Kvpair> deletedProperties = null;

  public MediachatinteractionsidputonholdData queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * The name of the queue where the Workspace API should put the interaction.
   * @return queue
  **/
  @ApiModelProperty(required = true, value = "The name of the queue where the Workspace API should put the interaction.")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public MediachatinteractionsidputonholdData reason(IxnReasonCode reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A collection of key/value pairs.
   * @return reason
  **/
  @ApiModelProperty(value = "A collection of key/value pairs.")
  public IxnReasonCode getReason() {
    return reason;
  }

  public void setReason(IxnReasonCode reason) {
    this.reason = reason;
  }

  public MediachatinteractionsidputonholdData extension(List<Kvpair> extension) {
    this.extension = extension;
    return this;
  }

  public MediachatinteractionsidputonholdData addExtensionItem(Kvpair extensionItem) {
    if (this.extension == null) {
      this.extension = new ArrayList<Kvpair>();
    }
    this.extension.add(extensionItem);
    return this;
  }

   /**
   * A collection of key/value pairs.
   * @return extension
  **/
  @ApiModelProperty(value = "A collection of key/value pairs.")
  public List<Kvpair> getExtension() {
    return extension;
  }

  public void setExtension(List<Kvpair> extension) {
    this.extension = extension;
  }

  public MediachatinteractionsidputonholdData addedProperties(List<Kvpair> addedProperties) {
    this.addedProperties = addedProperties;
    return this;
  }

  public MediachatinteractionsidputonholdData addAddedPropertiesItem(Kvpair addedPropertiesItem) {
    if (this.addedProperties == null) {
      this.addedProperties = new ArrayList<Kvpair>();
    }
    this.addedProperties.add(addedPropertiesItem);
    return this;
  }

   /**
   * A collection of key/value pairs of properties to add to the interaction.
   * @return addedProperties
  **/
  @ApiModelProperty(value = "A collection of key/value pairs of properties to add to the interaction.")
  public List<Kvpair> getAddedProperties() {
    return addedProperties;
  }

  public void setAddedProperties(List<Kvpair> addedProperties) {
    this.addedProperties = addedProperties;
  }

  public MediachatinteractionsidputonholdData changedProperties(List<Kvpair> changedProperties) {
    this.changedProperties = changedProperties;
    return this;
  }

  public MediachatinteractionsidputonholdData addChangedPropertiesItem(Kvpair changedPropertiesItem) {
    if (this.changedProperties == null) {
      this.changedProperties = new ArrayList<Kvpair>();
    }
    this.changedProperties.add(changedPropertiesItem);
    return this;
  }

   /**
   * A collection of key/value pairs of properties to change on the interaction.
   * @return changedProperties
  **/
  @ApiModelProperty(value = "A collection of key/value pairs of properties to change on the interaction.")
  public List<Kvpair> getChangedProperties() {
    return changedProperties;
  }

  public void setChangedProperties(List<Kvpair> changedProperties) {
    this.changedProperties = changedProperties;
  }

  public MediachatinteractionsidputonholdData deletedProperties(List<Kvpair> deletedProperties) {
    this.deletedProperties = deletedProperties;
    return this;
  }

  public MediachatinteractionsidputonholdData addDeletedPropertiesItem(Kvpair deletedPropertiesItem) {
    if (this.deletedProperties == null) {
      this.deletedProperties = new ArrayList<Kvpair>();
    }
    this.deletedProperties.add(deletedPropertiesItem);
    return this;
  }

   /**
   * A collection of key/value pairs of properties to delete from the interaction.
   * @return deletedProperties
  **/
  @ApiModelProperty(value = "A collection of key/value pairs of properties to delete from the interaction.")
  public List<Kvpair> getDeletedProperties() {
    return deletedProperties;
  }

  public void setDeletedProperties(List<Kvpair> deletedProperties) {
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
    MediachatinteractionsidputonholdData mediachatinteractionsidputonholdData = (MediachatinteractionsidputonholdData) o;
    return Objects.equals(this.queue, mediachatinteractionsidputonholdData.queue) &&
        Objects.equals(this.reason, mediachatinteractionsidputonholdData.reason) &&
        Objects.equals(this.extension, mediachatinteractionsidputonholdData.extension) &&
        Objects.equals(this.addedProperties, mediachatinteractionsidputonholdData.addedProperties) &&
        Objects.equals(this.changedProperties, mediachatinteractionsidputonholdData.changedProperties) &&
        Objects.equals(this.deletedProperties, mediachatinteractionsidputonholdData.deletedProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, reason, extension, addedProperties, changedProperties, deletedProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediachatinteractionsidputonholdData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

