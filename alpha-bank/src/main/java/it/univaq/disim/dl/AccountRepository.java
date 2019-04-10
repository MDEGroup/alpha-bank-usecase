package it.univaq.disim.dl;

import org.springframework.data.jpa.repository.JpaRepository;

import it.univaq.disim.domain.data_warehouse.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
		
}
