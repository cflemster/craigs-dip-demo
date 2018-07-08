package com.api.payments.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GetPaymentSubmissionP {

	private String paymentSubmissionId;

	private String xFapiFinancialId;

	private String authorization;

	private String xFapiCustomerLastLoggedTime;

	private String xFapiCustomerIpAddress;

	private String xFapiInteractionId;

	public GetPaymentSubmissionP(){}

	public GetPaymentSubmissionP(String paymentSubmissionId,String xFapiFinancialId,String authorization,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId){
		 this.paymentSubmissionId=paymentSubmissionId;
		 this.xFapiFinancialId=xFapiFinancialId;
		 this.authorization=authorization;
		 this.xFapiCustomerLastLoggedTime=xFapiCustomerLastLoggedTime;
		 this.xFapiCustomerIpAddress=xFapiCustomerIpAddress;
		 this.xFapiInteractionId=xFapiInteractionId;
	}


	public String getPaymentSubmissionId() {
		 return paymentSubmissionId;
	}

	public void setPaymentSubmissionId(String paymentSubmissionId) {
		 this.paymentSubmissionId=paymentSubmissionId;
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
}