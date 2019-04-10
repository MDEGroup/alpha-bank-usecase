package it.univaq.disim.presentation.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.typhon.client.model.Subscription;
import org.typhon.client.model.User;
import org.typhon.client.service.SubscriptionService;
import org.typhon.client.service.UserService;


@Controller
@RequestMapping("/web/web-banking")
public class WebBankingWEB {
	@Autowired
	private SubscriptionService subscriptionService;
	@Autowired
	private UserService userService;
    @GetMapping("/subscription/{id}")
    public String getSubscription(@PathVariable String id, Model model) {
    	Subscription value = subscriptionService.findById(id);
    	value.getCustomerGeneralObj();
        model.addAttribute("subscription", value);
        return "subscription";
    }
    @GetMapping("/subscription")
    public String getSubscriptions(Model model) {
    	Collection<Subscription> value = subscriptionService.findAll(1, 5, "ASC").getContent();
        model.addAttribute("subscriptions", value);
        return "subscriptions";
    }
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable String id, Model model) {
    	User value = userService.findById(id);
        model.addAttribute("subscription", value);
        return "user";
    }
    @GetMapping("/user")
    public String getUsers(Model model) {
    	Collection<User> value = userService.findAll(1, 5, "ASC").getContent();
        model.addAttribute("subscriptions", value);
        return "users";
    }
}
