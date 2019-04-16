package com.pat.bnb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pat.bnb.entity.ConfirmationToken;
import com.pat.bnb.entity.UserDetails;
import com.pat.bnb.model.ResponseModel;
import com.pat.bnb.repository.ConfirmationTokenRepository;
import com.pat.bnb.repository.UserRepository;
import com.pat.bnb.service.EmailSenderService;

@RestController
@RequestMapping( value="/UserRegistration")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserAccountController {

	@Autowired
    private UserRepository userRepository;

    @Autowired
    private ConfirmationTokenRepository confirmationTokenRepository;

    @Autowired
    private EmailSenderService emailSenderService;

	
	  @RequestMapping(value="/login", method = RequestMethod.GET) public
	  ResponseEntity<ResponseModel> userLogin(@RequestParam("loginId") String loginId,@RequestParam("password") String password,@RequestParam("userType") int userType)
	 { 
		  
		  
		  UserDetails userDetails=userRepository.findByLoginIdAndPassword(loginId, password);
		  
		  if(userDetails!=null) {
			 
			  return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ResponseModel(userDetails,"202"));		
			  
			 
		  }
		  else {
		
			  return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseModel("Wrong Credential...","401"));
			  }
	 }
	 
    @RequestMapping(value="/register", method = RequestMethod.POST )
    public String registerUser(@Valid @RequestBody UserDetails user)
    {

    	System.out.println("user."+user.getEmailId());
        UserDetails existingUser = userRepository.findByEmailId(user.getEmailId());
        if(existingUser != null)
        {
            return "dashboard";
        }
        else
        {
            userRepository.save(user);

            ConfirmationToken confirmationToken = new ConfirmationToken(user);

            confirmationTokenRepository.save(confirmationToken);

            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo(user.getEmailId());
            mailMessage.setSubject("Complete Registration!");
            mailMessage.setFrom("krishna2020.90@gmail.com");
            mailMessage.setText("To confirm your account, please click here : "
            +"http://localhost:8080/UserRegistration/confirm-account?token="+confirmationToken.getConfirmationToken());

            emailSenderService.sendEmail(mailMessage);

           

        return "we have send a mail to you please confirm from there";   
        }

        
    }

          
    @RequestMapping(value="/confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
    public String confirmUserAccount(@RequestParam("token")String confirmationToken)
    {
        ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);

        if(token != null)
        {
        	byte b=1;
            UserDetails user = userRepository.findByEmailId(token.getUser().getEmailId());
            user.setIsActive(b);
            userRepository.save(user);
            return "accountVerified";
        }
        else
        {
        	
     return "The link is invalid or broken!";
            
        }

     
    }
    // getters and setters

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public ConfirmationTokenRepository getConfirmationTokenRepository() {
		return confirmationTokenRepository;
	}

	public void setConfirmationTokenRepository(ConfirmationTokenRepository confirmationTokenRepository) {
		this.confirmationTokenRepository = confirmationTokenRepository;
	}

	public EmailSenderService getEmailSenderService() {
		return emailSenderService;
	}

	public void setEmailSenderService(EmailSenderService emailSenderService) {
		this.emailSenderService = emailSenderService;
	}
    
    
    
}
