package it.univaq.disim.dl;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.univaq.disim.domain.web_banking.User;

public interface UserRepository extends MongoRepository<User, String>{
		
}
