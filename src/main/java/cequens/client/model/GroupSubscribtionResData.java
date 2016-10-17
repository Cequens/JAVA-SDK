package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GroupSubscribtionResData
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class GroupSubscribtionResData   {
  @SerializedName("ValidRecipients")
  private String validRecipients = null;

  @SerializedName("InvalidRecipients")
  private String invalidRecipients = null;

  public GroupSubscribtionResData validRecipients(String validRecipients) {
    this.validRecipients = validRecipients;
    return this;
  }

   /**
   * List of valid Recipients provided could not be subscribed/unsubscribed.
   * @return validRecipients
  **/
  @ApiModelProperty(example = "null", value = "List of valid Recipients provided could not be subscribed/unsubscribed.")
  public String getValidRecipients() {
    return validRecipients;
  }

  public void setValidRecipients(String validRecipients) {
    this.validRecipients = validRecipients;
  }

  public GroupSubscribtionResData invalidRecipients(String invalidRecipients) {
    this.invalidRecipients = invalidRecipients;
    return this;
  }

   /**
   * List of invalid Recipients provided could not be subscribed/unsubscribed.
   * @return invalidRecipients
  **/
  @ApiModelProperty(example = "null", value = "List of invalid Recipients provided could not be subscribed/unsubscribed.")
  public String getInvalidRecipients() {
    return invalidRecipients;
  }

  public void setInvalidRecipients(String invalidRecipients) {
    this.invalidRecipients = invalidRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupSubscribtionResData groupSubscribtionResData = (GroupSubscribtionResData) o;
    return Objects.equals(this.validRecipients, groupSubscribtionResData.validRecipients) &&
        Objects.equals(this.invalidRecipients, groupSubscribtionResData.invalidRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validRecipients, invalidRecipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupSubscribtionResData {\n");
    
    sb.append("    validRecipients: ").append(toIndentedString(validRecipients)).append("\n");
    sb.append("    invalidRecipients: ").append(toIndentedString(invalidRecipients)).append("\n");
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

