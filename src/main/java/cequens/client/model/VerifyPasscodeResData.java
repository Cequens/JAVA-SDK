package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * VerifyPasscodeResData
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class VerifyPasscodeResData   {
  @SerializedName("PasscodeStatus")
  private Integer passcodeStatus = null;

  public VerifyPasscodeResData passcodeStatus(Integer passcodeStatus) {
    this.passcodeStatus = passcodeStatus;
    return this;
  }

   /**
   * Possible Status values means [0:expired],[1:valid] ,[2:invalid].
   * @return passcodeStatus
  **/
  @ApiModelProperty(example = "null", value = "Possible Status values means [0:expired],[1:valid] ,[2:invalid].")
  public Integer getPasscodeStatus() {
    return passcodeStatus;
  }

  public void setPasscodeStatus(Integer passcodeStatus) {
    this.passcodeStatus = passcodeStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyPasscodeResData verifyPasscodeResData = (VerifyPasscodeResData) o;
    return Objects.equals(this.passcodeStatus, verifyPasscodeResData.passcodeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passcodeStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPasscodeResData {\n");
    
    sb.append("    passcodeStatus: ").append(toIndentedString(passcodeStatus)).append("\n");
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

