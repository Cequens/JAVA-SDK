package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cequens.client.model.Error;
import cequens.client.model.MessageDetails;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * MessageDetailsRes
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class MessageDetailsRes   {
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
  private List<MessageDetails> data = new ArrayList<MessageDetails>();

  @SerializedName("error")
  private Error error = null;

  public MessageDetailsRes replyCode(Integer replyCode) {
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

  public MessageDetailsRes replyMessage(String replyMessage) {
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

  public MessageDetailsRes requestId(String requestId) {
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

  public MessageDetailsRes clientRequestId(Long clientRequestId) {
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

  public MessageDetailsRes requestTime(DateTime requestTime) {
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

  public MessageDetailsRes data(List<MessageDetails> data) {
    this.data = data;
    return this;
  }

  public MessageDetailsRes addDataItem(MessageDetails dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MessageDetails> getData() {
    return data;
  }

  public void setData(List<MessageDetails> data) {
    this.data = data;
  }

  public MessageDetailsRes error(Error error) {
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
    MessageDetailsRes messageDetailsRes = (MessageDetailsRes) o;
    return Objects.equals(this.replyCode, messageDetailsRes.replyCode) &&
        Objects.equals(this.replyMessage, messageDetailsRes.replyMessage) &&
        Objects.equals(this.requestId, messageDetailsRes.requestId) &&
        Objects.equals(this.clientRequestId, messageDetailsRes.clientRequestId) &&
        Objects.equals(this.requestTime, messageDetailsRes.requestTime) &&
        Objects.equals(this.data, messageDetailsRes.data) &&
        Objects.equals(this.error, messageDetailsRes.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyCode, replyMessage, requestId, clientRequestId, requestTime, data, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDetailsRes {\n");
    
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

