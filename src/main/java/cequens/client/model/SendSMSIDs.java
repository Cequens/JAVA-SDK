package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SendSMSIDs
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class SendSMSIDs   {
  @SerializedName("SMSID")
  private String SMSID = null;

  public SendSMSIDs SMSID(String SMSID) {
    this.SMSID = SMSID;
    return this;
  }

   /**
   * Get SMSID
   * @return SMSID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSMSID() {
    return SMSID;
  }

  public void setSMSID(String SMSID) {
    this.SMSID = SMSID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSMSIDs sendSMSIDs = (SendSMSIDs) o;
    return Objects.equals(this.SMSID, sendSMSIDs.SMSID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SMSID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSMSIDs {\n");
    
    sb.append("    SMSID: ").append(toIndentedString(SMSID)).append("\n");
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

