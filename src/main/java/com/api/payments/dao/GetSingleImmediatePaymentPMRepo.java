package com.api.payments.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.payments.model.GetSingleImmediatePaymentP;
public interface GetSingleImmediatePaymentPMRepo extends MongoRepository<GetSingleImmediatePaymentP,String>{

}
