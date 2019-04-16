package com.pat.bnb.repository;

import org.springframework.data.repository.CrudRepository;

import com.pat.bnb.entity.ConfirmationToken;
import com.pat.bnb.entity.UserDetails;
import com.pat.bnb.entity.UserType;

public interface UserTypeRepository extends CrudRepository<UserType,Integer> {

	
	UserType findByUserTypeId(int userTypeId);
	
}
