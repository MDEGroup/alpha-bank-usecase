package it.univaq.disim.dl;

import org.springframework.data.jpa.repository.JpaRepository;
import it.univaq.disim.domain.data_warehouse.CustomerGeneral;

public interface CustomerGeneralRepository extends JpaRepository<CustomerGeneral, Long>{
		
}
