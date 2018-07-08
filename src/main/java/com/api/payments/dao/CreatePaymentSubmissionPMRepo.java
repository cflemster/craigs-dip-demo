package com.api.payments.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.payments.model.CreatePaymentSubmissionP;
public interface CreatePaymentSubmissionPMRepo extends MongoRepository<CreatePaymentSubmissionP,String>{

}
