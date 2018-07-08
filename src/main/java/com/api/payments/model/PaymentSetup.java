package com.api.payments.model;

import java.util.Objects;
import com.api.payments.model.PaymentSetupInitiation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-09T09:42:13.412+12:00")

public class PaymentSetup   {
  @JsonProperty("Initiation")
  private PaymentSetupInitiation initiation = null;

  public PaymentSetup initiation(PaymentSetupInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

   /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(PaymentSetupInitiation initiation) {
    this.initiation = initiation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetup paymentSetup = (PaymentSetup) o;
    return Objects.equals(this.initiation, paymentSetup.initiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetup {\n");
    
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

