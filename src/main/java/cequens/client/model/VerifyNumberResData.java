package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * VerifyNumberResData
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class VerifyNumberResData   {
  @SerializedName("checkCode")
  private String checkCode = null;

  public VerifyNumberResData checkCode(String checkCode) {
    this.checkCode = checkCode;
    return this;
  }

   /**
   * Get checkCode
   * @return checkCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCheckCode() {
    return checkCode;
  }

  public void setCheckCode(String checkCode) {
    this.checkCode = checkCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyNumberResData verifyNumberResData = (VerifyNumberResData) o;
    return Objects.equals(this.checkCode, verifyNumberResData.checkCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyNumberResData {\n");
    
    sb.append("    checkCode: ").append(toIndentedString(checkCode)).append("\n");
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

