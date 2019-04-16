package com.pat.bnb;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {

	@Override
    protected void configure(HttpSecurity http) throws Exception {
		/*
		 * http.authorizeRequests() .antMatchers("/register").permitAll()
		 * .antMatchers("/confirm").permitAll();
		 */
		
		super.configure(http);
		
        http.csrf().disable();
    }
	 @Override
     public void configure(WebSecurity web) throws Exception {
          web.ignoring().antMatchers("/**");
     }
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * super.configure(http); http.csrf().disable();
	 * 
	 * }
	 */	
}
