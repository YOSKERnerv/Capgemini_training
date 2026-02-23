package com.capg.assessment.service;

import javax.persistence.*;
import com.capg.assessment.entity.*;

public class ProductService {

    private EntityManager em;

    public ProductService(EntityManager em) {
        this.em = em;
    }

    public void addProduct(String name, double price) {

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Product product = new Product();
            product.setName(name);
            product.setPrice(price);

            em.persist(product);

            tx.commit();
            System.out.println("Product Added Successfully!");

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
    }
}