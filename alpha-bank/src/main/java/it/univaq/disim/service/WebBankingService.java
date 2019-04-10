package it.univaq.disim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.dl.SubscriptionRepository;
import it.univaq.disim.dl.UserRepository;
import it.univaq.disim.domain.data_warehouse.CustomerGeneral;
import it.univaq.disim.domain.web_banking.Subscription;
import it.univaq.disim.domain.web_banking.User;
@Service
public class WebBankingService{

	@Autowired
	private SubscriptionRepository subscriptionRepository;
	@Autowired
	private UserRepository userRepository;
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

	public List<Subscription> findAllSubscription() {
		List<Subscription> subs = subscriptionRepository.findAll();
		for (Subscription subscription : subs) {
			CustomerGeneral cg = dwhService.findCustomerGeneralById(subscription.getCustomerGeneralID());
			subscription.setCustomerGeneral(cg);
		}
		return subs;
	}
	
	public User createUser(User objToUpdate) {
		
		return userRepository.save(objToUpdate);
	}

	public User updateUser(User objToUpdate) {
		return userRepository.save(objToUpdate);
	}

	public boolean deleteUser(String id) {
		try {
			userRepository.delete(id);
			return true;
		} catch(Exception e) {
			return true;
		}
	}

	public User findUserById(String id) {
		return userRepository.findOne(id);
	}

	public List<User> findAllUser() {
		return userRepository.findAll();
	}
	
}