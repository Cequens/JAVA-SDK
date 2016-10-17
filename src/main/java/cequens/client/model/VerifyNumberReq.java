package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * VerifyNumberReq
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class VerifyNumberReq   {
  @SerializedName("number")
  private String number = null;

  @SerializedName("codeExp")
  private Integer codeExp = 3;

  @SerializedName("sender")
  private String sender = "Cequens";

  public VerifyNumberReq number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Valid International mobile number.
   * @return number
  **/
  @ApiModelProperty(example = "null", required = true, value = "Valid International mobile number.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public VerifyNumberReq codeExp(Integer codeExp) {
    this.codeExp = codeExp;
    return this;
  }

   /**
   * Expiration value in minutes.
   * @return codeExp
  **/
  @ApiModelProperty(example = "null", value = "Expiration value in minutes.")
  public Integer getCodeExp() {
    return codeExp;
  }

  public void setCodeExp(Integer codeExp) {
    this.codeExp = codeExp;
  }

  public VerifyNumberReq sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyNumberReq verifyNumberReq = (VerifyNumberReq) o;
    return Objects.equals(this.number, verifyNumberReq.number) &&
        Objects.equals(this.codeExp, verifyNumberReq.codeExp) &&
        Objects.equals(this.sender, verifyNumberReq.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, codeExp, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyNumberReq {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    codeExp: ").append(toIndentedString(codeExp)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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

