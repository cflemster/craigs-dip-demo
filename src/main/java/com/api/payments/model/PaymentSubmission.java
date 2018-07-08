package com.api.payments.model;

import java.util.Objects;
import com.api.payments.model.PaymentSetupResponseInitiation;
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

public class PaymentSubmission   {
  @JsonProperty("PaymentId")
  private String paymentId = null;

  @JsonProperty("Initiation")
  private PaymentSetupResponseInitiation initiation = null;

  public PaymentSubmission paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.")
  @NotNull

 @Size(min=1,max=128)
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentSubmission initiation(PaymentSetupResponseInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

   /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupResponseInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(PaymentSetupResponseInitiation initiation) {
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
    PaymentSubmission paymentSubmission = (PaymentSubmission) o;
    return Objects.equals(this.paymentId, paymentSubmission.paymentId) &&
        Objects.equals(this.initiation, paymentSubmission.initiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, initiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubmission {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
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

