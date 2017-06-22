package com.altimetrik.OnePlatform.models.repository;

import com.altimetrik.OnePlatform.models.*;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BeneficiaryRepository extends MongoRepository<Beneficiary, String>{

}



