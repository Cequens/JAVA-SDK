package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * MessageDetails
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class MessageDetails   {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("AccountId")
  private Long accountId = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Sender")
  private String sender = null;

  @SerializedName("MessageText")
  private String messageText = null;

  @SerializedName("Recepient")
  private String recepient = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("SentDate")
  private DateTime sentDate = null;

  public MessageDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageDetails accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public MessageDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public MessageDetails sender(String sender) {
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

  public MessageDetails messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

   /**
   * Get messageText
   * @return messageText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public MessageDetails recepient(String recepient) {
    this.recepient = recepient;
    return this;
  }

   /**
   * Get recepient
   * @return recepient
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecepient() {
    return recepient;
  }

  public void setRecepient(String recepient) {
    this.recepient = recepient;
  }

  public MessageDetails status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Possible status values means [1:Delivered], [2:UnDelivered],[3:Sent],[4: Buffered],[5:Blocked],[16:SMSC Rejected], [17:In Progress],[1200:UNKNOWN]
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Possible status values means [1:Delivered], [2:UnDelivered],[3:Sent],[4: Buffered],[5:Blocked],[16:SMSC Rejected], [17:In Progress],[1200:UNKNOWN]")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public MessageDetails sentDate(DateTime sentDate) {
    this.sentDate = sentDate;
    return this;
  }

   /**
   * Get sentDate
   * @return sentDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getSentDate() {
    return sentDate;
  }

  public void setSentDate(DateTime sentDate) {
    this.sentDate = sentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDetails messageDetails = (MessageDetails) o;
    return Objects.equals(this.id, messageDetails.id) &&
        Objects.equals(this.accountId, messageDetails.accountId) &&
        Objects.equals(this.requestId, messageDetails.requestId) &&
        Objects.equals(this.sender, messageDetails.sender) &&
        Objects.equals(this.messageText, messageDetails.messageText) &&
        Objects.equals(this.recepient, messageDetails.recepient) &&
        Objects.equals(this.status, messageDetails.status) &&
        Objects.equals(this.sentDate, messageDetails.sentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, requestId, sender, messageText, recepient, status, sentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    recepient: ").append(toIndentedString(recepient)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
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

