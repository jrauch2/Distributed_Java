package edu.wctc.jrauch2.djclassprojectspringboot.service;

import edu.wctc.jrauch2.djclassprojectspringboot.data.dao.IProductDAO;
import edu.wctc.jrauch2.djclassprojectspringboot.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private IProductDAO productDao;
    
    public Product getProduct(String productID) {
        return productDao.getOne(productID);
    }

    public List<Product> getProductList() {
        return productDao.findAll();
    }
    
    public void updateProduct(Product product) {
        productDao.save(product);
    }
    
    public void deleteProduct(String productID) {
        productDao.deleteById(productID);
    }
    
    public void createProduct(Product product) {
        productDao.save(product);
    }
    
}
