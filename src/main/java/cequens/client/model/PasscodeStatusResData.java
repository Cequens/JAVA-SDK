package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cequens.client.model.PasscodeStatus;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * PasscodeStatusResData
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class PasscodeStatusResData   {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("Sender")
  private String sender = null;

  @SerializedName("CreationDate")
  private DateTime creationDate = null;

  @SerializedName("ChecksList")
  private List<PasscodeStatus> checksList = new ArrayList<PasscodeStatus>();

  public PasscodeStatusResData number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PasscodeStatusResData sender(String sender) {
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

  public PasscodeStatusResData creationDate(DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(DateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PasscodeStatusResData checksList(List<PasscodeStatus> checksList) {
    this.checksList = checksList;
    return this;
  }

  public PasscodeStatusResData addChecksListItem(PasscodeStatus checksListItem) {
    this.checksList.add(checksListItem);
    return this;
  }

   /**
   * Get checksList
   * @return checksList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PasscodeStatus> getChecksList() {
    return checksList;
  }

  public void setChecksList(List<PasscodeStatus> checksList) {
    this.checksList = checksList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasscodeStatusResData passcodeStatusResData = (PasscodeStatusResData) o;
    return Objects.equals(this.number, passcodeStatusResData.number) &&
        Objects.equals(this.sender, passcodeStatusResData.sender) &&
        Objects.equals(this.creationDate, passcodeStatusResData.creationDate) &&
        Objects.equals(this.checksList, passcodeStatusResData.checksList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, sender, creationDate, checksList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasscodeStatusResData {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    checksList: ").append(toIndentedString(checksList)).append("\n");
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

