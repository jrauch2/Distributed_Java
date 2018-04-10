package edu.wctc.jrauch2.week10.djclassproject.service;

import edu.wctc.jrauch2.week10.djclassproject.data.dao.IProductDAO;
import edu.wctc.jrauch2.week10.djclassproject.model.Product;
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
        return productDao.findOne(productID);
    }

    public List<Product> getProductList() {
        return productDao.findAll();
    }
    
}
