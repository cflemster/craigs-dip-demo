package com.api.payments.services.impl;

import java.util.*;

import com.api.payments.model.*;

import com.api.payments.dao.*;
import com.api.payments.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class GetSingleImmediatePaymentImpl implements GetSingleImmediatePaymentI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public GetSingleImmediatePaymentResponseWrapper execute(GetSingleImmediatePaymentP pojo){
		//TODO
		return new GetSingleImmediatePaymentResponseWrapper();
	}

	public GetSingleImmediatePaymentResponseWrapper reliable(GetSingleImmediatePaymentP pojo){
		//TODO
		return new GetSingleImmediatePaymentResponseWrapper();
	}
}