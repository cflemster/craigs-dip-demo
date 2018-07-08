package com.api.payments.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.payments.services.*;
import com.api.payments.model.*;


import com.api.payments.model.PaymentSubmissionPOSTRequest;
import com.api.payments.model.PaymentSubmitPOST201Response;

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
public class PaymentSubmissionsApiController implements PaymentSubmissionsApi {
	@Autowired
	 private CreatePaymentSubmissionI createPaymentSubmissionI;
	@Autowired
	 private GetPaymentSubmissionI getPaymentSubmissionI;




    public ResponseEntity<PaymentSubmitPOST201Response> createPaymentSubmission(@ApiParam(value = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours." ,required=true) @RequestHeader(value="x-idempotency-key", required=true) String xIdempotencyKey,
        @ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,
        @ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "Setup a single immediate payment" ,required=true )  @Valid @RequestBody PaymentSubmissionPOSTRequest body,
        @ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,
        @ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,
        @ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,
        @ApiParam(value = "DO NOT USE. Header containing a detached JWS signature of the body of the payload." ) @RequestHeader(value="x-jws-signature", required=false) String xJwsSignature) {

	CreatePaymentSubmissionResponseWrapper res = createPaymentSubmissionI.execute(new CreatePaymentSubmissionP(xIdempotencyKey,xFapiFinancialId,authorization,body,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,xJwsSignature));
        return new ResponseEntity<PaymentSubmitPOST201Response>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<PaymentSubmitPOST201Response> getPaymentSubmission(@ApiParam(value = "Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource.",required=true ) @PathVariable("PaymentSubmissionId") String paymentSubmissionId,
        @ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,
        @ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,
        @ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,
        @ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {

	GetPaymentSubmissionResponseWrapper res = getPaymentSubmissionI.execute(new GetPaymentSubmissionP(paymentSubmissionId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId));
        return new ResponseEntity<PaymentSubmitPOST201Response>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

}
