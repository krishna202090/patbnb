package com.pat.bnb.repository;

import org.springframework.data.repository.CrudRepository;

import com.pat.bnb.entity.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken,String> {

	
	ConfirmationToken findByConfirmationToken(String confirmationToken);
	
}
