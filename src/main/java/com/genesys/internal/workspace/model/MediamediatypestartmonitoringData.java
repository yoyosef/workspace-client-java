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

/**
 * MediamediatypestartmonitoringData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-24T19:04:52.509Z")
public class MediamediatypestartmonitoringData {
  @SerializedName("agentId")
  private String agentId = null;

  /**
   * The monitoring mode.
   */
  @JsonAdapter(MonitoringModeEnum.Adapter.class)
  public enum MonitoringModeEnum {
    MONITOR("Monitor"),
    
    COACH("Coach"),
    
    BARGIN("Bargin");

    private String value;

    MonitoringModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitoringModeEnum fromValue(String text) {
      for (MonitoringModeEnum b : MonitoringModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonitoringModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitoringModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitoringModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MonitoringModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("monitoringMode")
  private MonitoringModeEnum monitoringMode = null;

  /**
   * The monitoring interaction type.
   */
  @JsonAdapter(MonitoringNextInterationTypeEnum.Adapter.class)
  public enum MonitoringNextInterationTypeEnum {
    NEXTINTERACTION("NextInteraction"),
    
    ALLINTERACTIONS("AllInteractions");

    private String value;

    MonitoringNextInterationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitoringNextInterationTypeEnum fromValue(String text) {
      for (MonitoringNextInterationTypeEnum b : MonitoringNextInterationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonitoringNextInterationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitoringNextInterationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitoringNextInterationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MonitoringNextInterationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("monitoringNextInterationType")
  private MonitoringNextInterationTypeEnum monitoringNextInterationType = null;

  public MediamediatypestartmonitoringData agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * The unique ID of the agent to monitor.
   * @return agentId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the agent to monitor.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public MediamediatypestartmonitoringData monitoringMode(MonitoringModeEnum monitoringMode) {
    this.monitoringMode = monitoringMode;
    return this;
  }

   /**
   * The monitoring mode.
   * @return monitoringMode
  **/
  @ApiModelProperty(required = true, value = "The monitoring mode.")
  public MonitoringModeEnum getMonitoringMode() {
    return monitoringMode;
  }

  public void setMonitoringMode(MonitoringModeEnum monitoringMode) {
    this.monitoringMode = monitoringMode;
  }

  public MediamediatypestartmonitoringData monitoringNextInterationType(MonitoringNextInterationTypeEnum monitoringNextInterationType) {
    this.monitoringNextInterationType = monitoringNextInterationType;
    return this;
  }

   /**
   * The monitoring interaction type.
   * @return monitoringNextInterationType
  **/
  @ApiModelProperty(required = true, value = "The monitoring interaction type.")
  public MonitoringNextInterationTypeEnum getMonitoringNextInterationType() {
    return monitoringNextInterationType;
  }

  public void setMonitoringNextInterationType(MonitoringNextInterationTypeEnum monitoringNextInterationType) {
    this.monitoringNextInterationType = monitoringNextInterationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypestartmonitoringData mediamediatypestartmonitoringData = (MediamediatypestartmonitoringData) o;
    return Objects.equals(this.agentId, mediamediatypestartmonitoringData.agentId) &&
        Objects.equals(this.monitoringMode, mediamediatypestartmonitoringData.monitoringMode) &&
        Objects.equals(this.monitoringNextInterationType, mediamediatypestartmonitoringData.monitoringNextInterationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, monitoringMode, monitoringNextInterationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypestartmonitoringData {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    monitoringMode: ").append(toIndentedString(monitoringMode)).append("\n");
    sb.append("    monitoringNextInterationType: ").append(toIndentedString(monitoringNextInterationType)).append("\n");
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

