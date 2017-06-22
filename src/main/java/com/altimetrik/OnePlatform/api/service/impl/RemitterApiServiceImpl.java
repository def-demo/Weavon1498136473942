package com.altimetrik.OnePlatform.api.service.impl;

import com.altimetrik.OnePlatform.api.service.*;
import com.altimetrik.OnePlatform.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.OnePlatform.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.OnePlatform.models.Remitter;


import java.util.List;
import com.altimetrik.OnePlatform.exception.NotFoundException;


@Service
@Transactional
public class RemitterApiServiceImpl implements RemitterApiService {
		  	  
	  @Autowired
	
  	  private RemitterRepository  remitterRepository ;
	   
  
  
				
			
      @Override
      public List<Remitter> findAllRemitter()
      throws NotFoundException {
      
        
  		
  		
  			return remitterRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Remitter updateRemitter(Remitter remitter)
      throws NotFoundException {
      
         
        	return remitterRepository.save(remitter);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Remitter addRemitter(Remitter remitter)
      throws NotFoundException {
      
         
        	return remitterRepository.save(remitter);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Remitter findByIdRemitter(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return remitterRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteRemitter(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

