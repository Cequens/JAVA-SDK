package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * MasterAcc
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class MasterAcc   {
  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("Credit")
  private Double credit = null;

  public MasterAcc userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public MasterAcc credit(Double credit) {
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCredit() {
    return credit;
  }

  public void setCredit(Double credit) {
    this.credit = credit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterAcc masterAcc = (MasterAcc) o;
    return Objects.equals(this.userName, masterAcc.userName) &&
        Objects.equals(this.credit, masterAcc.credit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, credit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterAcc {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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

