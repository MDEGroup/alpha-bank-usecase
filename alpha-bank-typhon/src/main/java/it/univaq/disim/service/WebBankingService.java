package it.univaq.disim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.univaq.disim.dl.SubscriptionRepository;
import it.univaq.disim.domain.web_banking.Subscription;

public class WebBankingService{

	@Autowired
	private SubscriptionRepository subscriptionRepository;
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
		return subscriptionRepository.findOne(id);
	}

	public List<Subscription> findAllSubscriptions() {
		return subscriptionRepository.findAll();
	}
	
}