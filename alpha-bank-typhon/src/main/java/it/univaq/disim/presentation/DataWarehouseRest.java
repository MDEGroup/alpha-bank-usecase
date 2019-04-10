package it.univaq.disim.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.typhon.client.model.Account;
import org.typhon.client.model.CustomerGeneral;
import org.typhon.client.service.AccountService;
import org.typhon.client.service.CustomerGeneralService;

@RestController
@RequestMapping("/rest/datawarehouse/")
public class DataWarehouseRest {
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CustomerGeneralService customerService;
	
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public PagedResources<Account> getAccounts() {
		return accountService.findAll(1, 5, "ASC");
	}
	@RequestMapping(value = "accounts/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public Account getAccount(Long id) {
		return accountService.findById(id.intValue());
	}
	@RequestMapping(value = "accounts/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteAccount(@PathVariable Long id) {
		Account v = accountService.findById(id.intValue());
		accountService.delete(v);
		return true;
	}
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public Account updateAccount(@RequestBody Account objToUpdate) {
		return accountService.update(objToUpdate);
	}
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public Account createAccount(@RequestBody Account objToUpdate) {
		return accountService.create(objToUpdate);
	}
	
	
	@RequestMapping(value = "customer", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public PagedResources<CustomerGeneral> getCustomerGenerals() {
		return customerService.findAll(1, 5, "ASC");
	}
	@RequestMapping(value = "customer/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public CustomerGeneral getCustomerGeneral(Long id) {
		return customerService.findById(id.intValue());
	}
	@RequestMapping(value = "customer/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteCustomerGeneral(@PathVariable Long id) {
		CustomerGeneral v = customerService.findById(id.intValue());
		customerService.delete(v);
		return true;
	}
	@RequestMapping(value = "customer", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public CustomerGeneral updateCustomerGeneral(@RequestBody CustomerGeneral objToUpdate) {
		return customerService.update(objToUpdate);
	}
	@RequestMapping(value = "customer", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public CustomerGeneral createCustomerGeneral(@RequestBody CustomerGeneral objToUpdate) {
		return customerService.create(objToUpdate);
	}

}
