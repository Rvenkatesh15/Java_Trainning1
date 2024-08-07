package com.example.springbootcloudconfigclientdemo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/welcome")
public class WelcomeController {
    @Value("${app.name}")
    private String appName;
	
//	@Value("${app.welcome}")
//	String appWelcomeMessage;
	

	
	@Value("${db.connection.string}")
	
	String dbconnectionURL;
	
	@Value("${db.connection.username}")
	String dbconnectionUser;
	@Value("${db.connection.password}")
	String dbconnectionPassword;
	
	@GetMapping("/user")
	public String welcomeUser() {
		return "to "+appName;
	}
	@GetMapping("/db")
	public String checkDB() {
		return dbconnectionURL+" "+dbconnectionUser+" "+dbconnectionPassword;
		
		
		
		
	}
	
	
	

}
