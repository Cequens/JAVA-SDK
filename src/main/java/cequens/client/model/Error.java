package cequens.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cequens.client.model.InternalError;
import java.util.ArrayList;
import java.util.List;


/**
 * Error
 */
@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class Error   {
  @SerializedName("status")
  private Integer status = 400;

  @SerializedName("description")
  private String description = null;

  @SerializedName("internalErrors")
  private List<InternalError> internalErrors = new ArrayList<InternalError>();

  public Error status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Error internalErrors(List<InternalError> internalErrors) {
    this.internalErrors = internalErrors;
    return this;
  }

  public Error addInternalErrorsItem(InternalError internalErrorsItem) {
    this.internalErrors.add(internalErrorsItem);
    return this;
  }

   /**
   * Get internalErrors
   * @return internalErrors
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InternalError> getInternalErrors() {
    return internalErrors;
  }

  public void setInternalErrors(List<InternalError> internalErrors) {
    this.internalErrors = internalErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.status, error.status) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.internalErrors, error.internalErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description, internalErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    internalErrors: ").append(toIndentedString(internalErrors)).append("\n");
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

