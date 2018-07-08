package com.api.payments.services.impl;

import java.util.*;

import com.api.payments.model.*;

import com.api.payments.dao.*;
import com.api.payments.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class GetPaymentSubmissionImpl implements GetPaymentSubmissionI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public GetPaymentSubmissionResponseWrapper execute(GetPaymentSubmissionP pojo){
		//TODO
		return new GetPaymentSubmissionResponseWrapper();
	}

	public GetPaymentSubmissionResponseWrapper reliable(GetPaymentSubmissionP pojo){
		//TODO
		return new GetPaymentSubmissionResponseWrapper();
	}
}