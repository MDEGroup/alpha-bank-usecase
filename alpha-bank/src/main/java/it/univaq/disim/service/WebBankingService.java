package it.univaq.disim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.dl.SubscriptionRepository;
import it.univaq.disim.domain.data_warehouse.CustomerGeneral;
import it.univaq.disim.domain.web_banking.Subscription;
@Service
public class WebBankingService{

	@Autowired
	private SubscriptionRepository subscriptionRepository;
	@Autowired
	DataWarehouseService dwhService;
	public Subscription createSubscription(Subscription objToUpdate) {
		
		return subscriptionRepository.save(objToUpdate);
	}

	public Subscription updateSubscription(Subscription objToUpdate) {
		return subscriptionRepository.save(objToUpdate);
	}

	public boolean deleteSubscription(String id) {
		try {
			subscriptionRepository.delete(id);
			return true;
		} catch(Exception e) {
			return true;
		}
	}

	public Subscription findSubscriptionById(String id) {
		Subscription sub = subscriptionRepository.findOne(id);
		CustomerGeneral cg = dwhService.findCustomerGeneralById(sub.getCustomerGeneralID());
		sub.setCustomerGeneral(cg);
		return sub;
	}

	public List<Subscription> findAllSubscriptions() {
		List<Subscription> subs = subscriptionRepository.findAll();
		for (Subscription subscription : subs) {
			CustomerGeneral cg = dwhService.findCustomerGeneralById(subscription.getCustomerGeneralID());
			subscription.setCustomerGeneral(cg);
		}
		return subs;
	}
	
}