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
 * VoicecallsidcompletetransferData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-14T10:04:20.406Z")
public class VoicecallsidcompletetransferData {
  @SerializedName("parentConnId")
  private String parentConnId = null;

  @SerializedName("reasons")
  private List<Kvpair> reasons = null;

  @SerializedName("extensions")
  private List<Kvpair> extensions = null;

  public VoicecallsidcompletetransferData parentConnId(String parentConnId) {
    this.parentConnId = parentConnId;
    return this;
  }

   /**
   * The connId of the parent call can optionally be specified. In most cases this is not required.
   * @return parentConnId
  **/
  @ApiModelProperty(value = "The connId of the parent call can optionally be specified. In most cases this is not required.")
  public String getParentConnId() {
    return parentConnId;
  }

  public void setParentConnId(String parentConnId) {
    this.parentConnId = parentConnId;
  }

  public VoicecallsidcompletetransferData reasons(List<Kvpair> reasons) {
    this.reasons = reasons;
    return this;
  }

  public VoicecallsidcompletetransferData addReasonsItem(Kvpair reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<Kvpair>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * A key/value pairs list of a data structure that provides additional information associated with this action.
   * @return reasons
  **/
  @ApiModelProperty(value = "A key/value pairs list of a data structure that provides additional information associated with this action.")
  public List<Kvpair> getReasons() {
    return reasons;
  }

  public void setReasons(List<Kvpair> reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidcompletetransferData extensions(List<Kvpair> extensions) {
    this.extensions = extensions;
    return this;
  }

  public VoicecallsidcompletetransferData addExtensionsItem(Kvpair extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<Kvpair>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extensions
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional data.")
  public List<Kvpair> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Kvpair> extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicecallsidcompletetransferData voicecallsidcompletetransferData = (VoicecallsidcompletetransferData) o;
    return Objects.equals(this.parentConnId, voicecallsidcompletetransferData.parentConnId) &&
        Objects.equals(this.reasons, voicecallsidcompletetransferData.reasons) &&
        Objects.equals(this.extensions, voicecallsidcompletetransferData.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentConnId, reasons, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidcompletetransferData {\n");
    
    sb.append("    parentConnId: ").append(toIndentedString(parentConnId)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

