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
import com.genesys.internal.workspace.model.Dn;
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
 * DevicesData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-20T17:36:30.926Z")
public class DevicesData {
  @SerializedName("devices")
  private List<Dn> devices = null;

  public DevicesData devices(List<Dn> devices) {
    this.devices = devices;
    return this;
  }

  public DevicesData addDevicesItem(Dn devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<Dn>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * An array containing devices.
   * @return devices
  **/
  @ApiModelProperty(value = "An array containing devices.")
  public List<Dn> getDevices() {
    return devices;
  }

  public void setDevices(List<Dn> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicesData devicesData = (DevicesData) o;
    return Objects.equals(this.devices, devicesData.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesData {\n");
    
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

