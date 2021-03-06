package it.univaq.disim.presentation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.univaq.disim.domain.web_banking.Subscription;
import it.univaq.disim.domain.web_banking.User;
import it.univaq.disim.service.WebBankingService;

@Controller
@RequestMapping("/web/web-banking")
public class WebBankingWEB {
	@Autowired
	private WebBankingService wbService;
    @GetMapping("/subscription/{id}")
    public String getSubscription(@PathVariable String id, Model model) {
    	Subscription value = wbService.findSubscriptionById(id);
        model.addAttribute("subscription", value);
        return "subscription";
    }
    @GetMapping("/subscription")
    public String getSubscriptions(Model model) {
    	List<Subscription> value = wbService.findAllSubscription();
        model.addAttribute("subscriptions", value);
        return "subscriptions";
    }
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable String id, Model model) {
    	User value = wbService.findUserById(id);
        model.addAttribute("subscription", value);
        return "user";
    }
    @GetMapping("/user")
    public String getUsers(Model model) {
    	List<User> value = wbService.findAllUser();
        model.addAttribute("subscriptions", value);
        return "users";
    }
}
