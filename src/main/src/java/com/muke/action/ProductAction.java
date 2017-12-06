package com.muke.action;

import com.muke.domain.Product;
import com.muke.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven<Product> {
    private ProductService productService;

    private Product product = new Product();

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public ProductService getProductService() {
        return productService;
    }

    public Product getModel() {
        return product;
    }


    public String Save(){
        System.out.println("测试保存情况");
        productService.saveProduct(product);
        return NONE;
    }
}
