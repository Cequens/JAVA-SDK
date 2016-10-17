package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cequens.client.model.NetworkDetails;
import java.util.ArrayList;
import java.util.List;


/**
 * CountryPricingResData
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class CountryPricingResData   {
  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("CountryName")
  private String countryName = null;

  @SerializedName("Prefix")
  private Integer prefix = null;

  @SerializedName("DefaultPrice")
  private Double defaultPrice = null;

  @SerializedName("Networks")
  private List<NetworkDetails> networks = new ArrayList<NetworkDetails>();

  public CountryPricingResData countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CountryPricingResData countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public CountryPricingResData prefix(Integer prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPrefix() {
    return prefix;
  }

  public void setPrefix(Integer prefix) {
    this.prefix = prefix;
  }

  public CountryPricingResData defaultPrice(Double defaultPrice) {
    this.defaultPrice = defaultPrice;
    return this;
  }

   /**
   * Get defaultPrice
   * @return defaultPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDefaultPrice() {
    return defaultPrice;
  }

  public void setDefaultPrice(Double defaultPrice) {
    this.defaultPrice = defaultPrice;
  }

  public CountryPricingResData networks(List<NetworkDetails> networks) {
    this.networks = networks;
    return this;
  }

  public CountryPricingResData addNetworksItem(NetworkDetails networksItem) {
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Get networks
   * @return networks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NetworkDetails> getNetworks() {
    return networks;
  }

  public void setNetworks(List<NetworkDetails> networks) {
    this.networks = networks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryPricingResData countryPricingResData = (CountryPricingResData) o;
    return Objects.equals(this.countryCode, countryPricingResData.countryCode) &&
        Objects.equals(this.countryName, countryPricingResData.countryName) &&
        Objects.equals(this.prefix, countryPricingResData.prefix) &&
        Objects.equals(this.defaultPrice, countryPricingResData.defaultPrice) &&
        Objects.equals(this.networks, countryPricingResData.networks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryName, prefix, defaultPrice, networks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryPricingResData {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    defaultPrice: ").append(toIndentedString(defaultPrice)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

