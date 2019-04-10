package it.univaq.disim.dl;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.univaq.disim.domain.web_banking.Subscription;

public interface SubscriptionRepository extends MongoRepository<Subscription, String>{
		
}
