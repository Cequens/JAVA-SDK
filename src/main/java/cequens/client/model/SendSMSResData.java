package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cequens.client.model.SendSMSIDs;
import java.util.ArrayList;
import java.util.List;


/**
 * SendSMSResData
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class SendSMSResData   {
  @SerializedName("invalidRecipients")
  private String invalidRecipients = null;

  @SerializedName("SentSMSIDs")
  private List<SendSMSIDs> sentSMSIDs = new ArrayList<SendSMSIDs>();

  public SendSMSResData invalidRecipients(String invalidRecipients) {
    this.invalidRecipients = invalidRecipients;
    return this;
  }

   /**
   * Get invalidRecipients
   * @return invalidRecipients
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInvalidRecipients() {
    return invalidRecipients;
  }

  public void setInvalidRecipients(String invalidRecipients) {
    this.invalidRecipients = invalidRecipients;
  }

  public SendSMSResData sentSMSIDs(List<SendSMSIDs> sentSMSIDs) {
    this.sentSMSIDs = sentSMSIDs;
    return this;
  }

  public SendSMSResData addSentSMSIDsItem(SendSMSIDs sentSMSIDsItem) {
    this.sentSMSIDs.add(sentSMSIDsItem);
    return this;
  }

   /**
   * Get sentSMSIDs
   * @return sentSMSIDs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SendSMSIDs> getSentSMSIDs() {
    return sentSMSIDs;
  }

  public void setSentSMSIDs(List<SendSMSIDs> sentSMSIDs) {
    this.sentSMSIDs = sentSMSIDs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSMSResData sendSMSResData = (SendSMSResData) o;
    return Objects.equals(this.invalidRecipients, sendSMSResData.invalidRecipients) &&
        Objects.equals(this.sentSMSIDs, sendSMSResData.sentSMSIDs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidRecipients, sentSMSIDs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSMSResData {\n");
    
    sb.append("    invalidRecipients: ").append(toIndentedString(invalidRecipients)).append("\n");
    sb.append("    sentSMSIDs: ").append(toIndentedString(sentSMSIDs)).append("\n");
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

