package it.univaq.disim.presentation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.univaq.disim.domain.data_warehouse.Account;
import it.univaq.disim.domain.data_warehouse.CustomerGeneral;
import it.univaq.disim.domain.web_banking.Subscription;
import it.univaq.disim.domain.web_banking.User;
import it.univaq.disim.service.DataWarehouseService;
import it.univaq.disim.service.WebBankingService;

@Controller
@RequestMapping("/web/data-warehouse")
public class DataWarehouseWEB {
	@Autowired
	private DataWarehouseService dwhService;
    @GetMapping("/account/{id}")
    public String getSubscription(@PathVariable Long id, Model model) {
    	Account value = dwhService.findAccountById(id);
        model.addAttribute("subscription", value);
        return "account";
    }
    @GetMapping("/account")
    public String getSubscriptions(Model model) {
    	List<Account> value = dwhService.findAllAccount();
        model.addAttribute("subscriptions", value);
        return "accounts";
    }
    @GetMapping("/customer/{id}")
    public String getUser(@PathVariable Long id, Model model) {
    	CustomerGeneral value = dwhService.findCustomerGeneralById(id);
        model.addAttribute("subscription", value);
        return "customer";
    }
    @GetMapping("/customer")
    public String getUsers(Model model) {
    	List<CustomerGeneral> value = dwhService.findAllCustomerGeneral();
        model.addAttribute("subscriptions", value);
        return "customers";
    }
}
