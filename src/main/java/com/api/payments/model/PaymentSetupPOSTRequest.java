package com.api.payments.model;

import java.util.Objects;
import com.api.payments.model.PaymentSetup;
import com.api.payments.model.Risk;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Allows setup of a payment
 */
@ApiModel(description = "Allows setup of a payment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-09T09:42:13.412+12:00")

public class PaymentSetupPOSTRequest   {
  @JsonProperty("Data")
  private PaymentSetup data = null;

  @JsonProperty("Risk")
  private Risk risk = null;

  public PaymentSetupPOSTRequest data(PaymentSetup data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetup getData() {
    return data;
  }

  public void setData(PaymentSetup data) {
    this.data = data;
  }

  public PaymentSetupPOSTRequest risk(Risk risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Risk getRisk() {
    return risk;
  }

  public void setRisk(Risk risk) {
    this.risk = risk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupPOSTRequest paymentSetupPOSTRequest = (PaymentSetupPOSTRequest) o;
    return Objects.equals(this.data, paymentSetupPOSTRequest.data) &&
        Objects.equals(this.risk, paymentSetupPOSTRequest.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupPOSTRequest {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

