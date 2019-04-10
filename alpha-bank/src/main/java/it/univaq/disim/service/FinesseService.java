package it.univaq.disim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.dl.SubscriptionRepository;
import it.univaq.disim.domain.web_banking.Subscription;

@Service
public class FinesseService{
	@Autowired
	private SubscriptionRepository subscriptionRepo;
	
	public Subscription findAccountById(String id) {
		return subscriptionRepo.findOne(id);
	}
	
	public boolean deleteAccount(String objToDelete) {
		try {
			subscriptionRepo.delete(objToDelete);
			return true;
		} catch(Exception e) {
			return true;
		}
	}

	public List<Subscription> findAllAccount() {
		return subscriptionRepo.findAll();
	}

	public Subscription createAccount(Subscription objToCreate) {
		return subscriptionRepo.save(objToCreate);
	}	
	
	public Subscription updateAccount(Subscription objToUpdate) {
		return subscriptionRepo.save(objToUpdate);
	}
}