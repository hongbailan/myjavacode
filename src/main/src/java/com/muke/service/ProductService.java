package com.muke.service;

import com.muke.dao.ProductDao;
import com.muke.domain.Product;

public class ProductService {
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }
}
