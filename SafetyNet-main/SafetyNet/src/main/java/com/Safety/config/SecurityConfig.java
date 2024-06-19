package com.Safety.config;

//import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
//@EnableWebSecurity
public class SecurityConfig {

	 @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    } 
	 
	 

	 
//	 @Bean
//	    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//	        return http
//	                .authorizeHttpRequests(auth -> {
//	                    auth.requestMatchers("api/Safety/home","api/Safety/save","api/Safety/login","api/Safety/postalert","api/Safety/allalerts").permitAll();
//	                    auth.anyRequest().authenticated();
//	                   
//	                })
//	                .oauth2Login(withDefaults())
//	                
//	                .build();
//	    }
	 
	 
}
