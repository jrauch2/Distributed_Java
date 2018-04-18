package edu.wctc.jrauch2.week12.namesapp12.data.dao;

import edu.wctc.jrauch2.week12.namesapp12.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressDAO extends JpaRepository<Address, String>{
	
	// TODO additional custom query methods as needed

}
