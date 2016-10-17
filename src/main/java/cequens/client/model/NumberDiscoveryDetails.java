package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NumberDiscoveryDetails
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class NumberDiscoveryDetails   {
  @SerializedName("Destination")
  private String destination = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("IMSI")
  private String IMSI = null;

  @SerializedName("MSC")
  private String MSC = null;

  @SerializedName("Error")
  private String error = null;

  @SerializedName("ErrorDescription")
  private String errorDescription = null;

  @SerializedName("MCCMNC")
  private String MCCMNC = null;

  @SerializedName("Original_Network_Prefix")
  private String originalNetworkPrefix = null;

  @SerializedName("Original_Country_Prefix")
  private String originalCountryPrefix = null;

  @SerializedName("Is_Ported")
  private String isPorted = null;

  @SerializedName("Ported_Network_Prefix")
  private String portedNetworkPrefix = null;

  @SerializedName("Ported_Country_Prefix")
  private String portedCountryPrefix = null;

  @SerializedName("Is_Roaming")
  private String isRoaming = null;

  @SerializedName("Roaming_Network_Prefix")
  private String roamingNetworkPrefix = null;

  @SerializedName("Roaming_Country_Prefix")
  private String roamingCountryPrefix = null;

  @SerializedName("Is_Number_Ok")
  private String isNumberOk = null;

  public NumberDiscoveryDetails destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public NumberDiscoveryDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NumberDiscoveryDetails status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NumberDiscoveryDetails IMSI(String IMSI) {
    this.IMSI = IMSI;
    return this;
  }

   /**
   * Get IMSI
   * @return IMSI
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIMSI() {
    return IMSI;
  }

  public void setIMSI(String IMSI) {
    this.IMSI = IMSI;
  }

  public NumberDiscoveryDetails MSC(String MSC) {
    this.MSC = MSC;
    return this;
  }

   /**
   * Get MSC
   * @return MSC
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMSC() {
    return MSC;
  }

  public void setMSC(String MSC) {
    this.MSC = MSC;
  }

  public NumberDiscoveryDetails error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public NumberDiscoveryDetails errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public NumberDiscoveryDetails MCCMNC(String MCCMNC) {
    this.MCCMNC = MCCMNC;
    return this;
  }

   /**
   * Get MCCMNC
   * @return MCCMNC
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMCCMNC() {
    return MCCMNC;
  }

  public void setMCCMNC(String MCCMNC) {
    this.MCCMNC = MCCMNC;
  }

  public NumberDiscoveryDetails originalNetworkPrefix(String originalNetworkPrefix) {
    this.originalNetworkPrefix = originalNetworkPrefix;
    return this;
  }

   /**
   * Get originalNetworkPrefix
   * @return originalNetworkPrefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOriginalNetworkPrefix() {
    return originalNetworkPrefix;
  }

  public void setOriginalNetworkPrefix(String originalNetworkPrefix) {
    this.originalNetworkPrefix = originalNetworkPrefix;
  }

  public NumberDiscoveryDetails originalCountryPrefix(String originalCountryPrefix) {
    this.originalCountryPrefix = originalCountryPrefix;
    return this;
  }

   /**
   * Get originalCountryPrefix
   * @return originalCountryPrefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOriginalCountryPrefix() {
    return originalCountryPrefix;
  }

  public void setOriginalCountryPrefix(String originalCountryPrefix) {
    this.originalCountryPrefix = originalCountryPrefix;
  }

  public NumberDiscoveryDetails isPorted(String isPorted) {
    this.isPorted = isPorted;
    return this;
  }

   /**
   * Get isPorted
   * @return isPorted
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsPorted() {
    return isPorted;
  }

  public void setIsPorted(String isPorted) {
    this.isPorted = isPorted;
  }

  public NumberDiscoveryDetails portedNetworkPrefix(String portedNetworkPrefix) {
    this.portedNetworkPrefix = portedNetworkPrefix;
    return this;
  }

   /**
   * Get portedNetworkPrefix
   * @return portedNetworkPrefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPortedNetworkPrefix() {
    return portedNetworkPrefix;
  }

  public void setPortedNetworkPrefix(String portedNetworkPrefix) {
    this.portedNetworkPrefix = portedNetworkPrefix;
  }

  public NumberDiscoveryDetails portedCountryPrefix(String portedCountryPrefix) {
    this.portedCountryPrefix = portedCountryPrefix;
    return this;
  }

   /**
   * Get portedCountryPrefix
   * @return portedCountryPrefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPortedCountryPrefix() {
    return portedCountryPrefix;
  }

  public void setPortedCountryPrefix(String portedCountryPrefix) {
    this.portedCountryPrefix = portedCountryPrefix;
  }

  public NumberDiscoveryDetails isRoaming(String isRoaming) {
    this.isRoaming = isRoaming;
    return this;
  }

   /**
   * Get isRoaming
   * @return isRoaming
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsRoaming() {
    return isRoaming;
  }

  public void setIsRoaming(String isRoaming) {
    this.isRoaming = isRoaming;
  }

  public NumberDiscoveryDetails roamingNetworkPrefix(String roamingNetworkPrefix) {
    this.roamingNetworkPrefix = roamingNetworkPrefix;
    return this;
  }

   /**
   * Get roamingNetworkPrefix
   * @return roamingNetworkPrefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRoamingNetworkPrefix() {
    return roamingNetworkPrefix;
  }

  public void setRoamingNetworkPrefix(String roamingNetworkPrefix) {
    this.roamingNetworkPrefix = roamingNetworkPrefix;
  }

  public NumberDiscoveryDetails roamingCountryPrefix(String roamingCountryPrefix) {
    this.roamingCountryPrefix = roamingCountryPrefix;
    return this;
  }

   /**
   * Get roamingCountryPrefix
   * @return roamingCountryPrefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRoamingCountryPrefix() {
    return roamingCountryPrefix;
  }

  public void setRoamingCountryPrefix(String roamingCountryPrefix) {
    this.roamingCountryPrefix = roamingCountryPrefix;
  }

  public NumberDiscoveryDetails isNumberOk(String isNumberOk) {
    this.isNumberOk = isNumberOk;
    return this;
  }

   /**
   * Get isNumberOk
   * @return isNumberOk
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsNumberOk() {
    return isNumberOk;
  }

  public void setIsNumberOk(String isNumberOk) {
    this.isNumberOk = isNumberOk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberDiscoveryDetails numberDiscoveryDetails = (NumberDiscoveryDetails) o;
    return Objects.equals(this.destination, numberDiscoveryDetails.destination) &&
        Objects.equals(this.id, numberDiscoveryDetails.id) &&
        Objects.equals(this.status, numberDiscoveryDetails.status) &&
        Objects.equals(this.IMSI, numberDiscoveryDetails.IMSI) &&
        Objects.equals(this.MSC, numberDiscoveryDetails.MSC) &&
        Objects.equals(this.error, numberDiscoveryDetails.error) &&
        Objects.equals(this.errorDescription, numberDiscoveryDetails.errorDescription) &&
        Objects.equals(this.MCCMNC, numberDiscoveryDetails.MCCMNC) &&
        Objects.equals(this.originalNetworkPrefix, numberDiscoveryDetails.originalNetworkPrefix) &&
        Objects.equals(this.originalCountryPrefix, numberDiscoveryDetails.originalCountryPrefix) &&
        Objects.equals(this.isPorted, numberDiscoveryDetails.isPorted) &&
        Objects.equals(this.portedNetworkPrefix, numberDiscoveryDetails.portedNetworkPrefix) &&
        Objects.equals(this.portedCountryPrefix, numberDiscoveryDetails.portedCountryPrefix) &&
        Objects.equals(this.isRoaming, numberDiscoveryDetails.isRoaming) &&
        Objects.equals(this.roamingNetworkPrefix, numberDiscoveryDetails.roamingNetworkPrefix) &&
        Objects.equals(this.roamingCountryPrefix, numberDiscoveryDetails.roamingCountryPrefix) &&
        Objects.equals(this.isNumberOk, numberDiscoveryDetails.isNumberOk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, id, status, IMSI, MSC, error, errorDescription, MCCMNC, originalNetworkPrefix, originalCountryPrefix, isPorted, portedNetworkPrefix, portedCountryPrefix, isRoaming, roamingNetworkPrefix, roamingCountryPrefix, isNumberOk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberDiscoveryDetails {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    IMSI: ").append(toIndentedString(IMSI)).append("\n");
    sb.append("    MSC: ").append(toIndentedString(MSC)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    MCCMNC: ").append(toIndentedString(MCCMNC)).append("\n");
    sb.append("    originalNetworkPrefix: ").append(toIndentedString(originalNetworkPrefix)).append("\n");
    sb.append("    originalCountryPrefix: ").append(toIndentedString(originalCountryPrefix)).append("\n");
    sb.append("    isPorted: ").append(toIndentedString(isPorted)).append("\n");
    sb.append("    portedNetworkPrefix: ").append(toIndentedString(portedNetworkPrefix)).append("\n");
    sb.append("    portedCountryPrefix: ").append(toIndentedString(portedCountryPrefix)).append("\n");
    sb.append("    isRoaming: ").append(toIndentedString(isRoaming)).append("\n");
    sb.append("    roamingNetworkPrefix: ").append(toIndentedString(roamingNetworkPrefix)).append("\n");
    sb.append("    roamingCountryPrefix: ").append(toIndentedString(roamingCountryPrefix)).append("\n");
    sb.append("    isNumberOk: ").append(toIndentedString(isNumberOk)).append("\n");
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

