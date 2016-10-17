package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cequens.client.model.MasterAcc;
import cequens.client.model.SubAcc;
import java.util.ArrayList;
import java.util.List;


/**
 * AccbalanceResData
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class AccbalanceResData   {
  @SerializedName("Account")
  private MasterAcc account = null;

  @SerializedName("SubAccounts")
  private List<SubAcc> subAccounts = new ArrayList<SubAcc>();

  public AccbalanceResData account(MasterAcc account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(example = "null", value = "")
  public MasterAcc getAccount() {
    return account;
  }

  public void setAccount(MasterAcc account) {
    this.account = account;
  }

  public AccbalanceResData subAccounts(List<SubAcc> subAccounts) {
    this.subAccounts = subAccounts;
    return this;
  }

  public AccbalanceResData addSubAccountsItem(SubAcc subAccountsItem) {
    this.subAccounts.add(subAccountsItem);
    return this;
  }

   /**
   * Get subAccounts
   * @return subAccounts
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SubAcc> getSubAccounts() {
    return subAccounts;
  }

  public void setSubAccounts(List<SubAcc> subAccounts) {
    this.subAccounts = subAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccbalanceResData accbalanceResData = (AccbalanceResData) o;
    return Objects.equals(this.account, accbalanceResData.account) &&
        Objects.equals(this.subAccounts, accbalanceResData.subAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, subAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccbalanceResData {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    subAccounts: ").append(toIndentedString(subAccounts)).append("\n");
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

