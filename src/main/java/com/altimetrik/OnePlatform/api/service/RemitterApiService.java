package com.altimetrik.OnePlatform.api.service;

import com.altimetrik.OnePlatform.models.Remitter;


import com.altimetrik.OnePlatform.exception.NotFoundException;
import java.util.List;

public interface RemitterApiService {
  
      List<Remitter> findAllRemitter()
      throws NotFoundException;
  
      Remitter updateRemitter(Remitter remitter)
      throws NotFoundException;
  
      Remitter addRemitter(Remitter remitter)
      throws NotFoundException;
  
      Remitter findByIdRemitter(String id)
      throws NotFoundException;
  
      void deleteRemitter(String id)
      throws NotFoundException;
  
}

