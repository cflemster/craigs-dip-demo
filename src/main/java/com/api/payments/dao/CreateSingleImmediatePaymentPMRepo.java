package com.api.payments.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.payments.model.CreateSingleImmediatePaymentP;
public interface CreateSingleImmediatePaymentPMRepo extends MongoRepository<CreateSingleImmediatePaymentP,String>{

}
