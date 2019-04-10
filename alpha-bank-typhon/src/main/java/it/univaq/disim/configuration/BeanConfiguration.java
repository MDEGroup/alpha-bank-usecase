package it.univaq.disim.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.typhon.client.service.AccountService;
import org.typhon.client.service.CustomerGeneralService;
import org.typhon.client.service.SubscriptionService;
import org.typhon.client.service.UserService;

@Configuration
public class BeanConfiguration {
	@Bean
	public AccountService accountService() {
		return new AccountService("http://localhost:8080");
	}
	
	@Bean
	public CustomerGeneralService customerService() {
		return new CustomerGeneralService("http://localhost:8080");
	}
	
	@Bean
	public UserService userService() {
		return new UserService("http://localhost:8080");
	}
	
	@Bean
	public SubscriptionService subscritpionService() {
		return new SubscriptionService("http://localhost:8080");
	}
	
}
