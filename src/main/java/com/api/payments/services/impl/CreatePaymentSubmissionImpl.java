package com.api.payments.services.impl;

import java.util.*;

import com.api.payments.model.*;

import com.api.payments.dao.*;
import com.api.payments.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class CreatePaymentSubmissionImpl implements CreatePaymentSubmissionI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public CreatePaymentSubmissionResponseWrapper execute(CreatePaymentSubmissionP pojo){
		//TODO
		return new CreatePaymentSubmissionResponseWrapper();
	}

	public CreatePaymentSubmissionResponseWrapper reliable(CreatePaymentSubmissionP pojo){
		//TODO
		return new CreatePaymentSubmissionResponseWrapper();
	}
}