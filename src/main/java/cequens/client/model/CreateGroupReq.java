package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CreateGroupReq
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class CreateGroupReq   {
  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("recipients")
  private String recipients = null;

  public CreateGroupReq groupName(String groupName) {
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

  public CreateGroupReq description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateGroupReq recipients(String recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Valid international mobile contacts seperated by comma.
   * @return recipients
  **/
  @ApiModelProperty(example = "null", value = "Valid international mobile contacts seperated by comma.")
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
    CreateGroupReq createGroupReq = (CreateGroupReq) o;
    return Objects.equals(this.groupName, createGroupReq.groupName) &&
        Objects.equals(this.description, createGroupReq.description) &&
        Objects.equals(this.recipients, createGroupReq.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, description, recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupReq {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

