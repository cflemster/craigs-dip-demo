package com.api.payments.model;

import java.util.Objects;
import com.api.payments.model.PaymentSetupPOSTResponseLinks;
import com.api.payments.model.PaymentSetupPOSTResponseMeta;
import com.api.payments.model.PaymentSetupResponse1;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentSubmitPOST201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-09T09:42:13.412+12:00")

public class PaymentSubmitPOST201Response   {
  @JsonProperty("Data")
  private PaymentSetupResponse1 data = null;

  @JsonProperty("Links")
  private PaymentSetupPOSTResponseLinks links = null;

  @JsonProperty("Meta")
  private PaymentSetupPOSTResponseMeta meta = null;

  public PaymentSubmitPOST201Response data(PaymentSetupResponse1 data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupResponse1 getData() {
    return data;
  }

  public void setData(PaymentSetupResponse1 data) {
    this.data = data;
  }

  public PaymentSubmitPOST201Response links(PaymentSetupPOSTResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupPOSTResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PaymentSetupPOSTResponseLinks links) {
    this.links = links;
  }

  public PaymentSubmitPOST201Response meta(PaymentSetupPOSTResponseMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupPOSTResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(PaymentSetupPOSTResponseMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSubmitPOST201Response paymentSubmitPOST201Response = (PaymentSubmitPOST201Response) o;
    return Objects.equals(this.data, paymentSubmitPOST201Response.data) &&
        Objects.equals(this.links, paymentSubmitPOST201Response.links) &&
        Objects.equals(this.meta, paymentSubmitPOST201Response.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubmitPOST201Response {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

