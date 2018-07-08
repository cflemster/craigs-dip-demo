package com.api.payments.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class CreateSingleImmediatePaymentResponseWrapper {

	 private PaymentSetupPOSTResponse response;

	 public MultiValueMap<String, String> getHeaders(){
	 final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
 	return map;
	}
	 public void setHeaders(){
		 
	} 
	public PaymentSetupPOSTResponse getResponse(){
		 return response;
	} 
	 public void setResponse(PaymentSetupPOSTResponse response){
		 this.response=response;
	} 
}