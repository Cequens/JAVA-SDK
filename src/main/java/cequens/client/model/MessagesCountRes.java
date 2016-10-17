package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cequens.client.model.Error;
import cequens.client.model.MessagesCountResData;
import org.joda.time.DateTime;


/**
 * MessagesCountRes
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class MessagesCountRes   {
  @SerializedName("replyCode")
  private Integer replyCode = 0;

  @SerializedName("replyMessage")
  private String replyMessage = null;

  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("clientRequestId")
  private Long clientRequestId = null;

  @SerializedName("requestTime")
  private DateTime requestTime = null;

  @SerializedName("data")
  private MessagesCountResData data = null;

  @SerializedName("error")
  private Error error = null;

  public MessagesCountRes replyCode(Integer replyCode) {
    this.replyCode = replyCode;
    return this;
  }

   /**
   * Get replyCode
   * @return replyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getReplyCode() {
    return replyCode;
  }

  public void setReplyCode(Integer replyCode) {
    this.replyCode = replyCode;
  }

  public MessagesCountRes replyMessage(String replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }

   /**
   * Get replyMessage
   * @return replyMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReplyMessage() {
    return replyMessage;
  }

  public void setReplyMessage(String replyMessage) {
    this.replyMessage = replyMessage;
  }

  public MessagesCountRes requestId(String requestId) {
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

  public MessagesCountRes clientRequestId(Long clientRequestId) {
    this.clientRequestId = clientRequestId;
    return this;
  }

   /**
   * Get clientRequestId
   * @return clientRequestId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getClientRequestId() {
    return clientRequestId;
  }

  public void setClientRequestId(Long clientRequestId) {
    this.clientRequestId = clientRequestId;
  }

  public MessagesCountRes requestTime(DateTime requestTime) {
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Get requestTime
   * @return requestTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(DateTime requestTime) {
    this.requestTime = requestTime;
  }

  public MessagesCountRes data(MessagesCountResData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public MessagesCountResData getData() {
    return data;
  }

  public void setData(MessagesCountResData data) {
    this.data = data;
  }

  public MessagesCountRes error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagesCountRes messagesCountRes = (MessagesCountRes) o;
    return Objects.equals(this.replyCode, messagesCountRes.replyCode) &&
        Objects.equals(this.replyMessage, messagesCountRes.replyMessage) &&
        Objects.equals(this.requestId, messagesCountRes.requestId) &&
        Objects.equals(this.clientRequestId, messagesCountRes.clientRequestId) &&
        Objects.equals(this.requestTime, messagesCountRes.requestTime) &&
        Objects.equals(this.data, messagesCountRes.data) &&
        Objects.equals(this.error, messagesCountRes.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyCode, replyMessage, requestId, clientRequestId, requestTime, data, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesCountRes {\n");
    
    sb.append("    replyCode: ").append(toIndentedString(replyCode)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

