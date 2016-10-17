package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A representation of a SMS
 */
@ApiModel(description = "A representation of a SMS")
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class SendSMStoGroupReq   {
  @SerializedName("messageText")
  private String messageText = null;

  @SerializedName("senderName")
  private String senderName = null;

  /**
   * Message type either text or unicode
   */
  public enum MessageTypeEnum {
    @SerializedName("text")
    TEXT("text"),
    
    @SerializedName("unicode")
    UNICODE("unicode");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;

  @SerializedName("groups")
  private String groups = null;

  @SerializedName("clientMessageId")
  private Integer clientMessageId = null;

  @SerializedName("acknowledgement")
  private Integer acknowledgement = null;

  @SerializedName("deliveryTime")
  private String deliveryTime = null;

  @SerializedName("validityPeriod")
  private String validityPeriod = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("dlrUrl")
  private String dlrUrl = null;

  @SerializedName("dateStamp")
  private String dateStamp = null;

  @SerializedName("udh")
  private String udh = null;

  @SerializedName("dataCoding")
  private String dataCoding = null;

  /**
   * To flash or not [0 or 1].
   */
  public enum FlashingEnum {
    @SerializedName("0")
    NUMBER_0(0),
    
    @SerializedName("1")
    NUMBER_1(1);

    private Integer value;

    FlashingEnum(Integer value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("flashing")
  private FlashingEnum flashing = null;

  public SendSMStoGroupReq messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

   /**
   * Get messageText
   * @return messageText
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public SendSMStoGroupReq senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Get senderName
   * @return senderName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public SendSMStoGroupReq messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Message type either text or unicode
   * @return messageType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Message type either text or unicode")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public SendSMStoGroupReq groups(String groups) {
    this.groups = groups;
    return this;
  }

   /**
   * The name of the group of mobile phone numbers. in case of multiple groups, separate them by comma.
   * @return groups
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the group of mobile phone numbers. in case of multiple groups, separate them by comma.")
  public String getGroups() {
    return groups;
  }

  public void setGroups(String groups) {
    this.groups = groups;
  }

  public SendSMStoGroupReq clientMessageId(Integer clientMessageId) {
    this.clientMessageId = clientMessageId;
    return this;
  }

   /**
   * Client Message Ref Id.
   * @return clientMessageId
  **/
  @ApiModelProperty(example = "null", value = "Client Message Ref Id.")
  public Integer getClientMessageId() {
    return clientMessageId;
  }

  public void setClientMessageId(Integer clientMessageId) {
    this.clientMessageId = clientMessageId;
  }

  public SendSMStoGroupReq acknowledgement(Integer acknowledgement) {
    this.acknowledgement = acknowledgement;
    return this;
  }

   /**
   * Need Ack or not [0 or 1].
   * @return acknowledgement
  **/
  @ApiModelProperty(example = "null", value = "Need Ack or not [0 or 1].")
  public Integer getAcknowledgement() {
    return acknowledgement;
  }

  public void setAcknowledgement(Integer acknowledgement) {
    this.acknowledgement = acknowledgement;
  }

  public SendSMStoGroupReq deliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

   /**
   * Default is 1440
   * @return deliveryTime
  **/
  @ApiModelProperty(example = "null", value = "Default is 1440")
  public String getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public SendSMStoGroupReq validityPeriod(String validityPeriod) {
    this.validityPeriod = validityPeriod;
    return this;
  }

   /**
   * Default is 1440
   * @return validityPeriod
  **/
  @ApiModelProperty(example = "null", value = "Default is 1440")
  public String getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(String validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  public SendSMStoGroupReq ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IP address.
   * @return ip
  **/
  @ApiModelProperty(example = "null", value = "IP address.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public SendSMStoGroupReq dlrUrl(String dlrUrl) {
    this.dlrUrl = dlrUrl;
    return this;
  }

   /**
   * Default is empty string.
   * @return dlrUrl
  **/
  @ApiModelProperty(example = "null", value = "Default is empty string.")
  public String getDlrUrl() {
    return dlrUrl;
  }

  public void setDlrUrl(String dlrUrl) {
    this.dlrUrl = dlrUrl;
  }

  public SendSMStoGroupReq dateStamp(String dateStamp) {
    this.dateStamp = dateStamp;
    return this;
  }

   /**
   * Default is current datetime.
   * @return dateStamp
  **/
  @ApiModelProperty(example = "null", value = "Default is current datetime.")
  public String getDateStamp() {
    return dateStamp;
  }

  public void setDateStamp(String dateStamp) {
    this.dateStamp = dateStamp;
  }

  public SendSMStoGroupReq udh(String udh) {
    this.udh = udh;
    return this;
  }

   /**
   * Default is empty string.
   * @return udh
  **/
  @ApiModelProperty(example = "null", value = "Default is empty string.")
  public String getUdh() {
    return udh;
  }

  public void setUdh(String udh) {
    this.udh = udh;
  }

  public SendSMStoGroupReq dataCoding(String dataCoding) {
    this.dataCoding = dataCoding;
    return this;
  }

   /**
   * Default is empty string.
   * @return dataCoding
  **/
  @ApiModelProperty(example = "null", value = "Default is empty string.")
  public String getDataCoding() {
    return dataCoding;
  }

  public void setDataCoding(String dataCoding) {
    this.dataCoding = dataCoding;
  }

  public SendSMStoGroupReq flashing(FlashingEnum flashing) {
    this.flashing = flashing;
    return this;
  }

   /**
   * To flash or not [0 or 1].
   * @return flashing
  **/
  @ApiModelProperty(example = "null", value = "To flash or not [0 or 1].")
  public FlashingEnum getFlashing() {
    return flashing;
  }

  public void setFlashing(FlashingEnum flashing) {
    this.flashing = flashing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSMStoGroupReq sendSMStoGroupReq = (SendSMStoGroupReq) o;
    return Objects.equals(this.messageText, sendSMStoGroupReq.messageText) &&
        Objects.equals(this.senderName, sendSMStoGroupReq.senderName) &&
        Objects.equals(this.messageType, sendSMStoGroupReq.messageType) &&
        Objects.equals(this.groups, sendSMStoGroupReq.groups) &&
        Objects.equals(this.clientMessageId, sendSMStoGroupReq.clientMessageId) &&
        Objects.equals(this.acknowledgement, sendSMStoGroupReq.acknowledgement) &&
        Objects.equals(this.deliveryTime, sendSMStoGroupReq.deliveryTime) &&
        Objects.equals(this.validityPeriod, sendSMStoGroupReq.validityPeriod) &&
        Objects.equals(this.ip, sendSMStoGroupReq.ip) &&
        Objects.equals(this.dlrUrl, sendSMStoGroupReq.dlrUrl) &&
        Objects.equals(this.dateStamp, sendSMStoGroupReq.dateStamp) &&
        Objects.equals(this.udh, sendSMStoGroupReq.udh) &&
        Objects.equals(this.dataCoding, sendSMStoGroupReq.dataCoding) &&
        Objects.equals(this.flashing, sendSMStoGroupReq.flashing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageText, senderName, messageType, groups, clientMessageId, acknowledgement, deliveryTime, validityPeriod, ip, dlrUrl, dateStamp, udh, dataCoding, flashing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSMStoGroupReq {\n");
    
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    clientMessageId: ").append(toIndentedString(clientMessageId)).append("\n");
    sb.append("    acknowledgement: ").append(toIndentedString(acknowledgement)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    dlrUrl: ").append(toIndentedString(dlrUrl)).append("\n");
    sb.append("    dateStamp: ").append(toIndentedString(dateStamp)).append("\n");
    sb.append("    udh: ").append(toIndentedString(udh)).append("\n");
    sb.append("    dataCoding: ").append(toIndentedString(dataCoding)).append("\n");
    sb.append("    flashing: ").append(toIndentedString(flashing)).append("\n");
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

