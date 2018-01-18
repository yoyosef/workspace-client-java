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
 * MediamediatypeinteractionsidplaceinqueueData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T15:04:57.086Z")
public class MediamediatypeinteractionsidplaceinqueueData {
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

  public MediamediatypeinteractionsidplaceinqueueData queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * Queue name to submit the interaction.
   * @return queue
  **/
  @ApiModelProperty(required = true, value = "Queue name to submit the interaction.")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public MediamediatypeinteractionsidplaceinqueueData reason(IxnReasonCode reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public IxnReasonCode getReason() {
    return reason;
  }

  public void setReason(IxnReasonCode reason) {
    this.reason = reason;
  }

  public MediamediatypeinteractionsidplaceinqueueData extension(List<Kvpair> extension) {
    this.extension = extension;
    return this;
  }

  public MediamediatypeinteractionsidplaceinqueueData addExtensionItem(Kvpair extensionItem) {
    if (this.extension == null) {
      this.extension = new ArrayList<Kvpair>();
    }
    this.extension.add(extensionItem);
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extension
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional data.")
  public List<Kvpair> getExtension() {
    return extension;
  }

  public void setExtension(List<Kvpair> extension) {
    this.extension = extension;
  }

  public MediamediatypeinteractionsidplaceinqueueData addedProperties(List<Kvpair> addedProperties) {
    this.addedProperties = addedProperties;
    return this;
  }

  public MediamediatypeinteractionsidplaceinqueueData addAddedPropertiesItem(Kvpair addedPropertiesItem) {
    if (this.addedProperties == null) {
      this.addedProperties = new ArrayList<Kvpair>();
    }
    this.addedProperties.add(addedPropertiesItem);
    return this;
  }

   /**
   * A key/value pairs list of properties to add.
   * @return addedProperties
  **/
  @ApiModelProperty(value = "A key/value pairs list of properties to add.")
  public List<Kvpair> getAddedProperties() {
    return addedProperties;
  }

  public void setAddedProperties(List<Kvpair> addedProperties) {
    this.addedProperties = addedProperties;
  }

  public MediamediatypeinteractionsidplaceinqueueData changedProperties(List<Kvpair> changedProperties) {
    this.changedProperties = changedProperties;
    return this;
  }

  public MediamediatypeinteractionsidplaceinqueueData addChangedPropertiesItem(Kvpair changedPropertiesItem) {
    if (this.changedProperties == null) {
      this.changedProperties = new ArrayList<Kvpair>();
    }
    this.changedProperties.add(changedPropertiesItem);
    return this;
  }

   /**
   * A key/value pairs list of properties to change.
   * @return changedProperties
  **/
  @ApiModelProperty(value = "A key/value pairs list of properties to change.")
  public List<Kvpair> getChangedProperties() {
    return changedProperties;
  }

  public void setChangedProperties(List<Kvpair> changedProperties) {
    this.changedProperties = changedProperties;
  }

  public MediamediatypeinteractionsidplaceinqueueData deletedProperties(List<Kvpair> deletedProperties) {
    this.deletedProperties = deletedProperties;
    return this;
  }

  public MediamediatypeinteractionsidplaceinqueueData addDeletedPropertiesItem(Kvpair deletedPropertiesItem) {
    if (this.deletedProperties == null) {
      this.deletedProperties = new ArrayList<Kvpair>();
    }
    this.deletedProperties.add(deletedPropertiesItem);
    return this;
  }

   /**
   * A key/value pairs list of properties to delete.
   * @return deletedProperties
  **/
  @ApiModelProperty(value = "A key/value pairs list of properties to delete.")
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
    MediamediatypeinteractionsidplaceinqueueData mediamediatypeinteractionsidplaceinqueueData = (MediamediatypeinteractionsidplaceinqueueData) o;
    return Objects.equals(this.queue, mediamediatypeinteractionsidplaceinqueueData.queue) &&
        Objects.equals(this.reason, mediamediatypeinteractionsidplaceinqueueData.reason) &&
        Objects.equals(this.extension, mediamediatypeinteractionsidplaceinqueueData.extension) &&
        Objects.equals(this.addedProperties, mediamediatypeinteractionsidplaceinqueueData.addedProperties) &&
        Objects.equals(this.changedProperties, mediamediatypeinteractionsidplaceinqueueData.changedProperties) &&
        Objects.equals(this.deletedProperties, mediamediatypeinteractionsidplaceinqueueData.deletedProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, reason, extension, addedProperties, changedProperties, deletedProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypeinteractionsidplaceinqueueData {\n");
    
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

