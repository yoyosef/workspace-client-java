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
 * VoicecallsidalternateData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-24T21:04:55.629Z")
public class VoicecallsidalternateData {
  @SerializedName("heldConnId")
  private String heldConnId = null;

  @SerializedName("reasons")
  private List<Kvpair> reasons = null;

  @SerializedName("extensions")
  private List<Kvpair> extensions = null;

  public VoicecallsidalternateData heldConnId(String heldConnId) {
    this.heldConnId = heldConnId;
    return this;
  }

   /**
   * The connection ID of the held call that should be retrieved.
   * @return heldConnId
  **/
  @ApiModelProperty(required = true, value = "The connection ID of the held call that should be retrieved.")
  public String getHeldConnId() {
    return heldConnId;
  }

  public void setHeldConnId(String heldConnId) {
    this.heldConnId = heldConnId;
  }

  public VoicecallsidalternateData reasons(List<Kvpair> reasons) {
    this.reasons = reasons;
    return this;
  }

  public VoicecallsidalternateData addReasonsItem(Kvpair reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<Kvpair>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * Information on causes for, and results of, actions taken by the user of the current DN. For details about reasons, refer to the [Genesys Events and Models Reference Manual](https://docs.genesys.com/Documentation/System/Current/GenEM/Reasons).
   * @return reasons
  **/
  @ApiModelProperty(value = "Information on causes for, and results of, actions taken by the user of the current DN. For details about reasons, refer to the [Genesys Events and Models Reference Manual](https://docs.genesys.com/Documentation/System/Current/GenEM/Reasons).")
  public List<Kvpair> getReasons() {
    return reasons;
  }

  public void setReasons(List<Kvpair> reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidalternateData extensions(List<Kvpair> extensions) {
    this.extensions = extensions;
    return this;
  }

  public VoicecallsidalternateData addExtensionsItem(Kvpair extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<Kvpair>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * Media device/hardware reason codes and similar information. For details about extensions, refer to the [Genesys Events and Models Reference Manual](https://docs.genesys.com/Documentation/System/Current/GenEM/Extensions).
   * @return extensions
  **/
  @ApiModelProperty(value = "Media device/hardware reason codes and similar information. For details about extensions, refer to the [Genesys Events and Models Reference Manual](https://docs.genesys.com/Documentation/System/Current/GenEM/Extensions).")
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
    VoicecallsidalternateData voicecallsidalternateData = (VoicecallsidalternateData) o;
    return Objects.equals(this.heldConnId, voicecallsidalternateData.heldConnId) &&
        Objects.equals(this.reasons, voicecallsidalternateData.reasons) &&
        Objects.equals(this.extensions, voicecallsidalternateData.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heldConnId, reasons, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidalternateData {\n");
    
    sb.append("    heldConnId: ").append(toIndentedString(heldConnId)).append("\n");
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

