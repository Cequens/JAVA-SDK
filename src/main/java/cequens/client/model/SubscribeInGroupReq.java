package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SubscribeInGroupReq
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class SubscribeInGroupReq   {
  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("recipients")
  private String recipients = null;

  public SubscribeInGroupReq groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public SubscribeInGroupReq recipients(String recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Valid international mobile contacts seperated by comma.
   * @return recipients
  **/
  @ApiModelProperty(example = "null", required = true, value = "Valid international mobile contacts seperated by comma.")
  public String getRecipients() {
    return recipients;
  }

  public void setRecipients(String recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeInGroupReq subscribeInGroupReq = (SubscribeInGroupReq) o;
    return Objects.equals(this.groupName, subscribeInGroupReq.groupName) &&
        Objects.equals(this.recipients, subscribeInGroupReq.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeInGroupReq {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

