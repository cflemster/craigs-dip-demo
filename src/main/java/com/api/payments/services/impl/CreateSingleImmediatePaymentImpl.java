package com.api.payments.services.impl;

import java.util.*;

import com.api.payments.model.*;

import com.api.payments.dao.*;
import com.api.payments.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class CreateSingleImmediatePaymentImpl implements CreateSingleImmediatePaymentI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public CreateSingleImmediatePaymentResponseWrapper execute(CreateSingleImmediatePaymentP pojo){
		//TODO
		return new CreateSingleImmediatePaymentResponseWrapper();
	}

	public CreateSingleImmediatePaymentResponseWrapper reliable(CreateSingleImmediatePaymentP pojo){
		//TODO
		return new CreateSingleImmediatePaymentResponseWrapper();
	}
}