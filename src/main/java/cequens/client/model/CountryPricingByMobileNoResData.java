package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CountryPricingByMobileNoResData
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class CountryPricingByMobileNoResData   {
  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("CountryName")
  private String countryName = null;

  @SerializedName("NetworkCode")
  private Integer networkCode = null;

  @SerializedName("Phone")
  private String phone = null;

  @SerializedName("Price")
  private Double price = null;

  public CountryPricingByMobileNoResData countryCode(String countryCode) {
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

  public CountryPricingByMobileNoResData countryName(String countryName) {
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

  public CountryPricingByMobileNoResData networkCode(Integer networkCode) {
    this.networkCode = networkCode;
    return this;
  }

   /**
   * Get networkCode
   * @return networkCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNetworkCode() {
    return networkCode;
  }

  public void setNetworkCode(Integer networkCode) {
    this.networkCode = networkCode;
  }

  public CountryPricingByMobileNoResData phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CountryPricingByMobileNoResData price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryPricingByMobileNoResData countryPricingByMobileNoResData = (CountryPricingByMobileNoResData) o;
    return Objects.equals(this.countryCode, countryPricingByMobileNoResData.countryCode) &&
        Objects.equals(this.countryName, countryPricingByMobileNoResData.countryName) &&
        Objects.equals(this.networkCode, countryPricingByMobileNoResData.networkCode) &&
        Objects.equals(this.phone, countryPricingByMobileNoResData.phone) &&
        Objects.equals(this.price, countryPricingByMobileNoResData.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryName, networkCode, phone, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryPricingByMobileNoResData {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    networkCode: ").append(toIndentedString(networkCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

