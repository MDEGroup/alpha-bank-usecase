package it.univaq.disim.presentation.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.typhon.client.model.Account;
import org.typhon.client.model.CustomerGeneral;
import org.typhon.client.service.AccountService;
import org.typhon.client.service.CustomerGeneralService;


@Controller
@RequestMapping("/web/data-warehouse")
public class DataWarehouseWEB {
	@Autowired
	private AccountService accountService;
	@Autowired
	private CustomerGeneralService customerService;
    @GetMapping("/account/{id}")
    public String getSubscription(@PathVariable Long id, Model model) {
    	Account value = accountService.findById(id.intValue());
        model.addAttribute("subscription", value);
        return "account";
    }
    @GetMapping("/account")
    public String getSubscriptions(Model model) {
    	Collection<Account> value = accountService.findAll(1, 5, "ASC").getContent();
        model.addAttribute("subscriptions", value);
        return "accounts";
    }
    @GetMapping("/customer/{id}")
    public String getUser(@PathVariable Long id, Model model) {
    	CustomerGeneral value = customerService.findById(id.intValue());
        model.addAttribute("subscription", value);
        return "customer";
    }
    @GetMapping("/customer")
    public String getUsers(Model model) {
    	Collection<CustomerGeneral> value = customerService.findAll(1, 5, "ASC").getContent();
        model.addAttribute("subscriptions", value);
        return "customers";
    }
}
