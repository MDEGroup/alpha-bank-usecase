package it.univaq.disim.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.univaq.disim.dl.SubscriptionRepository;
import it.univaq.disim.domain.web_banking.Subscription;
import it.univaq.disim.domain.data_warehouse.CustomerGeneral;
import it.univaq.disim.service.DataWarehouseService;
import it.univaq.disim.service.WebBankingService;

@RestController
@RequestMapping("/datawarehouse/")
public class WebBankingRest {
	@Autowired
	private WebBankingService webBankingService;
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public List<Subscription> getAccounts() {
		return webBankingService.findAllSubscriptions();
	}
	@RequestMapping(value = "accounts/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
	public Subscription getAccount(String id) {
		return webBankingService.findSubscriptionById(id);
	}
	@RequestMapping(value = "accounts/{id}", produces = {"application/json", "application/xml"}, method = RequestMethod.DELETE)
	public boolean deleteAccount(@PathVariable String id) {
		return webBankingService.deleteSubscription(id);
	}
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.PUT)
	public Subscription updateAccount(@RequestBody Subscription objToUpdate) {
		return webBankingService.updateSubscription(objToUpdate);
	}
	@RequestMapping(value = "accounts", produces = {"application/json", "application/xml"}, method = RequestMethod.POST)
	public Subscription createAccount(@RequestBody Subscription objToUpdate) {
		return webBankingService.createSubscription(objToUpdate);
	}
}
