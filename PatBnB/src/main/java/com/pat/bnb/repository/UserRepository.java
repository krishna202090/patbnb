package com.pat.bnb.repository;

import org.springframework.data.repository.CrudRepository;

import com.pat.bnb.entity.ConfirmationToken;
import com.pat.bnb.entity.UserDetails;

public interface UserRepository extends CrudRepository<UserDetails,String> {

	
	UserDetails findByUserId(Integer userId);
	
	UserDetails findByEmailId(String emailId);
	
	UserDetails findByLoginIdAndPassword(String loginid,String password);
}
