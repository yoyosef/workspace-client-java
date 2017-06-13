/*
 * Workspace Application API
 * Application API used by Workspace Web Edition
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Kvpair;
import java.util.ArrayList;
import java.util.List;

/**
 * VoicecallsidcompleteconferenceData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-13T15:45:06.684Z")
public class VoicecallsidcompleteconferenceData {
  @SerializedName("currentConnId")
  private String currentConnId = null;

  @SerializedName("reasons")
  private List<Kvpair> reasons = new ArrayList<Kvpair>();

  @SerializedName("extensions")
  private List<Kvpair> extensions = new ArrayList<Kvpair>();

  public VoicecallsidcompleteconferenceData currentConnId(String currentConnId) {
    this.currentConnId = currentConnId;
    return this;
  }

   /**
   * Connection identifier of the consultation call; the consultation call will be deleted after completion of operation.
   * @return currentConnId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Connection identifier of the consultation call; the consultation call will be deleted after completion of operation.")
  public String getCurrentConnId() {
    return currentConnId;
  }

  public void setCurrentConnId(String currentConnId) {
    this.currentConnId = currentConnId;
  }

  public VoicecallsidcompleteconferenceData reasons(List<Kvpair> reasons) {
    this.reasons = reasons;
    return this;
  }

  public VoicecallsidcompleteconferenceData addReasonsItem(Kvpair reasonsItem) {
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * A key/value pairs list of a data structure that provides additional information associated with this action.
   * @return reasons
  **/
  @ApiModelProperty(example = "null", value = "A key/value pairs list of a data structure that provides additional information associated with this action.")
  public List<Kvpair> getReasons() {
    return reasons;
  }

  public void setReasons(List<Kvpair> reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidcompleteconferenceData extensions(List<Kvpair> extensions) {
    this.extensions = extensions;
    return this;
  }

  public VoicecallsidcompleteconferenceData addExtensionsItem(Kvpair extensionsItem) {
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extensions
  **/
  @ApiModelProperty(example = "null", value = "A key/value pairs list of additional data.")
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
    VoicecallsidcompleteconferenceData voicecallsidcompleteconferenceData = (VoicecallsidcompleteconferenceData) o;
    return Objects.equals(this.currentConnId, voicecallsidcompleteconferenceData.currentConnId) &&
        Objects.equals(this.reasons, voicecallsidcompleteconferenceData.reasons) &&
        Objects.equals(this.extensions, voicecallsidcompleteconferenceData.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentConnId, reasons, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidcompleteconferenceData {\n");
    
    sb.append("    currentConnId: ").append(toIndentedString(currentConnId)).append("\n");
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

