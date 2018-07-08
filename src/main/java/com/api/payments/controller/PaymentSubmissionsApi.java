/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.api.payments.controller;

import com.api.payments.model.PaymentSubmissionPOSTRequest;
import com.api.payments.model.PaymentSubmitPOST201Response;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-09T09:42:13.412+12:00")

@Api(value = "payment-submissions", description = "the payment-submissions API")
public interface PaymentSubmissionsApi {

    @ApiOperation(value = "Create a payment submission", notes = "Submit a previously setup payment", response = PaymentSubmitPOST201Response.class, authorizations = {
        @Authorization(value = "PSUOAuth2Security", scopes = {
            @AuthorizationScope(scope = "payments", description = "Generic payment scope")
            })
    }, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Payment submit resource successfully created", response = PaymentSubmitPOST201Response.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 405, message = "Method Not Allowed", response = Void.class),
        @ApiResponse(code = 406, message = "Not Acceptable", response = Void.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })
    
    @RequestMapping(value = "/payment-submissions",
        produces = { "application/json; charset=utf-8" }, 
        consumes = { "application/json; charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<PaymentSubmitPOST201Response> createPaymentSubmission(@ApiParam(value = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours." ,required=true) @RequestHeader(value="x-idempotency-key", required=true) String xIdempotencyKey,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "Setup a single immediate payment" ,required=true )  @Valid @RequestBody PaymentSubmissionPOSTRequest body,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,@ApiParam(value = "DO NOT USE. Header containing a detached JWS signature of the body of the payload." ) @RequestHeader(value="x-jws-signature", required=false) String xJwsSignature);


    @ApiOperation(value = "Get a payment submission", notes = "Get payment submission", response = PaymentSubmitPOST201Response.class, authorizations = {
        @Authorization(value = "PSUOAuth2Security", scopes = {
            @AuthorizationScope(scope = "payments", description = "Generic payment scope")
            }),
        @Authorization(value = "TPPOAuth2Security", scopes = {
            @AuthorizationScope(scope = "payments", description = "Generic payment scope")
            })
    }, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment resource successfully retrieved", response = PaymentSubmitPOST201Response.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 405, message = "Method Not Allowed", response = Void.class),
        @ApiResponse(code = 406, message = "Not Acceptable", response = Void.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })
    
    @RequestMapping(value = "/payment-submissions/{PaymentSubmissionId}",
        produces = { "application/json; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<PaymentSubmitPOST201Response> getPaymentSubmission(@ApiParam(value = "Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource.",required=true ) @PathVariable("PaymentSubmissionId") String paymentSubmissionId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId);

}
