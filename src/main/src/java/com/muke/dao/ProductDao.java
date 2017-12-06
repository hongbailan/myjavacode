package com.muke.dao;

import com.muke.domain.Product;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ProductDao extends HibernateDaoSupport{
    public void saveProduct(Product product) {
        System.out.println("保存成功");
        this.getHibernateTemplate().save(product);
    }
}
