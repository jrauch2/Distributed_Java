package edu.wctc.jrauch2.djclassprojectspringboot.data.dao;


import edu.wctc.jrauch2.djclassprojectspringboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDAO extends JpaRepository<Product, String>{
	
	// TODO additional custom query methods as needed

}
