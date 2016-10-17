package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * PasscodeStatus
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class PasscodeStatus   {
  @SerializedName("Passcode")
  private String passcode = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("VDate")
  private DateTime vDate = null;

  @SerializedName("Status")
  private Integer status = null;

  public PasscodeStatus passcode(String passcode) {
    this.passcode = passcode;
    return this;
  }

   /**
   * Get passcode
   * @return passcode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPasscode() {
    return passcode;
  }

  public void setPasscode(String passcode) {
    this.passcode = passcode;
  }

  public PasscodeStatus ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public PasscodeStatus vDate(DateTime vDate) {
    this.vDate = vDate;
    return this;
  }

   /**
   * Get vDate
   * @return vDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getVDate() {
    return vDate;
  }

  public void setVDate(DateTime vDate) {
    this.vDate = vDate;
  }

  public PasscodeStatus status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Possible Status values means [0:expired],[1:valid] ,[2:invalid].
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Possible Status values means [0:expired],[1:valid] ,[2:invalid].")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasscodeStatus passcodeStatus = (PasscodeStatus) o;
    return Objects.equals(this.passcode, passcodeStatus.passcode) &&
        Objects.equals(this.ip, passcodeStatus.ip) &&
        Objects.equals(this.vDate, passcodeStatus.vDate) &&
        Objects.equals(this.status, passcodeStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passcode, ip, vDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasscodeStatus {\n");
    
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    vDate: ").append(toIndentedString(vDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

