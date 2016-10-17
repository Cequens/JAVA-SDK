package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SubAcc
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class SubAcc   {
  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("Credit")
  private Double credit = null;

  /**
   * Gets or Sets balanceMode
   */
  public enum BalanceModeEnum {
    @SerializedName("Allocated balance")
    ALLOCATED_BALANCE("Allocated balance"),
    
    @SerializedName("Shared balance")
    SHARED_BALANCE("Shared balance");

    private String value;

    BalanceModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("BalanceMode")
  private BalanceModeEnum balanceMode = null;

  public SubAcc userName(String userName) {
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

  public SubAcc credit(Double credit) {
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

  public SubAcc balanceMode(BalanceModeEnum balanceMode) {
    this.balanceMode = balanceMode;
    return this;
  }

   /**
   * Get balanceMode
   * @return balanceMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public BalanceModeEnum getBalanceMode() {
    return balanceMode;
  }

  public void setBalanceMode(BalanceModeEnum balanceMode) {
    this.balanceMode = balanceMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAcc subAcc = (SubAcc) o;
    return Objects.equals(this.userName, subAcc.userName) &&
        Objects.equals(this.credit, subAcc.credit) &&
        Objects.equals(this.balanceMode, subAcc.balanceMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, credit, balanceMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAcc {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    balanceMode: ").append(toIndentedString(balanceMode)).append("\n");
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

