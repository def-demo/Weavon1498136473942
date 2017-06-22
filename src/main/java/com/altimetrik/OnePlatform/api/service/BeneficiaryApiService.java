package com.altimetrik.OnePlatform.api.service;

import com.altimetrik.OnePlatform.models.Beneficiary;


import com.altimetrik.OnePlatform.exception.NotFoundException;
import java.util.List;

public interface BeneficiaryApiService {
  
      List<Beneficiary> findAllBeneficiary()
      throws NotFoundException;
  
      Beneficiary updateBeneficiary(Beneficiary beneficiary)
      throws NotFoundException;
  
      Beneficiary addBeneficiary(Beneficiary beneficiary)
      throws NotFoundException;
  
      Beneficiary findByIdBeneficiary(String id)
      throws NotFoundException;
  
      void deleteBeneficiary(String id)
      throws NotFoundException;
  
}

