package it.univaq.disim.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.typhon.client.model.Subscription;
import org.typhon.client.model.User;
import org.typhon.client.service.SubscriptionService;
import org.typhon.client.service.UserService;


@RestController
@RequestMapping("/rest/web-banking/")
public class WebBankingRest {
	@Autowired
	private SubscriptionService webBankingService;
	@Autowired
	private UserService userService;
	@RequestMapping(value = "subscritpion", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public PagedResources<Subscription> getSubscriptions() {
		return webBankingService.findAll(1, 5, "ASC");
	}
	@RequestMapping(value = "subscritpion/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public Subscription getSubscription(String id) {
		return webBankingService.findById(id);
	}
	@RequestMapping(value = "subscritpion/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteSubscription(@PathVariable String id) {
		Subscription v = webBankingService.findById(id);
		webBankingService.delete(v);
		return true;
	}
	@RequestMapping(value = "subscritpion", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public Subscription updateSubscription(@RequestBody Subscription objToUpdate) {
		return webBankingService.update(objToUpdate);
	}
	@RequestMapping(value = "subscritpion", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public Subscription createSubscription(@RequestBody Subscription objToUpdate) {
		return webBankingService.create(objToUpdate);
	}
	
	@RequestMapping(value = "user", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public PagedResources<User> getUsers() {
		return userService.findAll(1, 5, "ASC");
	}
	@RequestMapping(value = "user/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public User getUser(String id) {
		return userService.findById(id);
	}
	@RequestMapping(value = "user/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable String id) {
		User u = userService.findById(id);
		userService.delete(u);
		return true;
	}
	@RequestMapping(value = "user", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public User updateUser(@RequestBody User objToUpdate) {
		return userService.update(objToUpdate);
	}
	@RequestMapping(value = "user", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public User createUser(@RequestBody User objToUpdate) {
		return userService.create(objToUpdate);
	}
}
