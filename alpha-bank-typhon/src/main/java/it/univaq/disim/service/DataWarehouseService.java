package it.univaq.disim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.dl.AccountRepository;
import it.univaq.disim.dl.CustomerGeneralRepository;
import it.univaq.disim.domain.data_warehouse.Account;
import it.univaq.disim.domain.data_warehouse.CustomerGeneral;
@Service
public class DataWarehouseService{
	@Autowired
	private AccountRepository accountRepo;
	@Autowired
	private CustomerGeneralRepository customerGeneralRepo;
	
	public Account findAccountById(Long id) {
		return accountRepo.findOne(id);
	}
	
	public boolean deleteAccount(Long objToDelete) {
		try {
			accountRepo.delete(objToDelete);
			return true;
		} catch(Exception e) {
			return true;
		}
	}

	public List<Account> findAllAccount() {
		return accountRepo.findAll();
	}

	public Account createAccount(Account objToCreate) {
		return accountRepo.save(objToCreate);
	}	
	
	public Account updateAccount(Account objToUpdate) {
		return accountRepo.save(objToUpdate);
	}

	public List<CustomerGeneral> findAllCustomerGeneral() {
		return customerGeneralRepo.findAll();
	}

	public CustomerGeneral findCustomerGeneralById(Long id) {
		return customerGeneralRepo.findOne(id);
	}

	public boolean deleteCustomerGeneral(Long id) {
		try {
			customerGeneralRepo.delete(id);
			return true;
		} catch(Exception e) {
			return true;
		}
	}

	public CustomerGeneral updateCustomerGeneral(CustomerGeneral objToUpdate) {
		return  customerGeneralRepo.save(objToUpdate);
	}
	
	public CustomerGeneral createCustomerGeneral(CustomerGeneral objToUpdate) {
		return  customerGeneralRepo.save(objToUpdate);
	}
}