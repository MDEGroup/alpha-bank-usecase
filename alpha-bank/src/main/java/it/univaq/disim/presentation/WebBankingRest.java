package it.univaq.disim.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.univaq.disim.domain.web_banking.Subscription;
import it.univaq.disim.domain.web_banking.User;
import it.univaq.disim.service.WebBankingService;

@RestController
@RequestMapping("/rest/web-banking/")
public class WebBankingRest {
	@Autowired
	private WebBankingService webBankingService;
	@RequestMapping(value = "subscritpion", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public List<Subscription> getSubscriptions() {
		return webBankingService.findAllSubscription();
	}
	@RequestMapping(value = "subscritpion/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public Subscription getSubscription(String id) {
		return webBankingService.findSubscriptionById(id);
	}
	@RequestMapping(value = "subscritpion/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteSubscription(@PathVariable String id) {
		return webBankingService.deleteSubscription(id);
	}
	@RequestMapping(value = "subscritpion", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public Subscription updateSubscription(@RequestBody Subscription objToUpdate) {
		return webBankingService.updateSubscription(objToUpdate);
	}
	@RequestMapping(value = "subscritpion", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public Subscription createSubscription(@RequestBody Subscription objToUpdate) {
		return webBankingService.createSubscription(objToUpdate);
	}
	
	@RequestMapping(value = "user", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public List<User> getUsers() {
		return webBankingService.findAllUser();
	}
	@RequestMapping(value = "user/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public User getUser(String id) {
		return webBankingService.findUserById(id);
	}
	@RequestMapping(value = "user/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable String id) {
		return webBankingService.deleteUser(id);
	}
	@RequestMapping(value = "user", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public User updateUser(@RequestBody User objToUpdate) {
		return webBankingService.updateUser(objToUpdate);
	}
	@RequestMapping(value = "user", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public User createUser(@RequestBody User objToUpdate) {
		return webBankingService.createUser(objToUpdate);
	}
}
