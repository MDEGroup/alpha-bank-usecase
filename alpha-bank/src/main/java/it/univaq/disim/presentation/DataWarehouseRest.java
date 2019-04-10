package it.univaq.disim.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.univaq.disim.domain.data_warehouse.Account;
import it.univaq.disim.domain.data_warehouse.CustomerGeneral;
import it.univaq.disim.service.DataWarehouseService;

@RestController
@RequestMapping("/rest/datawarehouse/")
public class DataWarehouseRest {
	@Autowired
	private DataWarehouseService dwhService;
	
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public List<Account> getAccounts() {
		return dwhService.findAllAccount();
	}
	@RequestMapping(value = "accounts/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public Account getAccount(Long id) {
		return dwhService.findAccountById(id);
	}
	@RequestMapping(value = "accounts/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteAccount(@PathVariable Long id) {
		return dwhService.deleteAccount(id);
	}
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public Account updateAccount(@RequestBody Account objToUpdate) {
		return dwhService.updateAccount(objToUpdate);
	}
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public Account createAccount(@RequestBody Account objToUpdate) {
		return dwhService.createAccount(objToUpdate);
	}
	
	
	@RequestMapping(value = "customer", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public List<CustomerGeneral> getCustomerGenerals() {
		return dwhService.findAllCustomerGeneral();
	}
	@RequestMapping(value = "customer/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public CustomerGeneral getCustomerGeneral(Long id) {
		return dwhService.findCustomerGeneralById(id);
	}
	@RequestMapping(value = "customer/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteCustomerGeneral(@PathVariable Long id) {
		return dwhService.deleteCustomerGeneral(id);
	}
	@RequestMapping(value = "customer", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public CustomerGeneral updateCustomerGeneral(@RequestBody CustomerGeneral objToUpdate) {
		return dwhService.updateCustomerGeneral(objToUpdate);
	}
	@RequestMapping(value = "customer", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public CustomerGeneral createCustomerGeneral(@RequestBody CustomerGeneral objToUpdate) {
		return dwhService.createCustomerGeneral(objToUpdate);
	}

}
