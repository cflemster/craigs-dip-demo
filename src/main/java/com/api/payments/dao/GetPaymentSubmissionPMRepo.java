package com.api.payments.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.payments.model.GetPaymentSubmissionP;
public interface GetPaymentSubmissionPMRepo extends MongoRepository<GetPaymentSubmissionP,String>{

}
