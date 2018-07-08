package com.api.payments.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CreateSingleImmediatePaymentP {

	private String xIdempotencyKey;

	private String xFapiFinancialId;

	private String authorization;

	private PaymentSetupPOSTRequest body;

	private String xFapiCustomerLastLoggedTime;

	private String xFapiCustomerIpAddress;

	private String xFapiInteractionId;

	private String xJwsSignature;

	public CreateSingleImmediatePaymentP(){}

	public CreateSingleImmediatePaymentP(String xIdempotencyKey,String xFapiFinancialId,String authorization,PaymentSetupPOSTRequest body,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId,String xJwsSignature){
		 this.xIdempotencyKey=xIdempotencyKey;
		 this.xFapiFinancialId=xFapiFinancialId;
		 this.authorization=authorization;
		 this.body=body;
		 this.xFapiCustomerLastLoggedTime=xFapiCustomerLastLoggedTime;
		 this.xFapiCustomerIpAddress=xFapiCustomerIpAddress;
		 this.xFapiInteractionId=xFapiInteractionId;
		 this.xJwsSignature=xJwsSignature;
	}


	public String getXIdempotencyKey() {
		 return xIdempotencyKey;
	}

	public void setXIdempotencyKey(String xIdempotencyKey) {
		 this.xIdempotencyKey=xIdempotencyKey;
	}
	public String getXFapiFinancialId() {
		 return xFapiFinancialId;
	}

	public void setXFapiFinancialId(String xFapiFinancialId) {
		 this.xFapiFinancialId=xFapiFinancialId;
	}
	public String getAuthorization() {
		 return authorization;
	}

	public void setAuthorization(String authorization) {
		 this.authorization=authorization;
	}
	public PaymentSetupPOSTRequest getBody() {
		 return body;
	}

	public void setBody(PaymentSetupPOSTRequest body) {
		 this.body=body;
	}
	public String getXFapiCustomerLastLoggedTime() {
		 return xFapiCustomerLastLoggedTime;
	}

	public void setXFapiCustomerLastLoggedTime(String xFapiCustomerLastLoggedTime) {
		 this.xFapiCustomerLastLoggedTime=xFapiCustomerLastLoggedTime;
	}
	public String getXFapiCustomerIpAddress() {
		 return xFapiCustomerIpAddress;
	}

	public void setXFapiCustomerIpAddress(String xFapiCustomerIpAddress) {
		 this.xFapiCustomerIpAddress=xFapiCustomerIpAddress;
	}
	public String getXFapiInteractionId() {
		 return xFapiInteractionId;
	}

	public void setXFapiInteractionId(String xFapiInteractionId) {
		 this.xFapiInteractionId=xFapiInteractionId;
	}
	public String getXJwsSignature() {
		 return xJwsSignature;
	}

	public void setXJwsSignature(String xJwsSignature) {
		 this.xJwsSignature=xJwsSignature;
	}
}