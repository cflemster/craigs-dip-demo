package com.api.payments.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.payments.services.*;
import com.api.payments.model.*;


import com.api.payments.model.PaymentSetupPOSTRequest;
import com.api.payments.model.PaymentSetupPOSTResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-09T09:42:13.412+12:00")

@Controller
public class PaymentsApiController implements PaymentsApi {
	@Autowired
	 private CreateSingleImmediatePaymentI createSingleImmediatePaymentI;
	@Autowired
	 private GetSingleImmediatePaymentI getSingleImmediatePaymentI;




    public ResponseEntity<PaymentSetupPOSTResponse> createSingleImmediatePayment(@ApiParam(value = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours." ,required=true) @RequestHeader(value="x-idempotency-key", required=true) String xIdempotencyKey,
        @ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,
        @ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "Setup a single immediate payment" ,required=true )  @Valid @RequestBody PaymentSetupPOSTRequest body,
        @ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,
        @ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,
        @ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,
        @ApiParam(value = "DO NOT USE. Header containing a detached JWS signature of the body of the payload." ) @RequestHeader(value="x-jws-signature", required=false) String xJwsSignature) {

	CreateSingleImmediatePaymentResponseWrapper res = createSingleImmediatePaymentI.execute(new CreateSingleImmediatePaymentP(xIdempotencyKey,xFapiFinancialId,authorization,body,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,xJwsSignature));
        return new ResponseEntity<PaymentSetupPOSTResponse>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<PaymentSetupPOSTResponse> getSingleImmediatePayment(@ApiParam(value = "Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.",required=true ) @PathVariable("PaymentId") String paymentId,
        @ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,
        @ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,
        @ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,
        @ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {

	GetSingleImmediatePaymentResponseWrapper res = getSingleImmediatePaymentI.execute(new GetSingleImmediatePaymentP(paymentId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId));
        return new ResponseEntity<PaymentSetupPOSTResponse>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

}
