package com.quicksol.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*
		 * All the requests require authentication
		 */
		http.httpBasic().and().authorizeHttpRequests().anyRequest().authenticated();
		/*
		 * Non of the requests require authentication
		 */
//		http.httpBasic().and().authorizeHttpRequests().anyRequest().permitAll();

	}
}
